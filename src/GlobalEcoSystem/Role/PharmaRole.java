/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Role;

//import Business.Customer.CustomerDirectory;
import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.Org;
import GlobalEcoSystem.Org.PharmacyOrganization;
import GlobalEcoSystem.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.GrocerRole.GrocerWorkAreaJPanel;
//import userinterface.PharmacistRole.PharmacistWorkAreaJPanel;
import userinterface.FoodManagerRole.FoodManagementAdminPortal;


public class PharmaRole extends Role {
 public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new FoodManagementAdminPortal(userProcessContainer, account, business,(PharmacyOrganization)organization,  enterprise, network);
 }
}
