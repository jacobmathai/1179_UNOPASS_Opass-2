<%-- 
    Document   : ProfileAction
    Created on : 10 Dec, 2014, 5:24:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBConnection;"%>
<%
String un=session.getAttribute("uname").toString();
 String mob= request.getParameter("mob");
            String fn = request.getParameter("fname");
            String ln = request.getParameter("lname");
            String gen = request.getParameter("sex");
            String dob = request.getParameter("dob");
            String ph = request.getParameter("txtphone");
            String amob = request.getParameter("txtmobile");
            String em = request.getParameter("txtemail");
            String street = request.getParameter("txtstreet");
             String city = request.getParameter("txtcity");
            String zip = request.getParameter("txtzip");
            String state = request.getParameter("txtstate");
            String country = request.getParameter("txtcountry");
            String sql="update register set fname='"+fn+"',lname='"+ln+"',gender='"+gen+"',dob='"+dob+"',phone='"+dob+"',altmob='"+amob+"',email='"+em+"',streetname='"+street+"',city='"+city+"',zip='"+zip+"',state='"+state+"',country='"+country+"' where username='"+un+"'";
            int i=new DBConnection().putData(sql);
            if(i>0)
                {
                out.print("success");
                }
            else
                {
                out.print("failed");
                }
%>