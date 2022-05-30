package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import project.ConnectionProvider;

public final class makeRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/banner.html");
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

      out.write('\n');
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>ADMIN</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.css\">\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    .row{\r\n");
      out.write("        padding: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    .fa-tint{     \r\n");
      out.write("        color: red;    \r\n");
      out.write("    }\r\n");
      out.write("    .blood{\r\n");
      out.write("        float: right;\r\n");
      out.write("    }\r\n");
      out.write("    .fa-users{     \r\n");
      out.write("        color: blue; \r\n");
      out.write("        font-size: 3ex;   \r\n");
      out.write("    }\r\n");
      out.write("    .fa-spinner{     \r\n");
      out.write("        color: blue; \r\n");
      out.write("        font-size: 3ex;   \r\n");
      out.write("    }\r\n");
      out.write("    .fa-check-circle{     \r\n");
      out.write("        color: blue; \r\n");
      out.write("        font-size: 3ex;   \r\n");
      out.write("    }\r\n");
      out.write("    .xyz{     \r\n");
      out.write("        color: blue; \r\n");
      out.write("        font-size: 3ex;   \r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light fixed-top bg-danger\">\r\n");
      out.write("        <a style=\"color:white;\" class=\"navbar-brand\" href=\"/\"><i class=\"fab fa-gratipay\"></i>&nbsp;<font face = \"Comic sans MS\" size =\"4\">Blood Bank Management System</font></a>\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("        <div class=\"navbar-collapse collapse w-100 order-3 dual-collapse2\">\r\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" style=\"color: white;\" href=\"logout.jsp\">Logout &nbsp; <i class=\"fas fa-sign-out-alt\"></i></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
      out.write("    font-size: 14px;\n");
      out.write("\tpadding:15px;\n");
      out.write("\twidth:60%;\t\n");
      out.write("\tborder-radius: 25px;\n");
      out.write("\tmargin-left:20%;\n");
      out.write("        \n");
      out.write("}\n");
      out.write("h1{\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 18px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("h2\n");
      out.write("{\t\n");
      out.write("\tmargin-left:20%;\n");
      out.write("        font-size: 20px;\n");
      out.write("       \n");
      out.write("}\n");
      out.write("\n");
      out.write("hr\n");
      out.write("{\n");
      out.write("width:60%;\t\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img{\n");
      out.write("    background: transparent;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <br><br>\n");
      out.write("        <center> <img src=\"images/donor.jpg\" style=\"width:150px; height: 150px;\"/></center>\n");
      out.write("    <center><h1>MAKE BLOOD REQUEST</h1></center>\n");
      out.write("    <form action=\"makeRequestAction.jsp\" method=\"post\">\n");
      out.write("        \n");
      out.write("        <h2>Patient Name</h2>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Patient Name\" name=\"name\">\n");
      out.write("        <hr>\n");
      out.write("        <h2>Patient Age</h2>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Patient Age\" name=\"age\">\n");
      out.write("        <h2>Gmail</h2>\n");
      out.write("        <input type=\"text\" placeholder=\"Gmail\" name=\"gmail\">\n");
      out.write("        <hr>\n");
      out.write("      \n");
      out.write("               <h2>Reason</h2>\n");
      out.write("               <input type=\"text\" placeholder=\"Enter reason\" name=\"reason\">\n");
      out.write("               <hr>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("               <h2>Blood Group</h2>\n");
      out.write("               <select name=\"bloodgroup\">\n");
      out.write("                   <option>-select-</option>\n");
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
      out.write("                  \n");
      out.write("               <h2>Unit </h2>\n");
      out.write("               <input type=\"text\" placeholder=\"Enter Unit\" name=\"unit\">\n");
      out.write("               <br>\n");
      out.write("               <center><button type=\"submit\" class=\"button\">Save</button></center>\n");
      out.write("               \n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
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
