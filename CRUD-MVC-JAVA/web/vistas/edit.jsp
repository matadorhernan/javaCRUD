
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <%
                PersonaDAO dao = new PersonaDAO();
                int id = Integer.parseInt((String) request.getAttribute("idper"));
                Persona p = (Persona) dao.list(id);
            %>
            <div class="col-lg-6">
                <h1>Agregar Persona</h1>
                <form action="Controlador">
                    Username:<br>
                    <input class="form-control" type="text" name="txtUsername" value="<%= p.getUsername()%>"><br>
                    Password: <br>
                    <input class="form-control" type="text" name="txtPassword" value="<%= p.getPassword()%>"><br>
                    Nombre(s): <br>
                    <input class="form-control" type="text" name="txtnombre" value="<%= p.getnombre()%>"><br>
                    Apeido(s): <br>
                    <input class="form-control" type="text" name="txtApeido" value="<%= p.getApeido()%>"><br>
                    <input type="hidden" name="txtid" value="<%= p.getId()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
