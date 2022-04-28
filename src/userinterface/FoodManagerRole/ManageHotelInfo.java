/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodManagerRole;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Pharmacy.Pharmacy;
import GlobalEcoSystem.Pharmacy.PharmacyDirectory;


import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageHotelInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageHotelInfo
     */
      private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private PharmacyDirectory pharmacyDirectory;
    private Pharmacy pharmacy;
    public ManageHotelInfo(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, PharmacyDirectory pharmacyDirectory) {
        initComponents();
    this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.pharmacyDirectory = ecoSystem.getPharmacyDirectory();
       
        for(Pharmacy res : this.pharmacyDirectory.getPharmacyDirectory()) {
            
            if(account.getEmployee().getName().equals(res.getPharmName())) {
                this.pharmacy = res;
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
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        Object [] row = new Object[4];
        row[0] = pharmacy;
            row[1] = pharmacy.getAddress();
            row[2] = pharmacy.getPhone();
            row[3] = pharmacy.getPharmacist();
        
        dtm.addRow(row);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mpi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1up = new javax.swing.JButton();
        backButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(36, 35, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mpi.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mpi.setForeground(new java.awt.Color(255, 255, 255));
        mpi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mpi.setText("Manage Hotel Info");
        jPanel1.add(mpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 480, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Phone", "Manager Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 539, 111));

        jButton1up.setBackground(new java.awt.Color(0, 102, 204));
        jButton1up.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton1up.setForeground(new java.awt.Color(255, 255, 255));
        jButton1up.setText("Update");
        jButton1up.setBorderPainted(false);
        jButton1up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1upActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1up, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 110, 40));

        backButton2.setBackground(new java.awt.Color(255, 255, 255));
        backButton2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        backButton2.setForeground(new java.awt.Color(0, 102, 204));
        backButton2.setText("<< Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1upActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Pharmacy restaurant = (Pharmacy)jTable1.getValueAt(selectedRow,0);
        ModifyHotelInfo modifyManager = new ModifyHotelInfo(userProcessContainer, ecoSystem, pharmacyDirectory, pharmacy);
        userProcessContainer.add("ModifyRestaurantInfoJPanel",modifyManager);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1upActionPerformed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton2;
    private javax.swing.JButton jButton1up;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mpi;
    // End of variables declaration//GEN-END:variables
}