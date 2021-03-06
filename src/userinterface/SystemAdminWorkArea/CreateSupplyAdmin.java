/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Employee.Employee;
import GlobalEcoSystem.Grocer.Grocer;
import GlobalEcoSystem.Grocer.GrocerDirectory;
import GlobalEcoSystem.Role.GrocerRole;
import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateSupplyAdmin extends javax.swing.JPanel {

    /**
     * Creates new form CreateSupplyAdmin
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private GrocerDirectory grocerDirectory;
    public CreateSupplyAdmin(JPanel userProcessContainer, EcoSystem ecosystem, GrocerDirectory grocerDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.grocerDirectory = ecosystem.getGrocerDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        namejText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        managerText = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileText = new javax.swing.JTextField();
        UILabel = new javax.swing.JLabel();
        addressjText = new javax.swing.JTextField();
        UIjText = new javax.swing.JTextField();
        specialityLabel = new javax.swing.JLabel();
        pwdLabel = new javax.swing.JLabel();
        pwdText = new javax.swing.JTextField();
        addjButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1cd = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 35, 41));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NameLabel.setText("Supplier Name");
        add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 110, -1));
        add(namejText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 299, 180, 30));

        emailLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        emailLabel.setText("Manager:");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 80, -1));

        managerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerTextActionPerformed(evt);
            }
        });
        add(managerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 180, 30));

        mobileLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        mobileLabel.setText("Phone Number:");
        add(mobileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 80, -1));
        add(mobileText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 180, 30));

        UILabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        UILabel.setText("UserID:");
        add(UILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 80, -1));

        addressjText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressjTextActionPerformed(evt);
            }
        });
        add(addressjText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 180, 30));

        UIjText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIjTextActionPerformed(evt);
            }
        });
        add(UIjText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 180, 30));

        specialityLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        specialityLabel.setText("Address:");
        add(specialityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 80, -1));

        pwdLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pwdLabel.setText("Password:");
        add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 80, -1));

        pwdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTextActionPerformed(evt);
            }
        });
        add(pwdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 180, 30));

        addjButton.setBackground(new java.awt.Color(0, 102, 204));
        addjButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        addjButton.setForeground(new java.awt.Color(255, 255, 255));
        addjButton.setText("Add Details");
        addjButton.setBorderPainted(false);
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });
        add(addjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 150, 70));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 204));
        btnBack.setText("<< Back");
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 700, -1, -1));

        jLabel1cd.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1cd.setText("Create Supply Admin");
        add(jLabel1cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void managerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_managerTextActionPerformed

    private void addressjTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressjTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressjTextActionPerformed

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
        // TODO add your handling code here:
        String mobile = mobileText.getText();
        String address = addressjText.getText();
        String userName = UIjText.getText();
        String password = pwdText.getText();
        String name = namejText.getText();
        
        
         for(Grocer grocer : grocerDirectory.getGrocerDirectory()) {
           
            if(grocer.getPhoneNum().equals(mobile)) {
                JOptionPane.showMessageDialog(null, "Mobile Number already exists"); //obile Number already exists
            }
        }
        
         
            for(UserAccount account : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");//Username Already exists
                return;
            }
        }
        
        if (namejText.getText().isEmpty() || !namejText.getText().matches("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"))
          JOptionPane.showMessageDialog(null, "Please enter valid name");//Please enter valid name
        
        
        else if(!(mobileText.getText().length()==10) || !mobileText.getText().matches("^[0-9]+") || mobileText.getText().matches("[0]{10}"))
        JOptionPane.showMessageDialog(null, "enter valid mobile number");//enter valid mobile number
                   
       
        else if (address.isEmpty()){
          JOptionPane.showMessageDialog(null, "Please enter address");//Please enter address
        }
        
        
        else if (userName.isEmpty() || !userName.matches("^[a-zA-Z0-9]*$"))
          JOptionPane.showMessageDialog(null, "Please enter userName");
        
        else if (password.isEmpty() || !password.matches("^[a-zA-Z0-9]*$"))
          JOptionPane.showMessageDialog(null, "Please enter password");
     
        else
           {
                   JOptionPane.showMessageDialog(null, "Supply Admin Created");
                   
        ecosystem.getGrocerDirectory().newGrocer(name,address,managerText.getText(),mobile); 
        
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(namejText.getText());
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new GrocerRole());
           }
    }//GEN-LAST:event_addjButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageSupplyAdmin grocer = (ManageSupplyAdmin) component;
        grocer.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void pwdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdTextActionPerformed

    private void UIjTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIjTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIjTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel UILabel;
    private javax.swing.JTextField UIjText;
    private javax.swing.JButton addjButton;
    private javax.swing.JTextField addressjText;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1cd;
    private javax.swing.JTextField managerText;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileText;
    private javax.swing.JTextField namejText;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JTextField pwdText;
    private javax.swing.JLabel specialityLabel;
    // End of variables declaration//GEN-END:variables
}
