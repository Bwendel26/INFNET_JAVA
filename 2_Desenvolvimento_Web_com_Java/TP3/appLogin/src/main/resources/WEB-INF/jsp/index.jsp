<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    </head>
    <body>
        <div id="content">
            <h3>Login</h3>
            <form action="./" method="post" >
                <div>
                    <label>E-mail:</label>
                    <input type="email" id="campoEmail" name="email" placeholder="Entre com seu E-mail..."/>
                </div>
                <div>
                    <label>Senha:</label>
                    <input id="campoPsw" type="password" name="password" placeholder="Senha..."/>
                </div>
                <div>
                    <input type="submit" id="btnEnviar" value="Enviar"/>
                </div>
            </form>
        </div>
    </body>
</html>