/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.SupportServicesOrganization;

import GlobalEcoSystem.Org.Org;
import GlobalEcoSystem.Org.OrganizationDirectory;

import GlobalEcoSystem.UserAccount.UserAccount;
import GlobalEcoSystem.WorkQueue.HelperWorkRequest;
import GlobalEcoSystem.WorkQueue.WorkRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class NGOPortal extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount userAccount;
   // private UserAccount userAccount;  
    private OrganizationDirectory od;
    private SupportServicesOrganization horg;
    EcoSystem business;
    
    Double availFunds;
    
    
    /**
     * Creates new form HealthCheckupProcessPortal
     */
    public NGOPortal(JPanel userProcessContainer,
                     UserAccount userAccount,
                     EcoSystem business, Org organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.od = od;
         this.horg = (SupportServicesOrganization)organization;
         this.business =business;
         populateRequestTable();
         
//         String availfunds = business.getHelperDirectory().getHelper(userAccount.getEmployee().getName()).getPrice().toString();
         
         this.availFunds = business.getHelperDirectory().getHelper(userAccount.getEmployee().getName()).getPrice();
                 
       lblfunds.setText(availFunds.toString());
       
    }
    
    public void populateRequestTable(){
       
           DefaultTableModel model = (DefaultTableModel)workRequestJjTable.getModel();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
        model.setRowCount(0);
       // if(!dorg.getWorkQueue().getWorkRequestList().isEmpty())
        //{
        for(WorkRequest request : business.getWorkQueue().getWorkRequestList()){
              if(request instanceof HelperWorkRequest){ 
                 if(((HelperWorkRequest) request).getProf().equalsIgnoreCase(business.getHelperDirectory().getHelper(userAccount.getEmployee().getName()).getProfession())){
                     // business.getHelperDirectory().getHelper(
                 // ecoSystem.getPersonDirectory().getPerson(account.getEmployee().getName());
            Object[] row = new Object[5];
            //row[0] = request;
           row[0] = ((HelperWorkRequest) request).getPname();
            //row[1] = 
            row[1] = ((HelperWorkRequest) request).getAdd();
            row[2] =((HelperWorkRequest) request).getDate();
            row[3] = ((HelperWorkRequest) request).getPrice();
            row[4]  = ((HelperWorkRequest) request);
            //row[3] = request.
            model.addRow(row);
                 }
        }
        }
        //}
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hwa = new javax.swing.JLabel();
        acceptjButton = new javax.swing.JButton();
        processjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblfunds = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 35, 39));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hwa.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        hwa.setForeground(new java.awt.Color(255, 255, 255));
        hwa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hwa.setText("NGO Portal");
        add(hwa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 560, 53));

        acceptjButton.setBackground(new java.awt.Color(0, 102, 204));
        acceptjButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        acceptjButton.setForeground(new java.awt.Color(255, 255, 255));
        acceptjButton.setText("Accept");
        acceptjButton.setBorderPainted(false);
        acceptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptjButtonActionPerformed(evt);
            }
        });
        add(acceptjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        processjButton.setBackground(new java.awt.Color(0, 102, 204));
        processjButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        processjButton.setForeground(new java.awt.Color(255, 255, 255));
        processjButton.setText("Fulfill");
        processjButton.setBorderPainted(false);
        processjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processjButtonActionPerformed(evt);
            }
        });
        add(processjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, -1, -1));

        workRequestJjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "person name", "address", "date", "price", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJjTable);
        if (workRequestJjTable.getColumnModel().getColumnCount() > 0) {
            workRequestJjTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 240, 680, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Available Funds");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        lblfunds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfunds.setText("0.0");
        lblfunds.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        add(lblfunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void processjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJjTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        HelperWorkRequest ntwr = (HelperWorkRequest)workRequestJjTable.getValueAt(selectedRow, 4);
        if(ntwr.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null, "Please accept the request first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(ntwr.getHstatus().equalsIgnoreCase("Request Fulfilled"))
        {
            JOptionPane.showMessageDialog(null, "Request has already been completed!", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(ntwr.getHstatus().equalsIgnoreCase("Fund Request Accepted"))
        {
            ntwr.setHstatus("Request Fulfilled");
            populateRequestTable();
            /* if(ntwr.getReceiver()!=userAccount)
            {
                JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            } */
        }
    }//GEN-LAST:event_processjButtonActionPerformed

    private void acceptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJjTable.getSelectedRow();
        
       
        

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 3);
        HelperWorkRequest request = (HelperWorkRequest) workRequestJjTable.getValueAt(selectedRow, 4);
        
        if(availFunds < request.getPrice()){
            JOptionPane.showMessageDialog(null, "Can't fulfill because value exceeds available funds", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(request.getReceiver()!=null)
        {
            //JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
            //return;
        }
        if(request.getHstatus().equalsIgnoreCase("Funds Accepted")){
            JOptionPane.showMessageDialog(null, "Already accepted");
        }
        request.setPrice(ERROR);
        request.setReceiver(userAccount);
        request.setHstatus("Fund Request Accepted");
        populateRequestTable();
    }//GEN-LAST:event_acceptjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptjButton;
    private javax.swing.JLabel hwa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfunds;
    private javax.swing.JButton processjButton;
    private javax.swing.JTable workRequestJjTable;
    // End of variables declaration//GEN-END:variables
}
