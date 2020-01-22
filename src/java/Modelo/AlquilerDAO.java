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

/**
 *
 * @author lucho1
 */
public class AlquilerDAO {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
     public String GenerarSerie(){
        String numeroserie="";
        String sql="select max(numSerie) from alquiler";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                numeroserie=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return numeroserie;
    }
    public String IdAlquiler(){
        String idventas="";
        String sql="select max(idal) from alquiler";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                idventas=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idventas;
    }
     public int guardarAlquiler(Alquiler ve){
        String sql="insert into alquiler(idcli, idEmp, fechaini, fechafin, numSerie, Monto, Estado)values(?,?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, ve.getIdcli());
            ps.setInt(2, ve.getIdempl());
            ps.setString(3, ve.getFechaini());
            ps.setString(4, ve.getFechafin());
            ps.setString(5, ve.getNumserie());
            ps.setDouble(6, ve.getMonto());
            ps.setString(7, ve.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
     public int guardarDetalleventas(Alquiler venta){
        String sql="insert into detalle_alquiler(idal, idmaq,cantidad, precioventa)values(?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, venta.getIdal());
            ps.setInt(2, venta.getIdmaq());
            ps.setInt(3, venta.getCantidad());
            ps.setDouble(4, venta.getPrecio());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
     
     
}
