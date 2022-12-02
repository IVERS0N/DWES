<%-- 
    Document   : Musica
    Created on : 22 nov 2022, 16:28:10
    Author     : daw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MVC</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Añadir Musica</h1>
        <form name="formulari" method="POST" action="ProductoServlet">
            <p>Titulo: <input type="text" name="titulo" placeholder="titulo"></p>
            <p>Precio: <input type="number" name="precio" placeholder="precio"></p>
            <p>Autor: <input type="text" name="autor" placeholder="autor"></p>
            <p>Album: <input type="text" name="album" placeholder="album"></p>
            <input type="submit">
        </form>
        <br>
        <div><a href="ProductoServlet">GoBack</a></div>
    </body>
</html>

