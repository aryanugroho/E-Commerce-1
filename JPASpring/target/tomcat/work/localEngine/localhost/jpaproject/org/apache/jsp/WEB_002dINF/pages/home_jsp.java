package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body data-ng-app=\"webapp\">\r\n");
      out.write("\t<div data-ng-controller=\"webappController\">\r\n");
      out.write("\t\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t<!-- Indicators -->\r\n");
      out.write("\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t<div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t<img class=\"first-slide\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"http://www.jirehtech.com/wp-content/uploads/2012/09/tech_user_banner.jpg\"\r\n");
      out.write("\t\t\t\t\t\talt=\"First slide\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Users.</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p>A user's account allows a user to authenticate to a system\r\n");
      out.write("\t\t\t\t\t\t\t\tand potentially to receive authorization to access resources\r\n");
      out.write("\t\t\t\t\t\t\t\tprovided by or connected to that system; however, authentication\r\n");
      out.write("\t\t\t\t\t\t\t\tdoes not imply authorization.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-lg btn-primary\" href=\"List\" role=\"button\">List\r\n");
      out.write("\t\t\t\t\t\t\t\t\tUsers</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t<img class=\"second-slide\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"http://www.incimages.com/uploaded_files/image/1940x900/1725x810_online_shopping_cart_19149.jpg\"\r\n");
      out.write("\t\t\t\t\t\talt=\"Second slide\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Carts.</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p>A shopping cart is a piece of software that acts as an\r\n");
      out.write("\t\t\t\t\t\t\t\tonline store's catalog and ordering process.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">List\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCarts</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\"\r\n");
      out.write("\t\t\t\tdata-slide=\"prev\"> <span\r\n");
      out.write("\t\t\t\tclass=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t</a> <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\"\r\n");
      out.write("\t\t\t\tdata-slide=\"next\"> <span\r\n");
      out.write("\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
