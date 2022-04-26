/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.WorkQueue;

import GlobalEcoSystem.Driver.Driver;
import GlobalEcoSystem.Person.Person;
import java.time.LocalDate;
import java.time.LocalTime;


public class DriverWorkRequest extends WorkRequest{
    
    private String driverRequestId;
    private Person person;
    private Driver driver;
    private Person address;
    private static int count = 0;
    private String needDriver;
    private String dstatus;
    private String destin;
private LocalDate date;
private LocalTime time;
private String seats;

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }


    
   /*  public DriverWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        driverRequestId = sb.toString();
        count++;
    }*/

    public String getDestin() {
        return destin;
    }

    public void setDestin(String destin) {
        this.destin = destin;
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


    public String getDstatus() {
        return dstatus;
    }

    /*    @Override
    public String toString() {
    Volunteer volunteer = (Volunteer)this.getSender().getPerson();
    String address = volunteer.getAddress1().concat(volunteer.getAddress2().concat(volunteer.getTown()));
    return address;
    }*/
    public void setDstatus(String dstatus) {
        this.dstatus = dstatus;
    }

    public String getDriverRequestId() {
        return driverRequestId;
    }

    public void setDriverRequestId(String driverRequestId) {
        this.driverRequestId = driverRequestId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Person getAddress() {
        return address;
    }

    public void setAddress(Person address) {
        this.address = address;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DriverWorkRequest.count = count;
    }

    public String getNeedDriver() {
        return needDriver;
    }

    public void setNeedDriver(String needDriver) {
        this.needDriver = needDriver;
    }

    @Override
   public String toString() {
       return this.dstatus;
   }
    
}
