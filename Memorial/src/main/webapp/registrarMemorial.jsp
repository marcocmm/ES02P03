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
        
        <label for="atividades">Atividades</label>
        <select name="atividades">
            <option value="<%=TipoAtividade.ATIVIDADES_PROFISSIONAIS%>"> Atividades Profissionais</option>
            <option value="<%=TipoAtividade.PARTICIPACAO_EM_CONSELHOS_COMISSOES_E_CONSULTORIAS%>">Conselhos Comissões e Consultorias</option>
            <option value="<%=TipoAtividade.ATIVIDADES_PROFISSIONAIS%>">Residência Médica</option>
            <option value="<%=TipoAtividade.CARGOS_E_FUNCAO_DE_DIRECAO_E_ADMINISTRACAO%>">Cargos e função de direção e administração</option>
            <option value="<%=TipoAtividade.ATIVIDADES_DOCENTES%>">Atividades Docentes</option>
            <option value="<%=TipoAtividade.ATIVIDADES_ASSISTENCIAIS%>">Atividades Assistenciais</option>
            <option value="<%=TipoAtividade.ATIVIDADES_DIDATICAS%>">Atividades Didáticas</option>
            <option value="<%=TipoAtividade.BANCA_EXAMINADORA%>">Banca Examinadora</option>
            <option value="<%=TipoAtividade.ESTAGIOS%>">Estágios</option>
            <option value="<%=TipoAtividade.ATIVIDADES_DE_EXTENSAO_UNIVERSITARIA%>">Atividades de extensão universitária</option>
            <option value="<%=TipoAtividade.PUBLICACOES%>">Publicações</option>
            <option value="<%=TipoAtividade.FILIACAO_E_SOCIEDADES_CIENTIFICAS%>">Filiação e Sociedades Científicas</option>
            <option value="<%=TipoAtividade.TITULOS%>">Títulos</option>
        </select>
        
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
    </fieldset>
</form>
    </body>
</html>
