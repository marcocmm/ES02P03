<%-- 
    Document   : evento
    Created on : 01/12/2016, 03:25:42
    Author     : mateus
--%>

<%@page import="br.com.memorial.model.memorial.TipoEvento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
    </head>
    <body>
        <form method="post" class="pure-form pure-form-stacked" action="EventoServlet">
            <fieldset>
                <legend>Memorial</legend>

                <label>Nome evento:</label>
                <input type="text" name="nomeEvento" maxlength="50" /><br/><br/>
                
                <label for="eventos">Eventos</label>
                <select name="eventos">
                    <option value="<%=TipoEvento.OUVINTE%>"> Ouvinte</option>
                    <option value="<%=TipoEvento.APRESENTANDO_TRABALHO%>">Apresentando Trabalho</option>
                    <option value="<%=TipoEvento.ORGANIZACAO%>">Organização</option>
                    <option value="<%=TipoEvento.PALESTRANTE%>">Palestrante</option>
                    <option value="<%=TipoEvento.INSTRUTOR%>">Instrutor</option>
                    <option value="<%=TipoEvento.SECRETARIO%>">Secretário</option>
                </select>

                <button type="submit" class="pure-button pure-button-primary">Salvar</button>
                <a href="registrarMemorial.jsp"/>Voltar</a>
            </fieldset>
        </form>
    </body>
</html>
