package org.apache.jsp.WEB_002dINF.my2048;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,height=device-height,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>\r\n");
      out.write("\r\n");
      out.write("    <title>2048</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/2048/2048.css\" />\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery-1.12.3.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/2048/support2048.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/2048/showanimation2048.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/2048/main2048.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <h1>2048</h1>\r\n");
      out.write("        <a href=\"javascript:newgame();\" id=\"newgamebutton\" class=\"gamebutton\">新的游戏</a>\r\n");
      out.write("        <a class=\"gamebutton\" href=\"/my2048/rank\">排行榜</a>\r\n");
      out.write("        <a class=\"gamebutton\" id=\"save\" href=\"javascript:savegame();\">保存并返回</a>\r\n");
      out.write("        <p>Modified by 王志远</p>\r\n");
      out.write("        <p>Learn from <a href=\"http://www.imooc.com/\" target=\"_blank\">慕课网</a></p>\r\n");
      out.write("        <p>score : <span id=\"score\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.my2048.score }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></p>\r\n");
      out.write("        <p style=\"display:none\" id=\"board\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.my2048.save }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"grid-container\">\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-0-0\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-0-1\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-0-2\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-0-3\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-1-0\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-1-1\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-1-2\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-1-3\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-2-0\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-2-1\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-2-2\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-2-3\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-3-0\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-3-1\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-3-2\"></div>\r\n");
      out.write("        <div class=\"grid-cell\" id=\"grid-cell-3-3\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
