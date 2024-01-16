<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Ticket Booking form</title>
    </head>
    <body>
        <h3><i>${getTc}</i></h3>
        <form action="/TicketBooking" method="post">
            <table>
                <tr>
                    <td>Enter Name::</td>
                    <td><input type="text" name="userName"></td>
                </tr>
                <tr>
                    <td>Enter Email::</td>
                    <td><input type="text" name="userEmail"></td>
                </tr>
                <tr>
                    <td>Enter Age::</td>
                    <td><input type="number" name="userAge"></td>
                </tr>
                <tr>
                    <td>Enter Phno::</td>
                    <td><input type="number" name="userPhno"></td>
                </tr>
                <tr>
                    <td>Enter Gender::</td>
                    <td><input type="radio" value="male" name="userGender">Male</td>
                    <td><input type="radio" value="female" name="userGender">FeMale</td>
                    <td><input type="radio" value="Trans" name="userGender">Trans</td>
                </tr>
                <tr>
                    <td>Select Boarding::</td>
                    <td>
                        <select name="userBoarding">
                            <option>-Select-</option>
                            <option value="Bengaluru">Bengaluru</option>
                            <option value="Hyderabad">Hyderabad</option>
                            <option value="Chennai">Chennai</option>
                            <option value="Vijayawada">Vijayawada</option>
                            <option value="Vishakapatnam">Vishakapatnam</option>
                            <option value="Nellore">Nellore</option>
                            <option value="Gunturu">Gunturu</option>
                            <option value="Electronic city">Electronic city</option>
                            <option value="AmmerPeat">AmmerPeat</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Select Droping::</td>
                    <td>
                        <select name="userDrop">
                            <option>-Select-</option>
                            <option value="Bengaluru">Bengaluru</option>
                            <option value="Hyderabad">Hyderabad</option>
                            <option value="Chennai">Chennai</option>
                            <option value="Vijayawada">Vijayawada</option>
                            <option value="Vishakapatnam">Vishakapatnam</option>
                            <option value="Nellore">Nellore</option>
                            <option value="Gunturu">Gunturu</option>
                            <option value="Electronic city">Electronic city</option>
                            <option value="AmmerPeat">AmmerPeat</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Select Coast::</td>
                    <td>
                        <select name="ticketCost">
                            <option>-Select-</option>
                            <option value="500.0">500.0</option>
                            <option value="770.0">770.0</option>
                            <option value="1050.0">1050.0</option>
                            <option value="1500.0">1500.0</option>
                            <option value="1300.0">1300.0</option>
                            <option value="600.0">600.0</option>
                            <option value="830.0">830.0</option>
                            <option value="2000.0">2000.0</option>
                            <option value="1800.0">1800.0</option>
                            <option value="1200.0">1200.0</option>
                            <option value="2500.0">2500.0</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Select Food::</td>
                    <td><input type="checkbox" name="userfood" value="Chicken Biryani">Chicken Biryani</td>
                    <td><input type="checkbox" name="userfood" value="Veg Biryani">Veg Biryani</td>
                    <td><input type="checkbox" name="userfood" value="Tomato Rice">Tomato Rice</td>
                    <td><input type="checkbox" name="userfood" value="Curd rice">Curd rice</td>
                    <td><input type="checkbox" name="userfood" value="Sambar rice">Sambar rice</td>
                    <td><input type="checkbox" name="userfood" value="Chapathi">Chapathi</td>
                </tr>
                <tr>
                    <td>Enter Timings</td>
                    <td><input type="text" name="userTime"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="submit">     <input type="reset" value="reset"></td>
                </tr>
            </table>
        </form>
    </body>
</html>    