/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.DeliveryMan;

import java.util.ArrayList;

public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;
    
     public DeliveryManDirectory() {
        deliveryManDirectory = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
     public DeliveryMan addDeliveryMan(String name, String address, String email, String phone) {
        DeliveryMan deliveryMan = new DeliveryMan(name, address, email, phone);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void removeDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManDirectory.remove(deliveryMan);
    }
}
