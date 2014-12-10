package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;

public final class get_005fbalance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      beans.AccountManager accountManager = null;
      synchronized (_jspx_page_context) {
        accountManager = (beans.AccountManager) _jspx_page_context.getAttribute("accountManager", PageContext.PAGE_SCOPE);
        if (accountManager == null){
          accountManager = new beans.AccountManager();
          _jspx_page_context.setAttribute("accountManager", accountManager, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

    try {
        int balance = accountManager.getBalance(request.getParameter("id"));

      out.write("\n");
      out.write("<div class=\"green\">");
      out.print(balance);
      out.write("</div>\n");

    } catch (SQLException ex) {
        response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
    } catch (NumberFormatException ex) {
        response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
    }

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
