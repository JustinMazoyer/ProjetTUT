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

        <h2>Modeles appartenant aux dispositifs ${dispositif.getNom()}</h2>
        <table border='1'>
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
        <hr>
        <a href="../index.html">Retour accueil</a>
    </body>

</html>
