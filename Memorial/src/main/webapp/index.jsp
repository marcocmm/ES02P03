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
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
    </head>
    <body>
        <form action="LoggableServlet" method="post" class="pure-form">
            <fieldset>
                <legend>Login</legend>
                <input type="text" name="login" placeholder="Login">
                <input type="password" name="senha" placeholder="Senha">
                <button type="submit" class="pure-button pure-button-primary">Entrar</button>
            </fieldset>
        </form>

        <a href="cadastraUsuario.jsp"/>Cadastrar</a>
</body>
</html>
