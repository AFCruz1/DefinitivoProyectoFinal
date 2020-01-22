
package Modelo;


public class Carrito {
   int item;
   int idProducto;
   int idclie;
   String nombres;
   String descripcion;
   
    public Carrito() {
    }

    public Carrito(int item, int idProducto, int idclie, String nombres, String descripcion) {
        this.item = item;
        this.idProducto = idProducto;
        this.idclie = idclie;
        this.nombres = nombres;
        this.descripcion = descripcion;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdclie() {
        return idclie;
    }

    public void setIdclie(int idclie) {
        this.idclie = idclie;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
   
}
