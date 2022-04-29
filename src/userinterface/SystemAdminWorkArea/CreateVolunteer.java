/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;


import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Employee.Employee;
import GlobalEcoSystem.Nurse.Nurse;
import GlobalEcoSystem.Nurse.NurseDirectory;
import GlobalEcoSystem.Role.NurseRole;
import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateVolunteer extends javax.swing.JPanel {

    /**
     * Creates new form CreateVolunteer
     */
    private JPanel userProcessContainer; 
    private EcoSystem ecosystem; 
    private NurseDirectory nurseDirectory;
    public CreateVolunteer(JPanel userProcessContainer, EcoSystem ecosystem, NurseDirectory nurseDirectory) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.nurseDirectory = ecosystem.getNurseDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1and = new javax.swing.JLabel();
        carLabel = new javax.swing.JLabel();
        genText = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileTjext = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        addjText = new javax.swing.JTextField();
        UILabel = new javax.swing.JLabel();
        UIText = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        addjButton = new javax.swing.JButton();
        NameLabel1 = new javax.swing.JLabel();
        namejText1 = new javax.swing.JTextField();
        emailLabel1 = new javax.swing.JLabel();
        emailjText1 = new javax.swing.JTextField();
        pwdText = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 35, 41));
        setPreferredSize(new java.awt.Dimension(900, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1and.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1and.setText("Add Volunteer Details");
        add(jLabel1and, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 420, 50));

        carLabel.setText("Gender:");
        add(carLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 80, -1));
        add(genText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 180, -1));

        mobileLabel.setText("Mobile:");
        add(mobileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 80, -1));
        add(mobileTjext, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 180, -1));

        addLabel.setText("Address:");
        add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 80, -1));

        addjText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjTextActionPerformed(evt);
            }
        });
        add(addjText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 180, -1));

        UILabel.setText("User Name:");
        add(UILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 80, -1));
        add(UIText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 180, -1));

        pwdLabel.setText("Password:");
        add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 80, -1));

        addjButton.setBackground(new java.awt.Color(0, 102, 204));
        addjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addjButton.setForeground(new java.awt.Color(255, 255, 255));
        addjButton.setText("Add Details");
        addjButton.setBorderPainted(false);
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });
        add(addjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 150, 50));

        NameLabel1.setText("Name:");
        add(NameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 80, -1));

        namejText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejText1ActionPerformed(evt);
            }
        });
        add(namejText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 180, -1));

        emailLabel1.setText("Email:");
        add(emailLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 80, -1));
        add(emailjText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, -1));
        add(pwdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 180, -1));

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
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addjTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addjTextActionPerformed

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
        // TODO add your handling code here:
        String mobile = mobileTjext.getText();
        String email = emailjText1.getText();
        String gender = genText.getText();
       // String seats = seatsText.getText();
        String userName = UIText.getText();
        String password = pwdText.getText();

        for(Nurse nurse : nurseDirectory.getNurseDirectory()) {

            if(nurse.getMobile().equals(mobile)) {
                JOptionPane.showMessageDialog(null, "Mobile Number already exists");//Mobile Number already exists
            }
        }
        for(Nurse nurse : nurseDirectory.getNurseDirectory()) {

            if(nurse.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email already exists");//Email already exists
            }
        }

        for(UserAccount account : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");//Username Already exists
                return;
            }
        }

        if (namejText1.getText().isEmpty() || !namejText1.getText().matches("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"))
        JOptionPane.showMessageDialog(null, "Please enter valid name");

        else if(!(mobileTjext.getText().length()==10) || !mobileTjext.getText().matches("^[0-9]+") || mobileTjext.getText().matches("[0]{10}"))
        JOptionPane.showMessageDialog(null, "enter valid mobile number");

        else if(emailjText1.getText().isEmpty()|| !(emailjText1.getText().trim().contains("@") && emailjText1.getText().trim().contains(".")))
        JOptionPane.showMessageDialog(null, "Enter valid email address");

        else if (addjText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter address");
        }

        else if (genText.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Please enter valid seats");

        else if (userName.isEmpty() || !userName.matches("^[a-zA-Z0-9]*$"))
        JOptionPane.showMessageDialog(null, "Please enter userName");

        else if (password.isEmpty() || !password.matches("^[a-zA-Z0-9]*$"))
        JOptionPane.showMessageDialog(null, "Please enter password");

        else
        {
            JOptionPane.showMessageDialog(null, "Volunteer Profile Created");
  

            ecosystem.getNurseDirectory().addNurse(userName, namejText1.getText(), email, mobile, addjText.getText(), genText.getText());
            Employee employee = ecosystem.getEmployeeDirectory().createEmployee(namejText1.getText());
            UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new NurseRole());
        }
    }//GEN-LAST:event_addjButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageVolunteer nurse = (ManageVolunteer) component;
        nurse.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void namejText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejText1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel UILabel;
    private javax.swing.JTextField UIText;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton addjButton;
    private javax.swing.JTextField addjText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel carLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField emailjText1;
    private javax.swing.JTextField genText;
    private javax.swing.JLabel jLabel1and;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileTjext;
    private javax.swing.JTextField namejText1;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JPasswordField pwdText;
    // End of variables declaration//GEN-END:variables
}
