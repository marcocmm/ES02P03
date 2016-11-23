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
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
    </head>
    <body>
        <form method="post" class="pure-form pure-form-stacked" action="UsuarioServlet">
            <fieldset>
                <legend>Cadastro</legend>
                
                <div>
                <label for="nome">Nome</label>
                <input type="text" name="nome" value="" maxlength="50" required=""/>
                </div>
                
                <div>
                <label for="dataNascimento">Data de nascimento</label>
                <input type="date" name="dataNascimento" value="" maxlength="50" required=""/>
                </div>
                
                <div>
                <label for="gender">Sexo</label>
                <input type="radio" name="gender" value="masculino">Masculino<br>
                <input type="radio" name="gender" value="feminino">Feminino<br>
                </div>
                
                <div>
                <label for="cpf">CPF</label>
                <input type="TEXT" name="cpf" value="" maxlength="50" required=""/>
                </div>
                
                <div>
                <label>Endereco Pessoal: </label>
                <label for="nroPessoal">Numero </label>
                <input type="text" name="nroPessoal" value="" maxlength="50" required="" />
                <label for="ufPessoal">Unidade Federativa </label>
                <input type="text" name="ufPessoal" value="" maxlength="50" required="" />
                <label for="logPessoal">Logradouro </label>
                <input type="text" name="logPessoal" value="" maxlength="50" required="" />
                </div>
                
                <div>
                <label>Endereco Profissional: </label>
                <label for="nroProfissional">Numero </label>
                <input type="text" name="nroProfissional" value="" maxlength="50" required="" />
                <label for="ufProfissional">Unidade Federativa </label>
                <input type="text" name="ufProfissional" value="" maxlength="50" required="" />
                <label for="logProfissional">Logradouro </label>
                <input type="text" name="logProfissional" value="" maxlength="50" required="" />
                </div>
                
                <div>
                <label for="rg">RG </label>
                <input type="text" name="rg" value="" maxlength="50" required="" />
                </div>
                
                <div>
                <label for="login">Login </label>
                <input type="text" name="login" value="" maxlength="50" required="" />
                </div>
                
                <div>
                <label for="nome">Senha </label>
                <input type="text" name="senha" value="" maxlength="50" required="" />
                </div>
                
                <button type="submit" class="pure-button pure-button-primary">Finalizar</button>
            </fieldset>
        </form>
            
    </body>
</html>