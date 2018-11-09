<%-- 
    Document   : ReceiveComments
    Created on : Nov 8, 2018, 4:48:15 PM
    Author     : 18452
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comments Review</title>
        <link href="css/a3.css" rel="stylesheet" type="text/css" media="screen" />
        <jsp:useBean id="rc" class="comment.receiveComments" scope="session" />
    </head>
    <body>
        <h2>Comments successfully</h2>
        <h3>Name:<jsp:getProperty name="rc" property="name" /></h3>
        <h3>Email:<jsp:getProperty name="rc" property="email" /></h3>
        <h3>Comments:<jsp:getProperty name="rc" property="comments" /></h3>
        <br/><br/>
        <a href="index.jsp">Return Last Page</a>
    </body>
</html>
