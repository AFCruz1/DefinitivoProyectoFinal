
package Modelo;

public class Alquiler {
    int idal;
    int idcli;
    int idempl;
    int idmaq;
    Integer item;
    String fechaini;
    String fechafin;
    String numserie;
    double monto;
    String estado;
    Double precio;
    Integer cantidad;
    Double subtotal;
    String DescripcionP;
    
    public Alquiler() {
    }

    public Alquiler(int idal, int idcli, int idempl, int idmaq, Integer item, String fechaini, String fechafin, String numserie, double monto, String estado, Double precio, Integer cantidad, Double subtotal, String DescripcionP) {
        this.idal = idal;
        this.idcli = idcli;
        this.idempl = idempl;
        this.idmaq = idmaq;
        this.item = item;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.numserie = numserie;
        this.monto = monto;
        this.estado = estado;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.DescripcionP = DescripcionP;
    }

    public int getIdal() {
        return idal;
    }

    public void setIdal(int idal) {
        this.idal = idal;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public int getIdempl() {
        return idempl;
    }

    public void setIdempl(int idempl) {
        this.idempl = idempl;
    }

    public int getIdmaq() {
        return idmaq;
    }

    public void setIdmaq(int idmaq) {
        this.idmaq = idmaq;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }
    
    
}
