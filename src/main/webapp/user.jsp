<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,com.bbd.modisa.data.entities.User"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Banking App</title>
    </head>

    <body>
        <table>
            <h2>Online Banking</h2>
            <h3>Create User</h3>
            <form method="GET" action="/bankingApplication/createUser">
            	<table>
            		<tr>
            			<td>First Name: </td>
            			<td><input type="text" name="fName"</td>
            		</tr>
            		<tr>
            			<td>Last Name:</td>
            			<td><input type="text" name="lName"></td>
            		</tr>
            		<tr>
            			<td colspan="2"><input type="Submit" name="operation"></td>
            		</tr>
            	</table>
            </form>
        </table>
     </body>
 </html>