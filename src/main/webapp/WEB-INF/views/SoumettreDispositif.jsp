<%-- 
    Document   : SoumettreDispositif
    Created on : 28 févr. 2020, 15:51:04
    Author     : Justin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <body>
        <h1>Demande d'ajout d'un nouveau dispositif</h1>
        <form method="POST">
            ID: <input name="id" placeholder="id de l'appareil"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('id')}">
                    <span style="color: red;">${mvc.encoders.html(error.message)}</span>
                    </c:forEach>
            </br>
            Nom: <input name="nom" placeholder="Nom du dispositif"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('nom')}">
                    <span style="color: red;">${mvc.encoders.html(error.message)}</span>
                    </c:forEach>
            </br>
            Description: <input name="description" placeholder="Description du dispositif"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('description:')}">
                    <span style="color: red;">${mvc.encoders.html(error.message)}</span>
                    </c:forEach>
            </br>
            urlPhoto: <input name="urlPhoto" placeholder="urlPhoto du dispositif"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('urlPhoto')}">
                    <span style="color: red;">${mvc.encoders.html(error.message)}</span>
                    </c:forEach>
            </br>
            <input type="submit" value="Envoyer">
        </form>
        <c:if test="${not empty databaseErrorMessage}">
            <span style="color: red;">${databaseErrorMessage}</span>
        </c:if>
        <hr>
        <a href="../index.html">Retour accueil</a>
    </body>
</html>
