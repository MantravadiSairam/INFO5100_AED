/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Role;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.UserAccount.UserAccount;
import javax.swing.JPanel;

import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.SupplyOrganisation;
import GlobalEcoSystem.Org.Org;
import userinterface.SupplyAdminRole.SupplyAdminPortal;
//import userinterface.GrocerRole.GrocerWorkAreaJPanel;


public class GrocerRole extends Role {
 public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new SupplyAdminPortal(userProcessContainer, account, business,(SupplyOrganisation)organization,  enterprise, network);
 }
 }
