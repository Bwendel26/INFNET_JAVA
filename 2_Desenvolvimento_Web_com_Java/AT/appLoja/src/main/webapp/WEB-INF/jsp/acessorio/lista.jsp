<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>APP2021 - Confirma!!!</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>

        <c:import url="../menu.jsp"/>

        <div class="container">

            <form action="/bebida" method="get">
                <button type="submit" class="btn btn-link">Incluir</button>
            </form>

            <hr>

            <c:if test="${not empty msg}">
                <div class="alert alert-success">
                    <strong>Sucesso!</strong> ${msg}
                </div>
            </c:if>

            <c:if test="${not empty bebidas}">
                <h4>Quantidade de bebidas existentes: ${bebidas.size()}!!!</h4>

                <hr>

                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Descrição</th>
                        <th>Valor</th>
                        <th>Artesanal</th>
                        <th>Marca</th>
                        <th>Medida</th>
                        <th>Gelada</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="b" items="${bebidas}">
                        <tr>
                            <td>${b.id}</td>
                            <td>${b.descricao}</td>
                            <td>${b.valor}</td>
                            <td>${b.artesanal}</td>
                            <td>${b.marca}</td>
                            <td>${b.medida}</td>
                            <td>${b.gelada}</td>
                            <td><a href="/bebida/${b.id}/excluir">Excluir</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>

            <c:if test="${empty bebidas}">
                <h4>Não existem bebidas cadastradas!!!</h4>
            </c:if>
        </div>
    </body>
</html>