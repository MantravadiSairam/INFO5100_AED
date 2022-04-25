/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Org;

import GlobalEcoSystem.Role.DoctorRole;
import GlobalEcoSystem.Role.DriverRole;
import GlobalEcoSystem.Role.HelperRole;
import GlobalEcoSystem.Role.NurseRole;
import GlobalEcoSystem.Role.PersonRole;
import GlobalEcoSystem.Role.Role;
import java.util.ArrayList;


public class PopulationOrganization  extends Org {
    //Driver d;
       public PopulationOrganization()
    {
        super(Org.Type.Person.getValue());
        //d = new Driver(userName, name, email, mobile, address, model, 0);
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PersonRole());
        roles.add(new DriverRole());
        roles.add(new NurseRole());
        roles.add(new HelperRole());
         roles.add(new DoctorRole());
        return roles;
    }
}
