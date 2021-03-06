/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import GlobalEcoSystem.Doctor.DoctorDirectory;
import GlobalEcoSystem.Driver.DriverDirectory;
import GlobalEcoSystem.EcoSystem;
import GlobalEcoSystem.Enterprise.Enterprise;
import GlobalEcoSystem.Grocer.GrocerDirectory;
import GlobalEcoSystem.Helper.HelperDirectory;
import GlobalEcoSystem.Network.Network;
import GlobalEcoSystem.Nurse.NurseDirectory;
import GlobalEcoSystem.Org.Org;

import GlobalEcoSystem.Person.PersonDirectory;
import GlobalEcoSystem.Pharmacy.PharmacyDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class SystemAdminPortal extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminPortal
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    GrocerDirectory grocerDirectory;
    PharmacyDirectory pharmacyDirectory;
    DoctorDirectory doctorDirectory;
    HelperDirectory helperDirectory;
    NurseDirectory nurseDirectory;
    PersonDirectory personDirectory;
    DriverDirectory driverDirectory;
    public SystemAdminPortal(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecoSystem;
        populateTree();
    }
    
    public void populateTree(){
DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Org> organizationList;
        
        Network network;
        Enterprise enterprise;
        Org organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnManagejNetwork = new javax.swing.JButton();
        btnManagejEnterprise = new javax.swing.JButton();
        btnManagejAllServices = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(226, 240, 255));

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 678, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        jPanel2.setBackground(new java.awt.Color(36, 35, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManagejNetwork.setBackground(new java.awt.Color(0, 51, 204));
        btnManagejNetwork.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManagejNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnManagejNetwork.setText("Manage Network");
        btnManagejNetwork.setBorderPainted(false);
        btnManagejNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagejNetworkActionPerformed(evt);
            }
        });
        jPanel2.add(btnManagejNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 220, 60));

        btnManagejEnterprise.setBackground(new java.awt.Color(0, 51, 204));
        btnManagejEnterprise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManagejEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnManagejEnterprise.setText("Manage Enterprise");
        btnManagejEnterprise.setBorderPainted(false);
        btnManagejEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagejEnterpriseActionPerformed(evt);
            }
        });
        jPanel2.add(btnManagejEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 220, 60));

        btnManagejAllServices.setBackground(new java.awt.Color(255, 255, 255));
        btnManagejAllServices.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManagejAllServices.setForeground(new java.awt.Color(0, 0, 0));
        btnManagejAllServices.setText("Manage All Services");
        btnManagejAllServices.setBorderPainted(false);
        btnManagejAllServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagejAllServicesActionPerformed(evt);
            }
        });
        jPanel2.add(btnManagejAllServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 220, 60));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 870, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
//        //DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
//        if(selectedNode!=null){
//            lblSelectedNode.setText(selectedNode.toString());
//        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnManagejNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagejNetworkActionPerformed
        // TODO add your handling code here:
         ManageNetworkJPanel mngNetPanel = new ManageNetworkJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageNetworkJPanel",mngNetPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagejNetworkActionPerformed

    private void btnManagejEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagejEnterpriseActionPerformed
        // TODO add your handling code here:
         ManageEnterpriseJPanel mngEntPanel = new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageEnterpriseJPanel",mngEntPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagejEnterpriseActionPerformed

    private void btnManagejAllServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagejAllServicesActionPerformed
        // TODO add your handling code here:
         ManageAllServicesJPanel mngServPanel = new ManageAllServicesJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageAllServicesJPanel",mngServPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagejAllServicesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManagejAllServices;
    private javax.swing.JButton btnManagejEnterprise;
    private javax.swing.JButton btnManagejNetwork;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    // End of variables declaration//GEN-END:variables
}
