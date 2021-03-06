/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

//import Business.Customer.Customer;
import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Employee.Employee;
import GlobalEcoSystem.Helper.NGO;
import GlobalEcoSystem.Helper.HelperDirectory;
import GlobalEcoSystem.Role.HelperRole;
//import Business.Role.CustomerRole;
import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class addNGO extends javax.swing.JPanel {

    /**
     * Creates new form addNGO
     */
     private JPanel userProcessContainer; 
    private EcoSystem ecosystem; 
    private HelperDirectory helperDirectory;
    public addNGO(JPanel userProcessContainer, EcoSystem ecosystem, HelperDirectory helperDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.helperDirectory = ecosystem.getHelperDirectory();
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
        carLabel = new javax.swing.JLabel();
        pricejText = new javax.swing.JTextField();
        seatsLabel = new javax.swing.JLabel();
        addjText = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileTextj = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        profjText = new javax.swing.JTextField();
        UILabel = new javax.swing.JLabel();
        UIText = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        addjButton = new javax.swing.JButton();
        NameLabel1 = new javax.swing.JLabel();
        namejText1 = new javax.swing.JTextField();
        emailLabel1 = new javax.swing.JLabel();
        emailText1j = new javax.swing.JTextField();
        pwdText = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 35, 39));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add NGO Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 455, 50));

        carLabel.setText("Funds:");
        add(carLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 80, -1));
        add(pricejText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 220, 30));

        seatsLabel.setText("Address:");
        add(seatsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 80, -1));
        add(addjText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 220, 90));

        mobileLabel.setText("Mobile:");
        add(mobileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 80, -1));
        add(mobileTextj, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 220, 30));

        addLabel.setText("Category:");
        add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 80, -1));

        profjText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profjTextActionPerformed(evt);
            }
        });
        add(profjText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 220, 30));

        UILabel.setText("User Name:");
        add(UILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 80, -1));
        add(UIText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 220, 30));

        pwdLabel.setText("Password:");
        add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 700, 80, -1));

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
        add(addjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 780, 140, 40));

        NameLabel1.setText("Name:");
        add(NameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 80, -1));
        add(namejText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 220, 30));

        emailLabel1.setText("Email:");
        add(emailLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 80, -1));
        add(emailText1j, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 220, 30));
        add(pwdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 720, 220, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 840, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void profjTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profjTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_profjTextActionPerformed

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
        // TODO add your handling code here:
       String mobile = mobileTextj.getText();
        String email = emailText1j.getText();
        String userName = UIText.getText();
        String password = pwdText.getText();
        
        
         for(NGO NGO : helperDirectory.getHelperDirectory()) {
           
            if(NGO.getMobile().equals(mobile)) {
                JOptionPane.showMessageDialog(null, "Mobile Number already exists");
            }
        }
         for(NGO NGO : helperDirectory.getHelperDirectory()) {
           
            if(NGO.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email already exists");
            }
        }
         
            for(UserAccount account : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }
        
        if (namejText1.getText().isEmpty() || !namejText1.getText().matches("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$"))
          JOptionPane.showMessageDialog(null, "Please enter valid name");
        
        
        else if(!(mobileTextj.getText().length()==10) || !mobileTextj.getText().matches("^[0-9]+") || mobileTextj.getText().matches("[0]{10}"))
        JOptionPane.showMessageDialog(null, "enter valid mobile number");
        
      
       
        else if(emailText1j.getText().isEmpty()|| !(emailText1j.getText().trim().contains("@") && emailText1j.getText().trim().contains(".")))
          JOptionPane.showMessageDialog(null, "Enter valid email address");
        
        else if (pricejText.getText().length() == 0){
          JOptionPane.showMessageDialog(null, "Please enter valid funds");
        }
       
        else if (profjText.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Please enter address");
        }
        
        else if (userName.isEmpty() || !userName.matches("^[a-zA-Z0-9]*$"))
          JOptionPane.showMessageDialog(null, "Please enter userName");
        
        else if (password.isEmpty() || !password.matches("^[a-zA-Z0-9]*$"))
          JOptionPane.showMessageDialog(null, "Please enter password");
        
     
        else
           {
                   JOptionPane.showMessageDialog(null, "NGO Profile Created");
                   //String userName,String profession,double price, String name, String email, String mobile, String address
        ecosystem.getHelperDirectory().addHelper(userName,profjText.getText(),Double.parseDouble(pricejText.getText()),namejText1.getText(), email, mobile, addjText.getText());
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(namejText1.getText());
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new HelperRole());
           }
        
    }//GEN-LAST:event_addjButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
    Component[] componentArray = userProcessContainer.getComponents();
    Component component = componentArray[componentArray.length - 1];
    manageHelper h = (manageHelper) component;
    h.populateTable();
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


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
    private javax.swing.JTextField emailText1j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileTextj;
    private javax.swing.JTextField namejText1;
    private javax.swing.JTextField pricejText;
    private javax.swing.JTextField profjText;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JPasswordField pwdText;
    private javax.swing.JLabel seatsLabel;
    // End of variables declaration//GEN-END:variables
}
