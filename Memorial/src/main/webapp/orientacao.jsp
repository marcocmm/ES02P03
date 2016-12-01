<%-- 
    Document   : orientacao
    Created on : 01/12/2016, 03:26:00
    Author     : mateus
--%>

<%@page import="br.com.memorial.model.memorial.TipoOrientacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
    </head>
    <body>
        <form method="post" class="pure-form pure-form-stacked" action="MemorialServlet">
            <fieldset>
                <legend>Memorial</legend>


                <label for="orientacao">Orientação</label>
                <select name="orientacao">
                    <option value="<%=TipoOrientacao.APERFEICOAMENTO_E_ESPECIALIZACAO%>"> Aperfeiçoamento e Especialização</option>
                    <option value="<%=TipoOrientacao.INICIACAO_CIENTIFICA%>">Iniciação Científica</option>
                    <option value="<%=TipoOrientacao.MESTRADO%>">Mestrado</option>
                    <option value="<%=TipoOrientacao.DOUTORADO%>">Doutorado</option>
                    <option value="<%=TipoOrientacao.POS_DOUTORADO%>">Pós-Doutorado</option>
                </select>

                
                <button type="submit" class="pure-button pure-button-primary">Salvar</button>
                <a href="registrarMemorial.jsp"/>Voltar</a>
            </fieldset>
        </form>
    </body>
</html>
