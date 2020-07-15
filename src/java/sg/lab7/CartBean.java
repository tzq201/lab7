package sg.lab7;

import java.io.Serializable;
import static java.lang.Integer.parseInt;

/**
 *
 * @author sarah
 */
public class CartBean implements Serializable {
    public static final long serialVersionUID = -1L;
    private int qty;
    private String ItemID;
    private String description;
    private float price;
    

    public CartBean() {
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setQty(String qty) {
        this.qty = parseInt(qty);
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }
        
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public float getTotalPrice() {
        return this.price*this.qty;
    }
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
}

