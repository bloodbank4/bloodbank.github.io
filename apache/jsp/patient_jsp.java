package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import project.ConnectionProvider;

public final class patient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("  float: left;\r\n");
      out.write("  border-right:1px solid #bbb;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li:last-child {\r\n");
      out.write("  border-right: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover:not(.active) {\r\n");
      out.write("  background-color: #111;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("  <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("  <li><a href=\"addNewDonor.jsp\">Add New Donor</a></li>\r\n");
      out.write("  <li><a href=\"editDeleteList.jsp\">Edit,Delete & List of Donor Details</a></li>\r\n");
      out.write("    <li><a href=\"manageStock.jsp\">Manage Stock</a></li>\r\n");
      out.write("  <li><a href=\"requestForBlood.jsp\">Request for Blood</a></li>\r\n");
      out.write("  <li><a href=\"requestCompleted.jsp\">Request Completed</a></li>\r\n");
      out.write("  <li style=\"float:right\"><a href=\"adminLogin.jsp\">Logout</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymou\">\n");
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
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light fixed-top bg-danger\">\n");
      out.write("        <a style=\"color:white;\" class=\"navbar-brand\" href=\"/\"><i class=\"fab fa-gratipay\"></i>&nbsp;<font face = \"Comic sans MS\" size =\"4\">Blood Bank Management System</font></a>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <div class=\"navbar-collapse collapse w-100 order-3 dual-collapse2\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: white;\" href=\"adminHome.jsp\">Logout &nbsp; <i class=\"fas fa-sign-out-alt\"></i></a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("<br>\n");
      out.write("<br>\n");

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
      out.write("    <form action=\"patientAction.jsp\" method=\"post\">\n");
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
      out.write("<h3><center>All Right Reserved @ BTech Days :: 2020  </center></h3>\n");
      out.write("\n");
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
