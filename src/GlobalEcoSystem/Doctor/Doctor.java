/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Doctor;


public class Doctor {
    private String name;
    private String email;
    private String mobile;
    private String address;
    private String userName;
    private String speciality;
    
    public Doctor(String userName, String name, String email, String mobile, String address,String speciality) {
    this.userName = userName;
    this.name = name; 
    this.email = email;
     this.mobile = mobile;
    this.address = address; 
    this.speciality = speciality;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    
        @Override
    public String toString() {
        return userName;
    }
    
}
