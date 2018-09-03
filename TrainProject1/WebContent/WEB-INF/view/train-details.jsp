<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Main Page</title>
	<title>Main Page</title>
	    <link rel="stylesheet" type="text/css"           
           href="${pageContext.request.contextPath}/resources/css/style-train-details.css">
	


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
    <li><a  href="${pageContext.request.contextPath}" >Home</a></li>
	<li><a class="av" href="${pageContext.request.contextPath}/showTrainDetails">Train Details</a></li>
    <li><a href="${pageContext.request.contextPath}/showFormForBookingTrain">Book Train</a></li>
    <li><a href="${pageContext.request.contextPath}/showFormForCancellingTicket">Cancel Train</a></li>
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
  
  <table>
  <tr>
  <th>Train Name</th>
   <th>Train Fare</th>
    <th>Number of seats</th>
     <th>From Place</th>
      <th>To Place</th>
       <th>Duration</th>
  </tr>
  
  <c:forEach var="tempTrain" items="${trainDetails}">
  <tr>
  <td>${tempTrain.trainName}</td>
   <td>${tempTrain.trainFare}</td>
    <td>${tempTrain.numberOfSeats}</td>
     <td>${tempTrain.fromPlace}</td>
      <td>${tempTrain.toPlace}</td>
       <td>${tempTrain.duration}</td>
  </tr>
  </c:forEach>
  </table>

</div>
<a style="color: #fff;font-size: 16px; padding-top: 100px;" href="${pageContext.request.contextPath}">Back to Home Page</a>
</div>

<div id="footer">
	

</div>

</div>
</body>
</html>