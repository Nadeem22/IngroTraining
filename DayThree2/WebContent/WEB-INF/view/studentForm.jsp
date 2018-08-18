<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<style type="text/css">
.error{
  color: red;
}

</style>
</head>
<body>
<form:form action="processStudent" modelAttribute="student">

First Name(*) : <form:input path="firstName"/>
               <form:errors path="firstName" cssClass="error"></form:errors>
<br>
Last Name(*) : <form:input path="lastName"/>
                <form:errors path="lastName" cssClass="error"></form:errors>
<br>
Country : <form:select path="country">

        <form:options items="${student.countryOptions}"/>

</form:select>
<br>
Favorite Language : 
                   Java<form:radiobutton path="favoriteLanguage" value="Java"/>
                   .Net<form:radiobutton path="favoriteLanguage" value=".NET"/>
                   PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
<br>
Operating systems:
                  Linux<form:checkbox path="operatingSystems" value="Linux"/>
                  Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
                  Windows<form:checkbox path="operatingSystems" value="Windows"/>
<br>
<input type="submit" value="Submit">
</form:form>

</body>
</html>