/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoundationRole;

import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Helper.NGO;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Org.PopulationOrganization;
import GlobalEcoSystem.Person.Person;
import GlobalEcoSystem.UserAccount.UserAccount;
import GlobalEcoSystem.WorkQueue.HelperWorkRequest;

import GlobalEcoSystem.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class NgoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NgoJPanel
     */
    private JPanel userProcessContainer;
private EcoSystem ecoSystem;
private UserAccount account;
private HelperWorkRequest hreq;
private Enterprise ent;
private PopulationOrganization organization;
private Network network;
    public NgoJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, HelperWorkRequest hreq, Enterprise ent, Network network, PopulationOrganization organization) {
initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.hreq = hreq;
        this.organization = organization;
        this.ent = ent;
        this.network = network;
        populateSeatsCombo();
        populateRequestTable();
        //double price = 20.5;
        
    }
    
     public void populateSeatsCombo() {
        ssbha.removeAllItems();
        //jComboBox1.addItem(" ");
        
        for(NGO res : ecoSystem.getHelperDirectory().getHelperDirectory()) {
            System.out.println("res" + res);
            
            ssbha.addItem(String.valueOf(res.getProfession()));
             //priceText.setText(String.valueOf(res.getPrice()));
            
            //selectComboBox.addItem(Integer.parseInt(res.getSeats())); String.valueOf(i)
            //jComboBox1.addItem(String.valueOf(res.getSeats()));
        }
    }
     
     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1h.getModel();
        model.setRowCount(0);
        //double price = 13.5;
        //for (Gene g : ((LabTestWorkRequest) request).getPatient().getGeneHistory().getGeneHistory()) {
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
        if (request instanceof HelperWorkRequest) {
        Object[] row = new Object[5];
        row[0] = ((HelperWorkRequest) request).getDate();
        row[1] = ((HelperWorkRequest) request).getProf();
        row[2] = ((HelperWorkRequest) request).getAdd();
        row[3] =((HelperWorkRequest) request).getPrice();
        row[4] = ((HelperWorkRequest) request);
        model.addRow(row);
//}
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

        jLabel1bha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ssbha = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1h = new javax.swing.JTable();
        bookhButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        priceInputField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 35, 39));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1bha.setText("Request funds from NGO");
        jLabel1bha.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1bha.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel1bha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel2.setText("Amount Required");
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabel4.setText("Select Service");
        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 111, -1));

        ssbha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ssbhaItemStateChanged(evt);
            }
        });
        add(ssbha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, -1));

        jTable1h.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Service", "Address", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1h);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 545, 132));

        bookhButton.setText("Request funds");
        bookhButton.setBackground(new java.awt.Color(0, 102, 204));
        bookhButton.setBorderPainted(false);
        bookhButton.setForeground(new java.awt.Color(255, 255, 255));
        bookhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookhButtonActionPerformed(evt);
            }
        });
        add(bookhButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 130, 40));

        backButton.setText("<< BACK");
        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setBorderPainted(false);
        backButton.setForeground(new java.awt.Color(0, 102, 204));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));
        add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        priceInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceInputFieldActionPerformed(evt);
            }
        });
        add(priceInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 130, 40));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bookhButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookhButtonActionPerformed
        // TODO add your handling code here:
       /*  if(EDText.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null,"Please enter the number of days of service", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }*/
       
       LocalDate dt = LocalDate.from(ZonedDateTime.now());
       if (datePicker1.getDate() == null || dt.compareTo(datePicker1.getDate()) > 0 )
         {
             JOptionPane.showMessageDialog(null,"Please pick valid date", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
         }
       
            double priceGiven = Double.parseDouble(priceInputField.getText());
            
            
       
       
//            double price = Double.parseDouble(priceText.getText());
            String prof = ssbha.getSelectedItem().toString();
        Person person = ecoSystem.getPersonDirectory().getPerson(account.getEmployee().getName());
        String add = person.getAddress();
        String pname = person.getName();
        LocalDate date = datePicker1.getDate();
       // NGO price = ecoSystem.getHelperDirectory().getHelper();
       // LocalTime time = dateTimePicker1.getTimePicker().getTime();
        String status = "Funds Requested";
        HelperWorkRequest hreq = new HelperWorkRequest();
        //hreq.setPrice();
        hreq.setPname(pname);
        hreq.setAdd(add);
        hreq.setProf(prof);
        hreq.setPrice(priceGiven);
        hreq.setDate(date);
        hreq.setHstatus(status);
        
         account.getWorkQueue().getWorkRequestList().add(hreq);
        ecoSystem.getWorkQueue().getWorkRequestList().add(hreq);
        
         JOptionPane.showMessageDialog(null,"You have successfully requested Funding. Please wait for the NGO to accept");
        populateRequestTable();
    }//GEN-LAST:event_bookhButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FoundationPortal a = (FoundationPortal) component;
        //a.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void ssbhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ssbhaItemStateChanged
        // TODO add your handling code here:
        populatePrice();
    }//GEN-LAST:event_ssbhaItemStateChanged

    private void priceInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceInputFieldActionPerformed
    public void populatePrice(){
        try{
            String helper = ssbha.getSelectedItem().toString();
            for(NGO hlp : ecoSystem.getHelperDirectory().getHelperDirectory()) {
                if(helper.equalsIgnoreCase(hlp.getProfession())){
            System.out.println("helper" + hlp);
                }
    }}catch(Exception e){}
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookhButton;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1bha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1h;
    private javax.swing.JTextField priceInputField;
    private javax.swing.JComboBox<String> ssbha;
    // End of variables declaration//GEN-END:variables
}