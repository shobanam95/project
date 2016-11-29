<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Access Denied</title>
</head>
<body>
 <center>
  <br /> <br /> <br />
  <h1>
   Access Denied for User : <span style="color: red;">${checkname}</span>
  </h1>

   
   <a href = "loginpage" input type="submit" value="LOGIN" /></a> 

 </center>

</body>
</html>