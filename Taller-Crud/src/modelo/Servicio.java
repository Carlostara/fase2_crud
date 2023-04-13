package modelo;

import java.util.Date;

public class Servicio {

    private Date fechaIngreso;
    private Date fechaEntrega;
    private float costo;
    private String descripcion;
    private Vehiculo vehiculo;
    private Propietario propietario;
    private Turno turno;

    //Constructores
    public Servicio() {
    }

    public Servicio(Date fechaIngreso, Date fechaEntrega, float costo, String descripcion, Vehiculo vehiculo, Propietario propietario, Turno turno) {
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
        this.descripcion = descripcion;
        this.vehiculo = vehiculo;
        this.propietario = propietario;
        this.turno = turno;
    }

    // getters y setters
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

}
