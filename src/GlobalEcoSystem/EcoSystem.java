/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem;


import GlobalEcoSystem.DeliveryMan.DeliveryManDirectory;
import GlobalEcoSystem.Doctor.DoctorDirectory;
import GlobalEcoSystem.Driver.DriverDirectory;
import GlobalEcoSystem.Grocer.GrocerDirectory;

import GlobalEcoSystem.Role.Role;
import GlobalEcoSystem.Role.SystemAdminRole;
import java.util.ArrayList;
import GlobalEcoSystem.Helper.HelperDirectory;

import GlobalEcoSystem.Person.PersonDirectory;
import GlobalEcoSystem.Pharmacy.PharmacyDirectory;
import GlobalEcoSystem.PharmacyMenu.PMenuDirectory;
import GlobalEcoSystem.PharmacyOrder.POrderDirectory;
import GlobalEcoSystem.GroceryMenu.GMenuDirectory;
import GlobalEcoSystem.GroceryOrder.GOrderDirectory;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Nurse.NurseDirectory;
import GlobalEcoSystem.Org.Org;

public class EcoSystem extends Org{
    
    private static EcoSystem business;
    
    private ArrayList<Network> networkList;
    private HelperDirectory helperDirectory;
    private DriverDirectory driverDirectory;
    private PharmacyDirectory pharmacyDirectory;
    private DeliveryManDirectory deliverymanDirectory;
    private DoctorDirectory doctorDirectory;
    private GrocerDirectory grocerDirectory;
    private PersonDirectory personDirectory;
    private PMenuDirectory  pMenuDirectory;
    private POrderDirectory  pOrderDirectory;
    private GMenuDirectory  gMenuDirectory;
    private GOrderDirectory  gOrderDirectory;
    private NurseDirectory nurseDirectory;
     
   /* public EcoSystem(HelperDirectory helperDirectory,DriverDirectory driverDirectory,PharmacyDirectory pharmacyDirectory,DeliveryManDirectory deliverymanDirectory,DoctorDirectory doctorDirectory,GrocerDirectory grocerDirectory,PersonDirectory personDirectory,
            PMenuDirectory  pMenuDirectory,POrderDirectory  pOrderDirectory,GMenuDirectory  gMenuDirectory,GOrderDirectory  gOrderDirectory,NurseDirectory nurseDirectory) {

        
        
        this.helperDirectory = helperDirectory;
        this.driverDirectory = driverDirectory;
        this.pharmacyDirectory = pharmacyDirectory;
        this.deliverymanDirectory = deliverymanDirectory;
        this.doctorDirectory = doctorDirectory;
        this.grocerDirectory = grocerDirectory;
        this.personDirectory = personDirectory;
        this.pMenuDirectory  = pMenuDirectory;
        this.pOrderDirectory  = pOrderDirectory;
          this.gMenuDirectory  = gMenuDirectory;
        this.gOrderDirectory  = gOrderDirectory;
        this.nurseDirectory = nurseDirectory;
           
    }*/
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    public Network createAndAddNetwork() {
        Network network = new Network();
        
        networkList.add(network);
        return network;
    }
    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NurseDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }
    

    public GMenuDirectory getgMenuDirectory() {
        return gMenuDirectory;
    }

    public void setgMenuDirectory(GMenuDirectory gMenuDirectory) {
        this.gMenuDirectory = gMenuDirectory;
    }

    public GOrderDirectory getgOrderDirectory() {
        return gOrderDirectory;
    }

    public void setgOrderDirectory(GOrderDirectory gOrderDirectory) {
        this.gOrderDirectory = gOrderDirectory;
    }
    
    

    public PMenuDirectory getpMenuDirectory() {
        return pMenuDirectory;
    }

    public void setpMenuDirectory(PMenuDirectory pMenuDirectory) {
        this.pMenuDirectory = pMenuDirectory;
    }

    public POrderDirectory getpOrderDirectory() {
        return pOrderDirectory;
    }

    public void setpOrderDirectory(POrderDirectory pOrderDirectory) {
        this.pOrderDirectory = pOrderDirectory;
    }

    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    

    public DeliveryManDirectory getDeliverymanDirectory() {
        return deliverymanDirectory;
    }

    public void setDeliverymanDirectory(DeliveryManDirectory deliverymanDirectory) {
        this.deliverymanDirectory = deliverymanDirectory;
    }

    
    public DriverDirectory getDriverDirectory() {
        return driverDirectory;
    }

    public void setDriverDirectory(DriverDirectory driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }
      
    
    
    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    
    
    public HelperDirectory getHelperDirectory() {
        return helperDirectory;
    }

    public void setHelperDirectory(HelperDirectory helperDirectory) {
        this.helperDirectory = helperDirectory;
    }
    
    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public GrocerDirectory getGrocerDirectory() {
        return grocerDirectory;
    }

    public void setGrocerDirectory(GrocerDirectory grocerDirectory) {
        this.grocerDirectory = grocerDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList = new ArrayList<Network>();
        helperDirectory = new HelperDirectory();
        pharmacyDirectory = new PharmacyDirectory();
        driverDirectory = new DriverDirectory();
        deliverymanDirectory = new DeliveryManDirectory();
        doctorDirectory = new DoctorDirectory();
        grocerDirectory = new GrocerDirectory();
        pMenuDirectory = new PMenuDirectory();
        pOrderDirectory = new POrderDirectory();
           gMenuDirectory = new GMenuDirectory();
        gOrderDirectory = new GOrderDirectory();
        personDirectory = new PersonDirectory();
        nurseDirectory = new NurseDirectory();
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
