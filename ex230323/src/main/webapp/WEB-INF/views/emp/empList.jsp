<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<meta charset="UTF-8">
<title>전체 조회</title>
</head>
 	<style>
 		table, tr,th, td{
 		border : 1px solid black;
 		}
 	</style>
<body>
	<button type="button" onclick="location.href='empInsert'">등록</button>
	<table>
		<thead>
				
		<tr > 

				<th>employee_id</th>
				<th>first_name</th>
				<th>last_name</th>
				<th>email</th>
				<th>hire_date</th>
				<th>job_id</th>
				<th>salary</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
<!-- onclick으로 디테일 불러오기 하면 되긴 되는데, 아래 td에 delete이벤트의 이벤트 버블링 현상으로 삭제 버튼을 눌렀을때 여기 이벤트도 일어난다. -->
			<c:forEach items="${empList }" var="emp">
				<tr onclick="location.href='empInfo?employeeId=${emp.employeeId}'">
					<td>${emp.employeeId }</td>
					<td>${emp.firstName }</td>
					<td>${emp.lastName }</td>
					<td>${emp.email }</td>
					<td>${emp.hireDate }</td>
					<td>${emp.jobId }</td>
					<td>${emp.salary }</td>
					<td><button type="button" 
					onclick="deleteInfo(${emp.employeeId}, event)">삭제</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<script>
	function printAlert(message){
		if(message == null || message =='') return;
		alert(message);	
	}
// 	jsp는 자바가 먼저 해석 되기 때문에 아래 jstl 태그를 사용 가능하다.
// 	but 권장하지 않는다 서로 다른 코드를 섞어버리면 컴파일 순서가 달라 원하는 
// 	방식으로 실행이 안 되는경우도 있다 onClick:function도 마찬가지이다.
	printAlert(`${result}`);
	
	function deleteInfo(id, event){
		$.ajax({
			url : 'empDelete',
			method : 'post',
		data : {employeeId : id},
// 		dataType : 'json', //html, text, json , xml 같이 우리가 자주 쓰는건 알아서 파싱해줌
		success : function(data){
			console.log(data);
		},
		error : function(reject){
			console.log(reject);
		}
		});
		//버블링 막는 메소드
		event.stopPropagation();
	}
	
</script>
</body>
</html>