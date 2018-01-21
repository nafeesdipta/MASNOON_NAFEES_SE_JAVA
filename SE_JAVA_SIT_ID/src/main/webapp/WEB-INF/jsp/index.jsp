<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    
    <title>Sweet Itech Products</title>
    
     <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/style.css" rel="stylesheet">
    
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/">New Product</a></li>
					<li><a href="/">Show Product</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<div class="container invisible-at-first" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome to Product List</h1>
				</div>
			</div>
<div class="container text-center" id="yaskDiv">
	<h3>Products List</h3>
	<hr>
	<div class="table-responsive">
		<table class="table table-stripped table-bordered">
		<tr>
			<th>Id</th>
			<th>RAM</th>
			<th>MotherBoard</th>
			<th>GraphicsCard</th>
			<th>Complete</th>
			<th></th>
			<th></th>
		</tr>
		<tbody>
			<c:forEach var="task" items="${tasks}">
				<tr>
					<td>${task.id}</td>
					<td>${task.ram}</td>
					<td>${task.motherboard}</td>
					<td>${task.graphicscard}</td>
					<td>${task.complete}</td>
					
					</tr>
			</c:forEach>
		
		</tbody>
		</table>
	
	</div>

</div>
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>	

</body>
</html>






