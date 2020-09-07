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
				<table class="table">
					<tr>
						<th>empno</th>
						<th>ename</th>
						<th>job</th>
						<th>pay</th>
						<th>hiredate</th>
					</tr>
				<c:forEach items="${list }" var="vo">
					<tr>
						<td>${vo.empno }</td>
						<td><a href="detail.bit?idx=${vo.empno }">${vo.ename }</a></td>
						<td>${vo.job }</td>
						<td>${vo.pay }</td>
						<td>${vo.hiredate }</td>
					</tr>
				</c:forEach>
				</table>
				<a href="add.bit" class="btn btn-primary" role="btn">New Employer</a>
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