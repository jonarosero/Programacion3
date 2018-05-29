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
public class Empresa extends Cliente{
    int ruc;
    String razon;
    Cliente persona;

    public Empresa(int ruc, String razon, Cliente persona, Direccion direccion) {
        super(direccion);
        this.ruc = ruc;
        this.razon = razon;
        this.persona = persona;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Cliente getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return String.format("\nRUC: %d\n"
                + "Razon Social: %s\n"
                + "Representante Legal: %s\n", this.getRuc(), this.getRazon(), this.getPersona());
    }
    
    
}
