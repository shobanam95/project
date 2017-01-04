<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	 <html>
<head>

</head>
<body>
 
 	<h3>ITEMS IN CART</h3>
 <form:form method = "post" action = "viproduct/addcarts" commandName="cart">
	
		<table class="tg">
			<tr>
				
				<th width="120">Cart Price</th>
				<th width="120">Product quantity</th>
				<th width="60">Product Name</th>
			    
			     
			     <th width="120">Remove from Cart</th>
			      <th width="120">Buy</th>
			
			</tr>
			
			<c:forEach items="${cart}" var="ct">
				<tr>
					
					<td>${ct.price}</td>
					<td>${cart.quantity}</td>
					<td>${ct.getproduct_Name()}</td>
					
					
					
					
 
					 
				</tr>
			</c:forEach>
		</table>
	</form:form>
	
</body>
</html>
