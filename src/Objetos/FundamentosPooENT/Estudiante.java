package Objetos.FundamentosPooENT;

import java.util.Date;

public class Estudiante extends Persona {
    private Date fechaDeNacimiento;
    private String estado;

    public Estudiante(int id, String nombre, String apellido, Date fechaDeNacimiento, String estado) {
        super(id, nombre, apellido);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante:" + "id=" + getId() + ", nombre=" + getNombre() + ", apellido=" + getApellido()  + ", fechaDeNacimiento=" + fechaDeNacimiento + ", estado=" + estado  ;

    }
}
