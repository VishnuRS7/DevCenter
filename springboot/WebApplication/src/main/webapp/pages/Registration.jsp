<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Database</title>
</head>
<body>
<h1>Enter the registration details</h1>
<form method="post" action="addStudent" >
Enter Student ID:<input type="text" name="id"/><br>
Enter Student Name:<input type="text" name="name"/><br>
Enter Student E-Mail:<input type="email" name="email"/><br>
Enter Student Password:<input type="password" name="password"/><br>
Enter Student Gender:<input type="radio" name="gender" value="1" checked=true/>Male
<input type="radio" name="gender" value="2"/>Female<br>
Enter Student DOB:<input type="text" name="dob"/><br>
<input type="submit" value="Register"/><br>
</form>
</body>
</html>