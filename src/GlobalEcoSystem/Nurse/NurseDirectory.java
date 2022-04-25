/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GlobalEcoSystem.Nurse;

import java.util.ArrayList;



public class NurseDirectory {
    
    private ArrayList<Nurse> NurseDirectory;

    public NurseDirectory() {
        NurseDirectory = new ArrayList();
    }
     
    

    public ArrayList<Nurse> getNurseDirectory() {
        return NurseDirectory;
    }

    public void setNurseDirectory(ArrayList<Nurse> NurseDirectory) {
        this.NurseDirectory = NurseDirectory;
    }
     //String userName, String name, String email, String mobile, String address, String gender
     public Nurse addNurse(String userName, String name, String email, String mobile, String address, String gender){
        Nurse nurse = new Nurse(userName, name, email, mobile, address,gender);
        NurseDirectory.add(nurse);
        return nurse;
    }
    
    public void removeNurse(Nurse nurse){
       NurseDirectory.remove(nurse);
    }
    
    public Nurse getNurse(String name){
        for(Nurse nurse: NurseDirectory){
            if(nurse.getName().equalsIgnoreCase(name)){
                return nurse;
            }
        }
        return null;
    }
     
     
    
}
