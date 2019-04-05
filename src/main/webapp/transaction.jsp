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
            <h3>Transaction</h3>
            <form method="POST" action="account.jsp">
            	<table>
            		<tr>
            		    <td>
            		        <select>
            		            <option value="Deposit">Deposit</option>
            		            <option value="Withdraw">Withdraw</option>
            		        </select>
            		    </td>
            		</tr>

            		<tr>
            			<td>Amount: </td>
            			<td><input type="text" name="amount"</td>
            		</tr>
            		<tr>
            		    <td>Account Id</td>
            		    <td><input type="text" name="Account_accId">
            		</tr>
            		<tr>
            		    <td>User Id</td>
            		    <td><input type="text" name="Account_User_userId"></td>
            		</tr>
            		<tr>
            			<td colspan="2"><input type="Submit" name="operation"></td>
            		</tr>
            	</table>
            </form>
        </table>
     </body>
 </html>