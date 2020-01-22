/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Presupuesto {
  
    int idpre;
    String nombre;
    String apellido;
    String nombempresa;
    String telf;
    String correo;

    public Presupuesto() {
    }

    public Presupuesto(int idpre, String nombre, String apellido, String nombempresa, String telf, String correo) {
        this.idpre = idpre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombempresa = nombempresa;
        this.telf = telf;
        this.correo = correo;
    }

    public int getIdpre() {
        return idpre;
    }

    public void setIdpre(int idpre) {
        this.idpre = idpre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombempresa() {
        return nombempresa;
    }

    public void setNombempresa(String nombempresa) {
        this.nombempresa = nombempresa;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    

  
}
