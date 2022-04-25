/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GlobalEcoSystem.Person;


public class Person {
    

    
      private String name;
      //private String dob;
      private String age;
      private String gender;
    private String email;
    private String mobile;
    private String address;
    private String userName;
    
     public Person(String userName,String gender, String name, String email, String mobile, String address,String age) {
        this.userName = userName;
        this.age = age;
        this.name = name; 
        this.email = email;
        this.mobile = mobile;
        this.address = address;
       // this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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