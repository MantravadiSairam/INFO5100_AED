/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.PharmacyOrder;

import java.util.ArrayList;


public class POrderDirectory {
     private ArrayList<POrder> orderDirectory;
    
    public POrderDirectory() {
        orderDirectory = new ArrayList();
    }

    public ArrayList<POrder> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<POrder> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
     public POrder newOrder(){
        POrder order = new POrder();
        orderDirectory.add(order);
        return order;
    }
    
    public POrder getOrderId(String id){
        for(POrder order: orderDirectory){
            if(order.getOrderId().equals(id)){
                return order;
            }
        }
        return null;
    }
    
}
