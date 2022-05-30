package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import project.ConnectionProvider;

public final class addNewDonor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<style>\n");
      out.write("input[type=\"text\"], input[type=\"password\"], input[type=\"email\"], select,input[type=\"number\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    background:silver;\n");
      out.write("    height: 50px;\n");
      out.write("    font-size: 16px;\n");
      out.write("\tpadding:15px;\n");
      out.write("\twidth:60%;\t\n");
      out.write("\tborder-radius: 25px;\n");
      out.write("\tmargin-left:20%;\n");
      out.write("}\n");
      out.write("h2,h1\n");
      out.write("{\t\n");
      out.write("\tmargin-left:20%;\n");
      out.write("}\n");
      out.write("hr\n");
      out.write("{\n");
      out.write("width:60%;\t\n");
      out.write("}\n");
      out.write(".footer {\n");
      out.write("  \n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("   background-color: #FF0018;\n");
      out.write("   color: white;\n");
      out.write("   text-align: center;\n");
      out.write("   height:75px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");

   int id=1;
try
{
  Connection con=ConnectionProvider.getCon();
  Statement st=con.createStatement();
  ResultSet rs=st.executeQuery("select *from donor");
  if(rs.first())
{
  id=rs.getInt(1);
  id=id+1;
}
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<h1 style=\"color:red;\">Donor ID: ");
out.println(id);
      out.write("</h1>\n");

}
catch(Exception e)
{
}

      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <form action=\"addNewDonorAction.jsp\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"id\" value=\"");
out.println(id);
      out.write("\">\n");
      out.write("        <h2>Name</h2>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Name\" name=\"name\">\n");
      out.write("        <hr>\n");
      out.write("        <h2> Father Name</h2>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Father Name\" name=\"father\">\n");
      out.write("        <hr>\n");
      out.write("        <h2>Mother Name</h2>\n");
      out.write("               <input type=\"text\" placeholder=\"Enter Mother Name\" name=\"mother\">\n");
      out.write("               <hr>\n");
      out.write("               <h2>Mobile Number</h2>\n");
      out.write("               <input type=\"number\" placeholder=\"Enter Mobile Number\" name=\"mobilenumber\">\n");
      out.write("               <hr>\n");
      out.write("               <h2>Gender</h2>\n");
      out.write("               <select name=\"gender\">\n");
      out.write("                   <option value=\"Male\">Male</option>\n");
      out.write("                    <option value=\"Female\">Female</option>\n");
      out.write("                     <option value=\"Others\">Other</option>\n");
      out.write("               </select>\n");
      out.write("                <hr>\n");
      out.write("               <h2>Email</h2>\n");
      out.write("               <input type=\"email\" placeholder=\"Enter Email\" name=\"email\">\n");
      out.write("                <hr>\n");
      out.write("               <h2>Blood Group</h2>\n");
      out.write("               <select name=\"bloodgroup\">\n");
      out.write("                   <option value=\"A+\">A+</option>\n");
      out.write("                   <option value=\"A-\">A-</option>\n");
      out.write("                   <option value=\"B+\">B+</option>\n");
      out.write("                   <option value=\"B-\">B-</option>\n");
      out.write("                   <option value=\"O+\">O+</option>\n");
      out.write("                   <option value=\"O-\">O-</option>\n");
      out.write("                   <option value=\"AB+\">AB+</option>\n");
      out.write("                   <option value=\"AB-\">AB-</option>\n");
      out.write("                   </select>\n");
      out.write("                <hr>\n");
      out.write("               <h2>Address</h2>\n");
      out.write("               <input type=\"text\" placeholder=\"Enter Address\" name=\"address\">\n");
      out.write("               <br>\n");
      out.write("               <center><button type=\"submit\" class=\"button\">Save</button></center>\n");
      out.write("               \n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h4><center><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("       \n");
      out.write("<div class=\"footer\">\n");
      out.write("  <p>Blood Bank Management System\n");
      out.write("      <br>\n");
      out.write("      Made In India &copy; 2022\n");
      out.write("  </p>\n");
      out.write("</div>  </center></h4>\n");
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
