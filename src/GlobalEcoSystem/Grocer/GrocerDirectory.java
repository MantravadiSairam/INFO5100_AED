/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Grocer;
import java.util.ArrayList;

public class GrocerDirectory {
     private ArrayList<Grocer> grocerDirectory;
     
     public GrocerDirectory() {
        grocerDirectory = new ArrayList();
    }

    public ArrayList<Grocer> getGrocerDirectory() {
        return grocerDirectory;
    }

    public void setGrocerDirectory(ArrayList<Grocer> grocerDirectory) {
        this.grocerDirectory = grocerDirectory;
    }
    
    
    public Grocer newGrocer(String name, String address, String managerName, String phoneNum) {
        Grocer grocer = new Grocer(name, address, managerName, phoneNum);
        grocerDirectory.add(grocer);
        
        return grocer;
    }
    
    public void removeGrocer(Grocer grocer){
        grocerDirectory.remove(grocer);
    }
    
      public Grocer getGrocer(String name) {
        for(Grocer r : grocerDirectory) {
            if(r.getGrocerName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    /*public Restaurant getRestaurant(String name) {
        for(Restaurant res : restaurantList) {
            if(res.getRestaurantName().equals(name)) {
                return res;
            }
        }
        return null;
    }*/
}
