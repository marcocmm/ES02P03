<%-- 
    Document   : registrarMemorial
    Created on : 30/11/2016, 04:07:02
    Author     : mateus
--%>

<%@page import="br.com.memorial.model.memorial.TipoEvento"%>
<%@page import="br.com.memorial.model.memorial.TipoAtividade"%>
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
        <form method="post" class="pure-form pure-form-stacked" action="MemorialServlet">
            <fieldset>
                <legend>Memorial</legend>


                <label for="formacaoAcademica">Selecione tipo de atividade:</label>
                <select onchange="this.options[this.selectedIndex].value && (window.location = this.options[this.selectedIndex].value);">
                    <option value="">Select...</option>
                    <option value="formacaoAcademica.jsp">Formação Acadêmica</option>
                    <option value="evento.jsp">Evento</option>
                    <option value="orientacao.jsp">Orientação</option>
                    <option value="atividade.jsp">Atividade Diversa</option>
                </select>
                
                <a href="anexarDocumento.jsp"/>Anexar Documentos</a>
                <a href="memorial.jsp"/>Voltar</a>
            </fieldset>
        </form>
    </body>
</html>
