<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
<form action="sendemail" method="post">
<pre>
Email Id:<input type="text" name="to" value="${emailid}">
subject:<input type="text"name="subject">
<textarea  name="text" rows="10" cols="100">
</textarea>
<input type="submit" value="SendEmail">
</pre>
</form>
</body>
</html>