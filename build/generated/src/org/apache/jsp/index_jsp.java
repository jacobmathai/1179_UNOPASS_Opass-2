package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <title>UNOPASS</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\" type=\"text/css\" />u\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/validationEngine.jquery.css\" type=\"text/css\"/>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-1.7.2.min.js\" type=\"text/javascript\">\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.validationEngine-en.js\" type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.validationEngine.js\" type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            //function to check hello field in the form\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\tjQuery(document).ready(function(){\n");
      out.write("\t\t\t// binds form submission and fields to the validation engine\n");
      out.write("\t\t\tjQuery(\"#formID\").validationEngine();\n");
      out.write("\t\t});\n");
      out.write("                    </script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"innerheader\">\n");
      out.write("                    <div id=\"title\">\n");
      out.write("                        <h1>UNOPASS</h1>\n");
      out.write("                        <h2></h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <div id=\"page\">\n");
      out.write("                    <div class=\"innerpage\">\n");
      out.write("                        <h2>Login</h2>\n");
      out.write("                        <p>\n");
      out.write("                            <form action=\"indexAction.jsp\" method=\"post\" id=\"formID\" class=\"formular\">\n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            UserName:\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" id=\"uname\" name=\"uname\" class=\"validate[required] text-input\"></input>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            MobileNo:\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"password\" id=\"Mob\" name=\"Mob\" class=\"validate[required] text-input\"></input>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                                        <td> <input type=\"submit\" value=\"Login\" style=\"background: red;font-weight:bolder\" onclick=\"return validate()\"></input><input type=\"reset\" value=\"Reset\" style=\"background: red;font-weight: bolder\"></input></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"color: red\">\n");
      out.write("                                            ");

                                            String st=request.getParameter("f");
                                            if(st!=null)
                                                {
                                                if(st.equals("1"))

                                                    {
                                                    out.print("Your account has been blocked..");
                                                }
                                            if(st.equals("2"))
                                                    {
                                                out.print("Entered wrong username or password");
                                                }
                                            }


      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                                    \n");
      out.write("                            </form>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <p></p>\n");
      out.write("                        <ul>\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                            &nbsp;&nbsp;&nbsp;\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <h3></h3>\n");
      out.write("                        <p></p>\n");
      out.write("                        <h3></h3>\n");
      out.write("                        <p><a href=\"\"></a> </p>\n");
      out.write("                        <h3></h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <p></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"sidebar\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Register.jsp\" class=\"selected\">Register Now</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
