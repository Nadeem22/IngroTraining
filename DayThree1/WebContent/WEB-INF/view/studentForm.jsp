<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<form:form action="processStudent" modelAttribute="student">

First Name : <form:input path="firstName" />

<br><br>

Last Name  : <form:input path="lastName"/>

<br><br>

Country : <form:select path="country">
<form:options items="${student.countryOptions}"/>

</form:select>
<br><br>
Favorite Language :
                  Java <form:radiobutton path="favoriteLanguage" value="Java"/>
                  C-Lang <form:radiobutton path="favoriteLanguage" value="C-Lang"/>
                  C++<form:radiobutton path="favoriteLanguage" value="c++"/>
                  PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
<br><br>
Operating Systems:
                 Linux<form:checkbox path="operatingSystems" value="Linux"/>
                 Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
                 Windows<form:checkbox path="operatingSystems" value="Windows"/>

<br><br>
<input type="submit" value="Submit">

</form:form>

</body>
</html>