
package Controlador;

import Modelo.Alquiler;
import Modelo.AlquilerDAO;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Maquinaria;
import Modelo.MaquinariaDAO;
import config.GenerarSerie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControladorAlquiler extends HttpServlet {
    
Cliente c = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
    EmpleadoDAO edao = new EmpleadoDAO();
    Empleado em = new Empleado();
     MaquinariaDAO pdao=new MaquinariaDAO();
     Maquinaria p=new Maquinaria();
   List<Maquinaria> productos=new ArrayList<>();
   
   Alquiler al=new Alquiler();
   List<Alquiler> lista = new ArrayList<>();
    int item;
    int cod;
    String descripcion;
    String fini;
    String ffin;
    double precio;
    int cant;
    double subtotal;
    double totalPagar;
    
    String numeroserie="";
    AlquilerDAO vdao = new AlquilerDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("NuevaVenta")) {           
            switch (accion) {
                case "BuscarCliente":
                    int co = Integer.parseInt(request.getParameter("codigocliente"));
                    c.setIdCli(co);
                    c = cdao.buscar(co); 
                    request.setAttribute("c", c);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "BuscarProducto":
                    int id = Integer.parseInt(request.getParameter("codigoproducto"));
                    p = pdao.listarId(id);                    
                    request.setAttribute("c", c);
                    request.setAttribute("producto", p);                    
                    request.setAttribute("lista", lista);                    
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "Agregar":
                    request.setAttribute("nserie", numeroserie);
                    request.setAttribute("c", c);
                    totalPagar = 0.0;
                    item = item + 1;
                    cod = p.getIdmaq();
                    descripcion = request.getParameter("nomproducto");
                    precio = Double.parseDouble(request.getParameter("precio"));
                    cant = Integer.parseInt(request.getParameter("cant"));
                    fini = request.getParameter("feini");
                    ffin = request.getParameter("fefin");
                    subtotal = precio * cant;
                    al = new Alquiler();
                    al.setItem(item);
                    al.setIdmaq(cod);
                    al.setDescripcionP(descripcion);
                    al.setFechaini(fini);
                    al.setFechafin(ffin);
                    al.setPrecio(precio);
                    al.setCantidad(cant);
                    al.setSubtotal(subtotal);
                    lista.add(al);
                    for (int i = 0; i < lista.size(); i++) {
                        totalPagar = totalPagar + lista.get(i).getSubtotal();
                    }
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("lista", lista);                    
                    break;
                case "GenerarVenta":
                    
//                    //Guardar Venta
                    al.setIdcli(c.getIdCli()); 
                    al.setIdempl(em.getIdCli());
                    al.setFechaini(fini);
                    al.setFechaini(ffin);
                    al.setNumserie(numeroserie);
                    al.setMonto(totalPagar);
                    al.setEstado("1");
                    vdao.guardarAlquiler(al);
                    //Guardar Detalle ventas
                    int idv=Integer.parseInt(vdao.IdAlquiler());
                    for (int i = 0; i < lista.size(); i++) {
                        al=new  Alquiler();
                        al.setIdal(idv);
                        al.setIdmaq(lista.get(i).getIdmaq());
                        al.setCantidad(lista.get(i).getCantidad());
                        al.setPrecio(lista.get(i).getPrecio());
                        vdao.guardarDetalleventas(al);
                    }
                    lista=new ArrayList<>();
                    break;
                default:                    
                    al = new Alquiler();
                    lista = new ArrayList<>();
                    item = 0;
                    totalPagar = 0.0;                    
                    numeroserie = vdao.GenerarSerie();
                    if (numeroserie == null) {
                        numeroserie = "000000001";                        
                        request.setAttribute("nserie", numeroserie);
                    } else {
                        int incrementar = Integer.parseInt(numeroserie);
                        GenerarSerie gs = new GenerarSerie();
                        numeroserie = gs.NumeroSerie(incrementar);
                        request.setAttribute("nserie", numeroserie);
                    }
                    request.getRequestDispatcher("admin/RegistrarVenta.jsp").forward(request, response);
            }
            request.getRequestDispatcher("admin/RegistrarVenta.jsp").forward(request, response);
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
