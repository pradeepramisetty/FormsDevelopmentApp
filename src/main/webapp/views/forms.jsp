<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Welcome to Web</title>
    </head>
    <body>
        <h3><i>${msg1}</i></h3>
        <form action="/student" method="post">
            <table>
                <tr>
                    <td>Enter Name::</td>
                    <td><input type="text" name="sName"></td>
                </tr>
                <tr>
                    <td>Enter Gender::</td>
                    <td><input type="radio" name="sGender" value="male">Male</td>
                    <td><input type="radio" name="sGender" value="Female">FeMale</td>
                </tr>
                <tr>
                    <td>Enter Age::</td>
                    <td><input type="number" name="sAge"></td>
                </tr>
                <tr>
                    <td>Enter Adrs::</td>
                    <td><input type="text" name="sAdrs"></td>
                </tr>
                <tr>
                    <td>Enter Phno::</td>
                    <td><input type="number" name="sPhno"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="submit">    <input type="reset" value="reset"></td>
                </tr>
            </table>
        </form>   
    </body>
</html>    