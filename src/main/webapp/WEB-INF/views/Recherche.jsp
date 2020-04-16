<%-- 
    Document   : Recherche
    Created on : 24 mars 2020, 13:50:33
    Author     : Justin
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Lato&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" type="text/css" href="../style/style.css">
        <title>Accueil</title>
    </head>

    <body>
          <%@include file="menu.jsp" %>

        <div class="contenu">
            <h1> Les dispositifs d'automesure </h1>
           <div class="recherche">
               
            <form method="POST"> <%-- L'action par défaut est de revenir à l'URL du contrôleur --%>

                <input id="search" name="nom" placeholder="Effectuez une recherche" required><br>
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
            <div class="definition">
        <h2>Qu'est-ce qu'un dispositif d'automesure ?</h2>
        <p>Les dispositifs d’automesures sont des appareils permettant à son utilisateur de prendre différentes mesures de ses paramètres de santé tels que son poids, sa température ou sa tension. Les objectifs des dispositifs d’automesures sont divers. En effet ils peuvent porter sur la pathologie d’un patient avec la prévention de celle-ci, son diagnostic, son suivi et son évolution mais aussi être utilisés par des particuliers n’ayant aucune pathologie. Par exemple, par des sportifs voulant connaître des données sur leurs performances physiques. Ce sont généralement de petits appareils que l’on peut transporter facilement. De plus, comme ces appareils sont censés être utilisé aussi par des particuliers ils sont la plupart du temps intuitif et facile d’utilisation. Les premiers appareils considérés comme des appareils d’automesure sont des pèse-personnes avec aucune autre fonctionnalité, au cours des années et de l’avancement technologique, ils se sont développés et répandus dans les foyers et sont devenus des appareils connectés multifonctions.</p>
      </div>
        </div>
             <%--<hr>
        <a href="../index.html">Retour accueil</a>--%>
    </body>
</html>