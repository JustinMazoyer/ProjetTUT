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
        <h1>Choisissez un dispositif pour voir les différents modèles</h1>
        <form> 	
            <select name='id' onchange='this.form.submit()'>

                <c:forEach var="dispositif" items="${dispositifs}">

                    <option value='${dispositif.id}'

                            <c:if test="${dispositif.id eq selected.id}">
                                selected
                            </c:if>
                            >

                        ${dispositif.nom}
                    </option>
                </c:forEach>
            </select>
            <input type='submit'>
        </form>

        <h2>Modeles appartenant aux dispositifs ${selected.nom}</h2>
        <table border='1'>
            <tr><th>Nom</th><th>Description</th></tr>

            <c:if test="${empty selected.modeleCollection}">
                <tr><td colspan="3">Aucun modeles</td></tr>	
            </c:if>

            <c:forEach var="modele" items="${selected.modeleCollection}">
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
