/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Role;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.AidOrganization;
import GlobalEcoSystem.Org.Org;
import GlobalEcoSystem.UserAccount.UserAccount;
import javax.swing.JPanel;

import userinterface.VolunteerRole.VolunteerPortal;


public class NurseRole extends Role{
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new VolunteerPortal(userProcessContainer, account, business, (AidOrganization)organization,  enterprise, network);
    //JPanel userProcessContainer, 
     //    UserAccount userAccount,  
       //     EcoSystem business, Org organization, Enterprise enterprise, Network network
     }
}
