<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jstl/core"   prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<style type="text/css">
body
{
	background-color: lightgrey;
}
.button {
  background-color: black;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

input[type=text],input[type=password],input[type=number],input[type=email],
select,input[type=date]
{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
}

</style>

</head>
<body>
<h2 align=center>Spring Web MVC CRUD Operation with JDBC</h2><br>
<a href="home">Home</a>&nbsp;&nbsp;&nbsp;
<a href="addemp">Add Employee</a>&nbsp;&nbsp;&nbsp;
<a href="viewallemps">View All Employees</a>&nbsp;&nbsp;&nbsp;
<a href="updateemp">Update Employee</a>&nbsp;&nbsp;&nbsp;
<a href="deleteemp">Delete Employee</a>&nbsp;&nbsp;&nbsp;
<br><br>

<h4 align="center"  style="color:red">
<c:out value="${message}"/>
</h4>

<h3 align="center"><u>Update Employee</u></h3>

<table align=center  border=2> 
<tr bgcolor="black" style="color:white">
<td>ID</td>
<td>NAME</td>
<td>GENDER</td>
<td>DEPARTMENT</td>
<td>SALARY</td>
<td>LOCATION</td>
<td>CONTACT NO</td>
<td>ACTION</td>
</tr>

<c:forEach items="${empdata}"  var="emp">
<tr>
<td><c:out value="${emp.id}" /></td>
<td><c:out value="${emp.name}" /></td>
<td><c:out value="${emp.gender}" /></td>
<td><c:out value="${emp.department}" /></td>
<td><c:out value="${emp.salary}" /></td>
<td><c:out value="${emp.location}" /></td>
<td><c:out value="${emp.contactno}" /></td>
<td>
<a href='<c:url value="empupdate?id=${emp.id}"></c:url>'>Update</a>
</td>

</tr>
</c:forEach>

</table>

</body>
</html>