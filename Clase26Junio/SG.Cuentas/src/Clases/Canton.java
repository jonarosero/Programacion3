package Clases;


public class Canton {
    private int IdCanton;
    private int IdProvincia;
    private String Canton;

    public Canton(int IdCanton, int IdProvincia, String Canton) {
        this.IdCanton = IdCanton;
        this.IdProvincia = IdProvincia;
        this.Canton = Canton;
    }

    public int getIdCanton() {
        return IdCanton;
    }

    public void setIdCanton(int IdCanton) {
        this.IdCanton = IdCanton;
    }

    public int getIdProvincia() {
        return IdProvincia;
    }

    public void setIdProvincia(int IdProvincia) {
        this.IdProvincia = IdProvincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    @Override
    public String toString() {
        return  Canton;
    }
    
    
}
