/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Enterprise;

import GlobalEcoSystem.Role.Role;
import java.util.ArrayList;


public class WelfareEnterprise extends Enterprise {
    
      public WelfareEnterprise(String name){
        super(name,Enterprise.EnterpriseType.HealthCare);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
