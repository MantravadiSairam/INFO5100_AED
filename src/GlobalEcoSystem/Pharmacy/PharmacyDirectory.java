/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Pharmacy;


import java.util.ArrayList;


public class PharmacyDirectory {
    
       private ArrayList<Pharmacy> pharmacyDirectory;
    
    public PharmacyDirectory() {
        pharmacyDirectory = new ArrayList();
        //restaurantDirectory.add(new Restaurant("ASd","asd","asd","asd"));
    }

    public ArrayList<Pharmacy> getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(ArrayList<Pharmacy> pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }
    
        
     public Pharmacy addPharmacy(String name, String address,String phone, String pName) {
        Pharmacy pharmacy = new Pharmacy(name, address, phone, pName);
        pharmacyDirectory.add(pharmacy);
        //System.out.println(restaurantDirectory.size() + "New Res");
        return pharmacy;
    }
    
    public void removePharmacy(Pharmacy pharmacy){
        pharmacyDirectory.remove(pharmacy);
    }
    
    public Pharmacy getPharmacy(String name) {
        for(Pharmacy r : pharmacyDirectory) {
            if(r.getPharmName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
}
