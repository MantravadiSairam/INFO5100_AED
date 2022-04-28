/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DriverRole;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.TransportationOrganization;
import GlobalEcoSystem.Org.Org;
import GlobalEcoSystem.Org.OrganizationDirectory;
import GlobalEcoSystem.UserAccount.UserAccount;
import GlobalEcoSystem.WorkQueue.DriverWorkRequest;
import GlobalEcoSystem.WorkQueue.WorkRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class CarrierPortal extends javax.swing.JPanel {

    /**
     * Creates new form CarrierPortal
     */
     private JPanel userProcessContainer;
   private UserAccount userAccount;  
    private OrganizationDirectory od;
    private TransportationOrganization dorg;
    EcoSystem business;
    public CarrierPortal(JPanel userProcessContainer,
                         UserAccount userAccount,
                         EcoSystem business, Org organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.od = od;
         this.dorg = (TransportationOrganization)organization;
         this.business =business;
         populatetransportRequestTable();
    }
  public void populatetransportRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)workRequestTable.getModel();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
        model.setRowCount(0);
       // if(!dorg.getWorkQueue().getWorkRequestList().isEmpty())
        //{
        for(WorkRequest request : business.getWorkQueue().getWorkRequestList()){
              if(request instanceof DriverWorkRequest){ 
            Object[] row = new Object[4];
            //row[0] = request;
            row[0] = ((DriverWorkRequest) request).getPerson().getName();
            //row[1] = 
            row[1] = ((DriverWorkRequest) request).getDestin();
            //row[2]
            row[2] = ((DriverWorkRequest) request);
            row[3] = ((DriverWorkRequest) request).getSeats();
            //row[3] = request.
            model.addRow(row);
        }
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

        jPanel1 = new javax.swing.JPanel();
        DWAA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestTable = new javax.swing.JTable();
        JacceptButton = new javax.swing.JButton();
        JprocessButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 204));

        jPanel1.setBackground(new java.awt.Color(36, 35, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DWAA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        DWAA.setForeground(new java.awt.Color(255, 255, 255));
        DWAA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DWAA.setText("Pickup Portal");
        jPanel1.add(DWAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 363, -1));

        workRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "person name", "location", "status", "seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 600, 94));

        JacceptButton.setBackground(new java.awt.Color(0, 102, 204));
        JacceptButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        JacceptButton.setForeground(new java.awt.Color(255, 255, 255));
        JacceptButton.setText("Accept Pickup");
        JacceptButton.setBorderPainted(false);
        JacceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JacceptButtonActionPerformed(evt);
            }
        });
        jPanel1.add(JacceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        JprocessButton.setBackground(new java.awt.Color(0, 102, 204));
        JprocessButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        JprocessButton.setForeground(new java.awt.Color(255, 255, 255));
        JprocessButton.setText("Completed");
        JprocessButton.setBorderPainted(false);
        JprocessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JprocessButtonActionPerformed(evt);
            }
        });
        jPanel1.add(JprocessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JacceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JacceptButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

       // WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 3);
        DriverWorkRequest request = (DriverWorkRequest) workRequestTable.getValueAt(selectedRow, 2);
        if(request.getReceiver()!=null)
        {
         //JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         //return;     
        }
        if(request.getDstatus().equalsIgnoreCase("Driver Accepted")){
            JOptionPane.showMessageDialog(null, "Already accepted");
        }
        request.setReceiver(userAccount);
        request.setDstatus("Driver Accepted");
        populatetransportRequestTable();
    }//GEN-LAST:event_JacceptButtonActionPerformed

    private void JprocessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JprocessButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestTable.getSelectedRow();

        if (selectedRow < 0){
          JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DriverWorkRequest ntwr = (DriverWorkRequest)workRequestTable.getValueAt(selectedRow, 2);
        if(ntwr.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null, "Please accept the ride first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(ntwr.getDstatus().equalsIgnoreCase("Ride Completed"))
        {
         JOptionPane.showMessageDialog(null, "Request has already been completed!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
         if(ntwr.getDstatus().equalsIgnoreCase("Driver Accepted"))
        {
            ntwr.setDstatus("Ride Completed");
            populatetransportRequestTable();
        /* if(ntwr.getReceiver()!=userAccount)
         {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
         } */
        }
        
        
    }//GEN-LAST:event_JprocessButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DWAA;
    private javax.swing.JButton JacceptButton;
    private javax.swing.JButton JprocessButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestTable;
    // End of variables declaration//GEN-END:variables
}