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
        <link href="https://fonts.googleapis.com/css2?family=Lato&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" type="text/css" href="../style/style.css">
        <title>Suggestion</title>
    </head>
    <body>
           <%@include file="menu.jsp" %>
        
        <div class="contenu">
            <h1> Suggestion de dispositif</h1>
            <p>Vous ne trouvez pas le dispositif que vous cherchez ?</p>
            <p>Aidez nous à nous améliorer en nous proposant un dispositif !</p>
        </div>
        <div class="formulaire">
        <form method="POST">
            <p><label>Nom: </label><input name="nom" placeholder="Tensiomètre" required="required"></p>
            <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('nom')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            <p><label>Description: </label><textarea name="description" placeholder="Description du dispositif"></textarea></p>
            <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('description')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            <p><label>urlPhoto: </label><input name="urlPhoto" placeholder="urlPhoto du dispositif"></p>
            <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('urlPhoto')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach> 
            <p><label>Catégorie : </label><select name="id">
                <c:forEach var="categorie" items="${categories}">
                    <option value='${categorie.id}'>${categorie.nom}</option>
                </c:forEach>
            </select></p>
            <p><label>Pathologie : </label><select name="id1">
                <c:forEach var="pathologie" items="${pathologies}">
                    <option value='${pathologie.id}'>${pathologie.nom}</option>
                </c:forEach>
            </select></p>
            <p><label>Modèle: </label><input name="nomM" placeholder="Tension 2000" required="required"></p>
            <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('nomM')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            <p><label>Description du Modèle: </label><textarea name="descriptionM" placeholder="Description spécifique au modèle"></textarea></p>
            <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('descriptionM')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            <p><label>Référence: </label><input name="lienRef" placeholder="Articles,..." required="required"></p>
            <%-- On montre les erreurs de saisie éventuelles --%>
            <c:forEach var="error" items="${validationErrors.getErrors('lienRef')}">
                <span style="color: red;">${mvc.encoders.html(error.message)}</span>
            </c:forEach>
            <input type="submit" value="Envoyer">
        </form>
        <c:if test="${not empty databaseErrorMessage}">
            <span style="color: red;">${databaseErrorMessage}</span>
        </c:if>
                <%--<hr>
           <a href="../index.html">Retour accueil</a> --%>
        </div>
    </body>
</html>