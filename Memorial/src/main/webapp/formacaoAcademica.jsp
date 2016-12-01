<%-- 
    Document   : formacaoAcademica
    Created on : 01/12/2016, 03:27:55
    Author     : mateus
--%>

<%@page import="br.com.memorial.model.memorial.FormacaoAcademica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
    </head>
    <body>
        <form method="post" class="pure-form pure-form-stacked" action="FormacaoAcademicaServlet">
            <fieldset>
                <legend>Memorial</legend>

                <label for="formacaoAcademica">Formação Acadêmica</label>
                <select name="formacaoAcademica">
                    <option value="<%=FormacaoAcademica.ENSINO_FUNDAMENTAL%>"> Ensino Fundamental</option>
                    <option value="<%=FormacaoAcademica.ENSINO_MEDIO%>">Ensino Médio</option>
                    <option value="<%=FormacaoAcademica.RESIDENCIA_MEDICA%>">Residência Médica</option>
                    <option value="<%=FormacaoAcademica.ESPECIALIZACAO%>">Especialização</option>
                    <option value="<%=FormacaoAcademica.POS_GRADUACAO%>">Pós-Graduação</option>
                    <option value="<%=FormacaoAcademica.MESTRADO%>">Mestrado</option>
                    <option value="<%=FormacaoAcademica.DOUTORADO%>">Doutorado</option>
                </select>

                <button type="submit" class="pure-button pure-button-primary">Salvar</button>
                <a href="registrarMemorial.jsp"/>Voltar</a>
            </fieldset>
        </form>
    </body>
</html>
