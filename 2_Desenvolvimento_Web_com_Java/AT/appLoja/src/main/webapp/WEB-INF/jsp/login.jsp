<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=devide-width, initial">
		<title>Loja - Cadastro</title>
		<link href="./style/cadastro.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<main id="content">
			<c:import url="/WEB-INF/jsp/menu.jsp"/>

			<div class="container">

				<c:if test="${not empty mensagem}">
					<div class="alert alert-danger">
						<strong>Problema!</strong> ${mensagem}
					</div>
				</c:if>

				<h2>Autenticação</h2>
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
			</div>
		</main>
		<section class="images"></section>
		<footer id="footer">
			<h3>Bruno Fernanades Programmer</h3>
		</footer>
	</body>
</html>