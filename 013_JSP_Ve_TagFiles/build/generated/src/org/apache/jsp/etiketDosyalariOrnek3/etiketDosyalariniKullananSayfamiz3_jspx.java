package org.apache.jsp.etiketDosyalariOrnek3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class etiketDosyalariniKullananSayfamiz3_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/tagdosyasi3.tagx");
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

      String _jspx_temp0 = "TR";
      out.write("<" + "text" + " lang=\"" + _jspx_temp0 + "\"" + ">");
      out.write("<font color=\"red\">");
      out.write("Güzel gören");
      out.write("</font>");
      if (_jspx_meth_t_tagdosyasi3_0(_jspx_page_context))
        return;
      out.write("<font color=\"blue\">");
      out.write("lezzet alır.");
      out.write("</font>");
      out.write("</" + "text" + ">");
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

  private boolean _jspx_meth_t_tagdosyasi3_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tagdosyasi3
    org.apache.jsp.tag.web.tagdosyasi3_tagx _jspx_th_t_tagdosyasi3_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.tagdosyasi3_tagx.class) : new org.apache.jsp.tag.web.tagdosyasi3_tagx();
    _jspx_th_t_tagdosyasi3_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tagdosyasi3_0.setUcuncuSoz("hayatından");
    _jspx_th_t_tagdosyasi3_0.setIkinciSoz("güzel düşünen");
    _jspx_th_t_tagdosyasi3_0.setBirinciSoz("güzel düşünür,");
    _jspx_th_t_tagdosyasi3_0.doTag();
    return false;
  }
}
