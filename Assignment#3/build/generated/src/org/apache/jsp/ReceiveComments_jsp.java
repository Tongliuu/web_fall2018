package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ReceiveComments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Comments Review</title>\n");
      out.write("        <link href=\"css/default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        ");
      Comments.ReceiveComments rc = null;
      synchronized (session) {
        rc = (Comments.ReceiveComments) _jspx_page_context.getAttribute("rc", PageContext.SESSION_SCOPE);
        if (rc == null){
          rc = new Comments.ReceiveComments();
          _jspx_page_context.setAttribute("rc", rc, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Comments successfully</h1>\n");
      out.write("        <h3>Name:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("rp"), "name")));
      out.write("</h3>\n");
      out.write("        <h3>Email:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("rp"), "email")));
      out.write("</h3>\n");
      out.write("        <h3>Comments:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("rp"), "comments")));
      out.write("</h3>\n");
      out.write("        <br/><br/>\n");
      out.write("        <a herf=\"index.jsp\">Return Last Page</a>\n");
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
