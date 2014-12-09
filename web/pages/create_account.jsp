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

        <%!
            private String fio = request.getParameter("fio");
            private String doc = request.getParameter("doc");

            private String showSuccess() {
                return "<p class=\"green\">" + fio + " with doc - " + doc + " was added success.</p>";
            }

            private String showError() {
                return "<p class=\"red\">" + fio + " with doc - " + doc + " was NOT added.</p>";
            }
        %>
        <%
            try {
                accountManager.createAccount(request.getParameter("fio"), request.getParameter("doc"));
        %>
        <%=showSuccess()%>
        <%
            } catch (SQLException ex) {
//                showError();
//                Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException ex) {
//                showError();
//                Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
            }
//                String strStatus;
//                String strClass;
//                if (success) {
//                    strStatus = " was added success.";
//                    strClass = "green";
//                } else {
//                    strStatus = " was not added.";
//                    strClass = "red";
//                    response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
//                }
        %>
    </body>
</html>
