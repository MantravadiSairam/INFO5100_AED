/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Pharmacy;

import GlobalEcoSystem.PharmacyMenu.PMenuDirectory;


public class Pharmacy {
     private String pharmName;
    private String address;
    private String phone;
    private String pharmacist;
    private PMenuDirectory MenuDirectory;
    
      public Pharmacy(String pharmName, String address, String phone,String pharmacist) {
        this.pharmName = pharmName;
        this.address = address;
         this.phone = phone;
        this.pharmacist = pharmacist;
       
    }

    public String getPharmName() {
        return pharmName;
    }

    public void setPharmName(String pharmName) {
        this.pharmName = pharmName;
    }

  

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(String pharmacist) {
        this.pharmacist = pharmacist;
    }

    public PMenuDirectory getMenuDirectory() {
        return MenuDirectory;
    }

    public void setMenuDirectory(PMenuDirectory MenuDirectory) {
        this.MenuDirectory = MenuDirectory;
    }
      
         @Override
    public String toString() {
        return pharmName;
    }
    
}
