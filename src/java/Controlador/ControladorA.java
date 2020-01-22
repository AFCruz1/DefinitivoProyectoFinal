
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Maquinaria;
import Modelo.MaquinariaDAO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class ControladorA extends HttpServlet {
EmpleadoDAO edao = new EmpleadoDAO();
    Empleado em = new Empleado();
Cliente c = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
MaquinariaDAO pdao=new MaquinariaDAO();
     Maquinaria p=new Maquinaria();
      List<Maquinaria> productos=new ArrayList<>();
int ide;
int idc;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
         productos=pdao.listar();
        if (menu.equals("Principaladministrador")) {
            request.getRequestDispatcher("admin/Principal.jsp").forward(request, response);
           
        }
        
        if (menu.equals("Empleado")) {
            switch (accion) {
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String nom = request.getParameter("txtnom");
                    String ape = request.getParameter("txtape");
                    String car = request.getParameter("txtcar");
                    String dir = request.getParameter("txtdir");
                    int tel = Integer.parseInt(request.getParameter("txttel"));
                    String usua = request.getParameter("txtusu");
                    String cla= request.getParameter("txtcla");
                    em.setNombre(nom);
                    em.setApellido(ape);
                    em.setCargo(car);
                    em.setDirec(dir);
                    em.setTelefono(tel);
                    em.setUsuario(usua); 
                    em.setClave(cla);
                    edao.agregar(em);
                    request.getRequestDispatcher("ControladorA?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("ControladorA?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    int id = Integer.parseInt(request.getParameter("txtid"));
                    String nom1 = request.getParameter("txtnom");
                    String ape1 = request.getParameter("txtape");
                    String car1 = request.getParameter("txtcar");
                    String dir1 = request.getParameter("txtdir");
                    int tel1 = Integer.parseInt(request.getParameter("txttel"));
                    String usua1 = request.getParameter("txtusu");
                    String cla1= request.getParameter("txtcla");
                    em.setNombre(nom1);
                    em.setApellido(ape1);
                    em.setCargo(car1);
                    em.setDirec(dir1);
                    em.setTelefono(tel1);
                    em.setUsuario(usua1); 
                    em.setClave(cla1);
                    em.setIdCli(id);
                    edao.actualizar(em);
                    request.getRequestDispatcher("ControladorA?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                    request.getRequestDispatcher("ControladorA?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            
            request.getRequestDispatcher("admin/Empleado.jsp").forward(request, response);
        }
        if (menu.equals("Cliente")) {
            switch (accion) {
                case "Listar":
                    List lista = cdao.listar();
                    request.setAttribute("clientes", lista);
                    break;
                case "Agregarr":
                    String nom = request.getParameter("txtnombre");
                    String ape = request.getParameter("txtapellido");
                    String nomem = request.getParameter("txtnomempresa");
                    String correo = request.getParameter("txtcorreo");
                    int tel = Integer.parseInt(request.getParameter("txttelefono"));
                    String usu = request.getParameter("txtusuario");
                    String clave = request.getParameter("txtclave");
                    c.setNombre(nom);
                    c.setApellido(ape);
                    c.setNomEmpresa(nomem);
                    c.setCorreo(correo);
                    c.setTelefono(tel);
                    c.setUsuario(usu);
                    c.setClave(clave);
                    cdao.agregar2(c); 
                    request.getRequestDispatcher("ControladorA?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idc = Integer.parseInt(request.getParameter("id"));
                    Cliente cl = cdao.listarId(idc);
                    request.setAttribute("cliente", cl);
                    request.getRequestDispatcher("ControladorA?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nom1 = request.getParameter("txtnombre");
                    String ape1 = request.getParameter("txtapellido");
                    String nomem1= request.getParameter("txtnomempresa");
                    String correo1 = request.getParameter("txtcorreo");
                    int tel1 = Integer.parseInt(request.getParameter("txttelefono"));
                    String usu1 = request.getParameter("txtusuario");
                    String clave1 = request.getParameter("txtclave");
                    c.setNombre(nom1);
                    c.setApellido(ape1);
                    c.setNomEmpresa(nomem1);
                    c.setCorreo(correo1);
                    c.setTelefono(tel1);
                    c.setUsuario(usu1);
                    c.setClave(clave1);
                    c.setIdCli(idc);
                    cdao.actualizar(c);
                    request.getRequestDispatcher("ControladorA?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idc = Integer.parseInt(request.getParameter("id"));
                    cdao.delete(idc);
                    request.getRequestDispatcher("ControladorA?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("admin/Clientes.jsp").forward(request, response);
        }
        if (menu.equals("Maquinaria")) {
           
            switch (accion) {
                case "Listar":
                    List lista = pdao.listar();
                    request.setAttribute("productos", lista);
                    break;
                case "Agregar":
                   String nom=request.getParameter("txtnom");
           Part part=request.getPart("imagen");
           InputStream inputStream=part.getInputStream();
           String pla=request.getParameter("txtpla");
           String tel=request.getParameter("txtfe");
           String es=request.getParameter("txtEs");
           
           p.setNomModelo(nom);
           p.setImagen(inputStream);
           p.setPlaca(pla);
           p.setFecha_de_fabricacion(accion);
           p.setEstado(es);
           
           pdao.agregar(p);
                    request.getRequestDispatcher("ControladorA?menu=Maquinaria&accion=Listar").forward(request, response);
                    break;
//                case "Editar":
//                    idp = Integer.parseInt(request.getParameter("id"));
//                    Producto pr = pdao.listarId(idp);
//                    request.setAttribute("producto", pr);
//                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
//                    break;
//                case "Actualizar":
//                    String dni1 = request.getParameter("txtDni");
//                    double pre1 = Double.parseDouble(request.getParameter("txtNombres"));
//                    int st1 = Integer.parseInt(request.getParameter("txtTel"));
//                    String est1 = request.getParameter("txtEstado");
//                    p.setNom(dni1);
//                    p.setPre(pre1);
//                    p.setStock(st1);
//                    p.setEstado(est1);
//                    p.setId(idp);
//                    pdao.actualizar(p);
//                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
//                    break;
//                case "Delete":
//                    idp = Integer.parseInt(request.getParameter("id"));
//                    pdao.delete(idp);
//                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
//                    break;
                default:                    
                    throw new AssertionError();
            }
            request.setAttribute("productos2", productos);
            request.getRequestDispatcher("admin/Maquinaria.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
