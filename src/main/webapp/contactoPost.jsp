<%-- 
    Document   : contactoPost
    Created on : 19 abr. 2023, 18:53:05
    Author     : vicen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Paginas de Registro de Contacto</h1>
        <form action="<%= request.getContextPath()%>/ContactoServlet" method="POST">
            <label> Nombre: <input type = "text" name="nombre"></label>
            <br><br>
            <label>Apellido</label><input type="text" name ="apellido">
            <br><br><!-- comment -->
              <label>EmailId</label><input type="email" name ="email">
              <br>
                            <label>Descripcion</label><input type="descripcion" name ="descripcion">
                          <input type="submit" value="Registrar">
                          

              
            </form>
    </body>
</html>
