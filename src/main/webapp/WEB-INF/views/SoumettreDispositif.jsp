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
        <form method="POST"> <%-- L'action par défaut est de revenir à l'URL du contrôleur --%>
			<input name="id" placeholder="Libellé de la catégorie"><br>
			<ul> <%-- On montre les erreurs de saisie éventuelles --%>
				<c:forEach var="error" items="${validationErrors.getErrors('id')}">
					<li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
				</c:forEach>
			</ul>
			
			<input name="description" placeholder="Description de la catégorie"><br>
			<ul> <%-- On montre les erreurs de saisie éventuelles --%>
				<c:forEach var="error" items="${validationErrors.getErrors('description')}">
					<li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
				</c:forEach>
			</ul>
    </body>
</html>
