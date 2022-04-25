/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.PharmacyMenu;


public class PMenu {
        private String itemName;
    private String pharmaName;
    
     public PMenu(String itemName, String pharmaName) {
        this.itemName = itemName;
        this.pharmaName =  pharmaName;
    }
     public PMenu(String itemName){
     
     }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }
     
          @Override
    public String toString() {
        return itemName;
    }
}
