<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
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

ID : ${emp.id} <br>
NAME : ${emp.name} <br>
GENDER : ${emp.gender} <br>
DOB : ${emp.dateofbirth} <br>
COMPANY : ${emp.company} <br>
DEPARTMENT : ${emp.department} <br>
SALARY : ${emp.salary} <br>
LOCATION : ${emp.location} <br>
MARITAL STATUS : ${emp.maritalstatus} <br>
EMAIL : ${emp.email} <br>
CONTACT : ${emp.contactno} <br>

</body>
</html>