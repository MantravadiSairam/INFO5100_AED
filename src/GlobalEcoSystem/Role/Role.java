/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Role;

import GlobalEcoSystem.EcoSystem;

import GlobalEcoSystem.UserAccount.UserAccount;
import javax.swing.JPanel;

import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.Org;

public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        Helper("NGO"),
        Driver("Driver"),
        Doctor("Doctor"),
        Grocer("Grocer");
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, Enterprise enterprise, EcoSystem business,Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}