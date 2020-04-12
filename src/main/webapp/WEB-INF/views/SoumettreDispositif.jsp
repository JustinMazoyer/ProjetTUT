<%-- 
    Document   : SoumettreDispositif
    Created on : 28 févr. 2020, 15:51:04
    Author     : Justin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Demande d'ajout d'un nouveau dispositif</h1>
        <form method="POST">
            Nom: <input name="nom" placeholder="Nom du dispositif" required="required"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('nom')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            </br>
            Description: <input name="description" placeholder="Description du dispositif"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('description')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            </br>
            urlPhoto: <input name="urlPhoto" placeholder="urlPhoto du dispositif"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('urlPhoto')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            </br> 
            <select name="id">
                <c:forEach var="categorie" items="${categories}">
                    <option value='${categorie.id}'>${categorie.nom}</option>
                </c:forEach>
            </select>
            <br>
            <br>
            <select name="id1">
                <c:forEach var="pathologie" items="${pathologies}">
                    <option value='${pathologie.id}'>${pathologie.nom}</option>
                </c:forEach>
            </select>
            <br>
            Modèle: <input name="nomM" placeholder="Modèle du dispositif" required="required"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('nomM')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            </br> 
            Description du Modèle: <input name="descriptionM" placeholder="Description"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('descriptionM')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            </br> 
             </br> 
            Référence: <input name="lienRef" placeholder="Référence" required="required"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('lienRef')}">
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