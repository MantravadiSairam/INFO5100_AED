/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Org;

import GlobalEcoSystem.Role.HelperRole;
import GlobalEcoSystem.Role.Role;
import java.util.ArrayList;


public class SupportServicesOrganization extends Org {
    
       public SupportServicesOrganization()
    {
        super(Org.Type.Helper.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HelperRole());
        return roles;
    }
}
