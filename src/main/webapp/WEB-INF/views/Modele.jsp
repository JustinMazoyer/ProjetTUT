<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Import des "tag libraries" de JSP -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

<head>
	<title>Affiche tous les modeles</title>
</head>

<body>
	<h1>Liste des modeles</h1>
	
	<table border='1'>
            <tr><th>Nom</th><th>Description</th><th>Voir</th></tr>
		
		<c:forEach var="modele" items="${modeles}">
			<tr>
				<td>${mvc.encoders.html(modele.nom)}</td>
				
				<td>${mvc.encoders.html(modele.description)}</td>
				
                                <td><input type="submit" value="Voir"></td>
                                
			</tr>
		</c:forEach>
	</table>

</body>

</html>
