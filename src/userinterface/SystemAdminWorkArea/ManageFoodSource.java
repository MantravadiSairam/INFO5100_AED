/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Pharmacy.Pharmacy;
import GlobalEcoSystem.Pharmacy.PharmacyDirectory;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageFoodSource extends javax.swing.JPanel {

    /**
     * Creates new form ManageFoodSource
     */
     private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private PharmacyDirectory pharmacyDirectory;
    public ManageFoodSource(JPanel userProcessContainer, EcoSystem ecosystem, PharmacyDirectory pharmacyDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //System.out.println(ecosystem);
        this.ecosystem =  ecosystem;
        this.pharmacyDirectory = ecosystem.getPharmacyDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
            for(Pharmacy pharmacy : pharmacyDirectory.getPharmacyDirectory()){
            Object [] row = new Object[5];
            row[0] = pharmacy;
            row[1] = pharmacy.getAddress();
            row[2] = pharmacy.getPhone();
            row[3] = pharmacy.getPharmacist();
            dtm.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        deleteBjutton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 35, 41));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Food Source Info");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pharmacy Name", "Address", "Mobile", "Pharmacist"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 570, 110));

        addButton.setBackground(new java.awt.Color(0, 102, 204));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("ADD");
        addButton.setBorderPainted(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 70, -1));

        updatejButton.setBackground(new java.awt.Color(0, 102, 204));
        updatejButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updatejButton.setForeground(new java.awt.Color(255, 255, 255));
        updatejButton.setText("UPDATE");
        updatejButton.setBorderPainted(false);
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });
        add(updatejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        deleteBjutton.setBackground(new java.awt.Color(153, 0, 0));
        deleteBjutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteBjutton.setForeground(new java.awt.Color(255, 255, 255));
        deleteBjutton.setText("DELETE");
        deleteBjutton.setBorderPainted(false);
        deleteBjutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBjuttonActionPerformed(evt);
            }
        });
        add(deleteBjutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

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
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
          addFoodManagement createPharmacy = new addFoodManagement(userProcessContainer, ecosystem, pharmacyDirectory);
        userProcessContainer.add("CreateCustomersJPanel",createPharmacy);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Pharmacy pharmacy = (Pharmacy)jTable1.getValueAt(selectedRow,0);
        updateFoodManagement modifyPharm = new updateFoodManagement(userProcessContainer, ecosystem, pharmacyDirectory, pharmacy);
        userProcessContainer.add("ModifyManagerJPanel",modifyPharm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void deleteBjuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBjuttonActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Pharmacy pharmacy = (Pharmacy) jTable1.getValueAt(selectedRow, 0);
        pharmacyDirectory.removePharmacy(pharmacy);
        populateTable();
    }//GEN-LAST:event_deleteBjuttonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
                userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteBjutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
