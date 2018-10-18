<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<title>Personal Loan</title>
<body>
	<h3>Fill below form and submit</h3>
	<form action="/newpersonalloanrequest" method="post">
		Name:   <input type="text" name="firstname"><br>
		Required Loan:<input type="text" name="loanamount"><br>
		Mobile No:<input type="text" name="mobilenum"><br>
		<input type=submit value=Submit>
	</form>
</body>
</html>