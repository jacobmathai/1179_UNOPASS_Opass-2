<%-- 
    Document   : RegisterAction
    Created on : 10 Dec, 2014, 1:24:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBProcess,com.mtech.db.AeSimpleSHA1;"%>
<%
            String un = request.getParameter("username");
           
            String pswd = request.getParameter("pswd");
            
            String mob= request.getParameter("mob");
            String fn = request.getParameter("fname");
            String ln = request.getParameter("lname");
            String gen = request.getParameter("sex");
            String dob = request.getParameter("dob");
          //  String ph = request.getParameter("txtphone");
            String amob = request.getParameter("txtmobile");
            String em = request.getParameter("txtemail");
            String street = request.getParameter("txtstreet");
             String city = request.getParameter("txtcity");
            String zip = request.getParameter("txtzip");
            String state = request.getParameter("txtstate");
            String country = request.getParameter("txtcountry");
            String qn = request.getParameter("sec_qn");
            String  ans= request.getParameter("sec");
            String password=AeSimpleSHA1.SHA1("pswd");
       boolean b=DBProcess.insertRegister(un, pswd, mob, fn, ln, gen, dob, mob, amob, em, street, city, zip, state, country, qn, ans);
             
       
         //  boolean b=DBProcess.insertRegister(un, fn, gen, dob, mob, amob, em, street, city, zip, state, country, qn, ans, ln);
if(b==true)
    {
    response.sendRedirect("index.jsp");
    out.print("sucess");
    }
       else
           {
           response.sendRedirect("Register.jsp?f=1");
           out.print("failed");
}




%>