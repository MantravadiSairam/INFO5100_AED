/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.GroceryOrder;

import java.util.ArrayList;


public class GOrderDirectory {
    
     private ArrayList<GOrder> orderDirectory;
    
    public GOrderDirectory() {
        orderDirectory = new ArrayList();
    }

    public ArrayList<GOrder> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<GOrder> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
     public GOrder newOrder(){
        GOrder order = new GOrder();
        orderDirectory.add(order);
        return order;
    }
    
    public GOrder getOrderId(String id){
        for(GOrder order: orderDirectory){
            if(order.getOrderId().equals(id)){
                return order;
            }
        }
        return null;
    }
    
}
