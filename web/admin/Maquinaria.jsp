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
                        <form action="ControladorA?menu=Maquinaria" method="POST" enctype="multipart/form-data">
                            <div class="form-group">
                                <label>Nombre Del Modelo</label>
                                <input type="text" value="${producto.getNomModelo()}" name="txtnom" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Imagen</label>
                                <input  type="file"  name="imagen">
                            </div>
                            <div class="form-group">
                                <label>Placa</label>
                                <input type="text" value="${producto.getPlaca()}" name="txtpla" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Fecha de Fabricacion</label>
                                <input type="text" value="${producto.getFecha_de_fabricacion()}" name="txtfe" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Estado</label>
                                <input type="text" value="${producto.getEstado()}" name="txtEs" class="form-control">
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
                                    <th>Nombre del Modelo</th>
                                    <th>Imagen</th>
                                    <th>Placa</th>
                                    <th>Fecha de Fa</th>                        
                                    <th>ESTADO</th>                                    
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="em" items="${productos2}">
                                    <tr>
                                        <td>${em.getIdmaq()}</td>                                      
                                        <td>${em.getNomModelo()}</td>
                                        <td><img src="ControladorIMG?id=${em.getIdmaq()}" width="300" height="180"></td>
                                        <td>${em.getPlaca()}</td>
                                        <td>${em.getFecha_de_fabricacion()}</td>
                                        <td>${em.getEstado()}</td>                                        
                                       <td>
                                            <a class="btn btn-warning" href="Controlador?menu=Producto&accion=Editar&id=${em.getIdmaq()}">Editar</a>
                                            <a class="btn btn-danger" href="Controlador?menu=Producto&accion=Delete&id=${em.getIdmaq()}">Delete</a>
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

