<%-- 
    Document   : producto
    Created on : 15 nov 2022, 16:27:59
    Author     : daw
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
 
<%@ page import="cat.institutmvm.servlets.mvc.Producto" %>
<%@ page import="cat.institutmvm.servlets.mvc.ProductoServicio" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.List" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MVC Sample</title>
    </head>
    <body>
        <%
        if (request.getAttribute("single_product") != null) {
            Producto product = (Producto)request.getAttribute("single_product");
        %>
 
        <h1>Product Details</h1>
        <div>ID: <%= product.getId()%></div>
        <div>Name: <%= product.getTitulo()%></div>
        <div>Price: $ <%= new DecimalFormat("#0.00").format(product.getPrecio()) %></div>
        <div>Author: <%= product.getInterprete()%></div>
        <div>Album: <%= product.getAlbum()%></div>
        <div><a href="ProductoServlet">Go Back</a></div>
 
        <% } else { %>
 
        <h1>Product List</h1>
        <table>
            <tr>
                    <td><b>Name</b></td>
                    <td><b>Options</b></td>
            </tr>
 
            <% for (Producto product : (List<Producto>)request.getAttribute("product_list")) {%>
 
            <tr>
                <td><%= product.getTitulo()%></td>
                <td><a href="ProductoServlet?id=<%= product.getId()%>">Details...</a></td>
            </tr>
            
            <% } %>
            <a href="Musica.jsp">AddSongs+</a>
            <% } %>
          
        </table>
    </body>
</html>
