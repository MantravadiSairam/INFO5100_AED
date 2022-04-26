/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.PharmacyOrder;

//import Business.Customer.Customer;
import GlobalEcoSystem.Doctor.Doctor;
import GlobalEcoSystem.Person.Person;
import GlobalEcoSystem.Pharmacy.Pharmacy;
import GlobalEcoSystem.PharmacyMenu.PMenu;
import GlobalEcoSystem.WorkQueue.WorkRequest;


public class POrder extends WorkRequest{
    
     private String orderId;
    private String orderStatus;
    private Pharmacy pharmacy;
    private Person person;
    private String deliveryMan;
    private int quantity;
    private PMenu menu;
    private String result;
    private boolean allot;
    private Doctor doctor;

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
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

    public PMenu getMenu() {
        return menu;
    }

    public void setMenu(PMenu menu) {
        this.menu = menu;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
       @Override
    public String toString() {
        return orderId;
    }
    
}
