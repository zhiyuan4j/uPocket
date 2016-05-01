package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>uPocket-login</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/my.css\">\n");
      out.write("\t<link href=\"./css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<form action=\"./login.do\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"form-group\" id=\"usernameGroup\">\n");
      out.write("\t\t\t<label for=\"InputUsername\">Username</label>\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"InputUsername\" placeholder=\"用户名\" name=\"username\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\" id=\"passwordGroup\">\n");
      out.write("\t\t\t\t<label for=\"InputPassword\">Password</label>\n");
      out.write("\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"InputPassword\" placeholder=\"密码\" name=\"password\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-default\" id=\"loginBtn\">登录</button>\n");
      out.write("\t\t\t<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.result}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t\t<div class=\"pull-right\"><a href=\"/register.jsp\">点此注册</a></div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"./js/jquery-1.12.3.min.js\"></script>\n");
      out.write("\t<script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"./js/login.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
