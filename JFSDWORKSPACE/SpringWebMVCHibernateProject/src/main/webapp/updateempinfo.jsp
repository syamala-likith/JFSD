<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
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
<h2 align=center>Spring Web MVC CRUD Operation with ORM (Hibernate)</h2><br>
<a href="home">Home</a>&nbsp;&nbsp;&nbsp;
<a href="addemp">Add Employee</a>&nbsp;&nbsp;&nbsp;
<a href="viewallemps">View All Employees</a>&nbsp;&nbsp;&nbsp;
<a href="updateemp">Update Employee</a>&nbsp;&nbsp;&nbsp;
<a href="deleteemp">Delete Employee</a>&nbsp;&nbsp;&nbsp;
<br><br>

<form method="post" action="update">

<table align=center>

<tr>
<td><label>ID</label></td>
<td><input type="number" name="id" value="${id}" readonly required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Name</label></td>
<td><input type="text" name="name" required></td>
</tr>

<tr><td></td></tr>


<tr>
<td><label>Salary</label></td>
<td><input type="number" name="sal" step="0.01"  required></td>
</tr>

<tr><td></td></tr>


<tr>
<td><label>Password</label></td>
<td><input type="password" name="pwd" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Contact No</label></td>
<td><input type="number" name="contact" required></td>
</tr>

<tr><td></td></tr>
<tr><td></td></tr>

<tr align=center>
<td><input type="submit" value="Update" class="button"></td>
<td><input type="submit" value="Clear" class="button"></td>
</tr>

</table>


</form>


</body>
</html>