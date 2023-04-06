<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<button type="button" onclick="location.href='boardInsert'">등록</button>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<!-- onclick으로 디테일 불러오기 하면 되긴 되는데, 아래 td에 delete이벤트의 이벤트 버블링 현상으로 삭제 버튼을 눌렀을때 여기 이벤트도 일어난다. -->
<!-- 			boardList는 컨트롤러에서 어떤 이름으로 보내주는가! attribute설정값을 보자 -->
			<c:forEach items="${boardList }" var="board">
				<tr onclick="location.href='getBoardInfo?bno=${board.bno}'">
					<td>${board.bno }</td>
					<td>${board.title }</td>
					<td>${board.writer }</td>
					<td><fmt:formatDate value="${board.regdate }" pattern="yyyy년MM월dd일"/></td>
					<td><button type="button" 
					onclick="deleteInfo(${board.bno}, event)">삭제</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script>

// 	jsp는 자바가 먼저 해석 되기 때문에 아래 jstl 태그를 사용 가능하다.
// 	but 권장하지 않는다 서로 다른 코드를 섞어버리면 컴파일 순서가 달라 원하는 
// 	방식으로 실행이 안 되는경우도 있다 onClick:function도 마찬가지이다.
	
	function deleteInfo(id, event){
		$.ajax({
			url : 'boardDelete',
			method : 'GET',
		data : {bno : id},
// 		dataType : 'json', //html, text, json , xml 같이 우리가 자주 쓰는건 알아서 파싱해줌
		success : function(){
			location.href="getBoardList"
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