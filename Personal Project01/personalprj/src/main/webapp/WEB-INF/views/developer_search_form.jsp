<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSP 기술의 한 종류인 [Include Direcctive]를 이용하여 -->
<!-- common.jsp 파일 소스 삽입 -->
<%@ include file="common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>developer_search_form</title>
<script>

</script>
</head>
<body>
<table border="1" align="center" style="width: 80%; border-collapse: collapse;">
	<tr bgcolor="#E5E5E5" align="center">
		<td colspan="6">
			사원정보 검색
		</td>
	</tr>
	<tr align="center">
		<td bgcolor="#E5E5E5">
			키워드
		</td>
		<td>
			<input type="text" name="" id="">
		</td>
		<td bgcolor="#E5E5E5">
			성별
		</td>
		<td>
			<input type="checkbox" name="남" id="">남
			<input type="checkbox" name="남" id="">여
		</td>
		<td bgcolor="#E5E5E5">
			종교
		</td>
		<td>
			<select name="religion" id="religion">
				<option value=""></option>
				<option value="기독교">기독교</option>
				<option value="천주교">천주교</option>
				<option value="불교">불교</option>
				<option value="이슬람">이슬람</option>
				<option value="무교">무교</option>
			</select>
		</td>
</tr>
<tr align="center">
		<td bgcolor="#E5E5E5">
			학력
		</td>
		<td>
			<input type="radio" name="고졸" id="">고졸
			<input type="radio" name="전문대졸" id="">전문대졸
			<input type="radio" name="일반대졸" id="">일반대졸
		</td>
		<td bgcolor="#E5E5E5">
			기술
		</td>
		<td colspan="4">
			<input type="checkbox" name="Java" id="">Java
			<input type="checkbox" name="JSP" id="">JSP
			<input type="checkbox" name="ASP" id="">ASP
			<input type="checkbox" name="PHP" id="">PHP
			<input type="checkbox" name="Delphi" id="">Delphi
		</td>
</tr>
<tr align="center">
		<td bgcolor="#E5E5E5">
			졸업일
		</td>
		<td colspan="5">
			<select name="" id="">
				<option value=""></option>
				<option value="2002">2002</option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
			</select>년
			<select name="" id="">
				<option value=""></option>
				<option value="02">02</option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
			</select>월 ~ 
			<select name="" id="">
				<option value=""></option>
				<option value="2002">2002</option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
			</select>년
			<select name="" id="">
				<option value=""></option>
				<option value="02">02</option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
			</select>월
		</td>
	</tr>
</table>
<table align="center" style="width: 80%;">
	<tr align="center">
		<td>
			<input type="button" value="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;검색&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" value="&nbsp;전부검색&nbsp;">
			<input type="button" value="&nbsp;초기화&nbsp;" onclick="reset()">
			<input type="button" value="&nbsp;등록&nbsp;" onclick="goInput()">
		</td>
	</tr>
	<tr align="right">
		<td>
			검색건수-->
		</td>
	</tr>
</table>
<table border="1" align="center" style="width: 80%; border-collapse: collapse;">
	<tr align="center">
		<td bgcolor="#E5E5E5">
			번호
		</td>
		<td bgcolor="#E5E5E5">
			이름
		</td>
		<td bgcolor="#E5E5E5">
			성별
		</td>
		<td bgcolor="#E5E5E5">
			종교
		</td>
		<td bgcolor="#E5E5E5">
			기술
		</td>
		<td bgcolor="#E5E5E5">
			졸업일
		</td>
		<td bgcolor="#E5E5E5">
			&nbsp;&nbsp;&nbsp;&nbsp;
		</td>
	</tr>
</table>
<form action="/erp/developer_input_form.do" name="developerInputForm" method="post"></form>
</body>
</html>