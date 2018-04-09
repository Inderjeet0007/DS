<%-- 
    Document   : Book
    Created on : Apr 1, 2018, 2:28:54 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             h1{
                 border: 5px solid blue;
             }
        </style>
    </head>
    <body bgcolor="yellow">
        <form action="RmiServlet" method="post">
            <h1>
    <center> <label>Enter name of Place to visit:</label><br><br>
            <input type="text" name="t1"/>
             <br><br>
            <label>Enter No Of Tickets:</label><br><br>
            <input type="number" name="t2"/>
              <br><br>
              <input type="submit" value="Submit"/><br><br></h1></center>
        </form>
    </body>
</html>
