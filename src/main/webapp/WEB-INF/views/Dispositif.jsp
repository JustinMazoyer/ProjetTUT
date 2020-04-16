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
	<h1>Liste des dispositifs</h1>
	
	<table class="Tableau"  border='1'>
            <tr><th>Nom</th><th>Description</th></tr>
		
		<c:forEach var="dispositif" items="${dispositifs}">
			<tr>
				<td>${mvc.encoders.html(dispositif.nom)}</td>
				
				<td>${mvc.encoders.html(dispositif.description)}</td>
				
                               
			</tr>
		</c:forEach>
	</table>
    <div class="lienModele">
         <a href="Modele">Pour voir tous les modèles cliquez ici</a>
    </div>
</body>

</html>
