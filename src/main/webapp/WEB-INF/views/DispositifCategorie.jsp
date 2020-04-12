<%-- 
    Document   : DispositifCategorie
    Created on : 3 mars 2020, 11:30:05
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dispositifs dans la catégorie DispositifCategorie</title>
    </head>
    <body>
        <form> 	
            <select name='id' onchange='this.form.submit()'>

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
            <input type='submit'>
        </form>
        <h2>Dispositifs dans la catégorie ${selected.nom}</h2>

        <table border='1'>
            <tr><th>ID</th><th>Nom</th><th>Voir</th></tr>
                    <%-- Une ligne dans la table pour chaque produit --%>				
                    <c:forEach var="dispositif" items="${selected.dispositifCollection}">
                <tr>
                    <td>${dispositif.id}</td>
                    <td>${dispositif.nom}</td> 		
                <form method="POST" action="">
                    <input type="hidden" name="dispositif" value="${dispositif.nom}">
                    <td>
                        <c:if test="${dispositif.nom !=null}">
                              <input type="submit" value="Voir">
                        </c:if>
                    </td>
                </form>
            </tr>
        </c:forEach>
    </table>




    <%-- <table border='1'>
        <tr><th>Nom</th><th>Description</th><th>Voir Dispositif</th></tr>

        <c:if test="${empty selected.dispositifCollection}">
            <tr><td colspan="3">Aucun dispositif dans cette catégorie</td></tr>	
        </c:if>

        <c:forEach var="dispositif" items="${selected.dispositifCollection}">
            <tr>
                <td>${dispositif.nom}</td>
                <td>${dispositif.description}</td>     
                <td><input type="submit" value="Voir Dispositif"></td>
            </tr>
        </c:forEach>
    </table>--%>
    <hr>
    <a href="../index.html">Retour accueil</a>
</body>

</html>
