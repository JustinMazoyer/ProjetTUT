<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Import des "tag libraries" de JSP -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Lato&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" type="text/css" href="../style/style.css">
        <title>Résultat</title>
    </head>

    <body>
        <%@include file="menu.jsp" %>
        
        <h1>${dispositif.nom}</h1>
        
        <div class="definition">
        <p>${dispositif.description}</p>
        </div>
        
        <div class="ImageDispositif">
        <img src=${dispositif.urlPhoto}>
        </div>
        
        <h2>Liste des modèles appartenant aux dispositifs ${dispositif.getNom()}</h2>
        
        <table class="Tableau" border='1'>
            <tr><th>Nom</th><th>Description</th></tr>

            <c:if test="${empty dispositif.modeleCollection}">
                <tr><td colspan="3">Aucun modeles</td></tr>	
            </c:if>

            <c:forEach var="modele" items="${dispositif.modeleCollection}">
                <tr>
                    <td>${modele.nom}</td>
                    <td>${modele.description}</td>     

                </tr>
            </c:forEach>
        </table>

    </body>

</html>
