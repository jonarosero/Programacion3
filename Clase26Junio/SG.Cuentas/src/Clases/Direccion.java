
package Clases;

public class Direccion {
    private String Provincia;
    private String Canton;
    private String Calle;

    public Direccion(String Provincia, String Canton, String Calle) {
        this.Provincia = Provincia;
        this.Canton = Canton;
        this.Calle = Calle;
    }

    public String getProvincia() {
        return Provincia;
    }

    public String getCanton() {
        return Canton;
    }

    public String getCalle() {
        return Calle;
    }
    
    
    
}
