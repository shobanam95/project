<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <meta charset="utf-8"> 
  <meta name="viewport" content="width=device-width, initial-scale=1"> 
   <link rel="stylesheet" href="<c:url value='resources/bootstrap-3.3.7-dist/css/bootstrap.min.css'/>"/> 
 <script src="<c:url value='resources/bootstrap-3.3.7-dist/js/jquery.min.js'/>"/></script> 
  <script src="<c:url value='resources/bootstrap-3.3.7-dist/js/bootstrap.min.js'/>"/></script>
  
</head>
<body>



<form:form method = "post" action="./editprdt" commandName="editobj">
		<table>
		<tr>
		 
			<td><form:label path="product_Id">Product Id:</form:label></td>
			<td><form:input path="product_Id"/></td>
			
			
        </tr>
        
     <tr>
           <td><form:label path="product_Name">Product Name:</form:label></td>
           <td><form:input path="product_Name" value = "${editobj.product_Name }"/></td>
       </tr>
       <tr>
           <td><form:label path="product_Description">Product Description:</form:label></td>
           <td><form:input path="product_Description"/></td>
       </tr>
       <tr>
           <td><form:label path="product_Price">Product Price:</form:label></td>
           <td><form:input path="product_Price"/></td>
       </tr>
       <tr>
           <td><form:label path="category">Category:</form:label></td>
           <td><form:input path="category" /></td>
       </tr>
         
   
	     <tr>
	    <td colspan="2">
	     <form:button type="update" value="update" class="btn btn-primary btn-block">UPDATE</form:button> 
          <form:button type="reset"  value="reset" onclick="Product" class="btn btn-primary btn-block">RESET</form:button>
	    </td>
	    </tr>
		</table>
	</form:form>
</body>
</html>
