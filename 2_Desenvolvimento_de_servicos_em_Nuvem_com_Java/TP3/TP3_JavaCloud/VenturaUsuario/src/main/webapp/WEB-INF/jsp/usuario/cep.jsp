<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-inverse">
    <form action="/cep" method="post">
        <div class="form-group">
            <label>CEP:</label>
            <input type="text" class="form-control" placeholder="CEP..." name="cep">
        </div>
        <button type="submit" class="btn btn-default">Pesquisar</button>
    </form>
    <c:if test="${endereco != null}">
        <div>
            <strong></strong> ${endereco}
        </div>
    </c:if>
</nav>
