/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoundationRole;

import GlobalEcoSystem.DeliveryMan.DeliveryManDirectory;
import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Grocer.Grocer;
import GlobalEcoSystem.Grocer.GrocerDirectory;
import GlobalEcoSystem.GroceryMenu.GMenu;
import GlobalEcoSystem.GroceryMenu.GMenuDirectory;
import GlobalEcoSystem.GroceryOrder.GOrder;
import GlobalEcoSystem.GroceryOrder.GOrderDirectory;
import GlobalEcoSystem.Person.Person;
import GlobalEcoSystem.Person.PersonDirectory;

import GlobalEcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class SupplyManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplyManagementJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount account;
    private PersonDirectory personDirectory;
    private GrocerDirectory grocerDirectory;
   
    private DeliveryManDirectory deliveryManDirectory;
    private GMenuDirectory gmenuDirectory;
    private GOrderDirectory gorderDirectory;
    private static int count = 1;
    public SupplyManagementJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem,
                                  PersonDirectory personDirectory, GrocerDirectory grocerDirectory,
                                  DeliveryManDirectory deliveryManDirectory, GMenuDirectory gmenuDirectory, GOrderDirectory gorderDirectory) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.personDirectory = ecoSystem.getPersonDirectory();
        this.grocerDirectory = ecoSystem.getGrocerDirectory();
        this.gmenuDirectory = ecoSystem.getgMenuDirectory();
        this.deliveryManDirectory = ecoSystem.getDeliverymanDirectory();
        this.gorderDirectory = ecoSystem.getgOrderDirectory();
        //valueLabel.setText(account.getUsername());
        //populateRequestTable();
        populateRestaurantCombo();
        //valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestTable.getModel();
        model.setRowCount(0);
       //SimpleDateFormat strDate = new SimpleDateFormat("MM/dd/yyyy");
       System.out.println("ecoSystem" + this.ecoSystem);
        for (GOrder order : this.ecoSystem.getgOrderDirectory().getOrderDirectory()){
            System.out.println("Order" + order.getOrderId());
            if(account.getEmployee().getName().equals(order.getPerson().getName())) {
                Object[] row = new Object[7];
                row[0] = order;
                row[1] = order.getMenu().getItemName();
                row[2] = order.getQuantity() * order.getMenu().getPrice();
                row[3] = order.getGrocer().getGrocerName();
                row[4] = order.getPerson().getName();
                row[5] = order.getOrderStatus();
                row[6] = order.getQuantity();
              //  row[7] = order.getTime().toString();
                model.addRow(row);
    }
        }
    }
    
      public void populateRestaurantCombo() {
        selectrComboBox.removeAllItems();
        selectrComboBox.addItem("  ");
        for(Grocer res : ecoSystem.getGrocerDirectory().getGrocerDirectory()) {
            System.out.println("res" + res);
            selectrComboBox.addItem(res.getGrocerName());
        }
    }
      
       public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jtable112.getModel();
        dtm.setRowCount(0);
        String grocername = selectrComboBox.getSelectedItem().toString();
        Grocer grocer = ecoSystem.getGrocerDirectory().getGrocer(grocername);
        for(GMenu gmenu : ecoSystem.getgMenuDirectory().getGmenuDirectory()){
            if(grocer.getGrocerName().equals(gmenu.getGrocerName())) {
                Object [] row = new Object[2];
                row[0] = gmenu;
                row[1] = gmenu.getPrice();
                dtm.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        QuantText = new javax.swing.JTextField();
        tpporder = new javax.swing.JButton();
        enterpriseLabel2 = new javax.swing.JLabel();
        jLabel1order = new javax.swing.JLabel();
        selectrComboBox = new javax.swing.JComboBox<>();
        MenutButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable112 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestTable = new javax.swing.JTable();
        BackjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 35, 39));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 110, -1));
        add(QuantText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 89, -1));

        tpporder.setBackground(new java.awt.Color(0, 102, 204));
        tpporder.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        tpporder.setForeground(new java.awt.Color(255, 255, 255));
        tpporder.setText("Place Order");
        tpporder.setBorderPainted(false);
        tpporder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpporderActionPerformed(evt);
            }
        });
        add(tpporder, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        enterpriseLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        enterpriseLabel2.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel2.setText("Order details:");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 150, 30));

        jLabel1order.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1order.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1order.setText("Order Supplies");
        add(jLabel1order, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        selectrComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select supplier" }));
        selectrComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectrComboBoxActionPerformed(evt);
            }
        });
        add(selectrComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 130, -1));

        MenutButton.setBackground(new java.awt.Color(0, 102, 204));
        MenutButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        MenutButton.setForeground(new java.awt.Color(255, 255, 255));
        MenutButton.setText("Display Menu");
        MenutButton.setBorderPainted(false);
        MenutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenutButtonActionPerformed(evt);
            }
        });
        add(MenutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jtable112.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Items", "Price"
            }
        ));
        jScrollPane2.setViewportView(jtable112);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 218, 90));

        workRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "ItemName", "Price", "Store", "Customer", "Status", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 780, 130));

        BackjButton.setBackground(new java.awt.Color(255, 255, 255));
        BackjButton.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        BackjButton.setForeground(new java.awt.Color(0, 102, 204));
        BackjButton.setText("<< BACK");
        BackjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackjButtonActionPerformed(evt);
            }
        });
        add(BackjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Supplier");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void selectrComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectrComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectrComboBoxActionPerformed

    private void MenutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenutButtonActionPerformed
        // TODO add your handling code here:
         if(selectrComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a restaurant");
            return;
        }
        populateTable();

    }//GEN-LAST:event_MenutButtonActionPerformed

    private void BackjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackjButtonActionPerformed
        // TODO add your handling code here:
           userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FoundationPortal a = (FoundationPortal) component;
        //a.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackjButtonActionPerformed

    private void tpporderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpporderActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtable112.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(QuantText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Please enter quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int quantity = Integer.parseInt(QuantText.getText());
        String grocerName = selectrComboBox.getSelectedItem().toString();
        Grocer grocer = ecoSystem.getGrocerDirectory().getGrocer(grocerName);
        Person person = ecoSystem.getPersonDirectory().getPerson(account.getEmployee().getName());
        GMenu menu = (GMenu) jtable112.getValueAt(selectedRow, 0);
        String status = "Order Placed";
        int min = 100;  
        int max = 1000; 
        int orderIdGen = (int)(Math.random()*(max-min+1)+min);
        GOrder order = ecoSystem.getgOrderDirectory().newOrder();
        order.setPerson(person);
        order.setOrderId(String.valueOf(orderIdGen));
        order.setQuantity(quantity);
        order.setMenu(menu);
        order.setGrocer(grocer);
        order.setOrderStatus(status);
        order.setAllot(false);
        
        JOptionPane.showMessageDialog(null,"You have placed an order");
        populateRequestTable();
    }//GEN-LAST:event_tpporderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackjButton;
    private javax.swing.JButton MenutButton;
    private javax.swing.JTextField QuantText;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel jLabel1order;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtable112;
    private javax.swing.JComboBox<String> selectrComboBox;
    private javax.swing.JButton tpporder;
    private javax.swing.JTable workRequestTable;
    // End of variables declaration//GEN-END:variables
}
