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
		<main>
			<div id="content">
				<h1 id="titulo">Criar Conta</h1>
				<form action="" method="post">
					<label for="nome">
						<span>Nome</span>
						<input type="text" id="nome" name="nome">
					</label>
					<label for="email">
						<span>E-mail</span>
						<input type="email" id="email" name="email">
					</label>
					<label for="senha">
						<span>Senha</span>
						<input type="password" id="senha" name="senha">
					</label>
					<a href="/solicitante/cadastro" id="linkRegistro">Fazer cadastro</a>
				</form>
			</div>
		</main>
		<section class="images"></section>
		<footer id="footer">
			<h3>Bruno Fernanades Programmer</h3>
		</footer>
	</body>
</html>