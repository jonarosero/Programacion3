/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class Catalogo { 
    private int IdCatalogo;
    private String Recurso;

    public Catalogo(int IdCatalogo, String Recurso) {
        this.IdCatalogo = IdCatalogo;
        this.Recurso = Recurso;
    }

    public int getIdCatalogo() {
        return IdCatalogo;
    }

    public void setIdCatalogo(int IdCatalogo) {
        this.IdCatalogo = IdCatalogo;
    }

    public String getRecurso() {
        return Recurso;
    }

    public void setRecurso(String Recurso) {
        this.Recurso = Recurso;
    }

    @Override
    public String toString() {
        return Recurso;
    }
    
    
}
