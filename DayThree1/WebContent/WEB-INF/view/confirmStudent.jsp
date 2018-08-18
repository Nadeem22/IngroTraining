<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm student</title>
</head>
<body>
<h1>
First Name is : ${student.firstName}
<br>
Last Name is  :${student.lastName}
<br>
Country       :${student.country}  
</h1>
<br>
<h1>Favorite Language : ${student.favoriteLanguage}</h1>

<br>
<h1>Operating Systems : 

<ul>
       <c:forEach var="temp" items="${student.operatingSystems}" > 
<li>${temp}</li>
</c:forEach>
</ul>
</h1>
</body>
</html>