<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Removing</title>
        <link href="../css/main.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <%@include file="../WEB-INF/jspf/nav.jspf" %>

        <%
            try {
                accountManager.removeAccountById(request.getParameter("id"));
        %>
        <p class="green">${param.id} was removed success.</p>
        <%
            } catch (SQLException ex) {
        %>
        <p class="red">${param.id} was NOT removed.</p>
        <%
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            } catch (NumberFormatException ex) {
        %>
        <p class="red">${param.id} was NOT removed.</p>
        <%
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            }
        %>
    </body>
</html>
