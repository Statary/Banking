package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;

public final class add_005fmoney_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private String operation;
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Money</title>\n");
      out.write("        <link href=\"../css/main.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write('\n');
      beans.AccountManager accountManager = null;
      synchronized (application) {
        accountManager = (beans.AccountManager) _jspx_page_context.getAttribute("accountManager", PageContext.APPLICATION_SCOPE);
        if (accountManager == null){
          accountManager = new beans.AccountManager();
          _jspx_page_context.setAttribute("accountManager", accountManager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!--scope=\"page|application\"-->\n");
      out.write("<a href=\"/\">Home</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            try {
                if (request.getParameter("add_balance") != null) {
                    accountManager.addMoney(request.getParameter("id"),request.getParameter("money"));
                    operation = "Adding to";
                } else if (request.getParameter("sub_balance") != null) {
                    accountManager.subMoney(request.getParameter("id"),request.getParameter("money"));
                    operation = "Subtracting from";
                }        
        
      out.write("\n");
      out.write("        <p class=\"green\">");
      out.print(operation);
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Account on ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.money}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$ was successful.</p>\n");
      out.write("        ");

            } catch (SQLException ex) {
        
      out.write("\n");
      out.write("        <p class=\"red\">");
      out.print(operation);
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Account on ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.money}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$ was FAILED.</p>\n");
      out.write("        ");

            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            } catch (NumberFormatException ex) {
        
      out.write("\n");
      out.write("        <p class=\"red\">");
      out.print(operation);
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Account on ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.money}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$ was FAILED.</p>\n");
      out.write("        ");

            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
