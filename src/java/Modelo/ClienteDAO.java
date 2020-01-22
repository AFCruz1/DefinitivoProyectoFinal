
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
     Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    public Cliente validar(String Usuario, String Clave) {
       Cliente c = new Cliente();
        String sql = "select * from cliente where usuario=? and clave=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Clave);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setIdCli(rs.getInt("idcli"));
                c.setNombre(rs.getString("Nombre"));
                c.setApellido(rs.getString("Apellido"));
                c.setNomEmpresa(rs.getString("NomEmpresa"));
                c.setCorreo(rs.getString("Correo"));
                c.setTelefono(rs.getInt("telf"));
                c.setUsuario(rs.getString("usuario"));
                c.setClave(rs.getString("clave"));
            }
        } catch (Exception e) {
        }
        return c;
    }
    
     public Cliente buscar(int idCli){
        Cliente c=new Cliente();
        String sql="Select * from cliente where idcli="+idCli;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                c.setIdCli(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setNomEmpresa(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setTelefono(rs.getInt(6));               
                c.setUsuario(rs.getString(7));               
                c.setClave(rs.getString(8));                
            }
        } catch (Exception e) {
        }
        return c;
    }
    
    
    
    
    
     public List listar(){
        String sql="select * from cliente";
        List<Cliente>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Cliente cl=new Cliente();
                cl.setIdCli(rs.getInt(1));
                cl.setNombre(rs.getString(2));
                cl.setApellido(rs.getString(3));
                cl.setNomEmpresa(rs.getString(4));
                cl.setCorreo(rs.getString(5));
                cl.setTelefono(rs.getInt(6));               
                cl.setUsuario(rs.getString(7));               
                cl.setClave(rs.getString(8));               
                lista.add(cl);
            }
        } catch (Exception e) {
        }
        return lista;
    }
     
     public Cliente listarId(int id){
        Cliente cli=new Cliente();
        String sql="select * from cliente where idcli="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                cli.setIdCli(rs.getInt(1));
                cli.setNombre(rs.getString(2));
                cli.setApellido(rs.getString(3));
                cli.setNomEmpresa(rs.getString(4));
                cli.setCorreo(rs.getString(5));
                cli.setTelefono(rs.getInt(6));               
                cli.setUsuario(rs.getString(7));               
                cli.setClave(rs.getString(8));              
            }
        } catch (Exception e) {
        }
        return cli;
    }
     
      public int agregar2(Cliente cl){ 
        String sql="insert into cliente(Nombre, Apellido, NomEmpresa,Correo, telf, usuario, clave)values(?,?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cl.getNombre());
            ps.setString(2, cl.getApellido());
            ps.setString(3, cl.getNomEmpresa());
            ps.setString(4, cl.getCorreo());
            ps.setInt(5, cl.getTelefono());
            ps.setString(6, cl.getUsuario());
            ps.setString(7, cl.getClave());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
     
     public int agregar(Cliente cl){ 
        String sql="insert into cliente(Nombre, Apellido, NomEmpresa,Correo, telf, usuario, clave)values(?,?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cl.getNombre());
            ps.setString(2, cl.getApellido());
            ps.setString(3, cl.getNomEmpresa());
            ps.setString(4, cl.getCorreo());
            ps.setInt(5, cl.getTelefono());
            ps.setString(6, cl.getUsuario());
            ps.setString(7, cl.getClave());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
     
     
      public int actualizar(Cliente em){
        String sql="update cliente set Nombre=?, Apellido=?, NomEmpresa=?,Correo=?, telf=?, usuario=?, clave=? where idcli=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellido());
            ps.setString(3, em.getNomEmpresa());
            ps.setString(4, em.getCorreo());
            ps.setInt(4, em.getTelefono());
            ps.setString(4, em.getUsuario());
            ps.setString(4, em.getClave());
            ps.setInt(5, em.getIdCli());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from cliente where idcli="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
     
}
