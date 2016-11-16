<%-- 
    Document   : index
    Created on : Nov 16, 2016, 1:37:46 PM
    Author     : joshuaashinhurst
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--<img id="logo" src="logo.png" alt="Logo">-->
        <table id="banner">
            <tr id="title">
                <td>
                    <img src="logo.png" id="logo" alt="logo">
                </td>
                <td>
                    <h1>CoCo - Collaborative Code Editor</h1>
                </td>
            </tr>
        </table>
        <form action="./session.html">
                <strong>Alias: </strong>
                <input type="text" value="session 1"><br>
                <button type="submit">Create</button>
        </form>
        <p id="ex">
            <a style="text-align:center" href="./join.html">Example Join Session</a>
        </p>
    </body>
</html>
