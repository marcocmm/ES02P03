<%-- 
    Document   : anexarDocumento
    Created on : 30/11/2016, 20:20:21
    Author     : mateus
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.memorial.model.memorial.Anexo"%>
<%@page import="br.com.memorial.persistence.AnexoPersistence"%>
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
            <a href="memorial.jsp"/>Voltar</a>
        </form>
        <%
                        AnexoPersistence ap = new AnexoPersistence();
                        List<Anexo> arquivos = ap.list();

                        if (arquivos.size() != 0) {

                            out.println("<table align=\"center\" class=\"pure-table tabelaCadastro\" title=" + "Dados" + ">");
                            out.println("<thead>");
                            out.println("<th>Nome</th><th>Download</th>");
                            out.println("</thead>");
                            for (Anexo a : arquivos) {
                                out.println("<tr>");
                                out.println("<td>" + a.getNome() + "</td>");
                                String url = "./" + a.getNome();
                                out.println("<td>" + "<a href=\"" + url + "\" >Download</a>");
                                out.println("</td>");
                                out.println("</tr>");


                            }
                            out.println("</table>");
                        } else {
                            out.println("<h1>Nenhum arquivo encontrado!</h1>");
                        }

                    %>
        <p>${mensagem}</p>
        <p>${mensagem2}</p>
    </body>
</html>
