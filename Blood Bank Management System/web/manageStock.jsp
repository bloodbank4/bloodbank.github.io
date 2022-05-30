<%-- 
    Document   : manageStock
    Created on : 24 Apr, 2022, 10:11:16 PM
    Author     : anushka  singh
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.html"%>
<html>
<head>
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="style.css" type="text/css" media="screen">
<style>
input[type="text"], input[type="password"], input[type="submit"],select
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	margin-left:35%;
	padding:15px;
	width:33%;	
	border-radius: 25px;
}

#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 55%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>
    <div class="container"></div>
        <br>
        <%
            String msg=request.getParameter("msg");
            if("invalid".equals(msg))
            {
                %>
                <center><font color="red" size="5">Some thing went wrong! Try Again</font>
                <%}%>
                <%
            if("valid".equals(msg))
            {
                %>
                <center><font color="red" size="5">Successfully Updated</font>
                <%}%>
                
                <nav class="navbar navbar-expand-lg navbar-light fixed-top bg-danger">
        <a style="color:white;" class="navbar-brand" href="/"><i class="fab fa-gratipay"></i>&nbsp;<font face = "Comic sans MS" size ="4">Blood Bank Management System</font></a>
        
      
        <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" style="color: white;" href="adminHome.jsp">Logout &nbsp; <i class="fas fa-sign-out-alt"></i></a>
                </li>
                
            </ul>
        </div>
      </nav>
                <br><br>
                
                <form action="manageStockAction.jsp" method="post">
                    <div class="form-group">
                        <center><h2>Select Blood Group</h2></center>
                        <select name="bloodgroup">
                            <option value="A+">A+</option>
                            <option value="A-">A-</option>
                            <option value="B+">B+</option>
                            <option value="B-">B-</option>
                            <option value="O+">O+</option>
                            <option value="O-">O-</option>
                            <option value="AB+">AB+</option>
                            <option value="AB-">AB-</option>
                        </select>
                        <center><h2>Select Increase/Decrease</h2></center>
                        <select name="incdec">
                            <option value="inc">Increase</option>
                            <option value="dec">Decrease</option></select>
                        <center><h2>Unit</h2></center>
                        <input type="text" placeholder="Enter Unit" name="unit">
                        <center><button type="submit" class="button">Save</button></center>
                           
                    </div>
                </form>
                <br>
                <center>
                    <table id="customers">
                        <tr>
                            <th>Blood Group</th>
                            <th>Unit</th>
                        </tr>
                        <tr>
                            <%
                            try
                            {
                                Connection con=ConnectionProvider.getCon();
                              Statement st=con.createStatement();
                                ResultSet rs=st.executeQuery("select *from stock");
                                while(rs.next())
                                {
                            
                            %>
                            <td><%=rs.getString(1)%>
                            <td><%=rs.getString(2)%>
                           </tr>
                           <%
                                }
                            }
                            catch(Exception e)
                            {
                                System.out.println(e);
                                
                            }
                            %>
                    </table>
                </center>
            
                
         
    
<br>
<br>
<br>
<br>

</body>
</html>
