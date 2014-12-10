package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Account;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/pages/../WEB-INF/jspf/nav.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Banking</title>\r\n");
      out.write("        <link href=\"../css/main.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("        <script type='text/javascript'>\r\n");
      out.write("            function getBalance(nId) {\r\n");
      out.write("                $.post('pages/get_balance.jsp?id=' + nId, function(data) {\r\n");
      out.write("                    $('#acc_id_' + nId).html(data);\r\n");
      out.write("                });\r\n");
      out.write("//                $.ajax({\r\n");
      out.write("//        type:       \"post\",\r\n");
      out.write("//        url:        \"dimensionList.jsp\",\r\n");
      out.write("//        data:       {\"dimensionName\":\"Slappy\"},\r\n");
      out.write("//        success:    function(msg) {\r\n");
      out.write("//                            alert(msg.data);\r\n");
      out.write("//            },\r\n");
      out.write("//            error:function (xhr, ajaxOptions, thrownError){\r\n");
      out.write("//                alert(xhr.status);\r\n");
      out.write("//                alert(thrownError);\r\n");
      out.write("//            }  \r\n");
      out.write("//    });\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write('\n');
      beans.AccountManager accountManager = null;
      synchronized (_jspx_page_context) {
        accountManager = (beans.AccountManager) _jspx_page_context.getAttribute("accountManager", PageContext.PAGE_SCOPE);
        if (accountManager == null){
          accountManager = new beans.AccountManager();
          _jspx_page_context.setAttribute("accountManager", accountManager, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!--scope=\"page|application\"-->\n");
      out.write("<a href=\"/\">Home</a>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("        <h1 class=\"centered\">Bank Admin Page</h1>\r\n");
      out.write("\r\n");
      out.write("        <form method=\"POST\" action=\"pages/create_account.jsp\" class=\"box horizontal\" >\r\n");
      out.write("            <div class=\"label centered\">Add Account</div>\r\n");
      out.write("            <p>FIO: <input type=\"text\" name=\"fio\" value=\"Input FIO\" size=\"30\" /></p>\r\n");
      out.write("            <p>Document: <input type=\"text\" name=\"doc\" value=\"Input Document\" size=\"24\" /></p>\r\n");
      out.write("            <p><input type=\"submit\" value=\"Create new Account\" /></p>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <form method=\"POST\" action=\"pages/remove_account.jsp\"\r\n");
      out.write("              class=\"box horizontal\" style=\"margin-left: 15px;\">\r\n");
      out.write("            <div class=\"label centered\">Remove Account</div>\r\n");
      out.write("            <p>Account ID: <input type=\"text\" name=\"id\" value=\"Input ID\" size=\"6\" /></p>\r\n");
      out.write("            <!--<p><input type=\"button\" value=\"Check Balance\" onclick=\"GetBalance()\"/></p>-->\r\n");
      out.write("            <p><input type=\"submit\" value=\"Remove Account\" /></p>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <form method=\"POST\" action=\"pages/add_money.jsp\"\r\n");
      out.write("              class=\"box horizontal\" style=\"margin-left: 15px;\">\r\n");
      out.write("            <div class=\"label centered\">Adding|Subtracting Money</div>\r\n");
      out.write("            <p>Account ID: <input type=\"text\" name=\"id\" value=\"Input ID\" size=\"6\" /></p>\r\n");
      out.write("            <p>$: <input type=\"text\" name=\"money\" size=\"10\" /></p>\r\n");
      out.write("            <p><input type=\"submit\" name=\"add_balance\" value=\"+\" title=\"Add to Balance\" />\r\n");
      out.write("                <input type=\"submit\" name=\"sub_balance\" value=\"-\" title=\"Subtract from Balance\" /></p>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <form method=\"POST\" action=\"pages/transfer_money.jsp\"\r\n");
      out.write("              class=\"box horizontal\" style=\"margin-left: 15px;\">\r\n");
      out.write("            <div class=\"label centered\">Money Transfer</div>\r\n");
      out.write("            <p> Sender ID: <input type=\"text\" name=\"sender_id\"  size=\"6\"/>\r\n");
      out.write("                Receiver ID: <input type=\"text\" name=\"receiver_id\"  size=\"6\"/></p>\r\n");
      out.write("            <p>$: <input type=\"text\" name=\"money\" size=\"10\" /></p>\r\n");
      out.write("            <p><input type=\"submit\" name=\"transfer_money\" value=\"Send\" title=\"Send Money\" /></p>\r\n");
      out.write("        </form>\r\n");
      out.write("        <br/>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"box big_box\">\r\n");
      out.write("            <div class=\"label centered\">All Accounts</div>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <table border=\"1\" cellpadding=\"3\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Account Number</th>\r\n");
      out.write("                        <th>FIO</th>\r\n");
      out.write("                        <th>Document</th>\r\n");
      out.write("                        <th>Balance</th>\r\n");
      out.write("                        <th>actions</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    ");

                        List<Account> list = accountManager.getAllAccountList();
                        for (Account account : list) {
                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(account.getID());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(account.getFio());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(account.getDoc());
      out.write("</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <div id=\"acc_id_");
      out.print(account.getID());
      out.write('"');
      out.write('>');
      out.print(account.getBalance());
      out.write("</div>\r\n");
      out.write("                            <input type=\"button\" value=\"$\" title=\"Get Balance\"\r\n");
      out.write("                                   onclick=\"getBalance(");
      out.print(account.getID());
      out.write(")\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <form method=\"POST\" action=\"pages/remove_account.jsp\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(account.getID());
      out.write("\" />\r\n");
      out.write("                                <input type=\"submit\" value=\"Remove Account\" />\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                            <form method=\"POST\" action=\"pages/add_money.jsp\">\r\n");
      out.write("                                $: <input type=\"text\" name=\"money\" value=\"\" size=\"10\" />\r\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(account.getID());
      out.write("\" />\r\n");
      out.write("                                <input type=\"submit\" name=\"add_balance\" value=\"+\" title=\"Add to Balance\" />\r\n");
      out.write("                                <input type=\"submit\" name=\"sub_balance\" value=\"-\" title=\"Subtract from Balance\" />\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                            <form method=\"POST\" action=\"pages/transfer_money.jsp\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"sender_id\" value=\"");
      out.print(account.getID());
      out.write("\" />\r\n");
      out.write("                                Sending to: <input type=\"text\" name=\"receiver_id\" size=\"6\" /> \r\n");
      out.write("                                $: <input type=\"text\" name=\"money\" value=\"\" size=\"10\" />\r\n");
      out.write("                                <input type=\"submit\" name=\"transfer_money\" value=\"Send\" title=\"Send Money\" />\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
