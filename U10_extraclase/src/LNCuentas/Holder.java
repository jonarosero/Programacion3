package LNCuentas;

/**
 *
 * @author bruno
 */
public class Holder {

    private String id;
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return "Cedula: " + id + ", Nombre:" + name + ", Apellido:" + lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
