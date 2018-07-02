package Clases;

import java.sql.Date;

public class Cliente {
    private String Cedula;
    private String Apellidos;
    private String Nombres;
    private Date FechaNacimiento;
    private Direccion LugarResidencia;
    private Direccion LugarTrabajo;

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public Direccion getLugarResidencia() {
        return LugarResidencia;
    }

    public void setLugarResidencia(Direccion LugarResidencia) {
        this.LugarResidencia = LugarResidencia;
    }

    public Direccion getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(Direccion LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }  
    
    
}
