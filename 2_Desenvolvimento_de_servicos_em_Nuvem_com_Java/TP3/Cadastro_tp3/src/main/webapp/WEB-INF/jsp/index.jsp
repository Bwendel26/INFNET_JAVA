<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div id="content">
            <header id="header">
                <h1 id="titulo">App Cadastro</h1>
            </header>
            <main id="main">
                <div id="container">
                    <form action="/login" method="post">

                        <div class="form-group">
                            <label>E-mail:</label>
                            <input type="email" class="form-control" placeholder="E-mail..." name="email">
                        </div>

                        <div class="form-group">
                            <label>Senha:</label>
                            <input value="" type="password" class="form-control" placeholder="Senha..." name="senha">
                        </div>

                        <button type="submit" class="btn btn-default">Acessar</button>
                    </form>
                    <div><a href="/cadastro">Cadastrar-se</a></div>
                </div>
            </main>
            <footer>
                <div id=github>
                    <p>
                        <a href="https://github.com/Bwendel26/INFNET_JAVA/">Link do projeto</a>
                    </p>
                </div>
            </footer>
        </div>
    </body>
</html>