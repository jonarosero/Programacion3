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
public class Canton {
    private int Id_Canton;
    private int Id_Provincia;
    private String Canton;

    public Canton(int Id_Canton, int Id_Provincia, String Canton) {
        this.Id_Canton = Id_Canton;
        this.Id_Provincia = Id_Provincia;
        this.Canton = Canton;
    }

    public int getId_Canton() {
        return Id_Canton;
    }

    public void setId_Canton(int Id_Canton) {
        this.Id_Canton = Id_Canton;
    }

    public int getId_Provincia() {
        return Id_Provincia;
    }

    public void setId_Provincia(int Id_Provincia) {
        this.Id_Provincia = Id_Provincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    @Override
    public String toString() {
        return this.Canton;
    }
    
    
    
    
    
}
