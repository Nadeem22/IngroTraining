<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Main Page</title>
	<title>Main Page</title>
	    <link rel="stylesheet" type="text/css"           
           href="${pageContext.request.contextPath}/resources/css/style-page2.css">
	


<script type="text/javascript" src="${pageContext.request.contextPath}/resources/jquery/jquery-3.3.1.js"></script>
  <script type="text/javascript">
  $(document).ready(function(){
          $("ul li a").click(function(){
            $("a").removeClass("av");
            $(this).addClass("av");
        });
  });
  </script>
</head>
<body>

<div id="wrapper">

<!-- header-->
<div id="header">
<div id="logo">
<img src="${pageContext.request.contextPath}/resources/images/logo4.png">
</div>
<div id="banner">
<img src="${pageContext.request.contextPath}/resources/images/banner1.jpg">
</div>
</div>

<!-- navigation-->
<div id="nav">
<ul>
    <li><a class="av" href="${pageContext.request.contextPath}" >Home</a></li>
	<li><a href="${pageContext.request.contextPath}/showAddTrainForm">Add Train</a></li>
    <li><a href="${pageContext.request.contextPath}/showTrainList">Update Train</a></li>
    <li><a href="${pageContext.request.contextPath}/displayTrainAndPassengerList">Display Train and Passanger List</a></li>
</ul>
</div>

<!-- container-->
<div id="container" style="background-image: url(${pageContext.request.contextPath}/resources/images/train.jpg);
                          background-size: cover;
	                       background-position: bottom;
	                         background-repeat: no-repeat;width: 96%;
	                       height: 97%;
	                      position: relative;" >
<div id="form">
  

</div>
<a style="color: #fff;font-size: 16px; padding-top: 100px;" href="${pageContext.request.contextPath}">Back to Home Page</a>
</div>

<div id="footer">
	

</div>

</div>
</body>
</html>