<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
<h1>
First Name : ${student.firstName}
<br>
Last Name : ${student.lastName}
<br>
Country : ${student.country}
<br>
Favorite Language : ${student.favoriteLanguage}
<br>
Operating Systems : 

<ul>
<c:forEach var ="temp" items="${student.operatingSystems}">
<li>${temp}</li>

</c:forEach>

</ul>



</h1>>

</body>
</html>