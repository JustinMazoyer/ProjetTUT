<%-- 
    Document   : Validation
    Created on : 3 juil. 2020, 16:54:56
    Author     : mjp81
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page de validation</title>
    </head>
    <body>
        <h1>Dispositifs à valider</h1>
        <br><br>
        
        
        <table border='1' id="customers">
            <tr><th>Modèle</th><th>Description</th><th>Validé</th></tr>
                    <%-- Pour chaque produit, une ligne dans la table HTML --%>
                    <c:forEach var="produit" items="${dispositif}">
                <tr>
                    <%-- Le nom peut contenir des caractères spéciaux HTML ! --%>
                    <td>${mvc.encoders.html(dispositif.nom)}</td>
                    <%-- Exemple d'utilisation des fonctions de formatage de données de la JSTL --%>
                    <td>${mvc.encoders.html(dispositif.description)}</td>
                    <td><input type="checkbox"></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
