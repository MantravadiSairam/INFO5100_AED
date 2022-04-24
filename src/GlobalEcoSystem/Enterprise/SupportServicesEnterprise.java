/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Enterprise;

import GlobalEcoSystem.Role.Role;
import java.util.ArrayList;


public class SupportServicesEnterprise extends Enterprise{
    
      
      public SupportServicesEnterprise(String name){
        super(name,Enterprise.EnterpriseType.SupportServices);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
