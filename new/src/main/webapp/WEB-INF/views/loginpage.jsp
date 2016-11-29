<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<style>
@import url(http://fonts.googleapis.com/css?family=Open+Sans:400,700);
body {background: #456;font-family: 'Open Sans', sans-serif;}
.login { width: 400px;margin: 16px auto;font-size: 16px;}

.login-header,.login p { margin-top: 0;margin-bottom: 0;}

.login-triangle {width: 0;margin-right: auto;margin-left: auto;border: 12px solid transparent;border-bottom-color: #28d;}
.login-header {background: #28d;padding: 20px;font-size: 1.4em;font-weight: normal;text-align: center;text-transform: uppercase;color: #fff;}
.login-container {background: #ebebeb;padding: 12px;}

.login p {padding: 12px;}
.login input {box-sizing: border-box;display: block;width: 100%;border-width: 1px;border-style: solid;padding: 16px;outline: 0;font-family: inherit;font-size: 0.95em;}
.login input[type="email"],.login input[type="password"] {background: #fff;border-color: #bbb;color: #555;}

.login input[type="email"]:focus, .login input[type="password"]:focus {  border-color: #888;}
.login input[type="submit"] {background: #28d;border-color: transparent;color: #fff;cursor: pointer;}
.login input[type="submit"]:hover {background: #17c;}

.login input[type="submit"]:focus {border-color: #05a;}
@media all and (max-width:450px){
.login {width: 95%;}
}

</style>



<body>



<h1>Login</h1>
<form action = "loginpage" method="post" >
<div class="container">
	<div class="row">
		<div class="login">
		
  <div class="login-triangle"></div>
  
  <h2 class="login-header">Log in</h2>


  <div class="login-container">
  
    <p><input id="username" type="text" name="checkname"  required="true" ></p>
    <p><input id="password" type="password" name="checkpwd" required ="true" ></p>
   
    <p> <input type="submit" value="Log in"></p>
 </div>

</div>
	</div>
	
</div>
</form>
</body>
</html> 