<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
<script type="text/javascript" src="../js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row" id="header">
			<div class="col-md-12">
				<h1>Bit College</h1>
			</div>
		</div>
		<div class="row" id="menu">
			<div class="col-md-12 text-uppercase text-center bg-info">
				<a href="/spring02/index.bit">home</a>
				<a href="/spring02/emp/list.bit">emp</a>
				<a href="/spring02/dept/dept.bit">dept</a>
				<a href="/spring02/login.bit">login</a>
			</div>
		</div>
		<div class="row" id="content">
			<div class="col-md-12 text-center">
				<form class="form-horizontal" method="post">
					<div class="form-group">
						<label for="ename" class="col-sm-2 control-label">Name</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="ename" placeholder="name">
					    </div>
					</div>
					<div class="form-group">
						<label for="job" class="col-sm-2 control-label">Job</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="job" placeholder="job">
					    </div>
					</div>
					<div class="form-group">
						<label for="pay" class="col-sm-2 control-label">Salary</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="pay" placeholder="pay">
					    </div>
					</div>
					<div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					      <button type="submit" class="btn btn-default">Add</button>
					    </div>
					</div>
				</form>
			</div>
		</div>
		<div class="row" id="footer">
			<div class="col-md-12">
			<address>blah blah address</address>
			</div>
		</div>
	</div>
</body>
</html>