<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Main Page</title>
	    <link rel="stylesheet" type="text/css"           
           href="${pageContext.request.contextPath}/resources/css/style-add-train.css">
	


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
    <li><a href="${pageContext.request.contextPath}">Home</a></li>
	<li><a  class="av" href="${pageContext.request.contextPath}/showAddTrainForm" class="av">Add Train</a></li>
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
   <h1>Add Train</h1><br>
   
   
   <form:form action="processTrainForm" modelAttribute="train">
   
   <form:hidden path="trainId"/>
    
   <div class ="add">
   <p style="color: green">${message1}</p>
     <p style="color: red">${message2}</p>
   </div>
   
    <div class ="add">
   	<p><label>Train Name</label></p>   
   	<div class ="textbox">
   	<form:input path="trainName"  />
    </div>
    </div>
    
    <div class ="add">
    <p><label>Train Fare</label></p>
    <div class ="textbox">
    <form:input path="trainFare" />
    </div>
    </div>
    
    <div class="add">
      <p><label>Number of seats</label></p>
       <div class ="textbox">
    <form:input path="numberOfSeats"  />
    </div>
    </div>
    
    <div class ="add">
      <p><label>From place</label></p>
       <div class ="textbox">
    <form:input path="fromPlace" />
    </div>
    </div>
    
    <div class ="add">
      <p><label>To place</label></p>
       <div class ="textbox">
    <form:input path="toPlace" />
    </div>
    </div>
    
    <div class ="add">
      <p><label>Duration(in hours)</label></p>
       <div class ="textbox">
    <form:input path="duration"  />
    </div>
    </div>

 
      
     <input type="submit"  id="sub "value="Save Train">
   
   
   </form:form>

</div>
<a style="color: #fff;font-size: 16px; padding-top: 100px;" href="${pageContext.request.contextPath}/showUserPage">Back</a>
</div>

<div id="footer">
	

</div>

</div>
</body>
</html>