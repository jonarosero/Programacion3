package LNCuentas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Cuenta {

    private String id;
    private String openningDate;
    private String type;
    private boolean active;

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenningDate() {
        return openningDate;
    }

    public void setOpenningDate(String openningDate) {
        this.openningDate = openningDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
