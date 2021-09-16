<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<link rel="stylesheet" href="./style/general.css">
		<link rel="stylesheet" href="./style/home.css">
	</head>
	<body>
		<div id="content">
			<div id="container">
				<header id="header">
					<h1 id="titulo">WebStore</h1>
					<h2>Desenvolvimento Web com Java EE - INFNET 2021</h2>
					<h3>Projeto de loja online</h3>
				</header>
				<nav>
					<c:import url="menu.jsp"/>
				</nav>
				<a href="/login.jsp" id="linkLogin">Login</a>
				<a href="/solicitante/cadastro.jsp" id="linkRegistro">Registro</a>
			</div>
			<div id=github>
				<p>
					<a href="https://github.com/Bwendel26/INFNET_JAVA/tree/main/2_Desenvolvimento_Web_com_Java/AT/appLoja">Link do projeto</a>
				</p>
			</div>
			<footer>
			</footer>
		</div>
	</body>
</html>