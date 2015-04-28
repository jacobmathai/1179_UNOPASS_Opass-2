/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtech.db;

import java.sql.ResultSet;

/**
 *
 * @author Acer
 */
public class DBProcess {

    public static boolean insertRegister(String uname, String pass,String mobile, String fname, String lname, String gender, String dob, String phone,String amob, String email, String street, String city, String zip, String state, String country, String secqn, String answer) {
        boolean b=false;
        String sql1 = "insert into register(username,fname,lname,gender,dob,phone,email,streetname,city,zip,state,country,securityqn,answer,altmob) values('" + uname + "','" + fname + "','" + lname + "','" + gender + "','" + dob + "','" + phone + "','" + email + "','" + street + "','" + city + "','" + zip + "','" + state + "','" + country + "','" + secqn + "','" + answer + "','"+amob+"')";
        String sql2="insert into login(username,password,status,usertype) values('"+uname+"','"+pass+"',1,'normal')";
        System.out.println(sql1);
        System.out.println(sql2);
        DBConnection db=new DBConnection();
        int i=db.putData(sql1);
       int j= db.putData(sql2);
       if(i>0&&j>0)
       {
          b=true; 
       }
       return b;
    }
    public static String loginCheck(String uname,String pass)
    {
            String res="";
        try{
    
        String sql="select * from login where username='"+uname+"' and password='"+pass+"'";
        System.out.println(sql);
      ResultSet rs=  new DBConnection().getData(sql);
        if(rs.next())
        {
           String utype=rs.getString("usertype");
          int status=rs.getInt("status");
             System.out.println(utype+"///////////"+status);
           if(utype.trim().equals("admin"))
           {
            
              res="admin";
           }
           if(utype.trim().equals("normal"))
           {
               if(status==1)
               {
                   res="normal";
               }
               else
               {
                   res="block";
               }
           }

        }
        else
        {
          res="invalid";
        }
        }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        return res;
    }
}
