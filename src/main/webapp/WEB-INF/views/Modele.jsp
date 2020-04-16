<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Import des "tag libraries" de JSP -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Lato&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" type="text/css" href="../style/style.css">
        <title>Dispositifs</title>
    </head>

    <body>
        <%@include file="menu.jsp" %>
        <h1>Liste de tous les modèles proposés</h1>
     <table class="Tableau" border='1'>
		<tr><th>ID</th><th>Nom</th><th>Description</th></tr>
		<%-- Pour chaque produit, une ligne dans la table HTML --%>
		<c:forEach var="modele" items="${modeles}">
			<tr>
				<td>${modele.id}</td>
				<%-- Le nom peut contenir des caractères spéciaux HTML ! --%>
				<td>${mvc.encoders.html(modele.nom)}</td>
				<%-- Exemple d'utilisation des fonctions de formatage de données de la JSTL --%>				
				<td>${mvc.encoders.html(modele.description)}</td>
			</tr>
		</c:forEach>
	</table>
    </body>

</html>
