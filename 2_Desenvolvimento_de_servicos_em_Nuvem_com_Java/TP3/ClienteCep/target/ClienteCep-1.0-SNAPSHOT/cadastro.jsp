<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pr-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CEP Finder</title>
    </head>
    <body>
        <h1>CEP Finder</h1>
        <form action="EnderecoController" method="post">
            <label for="nome">Nome:</label>
            <input type="text" name="nome" id="nome"><br/>
            <label for="email">Email:</label>
            <input type="email" name="email" id="email"><br/>
            <label for="telefone">Telefone:</label>
            <input type="phone" name="telefone" id="telefone"><br/>
            <label for="cep">Cep:</label>
            <input type="text" name="cep" id="cep"/>
            <input type="submit" value="Buscar" />
        </form>
    </body>
</html>
