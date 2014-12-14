<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="accountManager" class="beans.AccountManager" scope="application"/>

<%
    try {
        int balance = accountManager.getBalance(request.getParameter("id"));
%>
<div class="green"><%=balance%></div>
<%
    } catch (SQLException ex) {
        response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
    } catch (NumberFormatException ex) {
        response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
    }
%>