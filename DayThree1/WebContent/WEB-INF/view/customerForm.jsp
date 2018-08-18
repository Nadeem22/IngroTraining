<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style type="text/css">
.error{color:red}
</style>
</head>

<body>

<i>Fill out form.Asterisk(*) means required.</i>
<form:form action="processCustomer" modelAttribute="customer">

First Name : <form:input path="firstName"/>
<br><br>
Last Name : <form:input path="lastName"/>
            <form:errors path="lastName" cssClass="error"></form:errors>
<br><br>
Free Passes : <form:input path="freePasses"/>
              <form:errors path = "freePasses" cssClass="error"/>
<br><br>
Postal Code : <form:input path="postalCode"/>   
              <form:errors path = "postalCode" cssClass="error"></form:errors>           
   <br><br>       
 Course Code : <form:input path="courseCode"/>   
              <form:errors path = "courseCode" cssClass="error"></form:errors>           
   <br><br>    
<input type="submit" value="Submit">

</form:form>
</body>
</html>