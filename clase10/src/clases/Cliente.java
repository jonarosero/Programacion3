/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Date;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private String cedula;
    private String apellidos;
    private String nombres;
    private Date fechaNacimiento;
    private Direccion dirRes;
    private Direccion dirTra;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDirRes() {
        return dirRes;
    }

    public void setDirRes(Direccion dirRes) {
        this.dirRes = dirRes;
    }

    public Direccion getDirTra() {
        return dirTra;
    }

    public void setDirTra(Direccion dirTra) {
        this.dirTra = dirTra;
    }
    
}
