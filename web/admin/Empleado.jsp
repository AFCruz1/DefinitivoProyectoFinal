<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>        
        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <form action="ControladorA?menu=Empleado" method="POST">
                           <div class="form-group">
                                <label>Id</label>
                                <input type="text" value="${empleado.getIdCli()}" name="txtid" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Nombre</label>
                                <input type="text" value="${empleado.getNombre()}" name="txtnom" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Apellido</label>
                                <input type="text" value="${empleado.getApellido()}" name="txtape" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Cargo</label>
                                <input type="text" value="${empleado.getCargo()}" name="txtcar" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Direccion</label>
                                <input type="text" value="${empleado.getDirec()}" name="txtdir" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Telefono</label>
                                <input type="text" value="${empleado.getTelefono()}" name="txttel" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Usuario</label>
                                <input type="text" value="${empleado.getUsuario()}" name="txtusu" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Clave</label>
                                <input type="text" value="${empleado.getClave()}" name="txtcla" class="form-control">
                            </div>
                            <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                            <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                        </form>
                    </div>                         
                </div>
            </div>                     
            <div class="col-sm-8">
                <div class="card">
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>NOMBRES</th>
                                    <th>APELLIDO</th>
                                    <th>CARGO</th>
                                    <th>DIRECCION</th>
                                    <th>TELEFONO</th>
                                    <th>USUARIO</th>
                                    <th>CLAVE</th>
                                    
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="em" items="${empleados}">
                                    <tr>
                                        <td>${em.getIdCli()}</td>
                                        <td>${em.getNombre()}</td>
                                        <td>${em.getApellido()}</td>
                                        <td>${em.getCargo()}</td>
                                        <td>${em.getDirec()}</td>
                                        <td>${em.getTelefono()}</td>
                                        <td>${em.getUsuario()}</td>
                                        <td>${em.getClave()}</td>
                                        
                                        <td>
                                            
                                            <a class="btn btn-warning" href="ControladorA?menu=Empleado&accion=Editar&id=${em.getIdCli()}">Editar</a>
                                            <a class="btn btn-danger" href="ControladorA?menu=Empleado&accion=Delete&id=${em.getIdCli()}">Delete</a>
                                       
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>      
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
