package edu.neu.csye7374;

/**
 * Simple POJO (Plain Old Java Object) class to hold a menu item's data
 */
public class MenuItem {
    private int id;
    private String itemName;
    private double price;

    public MenuItem(int id, String itemName, double price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "Item #%d\t$%.2f\t%s",
                id, price, itemName
        );
    }
}
