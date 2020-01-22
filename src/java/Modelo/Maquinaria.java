
package Modelo;

import java.io.InputStream;


public class Maquinaria {
     int idmaq;
    String nomModelo;
    InputStream imagen;
    String placa;
    String fecha_de_fabricacion;
    String estado;

    public Maquinaria() {
    }

    public Maquinaria(int idmaq, String nomModelo, InputStream imagen, String placa, String fecha_de_fabricacion, String estado) {
        this.idmaq = idmaq;
        this.nomModelo = nomModelo;
        this.imagen = imagen;
        this.placa = placa;
        this.fecha_de_fabricacion = fecha_de_fabricacion;
        this.estado = estado;
    }

    public int getIdmaq() {
        return idmaq;
    }

    public void setIdmaq(int idmaq) {
        this.idmaq = idmaq;
    }

    public String getNomModelo() {
        return nomModelo;
    }

    public void setNomModelo(String nomModelo) {
        this.nomModelo = nomModelo;
    }

    public InputStream getImagen() {
        return imagen;
    }

    public void setImagen(InputStream imagen) {
        this.imagen = imagen;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFecha_de_fabricacion() {
        return fecha_de_fabricacion;
    }

    public void setFecha_de_fabricacion(String fecha_de_fabricacion) {
        this.fecha_de_fabricacion = fecha_de_fabricacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}
