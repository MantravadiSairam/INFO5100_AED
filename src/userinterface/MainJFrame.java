/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.DB4OUtil.DB4OUtil;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.Org;

import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainJFrame extends javax.swing.JFrame {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel userProcessContainer;
    private UserAccount account;
    private Org organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private Network network;

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        userNameINPUT = new javax.swing.JTextField();
        passwordFieldinput = new javax.swing.JPasswordField();
        unLABEL = new javax.swing.JLabel();
        PWLABEL = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(500);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(36, 35, 39));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        loginButton.setBackground(new java.awt.Color(0, 102, 202));
        loginButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        userNameINPUT.setBackground(new java.awt.Color(36, 35, 39));
        userNameINPUT.setForeground(new java.awt.Color(255, 255, 255));
        userNameINPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameINPUTActionPerformed(evt);
            }
        });

        passwordFieldinput.setBackground(new java.awt.Color(36, 35, 39));
        passwordFieldinput.setForeground(new java.awt.Color(255, 255, 255));

        unLABEL.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        unLABEL.setForeground(new java.awt.Color(255, 255, 255));
        unLABEL.setText("User Name");

        PWLABEL.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        PWLABEL.setForeground(new java.awt.Color(255, 255, 255));
        PWLABEL.setText("Password");

        logoutButton.setBackground(new java.awt.Color(116, 214, 154));
        logoutButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setText("Logout");
        logoutButton.setBorderPainted(false);
        logoutButton.setEnabled(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mvns7\\Desktop\\AED FInal Project\\Assets\\left.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PWLABEL)
                            .addComponent(unLABEL)
                            .addComponent(userNameINPUT)
                            .addComponent(passwordFieldinput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(loginLabel))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(unLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameINPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PWLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordFieldinput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 895, Short.MAX_VALUE))))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/right.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 1000));

        container.add(jLayeredPane1, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // Get user name
        String userName = userNameINPUT.getText();

        char[] passwordCharArray = passwordFieldinput.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise=null;
        Org inOrganization=null;
        Network inNetwork=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //System.out.println(network);
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Org organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               inNetwork = network;
                               break;
                           }
                       }
                        
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
//            System.out.println(inNetwork.getEnterpriseDirectory().getEnterpriseList().get(0));
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system,new Network()));
    //        System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0));
            layout.next(container);
        }

        logoutButton.setEnabled(true);
        loginButton.setEnabled(false);
        

       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        logoutButton.setEnabled(false);
        userNameINPUT.setEnabled(true);
        passwordFieldinput.setEnabled(true);
        loginButton.setEnabled(true);

        userNameINPUT.setText("");
        passwordFieldinput.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", jLayeredPane1);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void userNameINPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameINPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameINPUTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PWLABEL;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPasswordField passwordFieldinput;
    private javax.swing.JLabel unLABEL;
    private javax.swing.JTextField userNameINPUT;
    // End of variables declaration//GEN-END:variables
}