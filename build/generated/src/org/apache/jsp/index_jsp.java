package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>GALLO CONTRUCTOR</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("         <style>\n");
      out.write("             html{\n");
      out.write("                  background-color: rgba(0, 0, 0, .85);\n");
      out.write("             }\n");
      out.write("    </style>\n");
      out.write("        <style>.container {\n");
      out.write("  max-width: 960px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * Custom translucent site header\n");
      out.write(" */\n");
      out.write("\n");
      out.write(".site-header {\n");
      out.write("  background-color: rgba(0, 0, 0, .85);\n");
      out.write("  -webkit-backdrop-filter: saturate(180%) blur(20px);\n");
      out.write("  backdrop-filter: saturate(180%) blur(20px);\n");
      out.write("}\n");
      out.write(".site-header a {\n");
      out.write("  color: #999;\n");
      out.write("  transition: ease-in-out color .15s;\n");
      out.write("}\n");
      out.write(".site-header a:hover {\n");
      out.write("  color: #fff;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * Dummy devices (replace them with your own or something else entirely!)\n");
      out.write(" */\n");
      out.write("\n");
      out.write(".product-device {\n");
      out.write("  position: absolute;\n");
      out.write("  right: 10%;\n");
      out.write("  bottom: -30%;\n");
      out.write("  width: 300px;\n");
      out.write("  height: 540px;\n");
      out.write("  background-color: #333;\n");
      out.write("  border-radius: 21px;\n");
      out.write("  -webkit-transform: rotate(30deg);\n");
      out.write("  transform: rotate(30deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-device::before {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 10%;\n");
      out.write("  right: 10px;\n");
      out.write("  bottom: 10%;\n");
      out.write("  left: 10px;\n");
      out.write("  content: \"\";\n");
      out.write("  background-color: rgba(255, 255, 255, .1);\n");
      out.write("  border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-device-2 {\n");
      out.write("  top: -25%;\n");
      out.write("  right: auto;\n");
      out.write("  bottom: 0;\n");
      out.write("  left: 5%;\n");
      out.write("  background-color: #e5e5e5;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * Extra utilities\n");
      out.write(" */\n");
      out.write("\n");
      out.write(".flex-equal > * {\n");
      out.write("  -ms-flex: 1;\n");
      out.write("  flex: 1;\n");
      out.write("}\n");
      out.write("@media (min-width: 768px) {\n");
      out.write("  .flex-md-equal > * {\n");
      out.write("    -ms-flex: 1;\n");
      out.write("    flex: 1;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overflow-hidden { overflow: hidden; }</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"p-3 mb-2 \"> \n");
      out.write("         <nav class=\"site-header sticky-top py-1 \">\n");
      out.write("  <div class=\"container d-flex flex-column flex-md-row justify-content-between\">\n");
      out.write("    <a class=\"py-2\" href=\"#\" aria-label=\"Product\">\n");
      out.write("      <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"d-block mx-auto\" role=\"img\" viewBox=\"0 0 24 24\" focusable=\"false\"><title>Product</title><circle cx=\"12\" cy=\"12\" r=\"10\"/><path d=\"M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94\"/></svg>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"py-2 d-none d-md-inline-block\" href=\"#\">Acerca de</a>\n");
      out.write("    <a class=\"py-2 d-none d-md-inline-block\" href=\"SesionCliente.jsp\">Cliente</a>\n");
      out.write("    <a class=\"py-2 d-none d-md-inline-block\" href=\"SesionAdmin.jsp\">Admin</a>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("            \n");
      out.write("        <div class=\"container p-2\">\n");
      out.write("            <div id=\"carouselExampleSlidesOnly\" class=\"carousel slide \" data-ride=\"carousel\">\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active \">\n");
      out.write("        <center>\n");
      out.write("        <img src=\"cargador-frontal.jpg\" class=\"d-block w-50 h-50 \" >\n");
      out.write("        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5>Cargador Frontal</h5>\n");
      out.write("      </div>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"carousel-item \">\n");
      out.write("        <center>\n");
      out.write("        <img src=\"volquete.jpg\" class=\"d-block w-25 h-50 \" >\n");
      out.write("        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        <h5>Volquete</h5>\n");
      out.write("      </div>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("                \n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"container p-2 text-center\">\n");
      out.write("            <hr>\n");
      out.write("            <h1>Línea directa de alquiler las 24 horas: 1-888-346-6464</h1>\n");
      out.write("            <hr>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <div class=\"container p-2\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("  <div class=\"col-sm-6\">\n");
      out.write("    <div class=\"card bg-info\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Equipo pesado confiable para los trabajos más difíciles</h5>\n");
      out.write("        <p class=\"card-text\">Elija de nuestra extensa flota de nuevas máquinas Cat® de baja hora equipadas con la última tecnología para su construcción, pavimentación, silvicultura y otros proyectos. Nuestras grandes excavadoras, cargadoras de ruedas, retroexcavadoras y otros equipos pesados ??están convenientemente ubicados y tienen servicio en todo el oeste de Canadá para satisfacer sus necesidades de alquiler de equipos.</p>\n");
      out.write("        <p class=\"card-text\">Finning se enorgullece de proporcionar soluciones de alquiler a las industrias de construcción, petróleo y gas, minería, silvicultura, tuberías y manejo de materiales.</p>\n");
      out.write("     \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Solicitar Presupuesto</h5>\n");
      out.write("        <form  class=\"form-sign\" action=\"ControladorPresupuesto?menu=Presupuesto\" method=\"post\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label >Nombre</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\"  placeholder=\"Nombre\" name=\"nom\">\n");
      out.write("  </div>\n");
      out.write("           \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("    <label >Apellido</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\"  placeholder=\"Apellido\" name=\"ape\">\n");
      out.write("  </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("    <label >Nombre de la Empresa</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\"  placeholder=\"Nombre de Empresa\" name=\"nomem\">\n");
      out.write("  </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("    <label >Telefono</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\"  placeholder=\"Telefono\" name=\"tel\">\n");
      out.write("  </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("    <label >Email</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\"  placeholder=\"Email\" name=\"ema\">\n");
      out.write("  </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btn btn-primary\">\n");
      out.write("</form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("            <footer class=\"mastfoot mt-auto\">\n");
      out.write("    <div class=\"text-center\">\n");
      out.write("      <p>Gallo Contructor@</p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
