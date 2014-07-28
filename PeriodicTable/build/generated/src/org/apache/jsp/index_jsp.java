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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Periodic Table</title>\n");
      out.write("        <link href=\"css/frame.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"scripts/service.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"tabContainer\">\n");
      out.write("            <div class=\"tabs\">\n");
      out.write("                <ul>\n");
      out.write("                    <li id=\"tabHeader_1\">Home</li>\n");
      out.write("                    <li id=\"tabHeader_2\">Periodic Table</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"tabscontent\">\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_1\">\n");
      out.write("                    It is an application of Periodic Table Web Service\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_2\">\n");
      out.write("        <form action=\"index.jsp\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td><input type=\"submit\" name=\"atoms\" value=\"Get All Atoms\"></td><td></td></tr>\n");
      out.write("                <tr><td>Element: </td><td><input type=\"text\" name=\"ele\"></td></tr>\n");
      out.write("                <tr><td><input type=\"submit\" name=\"number\" value=\"Get Atomic Number\"></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"weight\" value=\"Get Atomic Weight\"></td><td></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>        \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        String element = request.getParameter("ele");
        String atoms = request.getParameter("atoms");
        String number = request.getParameter("number");
        String weight = request.getParameter("weight");
    try {
	service.Periodictable service = new service.Periodictable();
	service.PeriodictableSoap port = service.getPeriodictableSoap();
	 // TODO initialize WS operation arguments here
	String elementName = element;
	String result = "";
        if(atoms != null && !"".equals(atoms))
            result = port.getAtoms();
        else if(number != null && !"".equals(number)){
            result = port.getAtomicNumber(elementName);
            result = result.split(elementName)[0];
        }
        else if(weight != null && !"".equals(weight))
            result = port.getAtomicWeight(elementName);
	
	out.println(result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("     </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
