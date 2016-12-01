<%-- 
    Document   : atividade
    Created on : 01/12/2016, 03:26:14
    Author     : mateus
--%>

<%@page import="br.com.memorial.model.memorial.TipoAtividade"%>
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

                <button type="submit" class="pure-button pure-button-primary">Salvar</button>
                <a href="registrarMemorial.jsp"/>Voltar</a>
            </fieldset>
        </form>
    </body>
</html>
