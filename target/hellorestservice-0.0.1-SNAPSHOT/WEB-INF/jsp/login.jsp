<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${testBean.name }</title>
</head>
<body>
	<form action="testform" method="POST">
		<table border="1" cellpadding="1" cellspacing="1" align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${loginBean.name }" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="pass" value="${loginBean.pass }" /></td>
			</tr>
			<tr>
				<td>Birthday</td>
				<td><input type="text" name="birthdate"
					value="${loginBean.birthdate }" /></td>
			</tr>
			<tr>
				<td colspan=2><input type="submit" value="Fuck" /></td>
			</tr>
			<tr>
				<td colspan=2><a href="greeting">Call REST</a></td>
			</tr>
		</table>
	</form>
</body>
</html>