/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.GroceryOrder;

import GlobalEcoSystem.Grocer.Grocer;
import GlobalEcoSystem.GroceryMenu.GMenu;
import GlobalEcoSystem.Person.Person;
import GlobalEcoSystem.WorkQueue.WorkRequest;


public class GOrder extends WorkRequest {
 private String orderId;
    private String orderStatus;
    private Grocer grocer;
    private Person person;
    private String deliveryMan;
    private int quantity;
    private GMenu menu;
    private String result;
    private boolean allot;

    public GMenu getMenu() {
        return menu;
    }

    public void setMenu(GMenu menu) {
        this.menu = menu;
    }

    public Grocer getGrocer() {
        return grocer;
    }

    public void setGrocer(Grocer grocer) {
        this.grocer = grocer;
    }

    
  
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }


    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isAllot() {
        return allot;
    }

    public void setAllot(boolean allot) {
        this.allot = allot;
    }
    
       @Override
    public String toString() {
        return orderId;
    }
    
}

