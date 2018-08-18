<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
<h1>
The customer is confirmed : ${customer.firstName} ${customer.lastName}

<br>
Free Passes : ${customer.freePasses}
<br>
Postal Code : ${customer.postalCode}
<br>
Course Code : ${customer.courseCode}
</h1>
</body>
</html>