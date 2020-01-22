
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PresupuestoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;


public List listar(){
        String sql="select * from presupuesto";
        List<Presupuesto>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Presupuesto pr=new Presupuesto();
                pr.setIdpre(rs.getInt(1));
                pr.setNombre(rs.getString(2));
                pr.setApellido(rs.getString(3));
                pr.setNombempresa(rs.getString(4));
                pr.setCorreo(rs.getString(5));
                pr.setTelf(rs.getString(6));               
               ;               
                lista.add(pr);
            }
        } catch (Exception e) {
        }
        return lista;
        }
public int agregar(Presupuesto cl){ 
        String sql="insert into presupuesto(Nombre, Apellido, NomEmpresa,telf, correo)values(?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cl.getNombre());
            ps.setString(2, cl.getApellido());
            ps.setString(3, cl.getNombempresa());
            ps.setString(4, cl.getTelf());
            ps.setString(5, cl.getCorreo());
           
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }


}