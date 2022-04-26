/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Role;


import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.SupportServicesOrganization;
import GlobalEcoSystem.Org.Org;
import GlobalEcoSystem.UserAccount.UserAccount;
import javax.swing.JPanel;

import userinterface.NGORole.NGOPortal;

public class HelperRole extends Role{
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new NGOPortal(userProcessContainer, account, business, (SupportServicesOrganization)organization,  enterprise, network);
    }
    
    
}
