<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Comparator"%> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome, <%=request.getAttribute("username")%>!</h1>
	<h3>Please enter Flight details</h3>
	<form action="search" method="post">
		<table>
			<tr>
				<td>From</td>
				<td><select name="from" class="field">
						  <c:forEach items="${depLocations}" var="depLocation">
							<option value="${depLocation}">${depLocation}</option>
						</c:forEach>  
						<!-- <option value="MUB">MUB</option>
						<option value="BGR">BGR</option>
						<option value="DEL">DEL</option>
						 -->
				</select></td>
			</tr>
			<tr>
				<td>To</td>
				<td><select name="to" class="field">
						 <c:forEach items="${arrLocations}" var="arrLocation">
							<option value="${arrLocation}">${arrLocation}</option>
						</c:forEach> 
						<!-- <option value="MUB">MUB</option>
						<option value="BGR">BGR</option>
						<option value="DEL">DEL</option>
 -->						
				</select></td>
			</tr>
			<tr>
				<td>Flight Class</td>
				<td><select name="flightclass" class="field">
						<option>E</option>
						<option>B</option>

				</select></td>
			</tr>
			<tr>
				<td>Flight Date(dd-MM-yyyy)</td>
				<td><input type="text" id="flightdate" name="date" class="field"></td>
			</tr>
			<tr>
				<td>Sort by</td>
				<td><select name="sortBy" class="field">
						<option>Fare</option>
						<option>Duration</option>
						<option>Both</option>
				</select></td>
			</tr>
			
		</table>
		<input type="submit" value="search" id="btn">
	</form>
	
</body>
</html>