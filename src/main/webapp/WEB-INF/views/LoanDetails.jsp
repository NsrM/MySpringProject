<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<title>Personal Loan</title>
<body>
	
	<h2> Dear ${name} please find your loan details as below</h2>
	<table>
		<tr>
			<td>Loan Debtt Remaining</td>
			<td>${amtRemaining }</td>
		</tr>
		<tr>
			<td>Months Remaining</td>
			<td>${monthsRemaining}</td>
		</tr>
		<tr>
			<td>EMI</td>
			<td>${EMI}</td>
		</tr>
	</table>

</body>
</html>