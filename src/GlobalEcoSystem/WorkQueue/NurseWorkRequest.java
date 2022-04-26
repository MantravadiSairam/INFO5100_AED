/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.WorkQueue;

import GlobalEcoSystem.Nurse.Nurse;
import GlobalEcoSystem.Person.Person;
import java.time.LocalDate;


public class NurseWorkRequest extends WorkRequest {
    
     private String nstatus;
     private LocalDate date;
     private Nurse nurse;
     private int days;
     private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
     
     

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
     
     

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
     
     

    public String getNstatus() {
        return nstatus;
    }

    public void setNstatus(String nstatus) {
        this.nstatus = nstatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
     
        @Override
   public String toString() {
       return this.nstatus;
   }
    
     
    
}
