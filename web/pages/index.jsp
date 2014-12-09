<%@page import="beans.Account"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Banking</title>
        <link href="../css/main.css" rel="stylesheet" type="text/css">
        <script type='text/javascript'>
            function GetBalance(id) {
//                $.post()
//$.ajax({
//    type: "POST"
//    url: url,
//    data: data,
//    dataType: "json",
//    success: function(data) {
//        //
//    },
//    error: function() {
//        //
//    }
//});
            }
        </script>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/nav.jspf" %>
        <h1 class="centered">Bank Admin Page</h1>

        <form method="POST" action="pages/create_account.jsp" class="box horizontal" >
            <div class="label centered">Add Account</div>
            <p>FIO: <input type="text" name="fio" value="Input FIO" size="30" /></p>
            <p>Document: <input type="text" name="doc" value="Input Document" size="24" /></p>
            <p><input type="submit" value="Create new Account" /></p>
        </form>

        <form method="POST" action="pages/remove_account.jsp"
              class="box horizontal" style="margin-left: 15px;">
            <div class="label centered">Remove Account</div>
            <p>Account ID: <input type="text" name="id" value="Input ID" size="6" /></p>
            <!--<p><input type="button" value="Check Balance" onclick="GetBalance()"/></p>-->
            <p><input type="submit" value="Remove Account" /></p>
        </form>

        <form method="POST" action="pages/add_money.jsp"
              class="box horizontal" style="margin-left: 15px;">
            <div class="label centered">Adding|Subtracting Money</div>
            <p>$: <input type="text" name="money" size="10" /></p>
            <p>Account ID: <input type="text" name="id" value="Input ID" size="6" /></p>
            <p><input type="submit" name="add_balance" value="+" title="Add to Balance" class="centered" />
                <input type="submit" name="sub_balance" value="-" title="Subtract from Balance" class="centered"/></p>
        </form>

        <form method="POST" action="pages/transfer_money.jsp"
              class="box horizontal" style="margin-left: 15px;">
            <div class="label centered">Money Transfer</div>
            <p> Sender ID: <input type="text" name="sender_id"  size="6"/>
                Receiver ID: <input type="text" name="receiver_id"  size="6"/></p>
            <p>$: <input type="text" name="money" size="10" /></p>
            <p><input type="submit" name="transfer_money" value="Send" title="Send Money" /></p>
        </form>
        <br/>

        <div class="box big_box">
            <div class="label centered">All Accounts</div>
            <br/>
            <table border="1" cellpadding="3">
                <thead>
                    <tr>
                        <th>Account Number</th>
                        <th>FIO</th>
                        <th>Document</th>
                        <th>Balance</th>
                        <th>actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Account> list = accountManager.getAllAccountList();
                        for (Account account : list) {
                    %>
                    <tr>
                        <td><%=account.getID()%></td>
                        <td><%=account.getFio()%></td>
                        <td><%=account.getDoc()%></td>
                        <td>
                            <div id="acc_id_<%=account.getID()%>"><%=account.getBalance()%></div>
                            <input type="button" value="$" title="Get Balance"
                                   onclick="GetBalance(<%=account.getID()%>)" />
                        </td>
                        <td>
                            <form method="POST" action="pages/remove_account.jsp">
                                <input type="hidden" name="id" value="<%=account.getID()%>" />
                                <input type="submit" value="Remove Account" />
                            </form>

                            <form method="POST" action="pages/add_money.jsp">
                                $:
                                <input type="text" name="money" value="" size="10" />
                                <input type="hidden" name="id" value="<%=account.getID()%>" />
                                <input type="submit" name="add_balance" value="+" title="Add to Balance" />
                                <input type="submit" name="sub_balance" value="-" title="Subtract from Balance" />
                            </form>

                            <form method="POST" action="pages/transfer_money.jsp">
                                <input type="hidden" name="sender_id" value="<%=account.getID()%>" />
                                Sending to: <input type="text" name="receiver_id" size="6" /> 
                                $: <input type="text" name="money" value="400" size="10" />
                                <input type="submit" name="transfer_money" value="Send" title="Send Money" />
                            </form>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
