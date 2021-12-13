<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<@taglib prefix ="spring" uri="http://www.springframwork.org/tags"%>
<html>
<body>
<h1>Customer Form</h1>
<frm:form method="post" action="/doRegister" modelAttribute="mycustomer">
<table>
<tr>
<td>CustomerID</td>
<td><frm:input path="custid"/></td>
</tr>
<tr>
<td>Name</td>
<td><frm:input path="name"/></td>
</tr>
<tr>
<td>Email</td>
<td><frm:input path="email"/></td>
</tr>
<tr>
<td>Age</td>
<td><frm:input path="age"/></td>
</tr>
<tr>
<td colspan="2">
	<input type="submit" value="add Customer">
	</td>
	</tr>
</table>
</frm:form>
</body>
</html>