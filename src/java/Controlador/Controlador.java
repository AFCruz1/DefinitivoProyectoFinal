
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {
Cliente c = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("PrincipalCliente")) {
            request.getRequestDispatcher("cliente/index.jsp").forward(request, response);
           
        }
        if (menu.equals("Cliente")) {
            switch (accion) {
                case "Listar":
                    List lista = cdao.listar();
                    request.setAttribute("clientes", lista);
                    break;
                case "Agregar":
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
                    cdao.agregar(c);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
//                case "Editar":
//                    idc = Integer.parseInt(request.getParameter("id"));
//                    Cliente cl = cdao.listarId(idc);
//                    request.setAttribute("cliente", cl);
//                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
//                    break;
//                case "Actualizar":
//                    String dni1 = request.getParameter("txtDni");
//                    String nom1 = request.getParameter("txtNombres");
//                    String tel1 = request.getParameter("txtTel");
//                    String est1 = request.getParameter("txtEstado");
//                    c.setDni(dni1);
//                    c.setNom(nom1);
//                    c.setDir(tel1);
//                    c.setEs(est1);
//                    c.setId(idc);
//                    cdao.actualizar(c);
//                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
//                    break;
//                case "Delete":
//                    idc = Integer.parseInt(request.getParameter("id"));
//                    cdao.delete(idc);
//                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
//                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("cliente/index.jsp").forward(request, response);
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
