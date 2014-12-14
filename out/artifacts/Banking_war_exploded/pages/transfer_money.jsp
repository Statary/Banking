<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transfer Money</title>
        <link href="../css/main.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <%@include file="../WEB-INF/jspf/nav.jspf" %>

        <%
            try {
                accountManager.transferMoney(request.getParameter("sender_id")
                                            , request.getParameter("receiver_id")
                                            , request.getParameter("money")
                                            );
        %>
        <p class="green">Transfer from ${param.sender_id} to ${param.receiver_id} Account ${param.money}$ was successful.</p>
        <%
            } catch (SQLException ex) {
        %>
        <p class="red">Transfer from ${param.sender_id} to ${param.receiver_id} Account ${param.money}$ was FAILED.</p>
        <%
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            } catch (NumberFormatException ex) {
        %>
        <p class="red">Transfer from ${param.sender_id} to ${param.receiver_id} Account ${param.money}$ was FAILED.</p>
        <%
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            }
        %>
    </body>
</html>
