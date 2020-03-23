<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Import des "tag libraries" de JSP -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

<head>
	<title>Affiche tous les dispositifs</title>
</head>

<body>
	<h1>Liste des dispositifs</h1>
	
	<table border='1'>
            <tr><th>Nom</th><th>Description</th><th>Voir les modèles</th></tr>
		
		<c:forEach var="dispositif" items="${dispositifs}">
			<tr>
				<td>${mvc.encoders.html(dispositif.nom)}</td>
				
				<td>${mvc.encoders.html(dispositif.description)}</td>
				
                                <td><input type="submit" value="Voir les modèles"></td>
			</tr>
		</c:forEach>
	</table>

</body>

</html>
