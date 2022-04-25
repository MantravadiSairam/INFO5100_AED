/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Org;

import GlobalEcoSystem.Role.DriverRole;
import GlobalEcoSystem.Role.Role;
import java.util.ArrayList;


public class TransportationOrganization extends Org {
    
       public TransportationOrganization()
    {
        super(Org.Type.Driver.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DriverRole());
        return roles;
    }
}
