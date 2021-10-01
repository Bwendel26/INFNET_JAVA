<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>APP2021 - Cadastra!!!</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>

        <c:import url="../menu.jsp"/>

        <div class="container">
            <h2>Cadastro de Bebidas</h2>
            <form action="/bebida/incluir" method="post">

                <div class="form-group">
                    <label>Descrição:</label>
                    <input type="text" value="Suco" class="form-control" placeholder="Entre com a descrição" name="descricao">
                </div>

                <div class="form-group">
                    <label>Valor:</label>
                    <input type="text" value="10" class="form-control" placeholder="Entre com o valor" name="valor">
                </div>

                <div class="form-group">
                    <label>Marca:</label>
                    <input type="text" value="Natural" class="form-control" placeholder="Entre com a marca" name="marca">
                </div>

                <div class="form-group">
                    <label>Medida:</label>
                    <input type="text" value="500" class="form-control" placeholder="Entre com a medida" name="medida">
                </div>

                <div class="form-group">
                    <label>Características:</label>
                    <label class="checkbox-inline"><input type="checkbox" name="artesanal" checked>Artesanal</label>
                    <label class="checkbox-inline"><input type="checkbox" name="gelada">Gelada</label>
                </div>

                <button type="submit" class="btn btn-default">Cadastrar</button>
            </form>
        </div>
    </body>
</html>