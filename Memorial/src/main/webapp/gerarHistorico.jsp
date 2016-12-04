<%-- 
    Document   : gerarHistorico
    Created on : 03/12/2016, 17:53:12
    Author     : mateus
--%>

<%@page import="br.com.memorial.model.memorial.Anexo"%>
<%@page import="br.com.memorial.model.memorial.Orientacao"%>
<%@page import="br.com.memorial.model.memorial.AtividadeDiversa"%>
<%@page import="br.com.memorial.persistence.AtividadePersistence"%>
<%@page import="br.com.memorial.persistence.MemorialPersistence"%>
<%@page import="br.com.memorial.model.memorial.Memorial"%>
<%@page import="br.com.memorial.model.memorial.Atividade"%>
<%@page import="br.com.memorial.model.usuario.Usuario"%>
<%@page import="br.com.memorial.model.memorial.Evento"%>
<%@page import="java.util.List"%>
<%@page import="br.com.memorial.persistence.EventoPersistence"%>
<%@page import="br.com.memorial.persistence.UsuarioPersistence"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
    </head>
    <body>
        <table>
            <%
                Usuario usuario = (Usuario) session.getAttribute("usuario");
                List<Atividade> atividades = usuario.getMemorial().getAtividades();
                for (Atividade atividade : atividades) {

                    for (Anexo anexo : atividade.getAnexos()) {
                        out.println("Nome Arquivo:" + anexo.getNome());
                    }
                    if (atividade instanceof Evento) {
                        
                        Evento evento = (Evento) atividade;
                        out.println("Tipo Evento:" + evento.getTipo());
                        out.println("Nome Evento:" + evento.getNomeEvento());
                    } else if (atividade instanceof Orientacao) {
                        Orientacao orientacao = (Orientacao) atividade;
                        out.println("Tipo Orientação:" + orientacao.getTipo());
                        out.println("Orientador:" + orientacao.getOrientador());
                        out.println("Orientando:" + orientacao.getOrientando());
                    } else if (atividade instanceof AtividadeDiversa) {
                        AtividadeDiversa atividadeDiversa = (AtividadeDiversa) atividade;
                        out.println("Tipo Atividade:" + atividadeDiversa.getTipo());
                        out.println("Instituição:" + atividadeDiversa.getInstituicao());
                        out.println("Ocupação:" + atividadeDiversa.getOcupacao());
                    }
                }


            %>
        </table>
        <a href="memorial.jsp"/>Voltar</a>
    </body>
</html>
