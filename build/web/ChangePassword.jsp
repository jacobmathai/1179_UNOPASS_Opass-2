<%-- 
    Document   : ChangePassword
    Created on : 6 Dec, 2014, 11:34:10 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>foxy - free web template</title>
        <link rel="stylesheet" href="styles.css" type="text/css" />
         <link rel="stylesheet" href="css/validationEngine.jquery.css" type="text/css"/>
	
        
        <script src="js/jquery-1.7.2.min.js" type="text/javascript">
	</script>
        
        <script src="js/jquery.validationEngine-en.js" type="text/javascript" charset="utf-8">
	</script>
        
        <script src="js/jquery.validationEngine.js" type="text/javascript" charset="utf-8">
	</script>
         <script>
             
		jQuery(document).ready(function(){
			// binds form submission and fields to the validation engine
			jQuery("#formID").validationEngine();
		});
         </script>
        
        
        
         <%--   
        <script>
             function val1()
            {
                  if(document.getElementById("pass").value=="")
                {
                    alert("enter the Password");
                    document.getElementById("pass").focus();
                    return false;

                }
                  if(document.getElementById("npass").value=="")
                {
                    alert("enter the Password");
                    document.getElementById("npass").focus();
                    return false;

                }
                  if(document.getElementById("cpass").value=="")
                {
                    alert("enter the Password");
                    document.getElementById("cpass").focus();
                    return false;

                }
                 if((document.getElementById("npass").value)!=(document.getElementById("cpass").value))
                    {
                      alert("password missmatch");
                    document.getElementById("cpass").focus();
                    return false;
                    }
                }
        </script>
         --%>
    </head>
    <body>
        <div id="wrap">

            <div id="header">
                <div id="innerheader">
                    <div id="title">
                        <h1>UNOPASS</h1>
                        <h2></h2>
                    </div>
                </div>
            </div>

            <div id="content">
                <div id="page">
                    <div class="innerpage">

                        <h2>Change Password</h2>
                        <p>
                            <form action="ChangepasswordAction.jsp" method="post"id="formID" class="formular" >
                                <table>
                                    <tr>
                                        <td>
                                            Current Password:
                                        </td>
                                        <td>
                                            <input value="" class="validate[required] text-input" type="password" name="pass" id="pass" />
		
                                          
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Password:
                                        </td>
                                        <td>
                                            <input value="" class="validate[required,minSize[6]] text-input" type="password" name="npass" id="npass" />
		
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Confirm Password:
                                        </td>
                                        <td>
                                           
                                            <input value="" class="validate[required,equals[npass]] text-input" type="password" name="cpass" id="cpass" />
		
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="submit" value="Change" style="background: red;font-weight: bolder" onclick="return val1()"></input>
                                            <input type="reset" value="Clear" style="background: red;font-weight: bolder"></input>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="color: green" >
                                            <%
                                            String s=request.getParameter("f");
                                            if(s!=null)
                                                {
                                                if(s.equals("1"))
                                                    {
                                                    out.print("password changed  succefully");

                                                }

                                                else
                                                    {
                                                        out.print("password not changed");
                                                    }

                                               }
                                            
                                            %>
                                        </td>
                                    </tr>

                                </table>
                            </form>
                        </p>

                        <p></p>
                        <ul>
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                        </ul>

                        <h3></h3>
                        <p></p>
                        <h3></h3>
                        <p><a href=""></a> </p>
                        <h3></h3>


                        <p></p>
                    </div>
                </div>
                <div id="sidebar">
                    <ul>
                        <li><a href="UserHome.jsp" >Home</a></li>
                        <li><a href="ChangePassword.jsp" class="selected">Change Password</a></li>
                        <li><a href="ChangeMobileNo.jsp" >changeMobile No</a></li>
                            <li><a href="Download.jsp" >DownLoad</a></li>
   <li><a href="Profile.jsp" >Profile view&edit</a></li>
      <li><a href="Logout.jsp" >Logout</a></li>
                    </ul>
                </div>
                <div class="clear"></div>
            </div>

            <div id="footer">

            </div>
        </div>

    </body>
</html>


