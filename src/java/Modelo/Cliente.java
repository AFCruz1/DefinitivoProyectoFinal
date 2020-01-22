
package Modelo;


public class Cliente {
    int idCli;
    String Nombre;
    String Apellido;
    String NomEmpresa;
    String Correo;
    int Telefono;
    String Usuario;
    String Clave;

    public Cliente() {
    }

    public Cliente(int idCli, String Nombre, String Apellido, String NomEmpresa, String Correo, int Telefono, String Usuario, String Clave) {
        this.idCli = idCli;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NomEmpresa = NomEmpresa;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Usuario = Usuario;
        this.Clave = Clave;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNomEmpresa() {
        return NomEmpresa;
    }

    public void setNomEmpresa(String NomEmpresa) {
        this.NomEmpresa = NomEmpresa;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
    
}
