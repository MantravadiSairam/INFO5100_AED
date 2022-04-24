/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Driver;


public class Driver {
    
     private String name;
    private String email;
    private String mobile;
    private String address;
    private String userName;
    private String model;
    private int seats;
    
     public Driver(String userName, String name, String email, String mobile, String address, String model,int seats) {
        this.userName = userName;
        this.name = name; 
        this.email = email;
         this.mobile = mobile;
        this.address = address; 
        this.model = model;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
     
           @Override
    public String toString() {
        return userName;
    }
    
}
