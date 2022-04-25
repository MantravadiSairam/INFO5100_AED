/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Org;

import GlobalEcoSystem.Employee.EmployeeDirectory;
import GlobalEcoSystem.Role.Role;
import GlobalEcoSystem.UserAccount.UserAccountDirectory;
import GlobalEcoSystem.WorkQueue.WorkQueue;
import java.util.ArrayList;


public abstract class Org {
    
     private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), 
        Doctor("Doctor Organization"), 
        Person("Person Organization"), 
        Nursing("Nursing Organization"),
        Pharmacy("Pharmacy Organization"), 
        Grocery("Grocery Organization"), 
        Driver("Driver Organization"),
        Helper("NGO Organization"),
        DeliveryMan("DeliveryMan Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Org(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public Org(){
        
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Org.counter = counter;
    }
    
     @Override
    public String toString() {
        return name;
    }
}
