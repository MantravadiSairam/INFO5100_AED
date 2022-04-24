/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Driver;

import java.util.ArrayList;

/**
 *
 * @author grees
 */
public class DriverDirectory {
     private ArrayList<Driver> DriverDirectory;
     
     public DriverDirectory() {
        
        DriverDirectory = new ArrayList();
        
    }

    public ArrayList<Driver> getDriverDirectory() {
        return DriverDirectory;
    }

    public void setDriverDirectory(ArrayList<Driver> DriverDirectory) {
        this.DriverDirectory = DriverDirectory;
    }
     
        public Driver addDriver(String userName, String name, String email, String mobile, String address, String model,int seats){
        Driver driver = new Driver(userName, name, email, mobile, address, model, seats);
        DriverDirectory.add(driver);
        return driver;
    }
    
    public void removeDriver(Driver driver){
        DriverDirectory.remove(driver);
    }
    
    public Driver getDriver(String name){
        for(Driver driver: DriverDirectory){
            if(driver.getName().equalsIgnoreCase(name)){
                return driver;
            }
        }
        return null;
    }
    
}
