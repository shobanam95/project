<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
<body>
<div class="item">
              <img src="resources/images/logo.png">
      </div>
<h1>List Product</h1>
<h3><a href="addprdt">Add More Products</a></h3>

 <table id = "customers">
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
  
   
   
   
		 <td align="center"><a href="editprdt?product_Id=${Pr.product_Id}">Edit</a> | <a href="deleteprdt?product_Id=${Pr.product_Id}"onclick="return confirm('Are you sure you want to Delete?');">Delete</a></td>

 </tr>
   
   
  </c:forEach>
 </table>


</body>
</html>
 