package sg.lab7;

import java.io.Serializable;

public class ItemRecord implements Serializable {
    public static final long serialVersionUID = -1L;
    private String itemId;
    private String itemDescription;
    private String brand;
    private double price;
    private int points;

    public ItemRecord() {
    }
    
    public String getItemID() {
        return itemId;
    }

    public void setItemID(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
}
