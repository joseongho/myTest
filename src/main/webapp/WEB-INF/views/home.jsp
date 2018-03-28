<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" href=<c:url value="/resources/styles.css"/>>
</head>
<body>
	<div id="container">
		<%@ include file="/header.jsp"%>
		<%@ include file="/navigation.jsp"%>
		<div id="article">
		
		</div>
		<%@ include file="/footer.jsp"%>
	</div>
</body>
</html>
