<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Main Page</title>
	

	    <link rel="stylesheet" type="text/css"           
           href="${pageContext.request.contextPath}/resources/css/style-cancel-ticket.css">
	
  
  <script type="text/javascript">
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
<div class="topnav" id="nav">
<ul>
    <li><a  href="${pageContext.request.contextPath}" >Home</a></li>
	<li><a href="${pageContext.request.contextPath}/showTrainDetails">Train Details</a></li>
    <li><a  href="${pageContext.request.contextPath}/showFormForBookingTrain">Book Train</a></li>
    <li><a class="av" href="${pageContext.request.contextPath}/showFormForCancellingTicket">Cancel Ticket</a></li>
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
   <h1>Cancel Ticket</h1><br>
  
   
    <form:form action="${pageContext.request.contextPath}/processCancellingTicket" modelAttribute="trainBooking">
  
   <p style="color: green">${message1}</p>
    <p style="color: red">${message2}</p>
   	<p><label>Enter Contact Number</label></p>
   <form:input path="passengerContact" />
   
     <input type="submit"  value="Cancel Ticket">
    </form:form>

</div>

</div>



<div id="footer">
	

</div>

</div>
</body>
</html>