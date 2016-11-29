<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form:form  method = "post" action = "prdtlist" commandName="viewpro" >
<table>
  <tr>
           <td><form:label path="product_Name">Product Name:</form:label></td>
           <td><form:input path="product_Name" value = "${viewpro.product_Name }"/></td>
       </tr>
       <tr>
           <td><form:label path="product_Description">Product Description:</form:label></td>
           <td><form:input path="product_Description" /></td>
       </tr>
       <tr>
           <td><form:label path="product_Price">Product Price:</form:label></td>
           <td><form:input path="product_Price" /> </td>                                                                                                                        guy8/></td>
       </tr>
       <tr>
           <td><form:label path="category">Category:</form:label></td>
           <td><form:input path="category" /></td>
       </tr>

</table>
</form:form>
</body>
</html>