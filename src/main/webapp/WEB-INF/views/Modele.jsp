<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Import des "tag libraries" de JSP -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Affiche tous les modeles</title>
    </head>

    <body>
        <h1>Liste de tous les modèles proposés</h1>
     <table border='1'>
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
        <hr>
        <a href="../index.html">Retour accueil</a>
    </body>

</html>
