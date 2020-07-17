package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Hello World", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='container pt-4'>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <form action=\"edit\" method=\"POST\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\" />\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Product Name</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" \n");
      out.write("                                   name=\"product_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.product_name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Product Type</label>\n");
      out.write("                            <select class=\"form-control\" type=\"text\" \n");
      out.write("                                   name=\"product_type\">\n");
      out.write("                                <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.product_type == 'Alat Mandi' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("value=\"Alat Mandi\">Alat Mandi</option>\n");
      out.write("                                <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.product_type == 'Makanan & Minuman' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"Makanan & Minuman\">Makanan & Minuman</option>\n");
      out.write("                                <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.product_type == 'Pakaian' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"Pakaian\">Pakaian</option>\n");
      out.write("                                <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.product_type == 'Elektronik' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"Elektronik\">Elektronik</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Product Stock</label>\n");
      out.write("                            <input class=\"form-control\" type=\"number\" min=\"0\" \n");
      out.write("                                   name=\"stock\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.stock }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Product Price</label>\n");
      out.write("                            <input class=\"form-control\" type=\"number\" min=\"0\" \n");
      out.write("                                   name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.price }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Product Expired Date</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" \n");
      out.write("                                   name=\"expired\" id=\"datepicker\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ product.expired }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button class=\"btn btn-sm btn-primary\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/scripts.jsp", out, false);
      out.write("        \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $('#datepicker').datepicker({\n");
      out.write("                weekStart: 1,\n");
      out.write("                autoclose: true,\n");
      out.write("                todayHighlight: true,\n");
      out.write("                format: 'yyyy-mm-dd',\n");
      out.write("            });\n");
      out.write("            $('#datepicker').datepicker(\"setDate\", new Date());\n");
      out.write("        </script>\n");
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
