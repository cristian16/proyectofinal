package Modelo;

import java.io.Serializable;

public class Usuario1 implements Serializable {

    protected String cedula;
    private String nombres;
    protected String apellidos;
    protected String direccion;
    protected String correo;
    private String teléfono;
    private String edad;

    public Usuario1() {
    }

    public String getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    void setEdad(String edad) {

    }

}
