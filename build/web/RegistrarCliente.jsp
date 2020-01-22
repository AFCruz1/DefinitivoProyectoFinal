<%-- 
    Document   : RegistrarCliente
    Created on : Jan 11, 2020, 1:42:41 AM
    Author     : lucho1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Cliente</title>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <style>
        body{
            background-color: #f5f5f5;
        }
    </style>
    <body>
         <div class="container">
  <div class="py-5 text-center">
    <h2>Registrar Cliente</h2>
    
  </div>

  <div class="row">
    <div class="col-md-4 order-md-2 mb-4">
      <h4 class="d-flex justify-content-between align-items-center mb-3">
        <span class="text-muted">Catalago</span>
        
      </h4>
      <ul class="list-group mb-3">
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0">Cargador Frontal</h6>
            <small class="text-muted">Brief description</small>
          </div>
          <span class="text-muted">$12</span>
        </li>
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0">Volquete</h6>
            <small class="text-muted">Brief description</small>
          </div>
          <span class="text-muted">$8</span>
        </li>
        
      </ul>

      
    </div>
    <div class="col-md-8 order-md-1">
      <h4 class="mb-3">Registrar</h4>
      <form class="needs-validation" action="Controlador?menu=Cliente" method="POST" novalidate>
        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="firstName">Nombre</label>
            <input type="text" class="form-control" id="firstName" name="txtnombre" placeholder="Nombre" value="" required>
            <div class="invalid-feedback">
             Requiere nombre.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label for="lastName">Apellido</label>
            <input type="text" class="form-control" id="lastName" name="txtapellido"  placeholder="Apellido" value="" required>
            <div class="invalid-feedback">
              Requiere Apellido.
            </div>
          </div>
            <div class="col-md-6 mb-3">
            <label for="lastName">Nombre de Empresa</label>
            <input type="text" class="form-control" id="lastName" name="txtnomempresa" placeholder="Nombre de Empresa" value="" required>
            <div class="invalid-feedback">
              Requiere Este campo.
            </div>
          </div>
        </div>

        <div class="mb-3">
          <label for="username">Correo</label>
          <div class="input-group">
            <div class="input-group-prepend">
              <span class="input-group-text">@</span>
            </div>
            <input type="text" class="form-control" id="username" name="txtcorreo" placeholder="Correo" required>
            <div class="invalid-feedback" style="width: 100%;">
              Requiere este campo.
            </div>
          </div>
        </div>

        <div class="mb-3">
          <label for="address">Telefono</label>
          <input type="text" class="form-control" id="address" name="txttelefono" placeholder="Telefono" required>
          <div class="invalid-feedback">
            Requiere este campo.
          </div>
        </div>

        <div class="mb-3">
          <label for="address">Usuario</label>
          <input type="text" class="form-control" id="address" name="txtusuario" placeholder="Usuario" required>
          <div class="invalid-feedback">
            Requiere este campo.
          </div>
        </div>

        <div class="mb-3">
          <label for="address">Clave</label>
          <input type="password" class="form-control" id="inputPassword" name="txtclave" placeholder="Clave" required>
          <div class="invalid-feedback">
            Requiere este campo.
          </div>
        </div>

       
        <button class="btn btn-primary btn-lg btn-block" type="submit" name="accion" value="Agregar">Registrar</button>
      </form>
    </div>
  </div>

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">&copy; 2017-2019 Gallo Constructor</p>
    <ul class="list-inline">
      <li class="list-inline-item"><a href="SesionCliente.jsp">Regresar</a></li>
      
    </ul>
  </footer>
</div>
        
        
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
