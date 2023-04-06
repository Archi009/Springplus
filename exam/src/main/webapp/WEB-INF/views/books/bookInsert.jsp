<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empInsert.jsp</title>
</head>
<body>
	<h4>도서 등록</h4>

	<form action="bookInsert" method="post">


		<div>
			<label id="bookNo">도서번호</label><input type="text" name="bookNo" readonly>
		</div>
		<div>
			<label id="bookName">도서명</label><input type="text" name="bookName">
		</div>
		<div>
			<label id="bookCoverimg">도서표지</label><input type="text"
				name="bookCoverimg">
		</div>
		<div>
			<label id="bookDate">출판일자</label><input type="date" name="bookDate">
		</div>
		<div>
			<label id="bookPrice">금액</label><input type="text" name="bookPrice">
		</div>
		<div>
			<label id="bookPublisher">출판사</label><input type="text"
				name="bookPublisher">
		</div>
		<div>
			<label id="bookInfo">도서소개</label>
			<textarea rows="5" cols="33" name="bookInfo"></textarea>
		</div>
		<button type="submit">등록</button>
	</form>
	<script>
function formOptionChk(){
	let bookName= document.getElementsByname('bookName')[0];
	
	
	if(bookName.value == ""){
		alert('도서명이 입력되지 않았습니다.')
		title.focus();
		return
	}
	
	
	insertForm.submit();
}

document.querySelector('button[type="submit"]')
	.addEventListener('click',formOptionChk);

</script>
</body>
</html>