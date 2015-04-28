<%-- 
    Document   : DownloadAction
    Created on : 8 Dec, 2014, 11:24:01 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@ page import="java.io.*"%>
<%
String name="sms.apk";
String url=config.getServletContext().getRealPath("/")+"Download/"+"sms.apk";
String type=name.substring(name.indexOf(".")+1,name.length());
File F = new  File(url);
if(F.exists())
{
 response.setHeader("Content-Disposition","attachment;filename="+name);
 response.setHeader("Content-type","plain/"+type);
 ServletOutputStream sos=response.getOutputStream();
 FileInputStream fin=new FileInputStream(url);
 byte b[]=new byte[fin.available()];
 fin.read(b,0,b.length);
 sos.write(b);
 sos.flush();
 sos.close();
 }
%>