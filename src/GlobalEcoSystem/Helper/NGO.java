/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Helper;


public class NGO {
    
      private String name;
      private String profession;
     private Double price;
    private String email;
    private String mobile;
    private String address;
    private String userName;
    
     public NGO(String userName, String profession, Double price, String name, String email, String mobile, String address) {
        this.userName = userName;
        this.profession = profession;
        this.price = price;
        this.name = name; 
        this.email = email;
         this.mobile = mobile;
        this.address = address;     
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   

     
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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
     
        @Override
    public String toString() {
        return userName;
    }
     
    
}
