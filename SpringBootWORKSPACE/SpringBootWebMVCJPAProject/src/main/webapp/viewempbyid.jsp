<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 
<%@ taglib uri="jakarta.tags.core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c1" %>
 
<html> 
<head> 
 
<link type="text/css" rel="stylesheet" href="css/style.css"> 
 
<style> 
 
 
</style> 
</head> 
<body> 


<%@ include file="adminnavbar.jsp" %>

ID : ${emp.id}<br>
Name : ${emp.name}<br>
Gender : ${emp.gender}<br>
DateofBirth : ${emp.dateofbirth}<br>
Department : ${emp.department}<br>
Salary : ${emp.salary}<br>
Email : ${emp.email}<br>
Location : ${emp.location}<br>
Contact No : ${emp.contact}<br>
Status : ${emp.active}

</body>
</html>