<%-- 
    Document   : Submit
    Created on : Nov 8, 2018, 4:52:31 PM
    Author     : 18452
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/a3.css" rel="stylesheet" type="text/css" media="screen" />
        <title>Submit Comments</title>
    </head>
    <body>
        <h1>Submit Your Comments</h1>
        <form method="post" action="submitComments">
            <h3>Name</h3>
            <input type="text" id="name" name="name" size="40" />
            <h3>Email</h3>
            <input type="text" id="email" name="email" size="40" />
            <h3>Comments</h3>
            <input type="text" id="comments" name="comments" size="50" />
            <br/><br/>
            <input type="submit" class="input" />
        </form>
    </body>
</html>
