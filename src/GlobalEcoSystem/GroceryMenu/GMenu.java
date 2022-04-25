/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.GroceryMenu;


public class GMenu {
    
       private String itemName;
    private double price;
    private String grocerName;
    
     public GMenu(String itemName, double price, String grocerName) {
        this.itemName = itemName;
        this.price = price;
        this.grocerName = grocerName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGrocerName() {
        return grocerName;
    }

    public void setGrocerName(String grocerName) {
        this.grocerName = grocerName;
    }
    
             @Override
    public String toString() {
        return itemName;
    }
}
