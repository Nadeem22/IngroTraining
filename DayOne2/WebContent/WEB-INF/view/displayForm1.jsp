<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form1 data</title>
</head>
<body>
<h1>
Your Info :<br>
First Name : ${param.fname } <br>
Last Name :  ${param.lname}   <br>
Address    : ${param.address}  <br>

</h1>

<a href="showForm2">Adding Data</a>
</body>
</html>