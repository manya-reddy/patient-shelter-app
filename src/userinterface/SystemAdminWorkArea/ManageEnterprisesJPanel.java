/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nishigandha
 */
public class ManageEnterprisesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTestCenterJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    EnterpriseDirectory enterprise;
    public ManageEnterprisesJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.system=system;
        this.enterprise=enterprise;
        populateTable();
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        lblManageTesting = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise1 = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblEnterpriseType = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox();
        cmbEnterpriseType = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Add Enterprise Details");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, -1, -1));

        lblManageTesting.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManageTesting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageTesting.setText("MANAGE ENTERPRISE DETAILS");
        add(lblManageTesting, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 970, -1));

        txtID.setBackground(new java.awt.Color(214, 229, 244));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 212, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, 10));

        txtName.setBackground(new java.awt.Color(214, 229, 244));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 212, 30));

        tblEnterprise1.setBackground(new java.awt.Color(214, 229, 244));
        tblEnterprise1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "EnterpriseID", "City", "Type"
            }
        ));
        jScrollPane1.setViewportView(tblEnterprise1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 1070, 183));

        lblID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblID.setText("ID:");
        add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        lblCity.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCity.setText("City:");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 30, 20));

        lblEnterpriseType.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEnterpriseType.setText("Enterprise Type:");
        add(lblEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, 20));

        cmbCity.setBackground(new java.awt.Color(214, 229, 244));
        cmbCity.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        cmbCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });
        add(cmbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 210, -1));

        cmbEnterpriseType.setBackground(new java.awt.Color(214, 229, 244));
        cmbEnterpriseType.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        cmbEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseTypeActionPerformed(evt);
            }
        });
        add(cmbEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 210, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons8-contact-us-48.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/5.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        City city = (City) cmbCity.getSelectedItem();
//         Employee e = new Employee();
//        
//        String id = txtID.getText();
 String idEnt = txtID.getText();

        boolean flag ;

        flag = idEnt.matches("^[0-9]+$");
 if (txtID.getText().isEmpty() || txtName.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Empty Fields cannot added", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(flag == false) {
            JOptionPane.showMessageDialog(null, "Enterprice Id cannot have String values");
            return;
        }
        

        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cmbEnterpriseType.getSelectedItem();
        String name = txtName.getText();
        int id = Integer.parseInt(txtID.getText());
        if(!city.getEnterpriseDirectory().checkIfIDIsUnique(id)){
            JOptionPane.showMessageDialog(null, String.format("Enterprise ID %s already exists!", id),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        else if (city == null || type == null || name == null ) {
            JOptionPane.showMessageDialog(null, "Invalid Input!"); 
            return;
        } 
        else{
            Enterprise enterprise = city.getEnterpriseDirectory().createAndAddEnterprise(name , type, id);

        }
       
//        System.out.print(city.getEnterpriseDirectory().checkIfEnterpriseNameIsUnique(name));
//        if (city.getEnterpriseDirectory().checkIfEnterpriseNameIsUnique(name) != true) {
//                JOptionPane.showMessageDialog(null, "Enterprise name exists");
//                    return;
//        }
//        else if(!enterprise.checkIfEnterpriseNameIsUnique(name)){
//            JOptionPane.showMessageDialog(null, String.format("Enterprise Name %s already exists!", name),"Warning",JOptionPane.ERROR_MESSAGE);
//        }
       
        //Enterprise enterprise = city.getEnterpriseDirectory().createAndAddEnterprise(name , type, id);

        populateTable();
        txtName.setText("");
        txtID.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmbEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEnterpriseTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
               sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox cmbCity;
    private javax.swing.JComboBox cmbEnterpriseType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblManageTesting;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblEnterprise1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise1.getModel();

        model.setRowCount(0);
        for (City cityList : system.getCityList()) {
            for (Enterprise enterpriseList : cityList.getEnterpriseDirectory().getEnterpriseArrayList()) {
                Object[] row = new Object[4];
                row[0] = enterpriseList;
                row[1] = enterpriseList.getEnterpId();
                row[2] = enterpriseList.getName();
                row[3] = enterpriseList.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }//To change body of generated methods, choose Tools | Templates.
    }

    private void populateComboBox() {
        cmbCity.removeAllItems();
        cmbEnterpriseType.removeAllItems();

        for (City city : system.getCityList()) {
            cmbCity.addItem(city);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cmbEnterpriseType.addItem(type);
        } 
    }
}
