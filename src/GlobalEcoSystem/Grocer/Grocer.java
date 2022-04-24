/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Grocer;


public class Grocer {
    private String grocerName;
    private String address;
    private String managerName;
    private String phoneNum;
    //private MenuDirectory MenuDirectory;
    
    public Grocer(String restaurantName, String address, String managerName, String phoneNumber) {
    this.grocerName = restaurantName;
    this.address = address;
    this.managerName = managerName;
    this.phoneNum = phoneNumber;
}

    public String getGrocerName() {
        return grocerName;
    }

    public void setGrocerName(String grocerName) {
        this.grocerName = grocerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    @Override
    public String toString() {
        return grocerName;
    }
}
