<%-- 
    Document   : ChangeMobileNo
    Created on : 5 Dec, 2014, 10:34:10 AM
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
        
        
        <%--  <script>
            function val()
            {
                  if(document.getElementById("pass1").value=="")
                {
                    alert("enter the password");
                    document.getElementById("pass1").focus();
                    return false;

                }
                  if(document.getElementById("nmob").value=="")
                {
                    alert("enter the Mobile No");
                    document.getElementById("nmob").focus();
                    return false;

                }
                  if(document.getElementById("cmob").value=="")
                {
                    alert("enter the Mobile No");
                    document.getElementById("cmob").focus();
                    return false;

                }
                 if(document.getElementById("nmob").value!=document.getElementById("cmob").value)
                    {
                      alert("Number missmatch");
                    document.getElementById("cmob").focus();
                    return false;
                    }
                }
        </script> --%>
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
                           
                                 <form action="ChangeMobileNoAction.jsp" id="formID" class="formular" method="post">
                              
                                <table>
                                    <tr>
                                        <td>
                                            Current Password:
                                        </td>
                                        <td>
                                            <input value="" class="validate[required] text-input" type="text" name="pass1" id="pass1" />
		    
                                          
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            MobileNo:

                                        </td>
                                        <td>
                                            <input value="" maxlength="10" class="validate[required,custom[integer],Size equals[10]] text-input" type="password" name="nmob" id="nmob" />                                         
                                           
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Confirm Mobile No:
                                        </td>
                                        <td>
                                            
                                            <input value="" class="validate[required,equals[nmob]] text-input" type="password" name="cmob" id="cmob" />
			
                                              </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="submit" value="Change" style="background: red;font-weight: bolder" onclick="return val()"></input>
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
                                                    out.print("MobileNo changed  succefully");

                                                }

                                                else
                                                    {
                                                        out.print("MobileNo not changed");
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
                        <li><a href="ChangePassword.jsp" >Change Password</a></li>
                        <li><a href="ChangeMobileNo.jsp" class="selected" >changeMobile No</a></li>
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


