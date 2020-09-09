<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css"/>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>
</body>
	<div class="container">
		<div class="row">
			<div class="col-md-12" id="header">
				<nav class="navbar navbar-default">
					<div class="container-fluid">
				    	<div class="navbar-header">
				    		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
						        <span class="sr-only">Toggle navigation</span>
						        <span class="icon-bar"></span>
						        <span class="icon-bar"></span>
						        <span class="icon-bar"></span>
					      	</button>
				      		<a class="navbar-brand" href="${pageContext.request.contextPath }/index.bit">
				        		<div>Bit College</div>
				      		</a>
				    	</div>
					  	<div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1">
						  	<p class="navbar-text"><a href="${pageContext.request.contextPath }/emp/list.bit">EMP</a></p>
						  	<p class="navbar-text"><a href="${pageContext.request.contextPath }/dept/list.bit">DEPT</a></p>
						  	<p class="navbar-text navbar-right"><a href="${pageContext.request.contextPath }/login.bit">LOGIN</a></p>
					  	</div>
				 	</div>
				</nav>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12" id="content">
				<img alt="college_front_picture" src="img/pexels-andrea-piacquadio-3762800.jpg" class="img-thumbnail">
			</div>
		</div>
		<div class="row">
			<div class="col-md-12" id="footer">
				<address>address</address>
			</div>
		</div>
	</div>
</html>
