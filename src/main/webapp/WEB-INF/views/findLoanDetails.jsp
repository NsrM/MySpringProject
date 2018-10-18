<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<title>Personal Loan</title>
<body>
	
	<form action="/LoanCheck" method="post">
		<table>
			<tr><td>Name:  </td><td> <input type="text" name="firstname"><br></td></tr>
			<tr><td>Application ID:</td><td><input type="text" name="idofuser"><br></td></tr>
			
		</table>
		<input type=submit value=Submit>
	</form>

</body>
</html>