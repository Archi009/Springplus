<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시글 등록</h2>

	<form name="insertForm" action="insertPro" method="POST" onsubmit="return false">
		<table>
			<tbody>
				<tr>
						<th>상품ID</th>
						<td><input name="productId" value="${proNo.productId }"></td>

						<th>상품명</th>
						<td><input name="productName"></td>

						<th>단가</th>
						<td><input name="productPrice"></td>

						<th>상품정보</th>
						<td><input name="productInfo"></td>

						<th>등록일자</th>
						<td><input type="date" name="productDate"></td>

						<th>공급업체</th>
						<td><input name="company"></td>

						<th>담당자</th>
						<td><input name="managerId"></td>
				</tr>
			</tbody>
		</table>
		<div>
		
			<button onclick="javaseript:proInsert();">등록</button>
			<button type="button" onclick="location.href='getProList'">목록</button>
		</div>
	</form>
	<script>
	function proInsert(){
		//제목 입력 여부 체크
		let title = document.querySelector('input[name="productName"]');
		
		if(title.value == ""){
			alert("상품명이 등록되지 않았습니다")
			title.focus();
			return;
		}
		
		alert("게시글이 등록되었습니다")
		//isertForm은 form 태긔의 이름
		insertForm.submit();
//			 document.querySelector('from').submit();
		
	}
	</script>
</body>
</html>