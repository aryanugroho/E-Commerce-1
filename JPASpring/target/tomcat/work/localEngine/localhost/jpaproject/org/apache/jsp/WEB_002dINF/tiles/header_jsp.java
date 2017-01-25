package org.apache.jsp.WEB_002dINF.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- <div style=\"background: #E0E0E0; height: 55px; padding: 5px;\">\r\n");
      out.write("  <div style=\"float: left\">\r\n");
      out.write("     <h1>My Site</h1>\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("  <div style=\"float: right; padding: 10px; text-align: right;\">\r\n");
      out.write(" \r\n");
      out.write("     Search <input name=\"search\">\r\n");
      out.write(" \r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("</div> -->\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Fixed navbar -->\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\t\taria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"http://www.softtek.com/es\"><img height=\"100%\" alt=\"Softtek\" src=\"http://www.artech-consulting.com/view/images/logos/logo_softtek.png\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"home\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/jpaproject/User/List\">Users</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/jpaproject/Cart/List\">Carts</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Action</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Another action</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown-header\">Nav header</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/.nav-collapse -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
