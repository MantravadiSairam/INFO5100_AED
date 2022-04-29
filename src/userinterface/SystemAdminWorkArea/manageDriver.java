/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import GlobalEcoSystem.Driver.Driver;
import GlobalEcoSystem.Driver.DriverDirectory;
import GlobalEcoSystem.EcoSystem;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class manageDriver extends javax.swing.JPanel {

    /**
     * Creates new form manageDriver
     */
      private JPanel userProcessContainer; 
    private EcoSystem ecosystem; 
    private DriverDirectory driverDirectory;
    public manageDriver(JPanel userProcessContainer,EcoSystem ecosystem,DriverDirectory driverDirectory) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.driverDirectory = ecosystem.getDriverDirectory();
        //this.customerDirectory = customerDirectory;
        populateTable();
    }

     public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1j.getModel();
        model.setRowCount(0);
        for(Driver driver : ecosystem.getDriverDirectory().getDriverDirectory()){
            Object [] row = new Object[7];
            row[0] = driver;
            row[1] = driver.getName();
            row[2] = driver.getMobile();
            row[3] = driver.getEmail();
            row[4] = driver.getAddress();
            row[5] = driver.getModel();
            row[6] = driver.getSeats();
            
            model.addRow(row);
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

        jLabel1j = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1j = new javax.swing.JTable();
        addjjButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 35, 39));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1j.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1j.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1j.setText("Manage Driver Info");
        add(jLabel1j, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jTable1j.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserId", "Name", "Mobile", "Email", "Address", "Car Model", "No. of Seats"
            }
        ));
        jScrollPane1.setViewportView(jTable1j);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 570, 110));

        addjjButton.setBackground(new java.awt.Color(0, 102, 204));
        addjjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addjjButton.setForeground(new java.awt.Color(255, 255, 255));
        addjjButton.setText("ADD");
        addjjButton.setBorderPainted(false);
        addjjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjjButtonActionPerformed(evt);
            }
        });
        add(addjjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 70, -1));

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
        add(updatejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        deletejButton.setBackground(new java.awt.Color(153, 0, 0));
        deletejButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletejButton.setForeground(new java.awt.Color(255, 255, 255));
        deletejButton.setText("DELETE");
        deletejButton.setBorderPainted(false);
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });
        add(deletejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

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
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addjjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjjButtonActionPerformed
        // TODO add your handling code here:
           addDriver adddriv = new addDriver(userProcessContainer, ecosystem,driverDirectory);
        userProcessContainer.add("CreateHelperJPanel",adddriv);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addjjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1j.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row to update");
            return;
        }
        Driver drive = (Driver)jTable1j.getValueAt(selectedRow,0);
        
        updateDriver updateDriver = new updateDriver(userProcessContainer, ecosystem, driverDirectory,drive);
        userProcessContainer.add("updateDriverJPanel",updateDriver);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:
          int selectedRow = jTable1j.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select a row to delete");
            return;
        }
        
        Driver driver = (Driver) jTable1j.getValueAt(selectedRow, 0);
        driverDirectory.removeDriver(driver);
        populateTable();
    }//GEN-LAST:event_deletejButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjjButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deletejButton;
    private javax.swing.JLabel jLabel1j;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1j;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
