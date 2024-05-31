<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JPA Relational Mapping</title>
<style>

body
{
	background-color: lightblue;
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
select,input[type=date],input[type=datetime-local]
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
<body bgcolor=lightblue>

<h2 align="center">SpringBoot JPA Relational Mapping</h2>

<a href="/">Home</a>&nbsp;&nbsp;
<a href="viewallcourses">View Courses</a>&nbsp;&nbsp;
<a href="viewfaculty">View Faculty</a>&nbsp;&nbsp;
<a href="fcoursemapping">Faculty Course Mapping</a>&nbsp;&nbsp;
<a href="viewfcoursemapping">View Faculty Course Mapping</a>&nbsp;&nbsp;

<br><br>

<ol>
<li>View All Courses [Add Courses in table directly]
<li>View Faculty [Add Faculty in table directly]
<li>Faculty Course Mapping
<li>View Faculty Course Mapping
</ol>

</body>
</html>