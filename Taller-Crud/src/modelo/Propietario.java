
package modelo;





public class Propietario {
    private int id_propietario;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private int cedula;
    private boolean carta_propiedad;
    
    
    
   
    //Getters and Setters

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isCarta_de_propiedad() {
        return carta_propiedad;
    }

    public void setCarta_de_propiedad(boolean carta_de_propiedad) {
        this.carta_propiedad = carta_de_propiedad;
    }
   
    

   
   

    

  
}
