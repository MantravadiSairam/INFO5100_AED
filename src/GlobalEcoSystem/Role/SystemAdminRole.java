/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Role;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.Org;

import GlobalEcoSystem.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminPortal;
import javax.swing.JPanel;


public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new SystemAdminPortal(userProcessContainer, business);
    }
    
}
