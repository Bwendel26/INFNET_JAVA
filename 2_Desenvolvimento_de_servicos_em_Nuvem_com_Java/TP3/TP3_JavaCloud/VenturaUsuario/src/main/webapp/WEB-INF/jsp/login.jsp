<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TP3 - Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
	
		<c:if test="${msg != null}">
			<div class="alert alert-danger">
			  <strong>Problema!</strong> ${msg}
			</div>
		</c:if>
	
	  <h2>Autenticação</h2>
	  <form action="/login" method="post">

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input value="elberth.moraes@prof.infnet.edu.br" type="email" class="form-control" placeholder="Email..." name="email">
	    </div>

	    <div class="form-group">
	      <label>Senha:</label>
	      <input value="elberth.moraes@prof.infnet.edu.br" type="password" class="form-control" placeholder="Nome..." name="senha">
	    </div>

	    <button type="submit" class="btn btn-default">Acessar</button>
	  </form>
	</div>

</body>
</html>