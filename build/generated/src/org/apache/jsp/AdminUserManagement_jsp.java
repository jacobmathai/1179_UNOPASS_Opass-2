package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mtech.db.DBConnection;import java.sql.ResultSet;;

public final class AdminUserManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String ar[] = new  String[9];int i;
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
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\" type=\"text/css\" />\n");
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
      out.write("                        <h2> User Management</h2>\n");
      out.write("\n");
      out.write("                        <form action=\"\" method=\"post\">\n");
      out.write("\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>\n");
      out.write("                                        UserName\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        email\n");
      out.write("                                    </th>\n");
      out.write("                                  \n");
      out.write("                                    <th>\n");
      out.write("                                        Street\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        city\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        state\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        country\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        block/unblock\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        delete\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                ");
      out.write("\n");
      out.write("                                 ");

                                 try
                                         {

                                             String sql  = "select * from register join login on register.username=login.username";
                                    ResultSet rs = new DBConnection().getData(sql);
                                    while(rs.next())
                                        {
                                        ar[0]=rs.getString("username");
                                        ar[1]=rs.getString("email");
                                        ar[2]=rs.getString("altmob");
                                        ar[3]=rs.getString("dob");
                                        ar[4]=rs.getString("streetname");
                                         ar[5]=rs.getString("city");
                                        ar[6]=rs.getString("state");
                                        ar[7]=rs.getString("country");
                                        i=rs.getInt("status");
                                       

                                
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print( ar[0]);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print( ar[1] );
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                 \n");
      out.write("                                 <td>\n");
      out.write("                                    ");
      out.print(ar[4]);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                 <td>\n");
      out.write("                                    ");
      out.print(ar[5]);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                 <td>\n");
      out.write("                                    ");
      out.print(ar[6]);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                 <td>\n");
      out.write("                                    ");
      out.print(ar[7]);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    ");

                                    if(i==1)
                                        {
                                    
      out.write("\n");
      out.write("                                    <a href=\"Block.jsp?st=1&user=");
      out.print( ar[0]);
      out.write("\" style=\"color: red\">Block</a>\n");
      out.write("                                    ");

                                    }
                                        else
                                            {
                                            
      out.write("\n");
      out.write("                                  <a href=\"Block.jsp?st=0&user=");
      out.print( ar[0]);
      out.write("\" style=\"color: green\">Unblock</a>\n");
      out.write("                                          ");
  }
                                    
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                     <a href=\"Delete.jsp?user=");
      out.print( ar[0]);
      out.write("\" style=\"color: purple\">Delete</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                                ");

                                   }
                                    }
                                    catch(Exception e)
                                            {
                                        e.printStackTrace();
                                        }
                                
      out.write("\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("\n");
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
      out.write("                         <li><a href=\"AdminHome.jsp\" >AdminHome</a></li>\n");
      out.write("                       <li><a href=\"AdminUserManagement.jsp\" class=\"selected\">User Management</a></li>\n");
      out.write("           \n");
      out.write("                           <li><a href=\"Logout.jsp\" >Logout</a></li>\n");
      out.write("\n");
      out.write("                   \n");
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
      out.write("\n");
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
