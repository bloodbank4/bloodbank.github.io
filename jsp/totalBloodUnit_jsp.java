package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import project.ConnectionProvider;
import java.sql.Connection;

public final class totalBloodUnit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.css\">\n");
      out.write("<style>\n");
      out.write("input[type=\"text\"], input[type=\"password\"], input[type=\"submit\"],select\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    background:silver;\n");
      out.write("    height: 50px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    \n");
      out.write("\tmargin-left:35%;\n");
      out.write("\tpadding:15px;\n");
      out.write("\twidth:33%;\t\n");
      out.write("\tborder-radius: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers {\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 55%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("  padding-top: 12px;\n");
      out.write("  padding-bottom: 12px;\n");
      out.write("  text-align: left;\n");
      out.write("  background-color: red;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light fixed-top bg-danger\">\n");
      out.write("        <a style=\"color:white;\" class=\"navbar-brand\" href=\"/\"><i class=\"fab fa-gratipay\"></i>&nbsp;<font face = \"Comic sans MS\" size =\"4\">Welcome to admin Home</font></a>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <div class=\"navbar-collapse collapse w-100 order-3 dual-collapse2\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: white;\" href=\"logout.jsp\">Logout &nbsp; <i class=\"fas fa-sign-out-alt\"></i></a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container\"></div>\n");
      out.write("        <br>\n");
      out.write("        ");

            String msg=request.getParameter("msg");
            if("invalid".equals(msg))
            {
                
      out.write("\n");
      out.write("                <center><font color=\"red\" size=\"5\">Some thing went wrong! Try Again</font>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");

            if("valid".equals(msg))
            {
                
      out.write("\n");
      out.write("                <center><font color=\"red\" size=\"5\">Successfully Updated</font>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("              \n");
      out.write("                <br>\n");
      out.write("                <center>\n");
      out.write("                    <table id=\"customers\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Blood Group</th>\n");
      out.write("                            <th>Unit</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            ");

                            try
                            {
                                Connection con=ConnectionProvider.getCon();
                              Statement st=con.createStatement();
                                ResultSet rs=st.executeQuery("select *from stock");
                                while(rs.next())
                                {
                            
                            
      out.write("\n");
      out.write("                            <td>");
      out.print(rs.getString(1));
      out.write("\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("                           </tr>\n");
      out.write("                           ");

                                }
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                                
                            }
                            
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </center>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("         \n");
      out.write("    \n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h4><center><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("       \n");
      out.write("<div class=\"footer\">\n");
      out.write("  <p>Blood Bank Management System\n");
      out.write("      <br>\n");
      out.write("      Made In India &copy; 2022\n");
      out.write("  </p>\n");
      out.write("\n");
      out.write("</div>  </center></h4>\n");
      out.write("</body>\n");
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
