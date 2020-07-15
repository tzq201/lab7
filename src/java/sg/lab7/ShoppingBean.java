package sg.lab7;

import java.io.Serializable;

/**
 *
 * @author tzq20
 */
public class ShoppingBean implements Serializable {
    public static final long serialVersionUID = -1L;
    private String id;
    private String description;
    

    public ShoppingBean() {
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        this.id = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
 
}
