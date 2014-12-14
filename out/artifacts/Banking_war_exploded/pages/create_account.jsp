<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Creation</title>
        <link href="../css/main.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <%@include file="../WEB-INF/jspf/nav.jspf" %>

        <%
            try {
                accountManager.createAccount(request.getParameter("fio"), request.getParameter("doc"));
        %>
        <p class="green">${param.fio} with doc - ${param.fio} was added success.</p>
        <%
            } catch (SQLException ex) {
        %>
        <p class="red">${param.fio} with doc - ${param.fio} was NOT added.</p>
        <%
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            } catch (NumberFormatException ex) {
        %>
        <p class="red">${param.fio} with doc - ${param.fio} was NOT added.</p>
        <%
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            }
        %>
    </body>
</html>
