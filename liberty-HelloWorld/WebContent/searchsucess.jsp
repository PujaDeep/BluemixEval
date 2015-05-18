<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body bgcolor="#313f4a">
<br>
<P><h2><font color=white>User Found!</font></h2></P>

<%

String s1=request.getParameter("telStatus");

 %>
 
 <font color=white> <%=s1%> </font>

</body>
</html>