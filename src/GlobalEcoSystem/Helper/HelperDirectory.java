/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Helper;

import java.util.ArrayList;


public class HelperDirectory {
    
    private ArrayList<NGO> NGODirectory;
     
     public HelperDirectory() {
        
        NGODirectory = new ArrayList();
        
    }

    public ArrayList<NGO> getHelperDirectory() {
        return NGODirectory;
    }

    public void setHelperDirectory(ArrayList<NGO> NGODirectory) {
        this.NGODirectory = NGODirectory;
    }
     
     public NGO addHelper(String userName, String profession, double price, String name, String email, String mobile, String address){
        NGO NGO = new NGO(userName,profession,price, name, email, mobile, address);
        NGODirectory.add(NGO);
        return NGO;
    }
    
    public void removeHelper(NGO NGO){
        NGODirectory.remove(NGO);
    }
    
    public NGO getHelper(String name){
        for(NGO NGO : NGODirectory){
            if(NGO.getName().equalsIgnoreCase(name)){
                return NGO;
            }
        }
        return null;
    }
     
     
    
}
