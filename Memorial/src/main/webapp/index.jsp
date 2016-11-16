<%-- 
    Document   : index
    Created on : 08/11/2016, 15:20:38
    Author     : mateus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="LoggableServlet" method="post">            
            <input placeholder="login" name="login"/>
            <input placeholder="senha" name="senha"/>
            <button type="submit" >Entrar</button>
        </form>
        <a href="cadastraUsuario.jsp"/>Cadastro</a>
    </body>
</html>
