<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <form:form  action="updateproduct" method="post" commandName="prdt1">   
        
         <table>
       <tr>
           <td><form:label path="product_Name">Product Name:</form:label></td>
           <td><form:input path="product_Name" value="${prdt1.product_Name}"/></td>
       </tr>
       <tr>
           <td><form:label path="product_Description">Product Description:</form:label></td>
           <td><form:input path="product_Description" value="${prdt1.product_Description}"/></td>
       </tr>
       <tr>
           <td><form:label path="product_Price">Product Price:</form:label></td>
           <td><form:input path="product_Price" value="${prdt1.product_Price}"/></td>
       </tr>
       <tr>
           <td><form:label path="category">Category:</form:label></td>
           <td><form:input path="category" value="${prdt1.category}"/></td>
       </tr>
                 <tr>
         <td colspan="2"><input type="submit" value="update"/></td>
        </tr>
   
        </table> 
  </form:form>
  
  <c:if test="${!empty Product}">
  <h2>List Products</h2>
 <table align="left" border="1">
  <tr>
   <th>Product Name</th>
   <th>Product Description</th>
   <th>Product Price </th>
   <th>Category</th>
   <th>Actions on Row</th>
           
  </tr>
  
  <c:forEach items ="${Product}" >

          
   <tr>
    <td><c:out value= "${product_name}" /></td>
    <td><c:out value="${product_Description}" /></td>
    <td><c:out value="${product_Price}"/></td>
    <td><c:out value="${category}"/></td>
   
    <td align="center"><a href="edit.html?id=${employee.id}">Edit</a> | <a href="delete.html?id=${employee.id}">Delete</a></td>
   </tr>
 </c:forEach>
 </table>
  
</c:if>
</body>
</html>