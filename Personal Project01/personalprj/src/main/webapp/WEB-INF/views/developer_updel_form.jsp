<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>developer_search_form</title>
</head>
<body>
<table border="1" align="center" style="width: 80%; border-collapse: collapse;">
	<tr bgcolor="#E5E5E5" align="center">
		<td colspan="6">
			사원정보 수정
		</td>
	</tr>
	<tr align="center">
		<td bgcolor="#E5E5E5">
			이름
		</td>
		<td>
			<input type="text" name="" id="">
		</td>
		<td bgcolor="#E5E5E5">
			주민번호
		</td>
		<td>
			<input type="text" name="" id="">-
			<input type="text" name="" id="">
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
			</select>월
			<select name="" id="">
				<option value=""></option>
				<option value="02">02</option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
				<option value=""></option>
			</select>일
		</td>
	</tr>
</table>
<table align="center" style="width: 80%;">
	<tr align="center">
		<td>
			<input type="button" value="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;등록&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" value="&nbsp;초기화&nbsp;">
		</td>
	</tr>
</body>
</html>