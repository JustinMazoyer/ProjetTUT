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
            <form> 
                <select name="id" onchange='this.form.submit()'>
                    <c:forEach var="categorie" items="${categories}">
                        <option value='${categorie.id}' 
                                <c:if test="${categorie.id eq selected.id}">
                                    selected
                                </c:if>
                                > 
                            ${categorie.nom}
                        </option>
                    </c:forEach>
                </select>
            </form>
            <input type="submit" value="Envoyer">
        </form>
        <c:if test="${not empty databaseErrorMessage}">
            <span style="color: red;">${databaseErrorMessage}</span>
        </c:if>
        <hr>
        <a href="../index.html">Retour accueil</a>
    </body>
</html>
