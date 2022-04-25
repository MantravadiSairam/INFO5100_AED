/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.GroceryMenu;

import java.util.ArrayList;


public class GMenuDirectory {
    
        private ArrayList<GMenu> gmenuDirectory;
    
    public GMenuDirectory() {
        gmenuDirectory = new ArrayList();
    }

    public ArrayList<GMenu> getGmenuDirectory() {
        return gmenuDirectory;
    }

    public void setGmenuDirectory(ArrayList<GMenu> gmenuDirectory) {
        this.gmenuDirectory = gmenuDirectory;
    }
 public GMenu newItem(String itemName, double price, String res) {
        GMenu menu = new GMenu(itemName, price, res);
        gmenuDirectory.add(menu);
        return menu;
    }
    
    public void removeMenu(GMenu menu) {
        gmenuDirectory.remove(menu);
    }
    
    
}
