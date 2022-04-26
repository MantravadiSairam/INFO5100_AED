/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Role;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.Org;
import GlobalEcoSystem.Org.PopulationOrganization;
import GlobalEcoSystem.UserAccount.UserAccount;
import javax.swing.JPanel;

import userinterface.FoundationRole.FoundationPortal;


public class PersonRole extends Role{
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new FoundationPortal(userProcessContainer, account, (PopulationOrganization)organization,  enterprise,business, network);
    }
}

