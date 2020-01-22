
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
        
        <div class="d-flex p-2">
                                <table class="table table-hover table-dark">
                                    <thead>
    <tr>
        <th colspan="5"><center><h3>Pedidos Clientes Registrados</h3></center></th>
      
    </tr>
  </thead>
  <thead>
    <tr>
      <th scope="col">item</th>
      <th scope="col">idcli</th>
      <th scope="col">nombreModelo</th>
      <th scope="col">idmaq</th>
      <th scope="col">placa</th>
    </tr>
  </thead>
  <tbody>
      <c:forEach var="car" items="${listacarrito}">
    <tr>
      <td>${car.getItem()}</td>
      <td>${car.getIdclie()}</td>
      <td>${car.getNombres()}</td>
      <td>${car.getIdProducto()}</td>
      <td>${car.getDescripcion()}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
                            </div>
    
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
