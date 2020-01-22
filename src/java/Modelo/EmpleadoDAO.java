
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class EmpleadoDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Empleado validar(String user, String Clave) {
        Empleado em = new Empleado();
        String sql = "select * from empleado where usuario=? and clave=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, Clave);
            rs = ps.executeQuery();
            while (rs.next()) {
                em.setIdCli(rs.getInt("idEmp"));
                em.setNombre(rs.getString("Nombre"));
                em.setApellido(rs.getString("Apellido"));
                em.setCargo(rs.getString("cargo"));
                em.setDirec(rs.getString("direc"));
                em.setTelefono(rs.getInt("telf"));
                em.setUsuario(rs.getString("usuario"));
                em.setClave(rs.getString("clave"));
            }
        } catch (Exception e) {
        }
        return em;
    }
    
    public List listar(){
        String sql="select * from empleado";
        List<Empleado>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Empleado em=new Empleado();
                em.setIdCli(rs.getInt(1));
                em.setNombre(rs.getString(2));
                em.setApellido(rs.getString(3));
                em.setCargo(rs.getString(4));
                em.setDirec(rs.getString(5));
                em.setTelefono(rs.getInt(6));
                em.setUsuario(rs.getString(7));
                em.setClave(rs.getString(8));
                lista.add(em);
            }
        } catch (Exception e) {
            
        }
        return lista;
    }
    public int agregar(Empleado em){ 
        String sql="insert into empleado(Nombre,Apellido,cargo,direc,telf,usuario,clave)values(?,?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellido());
            ps.setString(3, em.getCargo());
            ps.setString(4, em.getDirec());
            ps.setInt(5, em.getTelefono());
            ps.setString(6, em.getUsuario());
            ps.setString(7, em.getClave());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    public Empleado listarId(int id){
        Empleado emp=new Empleado();
        String sql="select * from empleado where idEmp="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
               emp.setIdCli(rs.getInt(1));
                emp.setNombre(rs.getString(2));
                emp.setApellido(rs.getString(3));
                emp.setCargo(rs.getString(4));
                emp.setDirec(rs.getString(5));
                emp.setTelefono(rs.getInt(6));
                emp.setUsuario(rs.getString(7));
                emp.setClave(rs.getString(8));
            }
        } catch (Exception e) {
        }
        return emp;
    }
    public int actualizar(Empleado em){
        String sql="update empleado set Nombre=?, Apellido=?, cargo=?, direc=?, telf=?, usuario=?, clave=? where idEmp=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellido());
            ps.setString(3, em.getCargo());
            ps.setInt(4, em.getTelefono());
            ps.setString(5, em.getUsuario());
            ps.setString(6, em.getClave());
            ps.setInt(7, em.getIdCli());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from empleado where IdEmp="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
}
