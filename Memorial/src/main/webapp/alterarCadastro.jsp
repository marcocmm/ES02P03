<%-- 
    Document   : alterarCadastro
    Created on : 29/11/2016, 23:42:35
    Author     : mateus
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.memorial.model.usuario.Endereco"%>
<%@page import="br.com.memorial.model.usuario.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
    </head>
    <body>
        <form method="post" class="pure-form pure-form-stacked" action="AlterarCadastroServlet">
            <fieldset>
                <legend>Cadastro</legend>

                <%
                    Usuario usuario = (Usuario) session.getAttribute("usuario");
                    SimpleDateFormat date = new SimpleDateFormat("yyyy-dd-MM");
                    
                %>
                
                <div>
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" value="<%=usuario.getNome()%>" maxlength="50" required=""/>
                </div>

                <div>
                    <label for="dataNascimento">Data de nascimento</label>
                    <input type="date" name="dataNascimento" value="<%=date.format(usuario.getDataNasc())%>" maxlength="50" required=""/>
                </div>

                
                    <label for="gender">Sexo</label>
                    <input type="radio"  name="gender" value="masculino" <%= usuario.getSexo().equals("masculino") ? "checked" : "" %>>Masculino<br>
                    <input type="radio" name="gender"value="feminino" <%= usuario.getSexo().equals("feminino") ? "checked" : "" %>>Feminino<br>
                

                <div>
                    <label for="cpf">CPF</label>
                    <input type="TEXT" name="cpf" value="<%=usuario.getCpf()%>" maxlength="50" required=""/>
                </div>

                <div>
                    <label>Endereco Pessoal: </label>
                    <label for="nroPessoal">Numero </label>
                    <input type="text" name="nroPessoal" value="<%=usuario.getEnderecoPessoal().getNumero()%>" maxlength="50" required="" />
                    <label for="ufPessoal">Unidade Federativa </label>
                    <input type="text" name="ufPessoal" value="<%=usuario.getEnderecoPessoal().getUnidadeFederativa()%>" maxlength="50" required="" />
                    <label for="logPessoal">Logradouro </label>
                    <input type="text" name="logPessoal" value="<%=usuario.getEnderecoPessoal().getLogradouro()%>" maxlength="50" required="" />
                </div>

                <div>
                    <label>Endereco Profissional: </label>
                    <label for="nroProfissional">Numero </label>
                    <input type="text" name="nroProfissional" value="<%=usuario.getEnderecoPessoal().getNumero()%>" maxlength="50" required="" />
                    <label for="ufProfissional">Unidade Federativa </label>
                    <input type="text" name="ufProfissional" value="<%=usuario.getEnderecoPessoal().getUnidadeFederativa()%>" maxlength="50" required="" />
                    <label for="logProfissional">Logradouro </label>
                    <input type="text" name="logProfissional" value="<%=usuario.getEnderecoPessoal().getLogradouro()%>" maxlength="50" required="" />
                </div>

                <div>
                    <label for="rg">RG </label>
                    <input type="text" name="rg" value="<%=usuario.getRg()%>" maxlength="50" required="" />
                </div>

                <div>
                    <label for="login">Login </label>
                    <input type="text" name="login" disabled="true" value="<%=usuario.getLogin()%>" maxlength="50" required="" />
                </div>

                <div>
                    <label for="nome">Senha </label>
                    <input type="text" name="senha" value="<%=usuario.getSenha()%>" maxlength="50" required="" />
                </div>

                <button type="submit" class="pure-button pure-button-primary">Finalizar</button>
            </fieldset>
        </form>
    </body>
</html>
