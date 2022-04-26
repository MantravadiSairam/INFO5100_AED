/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.WorkQueue;

import GlobalEcoSystem.Helper.NGO;
import GlobalEcoSystem.Person.Person;
import java.time.LocalDate;


public class HelperWorkRequest extends WorkRequest {
    
     private String hstatus;
     private LocalDate date;
     private Person person;
     private NGO NGO;
     private int days;
     private double price;
     private String prof;
     private String add;
     private String pname;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
     
     

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
     
     

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }
     
     

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     
     

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
     
     

    public NGO getHelper() {
        return NGO;
    }

    public void setHelper(NGO NGO) {
        this.NGO = NGO;
    }
     
     

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
     
     

    public String getHstatus() {
        return hstatus;
    }

    public void setHstatus(String hstatus) {
        this.hstatus = hstatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
     
     
     
     
            @Override
   public String toString() {
       return this.hstatus;
   }
    
    
}
