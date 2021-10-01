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
                <div><a href="/login">Login</a></div>
            </header>
            <main id="main">
                <div id="container">
                    <form action="/cadastro" method="post">

                        <div class="form-group">
                            <label>Nome:</label>
                            <input type="text" class="form-control" placeholder="Nome..." name="nome">
                        </div>

                        <div class="form-group">
                            <label>E-mail:</label>
                            <input type="email" class="form-control" placeholder="E-mail..." name="email">
                        </div>

                        <div class="form-group">
                            <label>Senha:</label>
                            <input value="" type="password" class="form-control" placeholder="Senha..." name="senha">
                        </div>

                        <div class="form-group">
                            <label>Telefone:</label>
                            <input type="text" class="form-control" placeholder="Telefone..." name="fone">
                        </div>

                        <div class="form-group">
                            <label>CEP:</label>
                            <input type="text" class="form-control" placeholder="CEP..." name="cep">
                        </div>

                        <button type="submit" class="btn btn-default">Cadastrar</button>
                    </form>
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