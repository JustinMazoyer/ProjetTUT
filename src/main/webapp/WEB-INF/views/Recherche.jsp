<%-- 
    Document   : Recherche
    Created on : 24 mars 2020, 13:50:33
    Author     : Justin
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

    <head>
        <title>Connexion</title>
    </head>

    <body>
        <div style="text-align:center;">
            <h1 align="center">Recherche</h1>

            <form method="POST"> <%-- L'action par défaut est de revenir à l'URL du contrôleur --%>

                <input name="nom" placeholder="Effectuez une recherche"><br>
                <ul> <%-- On montre les erreurs de saisie éventuelles --%>
                    <c:forEach var="error" items="${validationErrors.getErrors('nom')}">
                        <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                        </c:forEach>
                </ul>
                <input type="submit" value="Valider">
            </form>
            <%-- Est-ce qu'on a un message d'erreur à afficher ? --%>
            <c:if test="${not empty databaseErrorMessage}">
                <h2>Erreur !</h2>
                <span style="color: red;">${databaseErrorMessage}</span>
            </c:if>
        </div>
    </body>
</html>