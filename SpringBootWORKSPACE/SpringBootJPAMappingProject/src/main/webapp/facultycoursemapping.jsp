<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 
<%@ taglib uri="jakarta.tags.core" prefix="c"%> 

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
<body>

<h2 align="center">SpringBoot JPA Relational Mapping</h2>

<a href="/">Home</a>&nbsp;&nbsp;
<a href="viewallcourses">View Courses</a>&nbsp;&nbsp;
<a href="viewfaculty">View Faculty</a>&nbsp;&nbsp;
<a href="fcoursemapping">Faculty Course Mapping</a>&nbsp;&nbsp;
<a href="viewfcoursemapping">View Faculty Course Mapping</a>&nbsp;&nbsp;


<br>

<h3 align="center" style="color:red">${message}</h3>

<form method="post" action="fcoursemappinginsert">
  <table align=center style="height:200px">
    <tr>
      <td><label>Select Faculty</label></td>
      <td>
        <select name="fid" required>
        
        <option value="">--Select--</option>
        
        <c:forEach items="${facultydata}" var="faculty"> 
        <option value="${faculty.id}">${faculty.id}</option>
        </c:forEach>
        
        </select>
        
      </td>
    </tr>
    <tr>
      <td><label>Select Course</label></td>
      <td>
        <select name="cid" required>
        
        <option value="">--Select--</option>
        
        <c:forEach items="${coursedata}" var="course"> 
        <option value="${course.id}">${course.coursecode}-${course.coursetitle}</option>
        </c:forEach>
        
        </select>
      </td>
    </tr>
    <tr>
      <td><label>Provide Section</label></td>
      <td>
        <input type="number" name="section" required>
      </td>
    </tr>
    <tr>
      <td><label>Select Faculty Type</label></td>
      <td>
        <select name="ftype" required>
          <option value="">--Select--</option>
          <option value="MAIN">Main Faculty</option>
          <option value="ASSISTANCE">Assistance Faculty</option>
        </select>
      </td>
    </tr>
    <tr>
    <td></td>
    </tr>
     <tr align="center">
       <td>
        <input type="submit" name="Submit" class="button">
      </td>
      <td>
        <input type="reset" name="Clear" class="button">
      </td>
    </tr>
  </table>
</form>



</body>
</html>