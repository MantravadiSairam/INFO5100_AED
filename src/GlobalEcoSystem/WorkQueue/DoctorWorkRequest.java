/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.WorkQueue;

import GlobalEcoSystem.Person.Person;
import java.time.LocalDate;
import java.time.LocalTime;


public class DoctorWorkRequest  extends WorkRequest{
    
    private String docstatus;
    private LocalDate date;
    private LocalTime time;
    private Person person;
    String spec;
    //private Doctor doctor;
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    
    

    public String getDocstatus() {
        return docstatus;
    }

    public void setDocstatus(String docstatus) {
        this.docstatus = docstatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

 /*   public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }*/
    
    
       @Override
   public String toString() {
       return this.docstatus;
   }
    
    
}
