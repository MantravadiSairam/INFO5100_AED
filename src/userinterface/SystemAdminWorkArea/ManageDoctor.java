/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import GlobalEcoSystem.Doctor.DoctorDirectory;
import GlobalEcoSystem.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import GlobalEcoSystem.Doctor.Doctor;
import javax.swing.JOptionPane;

public class ManageDoctor extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctor
     */
    private JPanel userProcessContainer; 
    private EcoSystem ecoSystem;
    private DoctorDirectory doctorDirectory;
    public ManageDoctor(JPanel userProcessContainer,EcoSystem ecoSystem,DoctorDirectory doctorDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.doctorDirectory = ecoSystem.getDoctorDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);
        for(Doctor doctor : doctorDirectory.getDoctorDirectory()){
            Object [] row = new Object[7];
            row[0] = doctor;
            row[1] = doctor.getName();
            row[2] = doctor.getSpeciality();
            row[3] = doctor.getEmail();
            row[4] = doctor.getMobile();
            row[5] = doctor.getAddress();
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

        jLabel1md = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        btnCreateDoc = new javax.swing.JButton();
        btnModifyDoc = new javax.swing.JButton();
        btnDeleteDoc = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 35, 41));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1md.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1md.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1md.setText("Manage Doctor");
        add(jLabel1md, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        tblDoctor.setBackground(new java.awt.Color(255, 255, 255));
        tblDoctor.setForeground(new java.awt.Color(255, 255, 255));
        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Speciality", "Email Id", "Phone Number", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblDoctor);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 726, 200));

        btnCreateDoc.setBackground(new java.awt.Color(0, 102, 204));
        btnCreateDoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCreateDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateDoc.setText("Create Doctor");
        btnCreateDoc.setBorderPainted(false);
        btnCreateDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDocActionPerformed(evt);
            }
        });
        add(btnCreateDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        btnModifyDoc.setBackground(new java.awt.Color(0, 102, 204));
        btnModifyDoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModifyDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyDoc.setText("Update Doctor");
        btnModifyDoc.setBorderPainted(false);
        btnModifyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDocActionPerformed(evt);
            }
        });
        add(btnModifyDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        btnDeleteDoc.setBackground(new java.awt.Color(153, 0, 0));
        btnDeleteDoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDoc.setText("Delete Doctor");
        btnDeleteDoc.setBorderPainted(false);
        btnDeleteDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDocActionPerformed(evt);
            }
        });
        add(btnDeleteDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 204));
        btnBack.setText("<<Back");
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDocActionPerformed
        // TODO add your handling code here:
        CreateDoctor createDoc = new CreateDoctor(userProcessContainer, ecoSystem, doctorDirectory);
        userProcessContainer.add("CreateDoctor",createDoc);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateDocActionPerformed

    private void btnDeleteDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDocActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctor.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select a row to delete");
            return;
        }
        
        Doctor doc = (Doctor) tblDoctor.getValueAt(selectedRow, 0);
        doctorDirectory.removeDoctor(doc);
        populateTable();
    }//GEN-LAST:event_btnDeleteDocActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModifyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDocActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctor.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Doctor doc = (Doctor) tblDoctor.getValueAt(selectedRow, 0);
        updateDoctor updateDoctorPanel = new updateDoctor(userProcessContainer, ecoSystem, doctorDirectory,doc);
        userProcessContainer.add("updateDoctor",updateDoctorPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateDoc;
    private javax.swing.JButton btnDeleteDoc;
    private javax.swing.JButton btnModifyDoc;
    private javax.swing.JLabel jLabel1md;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoctor;
    // End of variables declaration//GEN-END:variables
}