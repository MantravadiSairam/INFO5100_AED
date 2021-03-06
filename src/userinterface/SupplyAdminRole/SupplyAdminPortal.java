/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyAdminRole;

//import Business.Customer.CustomerDirectory;
import GlobalEcoSystem.Person.PersonDirectory;
import GlobalEcoSystem.DeliveryMan.DeliveryManDirectory;
import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Grocer.GrocerDirectory;
import GlobalEcoSystem.GroceryMenu.GMenuDirectory;
import GlobalEcoSystem.GroceryOrder.GOrderDirectory;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.SupplyOrganisation;
import GlobalEcoSystem.Org.Org;
import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class SupplyAdminPortal extends javax.swing.JPanel {

    /**
     * Creates new form AdminAreaJPanel
     */
    JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private Network network;
    private Enterprise enterprise;
    private SupplyOrganisation groceryOrganization;
    private PersonDirectory personDirectory;
    private GrocerDirectory grocerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private GMenuDirectory gmenuDirectory;
    private GOrderDirectory gorderDirectory;
    
    public SupplyAdminPortal(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, Org organisation, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.groceryOrganization = (SupplyOrganisation)organisation;
        this.network = network;
        this.enterprise = enterprise;
        this.personDirectory = ecoSystem.getPersonDirectory();
       this.grocerDirectory = ecoSystem.getGrocerDirectory();
        this.deliveryManDirectory = ecoSystem.getDeliverymanDirectory();
        this.gmenuDirectory = ecoSystem.getgMenuDirectory();
        this.gorderDirectory = ecoSystem.getgOrderDirectory();
        valueLabel.setText(account.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomeGrocerAdmin = new javax.swing.JLabel();
        JstoreButton = new javax.swing.JButton();
        manageJMenuButton = new javax.swing.JButton();
        manageJOrderButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 35, 41));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeGrocerAdmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        WelcomeGrocerAdmin.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeGrocerAdmin.setText("Welcome, Supplier!");
        add(WelcomeGrocerAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 480, -1));

        JstoreButton.setBackground(new java.awt.Color(0, 102, 204));
        JstoreButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        JstoreButton.setForeground(new java.awt.Color(255, 255, 255));
        JstoreButton.setText("Manage Store Info");
        JstoreButton.setBorderPainted(false);
        JstoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JstoreButtonActionPerformed(evt);
            }
        });
        add(JstoreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 263, 70));

        manageJMenuButton.setBackground(new java.awt.Color(0, 102, 204));
        manageJMenuButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        manageJMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        manageJMenuButton.setText("Manage Menu");
        manageJMenuButton.setBorderPainted(false);
        manageJMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageJMenuButtonActionPerformed(evt);
            }
        });
        add(manageJMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 263, 67));

        manageJOrderButton.setBackground(new java.awt.Color(0, 102, 204));
        manageJOrderButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        manageJOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        manageJOrderButton.setText("Manage Orders");
        manageJOrderButton.setBorderPainted(false);
        manageJOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageJOrderButtonActionPerformed(evt);
            }
        });
        add(manageJOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 263, 62));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Store:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 120, 30));

        valueLabel.setBackground(new java.awt.Color(36, 35, 41));
        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void JstoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JstoreButtonActionPerformed
        // TODO add your handling code here:
         ManageStoreInfoJPanel mrijp = new ManageStoreInfoJPanel(userProcessContainer,account, ecoSystem, grocerDirectory);
        userProcessContainer.add("manageRestJPanel",mrijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
 

    }//GEN-LAST:event_JstoreButtonActionPerformed

    private void manageJMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageJMenuButtonActionPerformed
    ManageMenuJPanel manageMenuJPanel = new ManageMenuJPanel(userProcessContainer,account, ecoSystem, grocerDirectory,gmenuDirectory);
        userProcessContainer.add("manageMenuJPanel",manageMenuJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageJMenuButtonActionPerformed

    private void manageJOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageJOrderButtonActionPerformed

         ManageOrderJPanel manageOrderJPanel = new ManageOrderJPanel(userProcessContainer,account, ecoSystem, grocerDirectory,gmenuDirectory, gorderDirectory);
        userProcessContainer.add("ManageHotelOrder",manageOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageJOrderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JstoreButton;
    private javax.swing.JLabel WelcomeGrocerAdmin;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton manageJMenuButton;
    private javax.swing.JButton manageJOrderButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
