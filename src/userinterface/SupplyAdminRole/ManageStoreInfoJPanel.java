/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyAdminRole;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Grocer.Grocer;
import GlobalEcoSystem.Grocer.GrocerDirectory;

import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageStoreInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHotelInfo
     */
      private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private GrocerDirectory grocerDirectory;
    private Grocer grocer;
    public ManageStoreInfoJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, GrocerDirectory grocerDirectory) {
        initComponents();
    this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.grocerDirectory = ecoSystem.getGrocerDirectory();
       
        for(Grocer res : this.grocerDirectory.getGrocerDirectory()) {
            
            if(account.getEmployee().getName().equals(res.getGrocerName())) {
                this.grocer = res;
                break;
            }
        }
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jtablemgi.getModel();
        dtm.setRowCount(0);
        Object [] row = new Object[4];
        row[0] = grocer;
            row[1] = grocer.getAddress();
            row[2] = grocer.getPhoneNum();
            row[3] = grocer.getManagerName();
        
        dtm.addRow(row);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        managegroceryinfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablemgi = new javax.swing.JTable();
        updatebutton = new javax.swing.JButton();
        backjButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(36, 35, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        managegroceryinfo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        managegroceryinfo.setForeground(new java.awt.Color(255, 255, 255));
        managegroceryinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managegroceryinfo.setText("Manage Supplier Info");
        jPanel1.add(managegroceryinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 430, -1));

        jtablemgi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "store Name", "Store Address", "StorePhone", "Manager Name"
            }
        ));
        jScrollPane1.setViewportView(jtablemgi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 700, 190));

        updatebutton.setBackground(new java.awt.Color(0, 102, 204));
        updatebutton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton.setText("Update");
        updatebutton.setBorderPainted(false);
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 140, 50));

        backjButton2.setBackground(new java.awt.Color(255, 255, 255));
        backjButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton2.setForeground(new java.awt.Color(0, 0, 0));
        backjButton2.setText("<< Back");
        backjButton2.setBorderPainted(false);
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(backjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton2ActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtablemgi.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Grocer restaurant = (Grocer)jtablemgi.getValueAt(selectedRow,0);
        ModifyStoreInfoJPanel modifyManager = new ModifyStoreInfoJPanel(userProcessContainer, ecoSystem, grocerDirectory, grocer);
        userProcessContainer.add("ModifyRestaurantInfoJPanel",modifyManager);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updatebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablemgi;
    private javax.swing.JLabel managegroceryinfo;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
