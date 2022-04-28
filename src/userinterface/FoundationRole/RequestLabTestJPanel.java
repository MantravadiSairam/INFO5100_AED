/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoundationRole;

import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;


public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        
        this.userAccount = account;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJlButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJlButton.setBackground(new java.awt.Color(0, 102, 204));
        requestTestJlButton.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        requestTestJlButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJlButton.setText("Request Test");
        requestTestJlButton.setBorderPainted(false);
        requestTestJlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJlButtonActionPerformed(evt);
            }
        });
        add(requestTestJlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 150, 40));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));
        add(messageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 480, 70));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setForeground(new java.awt.Color(0, 102, 204));
        backJButton.setText("<<Back");
        backJButton.setBorderPainted(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJlButtonActionPerformed
        
        
        
    }//GEN-LAST:event_requestTestJlButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FoundationPortal dwjp = (FoundationPortal) component;
        //dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JButton requestTestJlButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
