<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name : <form:input path="firstName"/>
<br>
Last Name : <form:input path="lastName"/>
<br>
Country:

<form:select path="country">

<form:option value="India" label="India"></form:option>
<form:option value="America" label="America"></form:option>
<form:option value="Uk" label="UK"></form:option>
<form:option value="Germany" label="Germany"></form:option>
</form:select>

<br>
<input type="submit" value="Submit">
</form:form>
</body>
</html>