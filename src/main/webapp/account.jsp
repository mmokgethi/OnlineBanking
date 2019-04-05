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
            <h3>Create Account</h3>
            <form method="POST" action="account.jsp">
            	<table>
            		<tr>
            			<td>User Id: </td>
            			<td><input type="text" name="userId"</td>
            		</tr>
            		<tr>
            		    <td>
            		        <select name="Account Type">
            		            <option value="Cheque">Cheque</option>
            		            <option value="Savings">Savings</option>
            		        </select>
            		    </td>
            		</tr>
            		<tr>
            			<td colspan="2"><input type="Submit" name="operation"></td>
            		</tr>
            	</table>
            </form>
        </table>
     </body>
 </html>