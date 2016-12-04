<%-- 
    Document   : alterarCadastro
    Created on : 22/11/2016, 17:58:20
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
            <a href="alterarCadastro.jsp"/>Alterar Cadastro</a>
            <a href="registrarMemorial.jsp"/>Registrar Memorial</a>
            <a href="gerarHistorico.jsp"/>Gerar Histórico</a>
        <form action="DeslogarServlet" method="post" >
            <button type="submit" >Sair</button>
        </form>
    </body>
</html>
