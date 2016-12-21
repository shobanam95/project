<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>
<div class="item">
              <img src="resources/images/logo.png">
      </div>
<h1>List Product</h1>
<h3><a href="addprdt">Add More Products</a></h3>

 <table align="left" border="1">
  <tr>
  <th>Product Id</th>
   <th>Product Name</th>
   <th>Product Description</th>
   <th>Product Price</th>
   <th>Category</th>
  </tr>


  <c:forEach items="${prdtlist}" var="Pr">
   <tr>
    <td>${Pr.product_Id}</td>
    <td>${Pr.product_Name}</td>
    <td>${Pr.product_Description}</td>
    <td>${Pr.product_Price}</td>
    <td>${Pr.category}</td>
  
   
   
   
		 <td align="center"><a href="editprdt?product_Id=${Pr.product_Id}">Edit</a> | <a href="deleteprdt?product_Id=${Pr.product_Id}">Delete</a></td>

 </tr>
   
   
  </c:forEach>
 </table>


</body>
</html>
<!--  
    <td><a href="getProduct/${Pr.product_Id}" >${Pr.product_Id}</a></td>
   		<td><a href="getProduct/${Pr.product_Id}" ><span class="glyphicon glyphicon-info-sign"></span></a>
		<a href="delete/${Pr.product_Id}"><span class="glyphicon glyphicon-trash"></span></a>
		<a href="editProduct/${Pr.product_Id }"><span class="glyphicon glyphicon-edit"></span></a>
		  -->  