/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

/** 
 *
 * @author lucho1
 */
public class MaquinariaDAO {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
    List<Maquinaria> productos=new ArrayList();
    String sql="select * from maquinaria";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                Maquinaria p=new Maquinaria();
                p.setIdmaq(rs.getInt(1));
                p.setNomModelo(rs.getString(2));
                p.setImagen(rs.getBinaryStream(3));
                p.setPlaca(rs.getString(4));
                p.setFecha_de_fabricacion(rs.getString(5));
                p.setEstado(rs.getString(6));
                
                productos.add(p);
            }
        } catch (Exception e) {
        }
    return productos;
    }
    
    public Maquinaria listarId(int id){
        String sql="select * from maquinaria where idmaq="+id;
        Maquinaria p=new Maquinaria();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                p.setIdmaq(rs.getInt(1));
                p.setNomModelo(rs.getString(2));
                p.setImagen(rs.getBinaryStream(3));
                p.setPlaca(rs.getString(4));
                p.setFecha_de_fabricacion(rs.getString(5));
                p.setEstado(rs.getString(6));
            }
        } catch (Exception e) {
        }return p;
    }
    
    public void listarImg (int id, HttpServletResponse response){
    
    String sql="select * from maquinaria where idmaq="+id;
    InputStream inputStream=null; 
    OutputStream outputStream=null; 
    BufferedInputStream bufferInputStream=null;
    BufferedOutputStream bufferOutputStream=null;
        try {
            
            outputStream= response.getOutputStream();
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if (rs.next()) {
               inputStream=rs.getBinaryStream("imagen");
            }
            bufferInputStream=new BufferedInputStream(inputStream);
            bufferOutputStream=new BufferedOutputStream(outputStream);
            int i=0;
            while ((i=bufferInputStream.read())!=-1){
            bufferOutputStream.write(i);
            }
            
        } catch (Exception e) {
        }
    
    }
   
    
    public void agregar(Maquinaria m){
     Maquinaria p=new Maquinaria();
     String sql="insert int maquinaria(nomModelo,imagen,placa,fecha_de_fabricacion,estado)values(?,?,?,?,?)";
     try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            
                ps.setString(1, p.getNomModelo());
                ps.setBlob(1, p.getImagen());
                ps.setString(1, p.getPlaca());
                ps.setString(1, p.getFecha_de_fabricacion());
                ps.setString(1, p.getEstado());
                
           ps.executeUpdate();
        } catch (Exception e) {
        }
     
    }
}
