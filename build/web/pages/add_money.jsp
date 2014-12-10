<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Money</title>
        <link href="../css/main.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <%@include file="../WEB-INF/jspf/nav.jspf" %>

        <%!private String operation;%>
        <%
            try {
                if (request.getParameter("add_balance") != null) {
                    accountManager.addMoney(request.getParameter("id"),request.getParameter("money"));
                    operation = "Adding to";
                } else if (request.getParameter("sub_balance") != null) {
                    accountManager.subMoney(request.getParameter("id"),request.getParameter("money"));
                    operation = "Subtracting from";
                }        
        %>
        <p class="green"><%=operation%> ${param.id} Account on ${param.money}$ was successful.</p>
        <%
            } catch (SQLException ex) {
        %>
        <p class="red"><%=operation%> ${param.id} Account on ${param.money}$ was FAILED.</p>
        <%
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            } catch (NumberFormatException ex) {
        %>
        <p class="red"><%=operation%> ${param.id} Account on ${param.money}$ was FAILED.</p>
        <%
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            }
        %>
    </body>
</html>
