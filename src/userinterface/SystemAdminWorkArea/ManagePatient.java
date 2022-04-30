/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Person.Person;
import GlobalEcoSystem.Person.PersonDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManagePatient extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatient
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private PersonDirectory personDirectory;
    public ManagePatient(JPanel userProcessContainer,EcoSystem ecoSystem,PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.personDirectory = ecoSystem.getPersonDirectory();
        populateTable();
    }
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();
        dtm.setRowCount(0);
        for(Person person : personDirectory.getPersonDirectory()){
            Object [] row = new Object[7];
            //row[0] = person;
            row[0] = person.getName();
            //row[1] = person.getDob();
            row[1] = person.getAge();
            row[2] = person.getGender();
            row[3] = person.getAddress();
            row[4] = person.getEmail();
            row[5] = person.getMobile();
            row[6] = person;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1jmp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jj = new javax.swing.JButton();
        btnjModify = new javax.swing.JButton();
        btnjDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 35, 41));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 35, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1jmp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1jmp.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1jmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1jmp.setText("Manage User");
        jPanel2.add(jLabel1jmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 388, -1));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "age", "gender", "address", "e-mail", "phone number", "username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 780, 100));

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
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jj.setBackground(new java.awt.Color(0, 102, 204));
        jj.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jj.setForeground(new java.awt.Color(255, 255, 255));
        jj.setText("Create Uer");
        jj.setBorderPainted(false);
        jj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjActionPerformed(evt);
            }
        });
        jPanel2.add(jj, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 165, -1));

        btnjModify.setBackground(new java.awt.Color(0, 102, 204));
        btnjModify.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnjModify.setForeground(new java.awt.Color(255, 255, 255));
        btnjModify.setText("Modify User");
        btnjModify.setBorderPainted(false);
        btnjModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjModifyActionPerformed(evt);
            }
        });
        jPanel2.add(btnjModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 165, -1));

        btnjDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnjDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnjDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnjDelete.setText("Delete User");
        btnjDelete.setBorderPainted(false);
        btnjDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnjDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 165, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    userProcessContainer.remove(this);
    Component[] componentArray = userProcessContainer.getComponents();
    Component component = componentArray[componentArray.length - 1];
    ManageAllServicesJPanel mcjp = (ManageAllServicesJPanel) component;
    //mcjp.populateTable();
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjActionPerformed
       CreateUser createUserPanel = new CreateUser(userProcessContainer, ecoSystem,personDirectory);
        userProcessContainer.add("CreateUser", createUserPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jjActionPerformed

    private void btnjModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjModifyActionPerformed
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person = (Person) tblCustomer.getValueAt(selectedRow, 6);
        ModifyPatient modifypatientPanel = new ModifyPatient(userProcessContainer, ecoSystem,personDirectory,person);
        userProcessContainer.add("ModifyDeliveryManJPanel",modifypatientPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnjModifyActionPerformed

    private void btnjDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjDeleteActionPerformed
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Person person = (Person) tblCustomer.getValueAt(selectedRow, 6);
        personDirectory.removePerson(person);
        populateTable();
    }//GEN-LAST:event_btnjDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnjDelete;
    private javax.swing.JButton btnjModify;
    private javax.swing.JLabel jLabel1jmp;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jj;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables
}