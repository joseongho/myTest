<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href=<c:url value="/resources/styles.css"/>>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<%@ include file="/navigation.jsp"%>
	<div id="article">
		<p>number : ${diary.getNumber()}</p>
		<p>title : ${diary.getTitle()}</p>
		<p>date : ${diary.getDate()}</p>
		<p>content</p>
		<textarea id="test" readonly="readonly">${diary.getContent()}</textarea>
		<p>goodthing : ${diary.getGoodthing()}</p>
		<p>badthing : ${diary.getBadthing()}</p>
		<p>todo : ${diary.getTodo()}</p>
	</div>
	<%@ include file="/footer.jsp"%>
	<script>
		
	</script>
</body>
</html>