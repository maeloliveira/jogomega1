<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>
<a href="ListaJogo">Criar novo jogo</a>
<br /> <br />
<table>
<tr>
<th>Id</th>
<th>numeroJogo</th>
<th>email</th>
<th>validaJogo</th>
<th>dataValidade</th>


</tr>
<c:forEach items="${jogo}" var="jogo">
<tr>
<td>${jogo.id}</td>
<td>${jogo.descricao}</td>
<c:if test="${jogo.NumeroJogo eq false}">
<td>Jogo em andamento</td>
</c:if>
<c:if test="${jogo.email eq false}">
<td>Adicionar Email</td>
</c:if>
<c:if test="${jogo.finalizado eq true}">
<td>Jogo Finalizado</td>
</c:if>
<td>
<fmt:formatDate
value="${jogo.dataValidade.time}"
pattern="dd/MM/yyyy"/>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>