<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록</title>
</head>
<body>
<!-- 	웹사이트에서는 절대 경로 상대경로 구분한다. -->
<!-- 	URI/ContextPath 1)꺽괄호c:url꺽괄호 / ,, 2)el -->
<!-- 	아래와 같이 el의 contextpath를 기반으로 한 접근을 이용하면 contextpath가 변경돼도 사용가능 -->
<%-- 	<form action="${pageContext.request.contextPath }/empInsert" method=""> --%>
	<form action="empInsert" method="POST">
		<div>
		<div>
			<label>first_name : <input type="text" name="firstName"></label>
		</div>
		<div>
			<label>last_name : <input type="text" name="lastName"></label>
		</div>
		<div>
			<label>email : <input type="text" name="email"></label>
		</div>
		<div>
			<label>job_id : <input type="text" name="jobId"></label>
		</div>
		<div>
			<label>salary : <input type="text" name="salary"></label>
		</div>
			<button type="submit">등록</button>
			<button type="button">목록</button>
		</div>
	</form>
</body>
</html>