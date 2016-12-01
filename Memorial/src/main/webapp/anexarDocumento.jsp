<%-- 
    Document   : anexarDocumento
    Created on : 30/11/2016, 20:20:21
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
        <form enctype="multipart/form-data" method="post" action="AnexarDocumentoServlet">
            <label>Nome do Arquivo:</label>
            <input type="text" name="arquivo" maxlength="50" /><br/><br/>
            <input type="file" name="arquivo"  /><br/><br/>
            <input type="submit" value="Enviar" />
        </form>
        <p>${mensagem}</p>
        <p>${mensagem2}</p>
    </body>
</html>
