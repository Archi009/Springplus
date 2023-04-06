<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h3>게시글 등록</h3>
	<form name="insertForm" action="insert" method="post" onsubmit="return false">
		<table>
			<tr>
				<td>번호</td>
				<td><input type="number" name="boardNo" value="${boardNo }"
					readOnly></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="boardTitle" ></td>
			</tr>
			<tr>
				<td>저자</td>
				<td><input type="text" name="boardWriter" ></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="boardContent" ></td>
			</tr>
			<tr>
				<td>이미지</td>
				<td><input type="text" name="boardImage" ></td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><input type="date" name="boardDate" ></td>
			</tr>
		</table>
		<button type="button" onclick="javaseript:boardInsert();">등록</button>
	</form>
	<script>
		function boardInsert(){
			//제목 입력 여부 체크
			let title = document.querySelector('input[name="boardTitle"]');
			
			if(title.value == ""){
				alert("제목이 등록되지 않았습니다")
				title.focus();
				return;
			}
			
			alert("게시글이 등록되었습니다")
			//isertForm은 form 태긔의 이름
			insertForm.submit();
// 			 document.querySelector('from').submit();
			
		}
	</script>
</body>
</html>