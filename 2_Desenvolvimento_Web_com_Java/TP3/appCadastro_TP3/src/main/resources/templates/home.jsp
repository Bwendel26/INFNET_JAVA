<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.infnet.mvc.appCadastro_TP3.model.User" %>    

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	</head>
	<body>
		<div>Usuários:</div>
		<%
			for(User user: users) {
				%><h3>Nome: <% user.nome %></h3>
				  <h3>Email: <% user.email %></h3>
				  <br/>
			<%}
		%>
	</body>
</html>