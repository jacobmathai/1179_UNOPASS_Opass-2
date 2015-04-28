<%-- 
    Document   : indexAction
   Created on : 8 Dec, 2014, 2:24:01 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mtech.db.DBProcess,com.mtech.db.AeSimpleSHA1;"%>
<%
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
           // String pswd = AeSimpleSHA1.SHA1(pass);
            String res = DBProcess.loginCheck(uname, pass);
            if (res.equals("admin")) {
                session.setAttribute("uname", uname);
                session.setAttribute("pass", pass);
                response.sendRedirect("AdminHome.jsp");

            }
            if (res.equals("normal")) {
                session.setAttribute("uname", uname);
                session.setAttribute("pass", pass);
                response.sendRedirect("UserHome.jsp");

            }
            if (res.equals("block")) {
                response.sendRedirect("index.jsp?f=1");
            }
            if (res.equals("invalid")) {
                response.sendRedirect("index.jsp?f=2");
            }
%>
