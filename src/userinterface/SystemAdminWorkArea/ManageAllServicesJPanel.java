/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import GlobalEcoSystem.Doctor.DoctorDirectory;
import GlobalEcoSystem.Driver.DriverDirectory;
import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Grocer.GrocerDirectory;
import GlobalEcoSystem.Helper.HelperDirectory;
import GlobalEcoSystem.Nurse.NurseDirectory;
import GlobalEcoSystem.Person.PersonDirectory;
import GlobalEcoSystem.Pharmacy.PharmacyDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;


public class ManageAllServicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAllServicesJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    GrocerDirectory grocerDirectory;
    PharmacyDirectory pharmacyDirectory;
    DoctorDirectory doctorDirectory;
    HelperDirectory helperDirectory;
    NurseDirectory nurseDirectory;
    PersonDirectory personDirectory;
    DriverDirectory driverDirectory;
    public ManageAllServicesJPanel(JPanel userProcessContainer,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecoSystem;
        this.grocerDirectory = grocerDirectory;
        this.pharmacyDirectory = pharmacyDirectory;
        this.doctorDirectory = doctorDirectory;
        this.helperDirectory = helperDirectory;
        this.nurseDirectory = nurseDirectory;
        this.personDirectory = personDirectory;
        this.driverDirectory = driverDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageDelivery = new javax.swing.JButton();
        btnManageHealthjServices = new javax.swing.JButton();
        btnManageSuppojrtServices = new javax.swing.JButton();
        btnManageTransportationjServices = new javax.swing.JButton();
        jLabel1jjj = new javax.swing.JLabel();
        btnManagePerson = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 35, 41));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageDelivery.setBackground(new java.awt.Color(0, 102, 204));
        btnManageDelivery.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnManageDelivery.setForeground(new java.awt.Color(255, 255, 255));
        btnManageDelivery.setText("Manage DeliveryServices");
        btnManageDelivery.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManageDelivery.setBorderPainted(false);
        btnManageDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryActionPerformed(evt);
            }
        });
        add(btnManageDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 410, 40));

        btnManageHealthjServices.setBackground(new java.awt.Color(0, 102, 204));
        btnManageHealthjServices.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnManageHealthjServices.setForeground(new java.awt.Color(255, 255, 255));
        btnManageHealthjServices.setText("Manage HealthServices");
        btnManageHealthjServices.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManageHealthjServices.setBorderPainted(false);
        btnManageHealthjServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHealthjServicesActionPerformed(evt);
            }
        });
        add(btnManageHealthjServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 410, 40));

        btnManageSuppojrtServices.setBackground(new java.awt.Color(0, 102, 204));
        btnManageSuppojrtServices.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnManageSuppojrtServices.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSuppojrtServices.setText("Manage SupportSerivces");
        btnManageSuppojrtServices.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManageSuppojrtServices.setBorderPainted(false);
        btnManageSuppojrtServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppojrtServicesActionPerformed(evt);
            }
        });
        add(btnManageSuppojrtServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 410, 40));

        btnManageTransportationjServices.setBackground(new java.awt.Color(0, 102, 204));
        btnManageTransportationjServices.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnManageTransportationjServices.setForeground(new java.awt.Color(255, 255, 255));
        btnManageTransportationjServices.setText("Manage TransportationSerivces");
        btnManageTransportationjServices.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManageTransportationjServices.setBorderPainted(false);
        btnManageTransportationjServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTransportationjServicesActionPerformed(evt);
            }
        });
        add(btnManageTransportationjServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 410, 40));

        jLabel1jjj.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1jjj.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1jjj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1jjj.setText("Manage Services");
        add(jLabel1jjj, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 408, -1));

        btnManagePerson.setBackground(new java.awt.Color(0, 102, 204));
        btnManagePerson.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnManagePerson.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePerson.setText("Manage Person");
        btnManagePerson.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        btnManagePerson.setBorderPainted(false);
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });
        add(btnManagePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 370, 40));

        backjButton.setBackground(new java.awt.Color(255, 255, 255));
        backjButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backjButton.setForeground(new java.awt.Color(0, 0, 0));
        backjButton.setText("<< BACK");
        backjButton.setBorderPainted(false);
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryActionPerformed
        ManageDeliveryServicesJPanel mngDelSrvPanel = new ManageDeliveryServicesJPanel(userProcessContainer, ecosystem, ecosystem.getGrocerDirectory(),ecosystem.getPharmacyDirectory(),ecosystem.getDeliverymanDirectory());
        userProcessContainer.add("ManageDeliveryServicesJPanel",mngDelSrvPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageDeliveryActionPerformed

    private void btnManageHealthjServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHealthjServicesActionPerformed
        ManageDoctor mngHelSrvPanel = new ManageDoctor(userProcessContainer, ecosystem, ecosystem.getDoctorDirectory());
        userProcessContainer.add("ManageDoctor",mngHelSrvPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageHealthjServicesActionPerformed

    private void btnManageSuppojrtServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppojrtServicesActionPerformed
        ManageSupportServicesJPanel mngSupSrvPanel = new ManageSupportServicesJPanel(userProcessContainer, ecosystem, ecosystem.getHelperDirectory(),ecosystem.getNurseDirectory());
        userProcessContainer.add("ManageSupportServicesJPanel",mngSupSrvPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppojrtServicesActionPerformed

    private void btnManageTransportationjServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTransportationjServicesActionPerformed
        // TODO add your handling code here:
        manageDriver mngDriverPanel = new manageDriver(userProcessContainer, ecosystem, ecosystem.getDriverDirectory());
        userProcessContainer.add("manageDriver",mngDriverPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageTransportationjServicesActionPerformed

    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        // TODO add your handling code here:
        ManagePatient mngPersonPanel = new ManagePatient(userProcessContainer, ecosystem, ecosystem.getPersonDirectory());
        userProcessContainer.add("manageDriver",mngPersonPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePersonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminPortal sysAdminwjp = (SystemAdminPortal) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton btnManageDelivery;
    private javax.swing.JButton btnManageHealthjServices;
    private javax.swing.JButton btnManagePerson;
    private javax.swing.JButton btnManageSuppojrtServices;
    private javax.swing.JButton btnManageTransportationjServices;
    private javax.swing.JLabel jLabel1jjj;
    // End of variables declaration//GEN-END:variables
}
