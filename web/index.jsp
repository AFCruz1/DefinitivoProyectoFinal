<!DOCTYPE html>

<html>
    <head>
        <title>GALLO CONTRUCTOR</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
         <style>
             html{
                  background-color: rgba(0, 0, 0, .85);
             }
    </style>
        <style>.container {
  max-width: 960px;
}

/*
 * Custom translucent site header
 */

.site-header {
  background-color: rgba(0, 0, 0, .85);
  -webkit-backdrop-filter: saturate(180%) blur(20px);
  backdrop-filter: saturate(180%) blur(20px);
}
.site-header a {
  color: #999;
  transition: ease-in-out color .15s;
}
.site-header a:hover {
  color: #fff;
  text-decoration: none;
}

/*
 * Dummy devices (replace them with your own or something else entirely!)
 */

.product-device {
  position: absolute;
  right: 10%;
  bottom: -30%;
  width: 300px;
  height: 540px;
  background-color: #333;
  border-radius: 21px;
  -webkit-transform: rotate(30deg);
  transform: rotate(30deg);
}

.product-device::before {
  position: absolute;
  top: 10%;
  right: 10px;
  bottom: 10%;
  left: 10px;
  content: "";
  background-color: rgba(255, 255, 255, .1);
  border-radius: 5px;
}

.product-device-2 {
  top: -25%;
  right: auto;
  bottom: 0;
  left: 5%;
  background-color: #e5e5e5;
}


/*
 * Extra utilities
 */

.flex-equal > * {
  -ms-flex: 1;
  flex: 1;
}
@media (min-width: 768px) {
  .flex-md-equal > * {
    -ms-flex: 1;
    flex: 1;
  }
}

.overflow-hidden { overflow: hidden; }</style>
    </head>
    <body>
        <div class="p-3 mb-2 "> 
         <nav class="site-header sticky-top py-1 ">
  <div class="container d-flex flex-column flex-md-row justify-content-between">
    <a class="py-2" href="#" aria-label="Product">
      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="d-block mx-auto" role="img" viewBox="0 0 24 24" focusable="false"><title>Product</title><circle cx="12" cy="12" r="10"/><path d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94"/></svg>
    </a>
    <a class="py-2 d-none d-md-inline-block" href="#">Acerca de</a>
    <a class="py-2 d-none d-md-inline-block" href="SesionCliente.jsp">Cliente</a>
    <a class="py-2 d-none d-md-inline-block" href="SesionAdmin.jsp">Admin</a>
    
  </div>
</nav>
            
        <div class="container p-2">
            <div id="carouselExampleSlidesOnly" class="carousel slide " data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active ">
        <center>
        <img src="cargador-frontal.jpg" class="d-block w-50 h-50 " >
        <div class="carousel-caption d-none d-md-block">
        <h5>Cargador Frontal</h5>
      </div>
        </center>
    </div>
      <div class="carousel-item ">
        <center>
        <img src="volquete.jpg" class="d-block w-25 h-50 " >
        <div class="carousel-caption d-none d-md-block">
        <h5>Volquete</h5>
      </div>
        </center>
    </div>
    
    
  </div>
                
</div>
        </div>
            <div class="container p-2 text-center">
            <hr>
            <h1>Línea directa de alquiler las 24 horas: 1-888-346-6464</h1>
            <hr>
        </div>
            
            <div class="container p-2">
            <div class="row">
  <div class="col-sm-6">
    <div class="card bg-info">
      <div class="card-body">
        <h5 class="card-title">Equipo pesado confiable para los trabajos más difíciles</h5>
        <p class="card-text">Elija de nuestra extensa flota de nuevas máquinas Cat® de baja hora equipadas con la última tecnología para su construcción, pavimentación, silvicultura y otros proyectos. Nuestras grandes excavadoras, cargadoras de ruedas, retroexcavadoras y otros equipos pesados ??están convenientemente ubicados y tienen servicio en todo el oeste de Canadá para satisfacer sus necesidades de alquiler de equipos.</p>
        <p class="card-text">Finning se enorgullece de proporcionar soluciones de alquiler a las industrias de construcción, petróleo y gas, minería, silvicultura, tuberías y manejo de materiales.</p>
     
      </div>
    </div>
      </div>
                
                <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Solicitar Presupuesto</h5>
        <form  class="form-sign" action="ControladorPresupuesto?menu=Presupuesto" method="post">
  <div class="form-group">
    <label >Nombre</label>
    <input type="text" class="form-control"  placeholder="Nombre" name="nom">
  </div>
           
            <div class="form-group">
    <label >Apellido</label>
    <input type="text" class="form-control"  placeholder="Apellido" name="ape">
  </div>
            <div class="form-group">
    <label >Nombre de la Empresa</label>
    <input type="text" class="form-control"  placeholder="Nombre de Empresa" name="nomem">
  </div>
            <div class="form-group">
    <label >Telefono</label>
    <input type="text" class="form-control"  placeholder="Telefono" name="tel">
  </div>
            <div class="form-group">
    <label >Email</label>
    <input type="text" class="form-control"  placeholder="Email" name="ema">
  </div>
            
            
            <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
</form>
      </div>
    </div>
  </div>
</div>
        </div>
            <footer class="mastfoot mt-auto">
    <div class="text-center">
      <p>Gallo Contructor@</p>
    </div>
  </footer>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
