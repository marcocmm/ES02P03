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
                <input type="text" placeholder="nome" name="nome" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Data de nascimento </label>
                <input type="text" placeholder="data nascimento" name="data nascimento" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Sexo </label>
                <input type="radio" name="gender" value="">Masculino<br>
                <input type="radio" name="gender" value="">Feminino<br>
            </div>
            <div>
                <label for="nome">CPF </label>
                <input type="text" name="cpf" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Endereco Pessoal </label>
                <input type="text" name="endereco pessoal" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">Endereco Profissional </label>
                <input type="text" name="endereco profissional" value="" maxlength="50" required="" />
            </div>
            <div>
                <label for="nome">RG </label>
                <input type="text" name="rg" value="" maxlength="50" required="" />
            </div>
            <input type="submit" value="Cadastrar"/>
        </form>
        <h1>Hello World!</h1>
    </body>
</html>
