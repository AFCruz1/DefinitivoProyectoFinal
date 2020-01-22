
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/your-path-to-fontawesome/css/all.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Gallo Constructores</title>
        
    </head>
    <body>
       <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Gallo Constructores</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="ControladorMaquinaria?accion=home">Catalogo <span class="sr-only">(current)</span></a>
      </li>
      
     
      <li class="nav-item">
          <a class="nav-link " href="ControladorMaquinaria?accion=home"> Seguir Comprando</a>
      </li>
    </ul>
    
  </div>
</nav>
       <div class="container mt-4">
            <h3>Carrito</h3>
            <div class="row">
                <div class="col-sm-8">
                    <form action="ControladorMaquinaria">
                     <table class="table table-hover bg-info">
                        <thead>
                            <tr>
                                <th>Item</th>
                                <th>Id Cliente</th>
                                <th>Nombre del Modelo</th>
                                <th>Id Maquinaria</th>
                                <th>Placa</th>
                                
                                <th>Accion</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="car" items="${carrito}">
                            
                            <tr>
                                <td><input type="text" name="item" value="${car.getItem()}" class="form-control"></td>
                                <td><input type="text" name="cli" value="${car.getIdclie()}" class="form-control"></td>
                                <td><input type="text" name="nom" value="${car.getNombres()}" class="form-control"></td>
                                <td><input type="text" name="idma" value="${car.getIdProducto()}" class="form-control"></td>
                                <td><input type="text" name="pla" value="${car.getDescripcion()}" class="form-control"></td>
                                
                                <td>
                                    <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                                    <a href="ControladorMaquinaria?accion=Delete&id=${car.getIdProducto()}" class="btn btn-danger" >Eliminar</a>
                                    </td>
                        
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    </form>
                </div>
                
                
            </div>
        </div>
        
       
      
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script src="js/funciones.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    </body>
</html>
