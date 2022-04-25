/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GlobalEcoSystem.Nurse;


public class Nurse {
  
    
      private String name;
    private String email;
    private String mobile;
    private String address;
    private String userName;
    private String gender;
    
     public Nurse(String userName, String name, String email, String mobile, String address, String gender) {
        this.userName = userName;
        this.gender = gender;
      this.name = name; 
        this.email = email;
         this.mobile = mobile;
        this.address = address;     
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
     
    
    

