package org.apache.jsp;

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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <title>JSTL SQL Tagları ile Veritabanı İşlemleri</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>JSTL SQL Tagları ile Veritabanı İşlemleri</h2>\n");
      out.write("\n");
      out.write("        <table border=\"1\" width=\"500\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Örneğin Adı</th>\n");
      out.write("                    <th>Adresi</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("      \n");
      out.write("                 <tr>\n");
      out.write("                    <td>sql:setDataSource</td>\n");
      out.write("                    <td><a href=\"01-sql-setDataSource.jsp\">DataSource ile veritabanına bağlantı kurma işlemleri</a></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td>sql:query</td>\n");
      out.write("                    <td><a href=\"02-sql-query.jsp\">Veri sorgulama işlemleri</a></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>sql:update</td>\n");
      out.write("                    <td><a href=\"03-sql-update.jsp\">Veri ekleme, güncelleme ve silme işlemleri</a></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>sql:param</td>\n");
      out.write("                    <td><a href=\"04-sql-param.jsp\">Parametre ile çalışma işlemleri</a></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>sql:param</td>\n");
      out.write("                    <td><a href=\"05-sql-param2.jsp\">Bir sayfadan diğerine parametre gönderme işlemleri</a></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>sql:dateParam</td>\n");
      out.write("                    <td><a href=\"06-sql-dateParam.jsp\">Tarih işlemleri java.util.Date value.</a></td>\n");
      out.write("                </tr>\t\n");
      out.write("                \n");
      out.write("                   <tr>\n");
      out.write("                    <td>sql:transaction</td>\n");
      out.write("                    <td><a href=\"07-sql-transaction.jsp\">Transaction işlemleri</a></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
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
