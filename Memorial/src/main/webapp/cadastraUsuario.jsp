<%-- 
    Document   : cadastraUsuario
    Created on : 09/11/2016, 20:57:27
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
        <form method="post"action="UsuarioServlet">
            <div>
                <label for="nome">Nome </label>
                <input type="text" name="nome" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Data de nascimento </label>
                <input type="date" name="dataNascimento" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Sexo </label>
                <input type="radio" checked="" name="gender" value="masculino">Masculino<br>
                <input type="radio" name="gender" value="feminino">Feminino<br>
            </div>
            <div>
                <label for="nome">CPF </label>
                <input type="text" name="cpf" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Endereco Pessoal </label>
                <input type="text" placeholder="numero" name="nroPessoal" value="" maxlength="50" required="" />
                <input type="text" placeholder="unidade federativa" name="ufPessoal" value="" maxlength="50" required="" />
                <input type="text" placeholder="logradouro" name="logPessoal" value="" maxlength="50" required="" />
                
            </div>
            <div>
                <label for="nome">Endereco Profissional </label>
                <input type="text" placeholder="numero" name="nroProfissional" value="" maxlength="50" required="" />
                <input type="text" placeholder="unidade federativa" name="ufProfissional" value="" maxlength="50" required="" />
                <input type="text" placeholder="logradouro" name="logProfissional" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">RG </label>
                <input type="text" name="rg" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Login </label>
                <input type="text" name="login" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Senha </label>
                <input type="text" name="senha" value="" maxlength="50" required="" />
            </div>
            <input type="submit" value="Finalizar"/>
        </form>
    </body>
</html>
