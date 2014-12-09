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
            boolean success = false;
            if (request.getParameter("add_balance") != null) {
                success = accountManager.AddMoney(request.getParameter("id"),request.getParameter("money"));
            } else if (request.getParameter("sub_balance") != null) {
                success = accountManager.SubMoney(request.getParameter("id"),request.getParameter("money"));
            }
            
            String strStatus;
            String strClass;
            if (success) {
                strStatus = " was removed success.";
                strClass = "green";
            } else {
                strStatus = " was not removed.";
                strClass = "red";
                response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            }
        %>
        <p class="<%=strClass%>">${param.id}
            <%=strStatus%>
        </p>
    </body>
</html>
