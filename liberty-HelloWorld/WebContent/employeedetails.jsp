<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
 <script Language="JavaScript" src="index.js"></script>
<title>Telephone Directory</title>
</head>
<body bgcolor="#313f4a"  >

<center>

		<form  action = "employeeServlet" method =post>
		
		<img align ="left" src="images/ToolsGroup_Logo.jpg">
		<img align ="right" src="images/Infosys_Logo.jpg"><br><br><br> <br><hr>

			<h1><font color="FFFFFF" >Telephone Directory</font></h1>
			<hr>
			<br>
			<table bgcolor="#FFFFFF">
		
		
		<tr><td align="center" class="blue">Search<input type="radio"  name="emp" id="empsearch"  value="search" onchange="return displayFields()" checked="checked"> </td>
		<td align="center"  class="blue" >Add<input type="radio" name="emp" id="empadd" value="add" onchange="return displayFields()"></td></tr>
		</table>
		<br>
		<div id="option" style="display: block">
		<table bgcolor="#FFFFFF">
		<tr><td align="center"  class="blue">Employee ID<input type="radio"  name="Searchemp" id="searchID" value="emp" onchange="return displaySearchFields()" checked="checked"> </td>
		<td align="center"  class="blue" >Email ID<input type="radio" name="Searchemp" id="searchEmail" value="email" onchange="return displaySearchFields()"></td></tr>
		</table>
		</div>
		
		<br>
		
		<div id ="divempID" style="display: block">
		<table>
		
		<tr>
		<td  bgcolor="#FFFFFF" >Employee Id : <input type="text" name="employee" value="" id="empID" > </td></tr></table>
		</div>
		
		<br>
		<div id ="divemailID" style="display: none">
		<table><tr>
		<td bgcolor="#FFFFFF">Employee Email : <input type="text" name="emailId" value="" id="emailID" ></td> </tr>
		</table>
		</div>
		<br>
		<div id="searchbtn" style="display: block">
		<table>
		<tr><td align="center"><input type="submit" name="Search" value="search"> </td></tr></table></div>
		<br>
		
		<div id="addbtn" style="display: none"><table><tr>
		 <td align="center"><input  type="submit" name="Addme" value="Add"></td></tr>
		</table></div>
				  </form>
				</center></body>
</html>