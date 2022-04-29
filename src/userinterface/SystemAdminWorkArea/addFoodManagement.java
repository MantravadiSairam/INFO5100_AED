/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Employee.Employee;
import GlobalEcoSystem.Pharmacy.Pharmacy;
import GlobalEcoSystem.Pharmacy.PharmacyDirectory;

//import Business.Role.AdminRole;
import GlobalEcoSystem.Role.PharmaRole;
import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class addFoodManagement extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private PharmacyDirectory pharmacyDirectory;

    /**
     * Creates new form addFoodManagement
     */
    public addFoodManagement(JPanel userProcessContainer, EcoSystem ecoSystem, PharmacyDirectory pharmacyDirectory) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.pharmacyDirectory = ecoSystem.getPharmacyDirectory();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileText = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        addjText = new javax.swing.JTextField();
        UILabel = new javax.swing.JLabel();
        UIText = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        addjjButtonaxd = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        NameLabel1 = new javax.swing.JLabel();
        pharmacistText = new javax.swing.JTextField();
        pwdjText = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(36, 35, 41));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(36, 35, 41));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Food Source Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 450, 50));

        NameLabel.setText("Name: ");
        add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 100, 20));
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 190, 30));

        mobileLabel.setText("Mobile:");
        add(mobileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 90, 20));
        add(mobileText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 190, 30));

        addLabel.setText("Address:");
        add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 90, 20));
        add(addjText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 190, 30));

        UILabel.setText("UserID:");
        add(UILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 90, 20));
        add(UIText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 190, 30));

        pwdLabel.setText("Password:");
        add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 90, 20));

        addjjButtonaxd.setBackground(new java.awt.Color(0, 102, 204));
        addjjButtonaxd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        addjjButtonaxd.setForeground(new java.awt.Color(255, 255, 255));
        addjjButtonaxd.setText("Add Details");
        addjjButtonaxd.setBorderPainted(false);
        addjjButtonaxd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjjButtonaxdActionPerformed(evt);
            }
        });
        add(addjjButtonaxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 130, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 102, 204));
        backButton.setText("<< BACK");
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 90, 30));

        NameLabel1.setText("Manager");
        add(NameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 100, 20));
        add(pharmacistText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 190, 30));
        add(pwdjText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addjjButtonaxdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjjButtonaxdActionPerformed
        // TODO add your handling code here:
        String PharmacyName = nameText.getText();
        String address = addjText.getText();
        String phone = mobileText.getText();
        String pName = pharmacistText.getText();
        String userName = UIText.getText();
        String password = pwdjText.getText();
        
         for(Pharmacy pharmacy : pharmacyDirectory.getPharmacyDirectory()) {
           
            if(pharmacy.getPharmName().equals(PharmacyName)) {
                JOptionPane.showMessageDialog(null, "This pharmacy already exists");
            }
        }
         for(Pharmacy pharmacy : pharmacyDirectory.getPharmacyDirectory()) {
           
            if(pharmacy.getPhone().equals(phone)) {
                JOptionPane.showMessageDialog(null, "Phone number already exists");
            }
        }
         
          for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }
        
        if (PharmacyName.isEmpty() || !PharmacyName.matches("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"))
          JOptionPane.showMessageDialog(null, "Please enter valid name");
        
        
        else if(!(phone.length()==10) || !phone.matches("^[0-9]+") || phone.matches("[0]{10}"))
        JOptionPane.showMessageDialog(null, "enter valid mobile number");
        
      
       
        /*else if(emailText.getText().isEmpty()|| !(emailText.getText().trim().contains("@") && emailText.getText().trim().contains(".")))
          JOptionPane.showMessageDialog(null, "Enter valid email address");*/
       
       
        else if (address.isEmpty()){
          JOptionPane.showMessageDialog(null, "Please enter address");
        }
        
        else if (pName.isEmpty() || !pName.matches("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"))
          JOptionPane.showMessageDialog(null, "Please enter valid name");
        
        else if (userName.isEmpty() || !userName.matches("^[a-zA-Z0-9]*$"))
          JOptionPane.showMessageDialog(null, "Please enter userName");
        
        else if (password.isEmpty() || !password.matches("^[a-zA-Z0-9]*$"))
          JOptionPane.showMessageDialog(null, "Please enter password");
        
     
        else
           {
                   JOptionPane.showMessageDialog(null, "Food Source registered");
                   
        /*ecoSystem.getCustomerDirectory().addCustomer(userName, nameText.getText(), email, mobile, addText.getText());
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(nameText.getText());
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new CustomerRole());
        */
        
        ecoSystem.getPharmacyDirectory().addPharmacy(PharmacyName, address, phone, pName);
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(PharmacyName);
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new PharmaRole());
           }
    }//GEN-LAST:event_addjjButtonaxdActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFoodSource m = (ManageFoodSource) component;
        m.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel UILabel;
    private javax.swing.JTextField UIText;
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField addjText;
    private javax.swing.JButton addjjButtonaxd;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField pharmacistText;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JPasswordField pwdjText;
    // End of variables declaration//GEN-END:variables
}