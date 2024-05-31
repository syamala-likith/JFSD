<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core"   prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
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
<h2 align=center>Spring Web MVC CRUD Operation with ORM (Hibernate)</h2><br>
<a href="home">Home</a>&nbsp;&nbsp;&nbsp;
<a href="addemp">Add Employee</a>&nbsp;&nbsp;&nbsp;
<a href="viewallemps">View All Employees</a>&nbsp;&nbsp;&nbsp;
<a href="updateemp">Update Employee</a>&nbsp;&nbsp;&nbsp;
<a href="deleteemp">Delete Employee</a>&nbsp;&nbsp;&nbsp;
<br><br>

<h3 align="center"><u>Delete Employee</u></h3>

<table align=center border=2>

<tr bgcolor="black" style="color:white">
<td>ID</td>
<td>NAME</td>
<td>GENDER</td>
<td>DATE OF BIRTH</td>
<td>COMPANY</td>
<td>DEPARTMENT</td>
<td>SALARY</td>
<td>LOCATION</td>
<td>MARITAL STATUS</td>
<td>EMAIL</td>
<td>CONTACT NO</td>
<td>ACTION</td>
</tr>

<c:forEach items="${empdata}" var="emp">
<tr>
<td><c:out value="${emp.id}"></c:out></td>
<td><c:out value="${emp.name}"></c:out></td>
<td><c:out value="${emp.gender}"></c:out></td>
<td><c:out value="${emp.dateofbirth}"></c:out></td>
<td><c:out value="${emp.company}"></c:out></td>
<td><c:out value="${emp.department}"></c:out></td>
<td><c:out value="${emp.salary}"></c:out></td>
<td><c:out value="${emp.location}"></c:out></td>
<td><c:out value="${emp.maritalstatus}"></c:out></td>
<td><c:out value="${emp.email}"></c:out></td>
<td><c:out value="${emp.contactno}"></c:out></td>

<td>
<a href='<c:url value="delete/${emp.id}"/>'>Delete</a>
</td>


</tr>
</c:forEach>


</table>


</body>
</html>