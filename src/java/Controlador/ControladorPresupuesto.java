/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Presupuesto;
import Modelo.PresupuestoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucho1
 */
public class ControladorPresupuesto extends HttpServlet {
PresupuestoDAO prdao=new PresupuestoDAO();
    Presupuesto pr=new Presupuesto();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        if (menu.equals("Presupuesto")) {
            switch (accion) {
                case "Listar":
                    List lista = prdao.listar();
                    request.setAttribute("presupuesto", lista);
                    break;
                case "Agregar":
                    String nom = request.getParameter("nom");
                    String ape = request.getParameter("ape");
                    String nomempre = request.getParameter("nomem");
                    
                    String tel = request.getParameter("tel");
                    String correo = request.getParameter("ema");
                    
                    pr.setNombre(nom);
                    pr.setApellido(ape);
                    pr.setNombempresa(nomempre);
                    pr.setTelf(tel);
                    pr.setCorreo(correo);
                    
                    
                    prdao.agregar(pr);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
//                case "Editar":
//                    ide = Integer.parseInt(request.getParameter("id"));
//                    Empleado e = edao.listarId(ide);
//                    request.setAttribute("empleado", e);
//                    request.getRequestDispatcher("ControladorA?menu=Empleado&accion=Listar").forward(request, response);
//                    break;
//                case "Actualizar":
//                    String nom1 = request.getParameter("txtnom");
//                    String ape1 = request.getParameter("txtape");
//                    String car1 = request.getParameter("txtcar");
//                    String dir1 = request.getParameter("txtdir");
//                    int tel1 = Integer.parseInt(request.getParameter("txttel"));
//                    String usua1 = request.getParameter("txtusu");
//                    String cla1= request.getParameter("txtcla");
//                    em.setNombre(nom1);
//                    em.setApellido(ape1);
//                    em.setCargo(car1);
//                    em.setDirec(dir1);
//                    em.setTelefono(tel1);
//                    em.setUsuario(usua1); 
//                    em.setClave(cla1);
//                    em.setIdCli(ide);
//                    edao.actualizar(em);
//                    request.getRequestDispatcher("ControladorA?menu=Empleado&accion=Listar").forward(request, response);
//                    break;
//                case "Delete":
//                    ide = Integer.parseInt(request.getParameter("id"));
//                    edao.delete(ide);
//                    request.getRequestDispatcher("ControladorA?menu=Empleado&accion=Listar").forward(request, response);
//                    break;
                default:
                    throw new AssertionError();
            }
            
            request.getRequestDispatcher("admin/presupuesto.jsp").forward(request, response);
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
