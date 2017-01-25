package org.apache.jsp.WEB_002dINF.pages.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listcarts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"http://getbootstrap.com/dist/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"http://codepen.io/zavoloklom/pen/IGkDz.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Carts</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"font-family: sans-serif;\" data-ng-app=\"webapp\" data-ng-controller=\"cartController\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<h3 style=\"color: blue; font-family: sans-serif;\">Cart List:</h3>\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Add Cart</a> --- \r\n");
      out.write("\t<a href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">Return to Index</a>\r\n");
      out.write("\t<br/><br/>\r\n");
      out.write("\t\r\n");
      out.write("\t<table >\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width=\"5%\">Cart Id</th>\r\n");
      out.write("\t\t\t<th width=\"10%\">Lines Amount</th>\r\n");
      out.write("\t\t\t<th width=\"10%\">Shipping Amount</th>\r\n");
      out.write("\t\t\t<th width=\"10%\">Cart Amount</th>\r\n");
      out.write("\t\t\t<th width=\"17%\">Ship To</th>\r\n");
      out.write("\t\t\t<th width=\"7%\">Status</th>\r\n");
      out.write("\t\t\t<th width=\"15%\">Created Date</th>\r\n");
      out.write("\t\t\t<th width=\"15%\">Modified Date</th>\r\n");
      out.write("\t\t\t<th width=\"11%\">Delete</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<tr data-ng-repeat=\"c in carts\">\r\n");
      out.write("\t\t<td><a data-ng-href=\"/jpaproject/User/editcart?cartId={{c.id.id}}&status={{c.cartDetails.status.id}}\">{{c.id.id}}</a></td>\r\n");
      out.write("          <td>{{c.cartDetails.linesAmount | currency}}</td>\r\n");
      out.write("          <td>{{c.cartDetails.shippingAmount | currency}}</td>\r\n");
      out.write("          <td>{{c.cartDetails.cartAmount | currency}}</td>\r\n");
      out.write("          <td>{{c.cartDetails.shipTo.name}}</td>\r\n");
      out.write("          <td>{{c.cartDetails.status.description}}</td>\r\n");
      out.write("          <td>{{c.audit.createDate | date:\"medium\"}}</td>\r\n");
      out.write("          <td>{{c.audit.updateDate | date:\"medium\"}}</td>\r\n");
      out.write("          <td><div data-ng-show='{{c.cartDetails.status.id}} != 1300'>Delete</div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/cart/listcarts.jsp(22,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/jsp/cart/add.jsp");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/pages/cart/listcarts.jsp(23,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/Cart/home");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}
