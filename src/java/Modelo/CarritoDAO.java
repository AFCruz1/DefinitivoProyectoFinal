/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucho1
 */
public class CarritoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    public List listar(){
        String sql="select * from carrito";
        List<Carrito>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Carrito ca=new Carrito();
                ca.setItem(rs.getInt(1));
                ca.setIdclie(rs.getInt(2));
                ca.setNombres(rs.getString(3));
                ca.setIdProducto(rs.getInt(4));
                ca.setDescripcion(rs.getString(5));               
                lista.add(ca);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public Carrito listarId(int id){
        Carrito ca=new Carrito();
        String sql="select * from cliente where item="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                ca.setItem(rs.getInt(1));
                ca.setIdclie(rs.getInt(2));
                ca.setNombres(rs.getString(3));
                ca.setIdProducto(rs.getInt(4));
                ca.setDescripcion(rs.getString(5));
                
            }
        } catch (Exception e) {
        }
        return ca;
    }
    
     public int agregar(Carrito cl){ 
        String sql="insert into carrito(item, idcli, nombreModelo, idmaq, placa)values(?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cl.getItem());
            ps.setInt(2, cl.getIdclie());
            ps.setString(3, cl.getNombres());
            ps.setInt(4, cl.getIdProducto());
            ps.setString(5, cl.getDescripcion());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
}
