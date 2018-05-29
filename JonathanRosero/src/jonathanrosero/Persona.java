/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonathanrosero;

/**
 *
 * @author USUARIO
 */
public class Persona extends Cliente{
    private int cedula;
    private String apellidos;
    private String nombres;

    public Persona(int cedula, String apellidos, String nombres, Direccion direccion) {
        super(direccion);
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    

    @Override
    public String toString() {
        return String.format("\nNombres: %s\n"
                + "Apellidos: %s\n"
                + "Cedula: %d\n", this.getNombres(), this.getApellidos(), this.getCedula());
    }
    
    
    
}
