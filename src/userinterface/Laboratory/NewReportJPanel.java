/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Laboratory;

import Business.EcoSystem;
import Business.Person.Person;
import Business.LabReport.LabReport;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nishigandha
 */
public class NewReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewReportJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public NewReportJPanel(EcoSystem system, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
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
        lblTitle = new javax.swing.JLabel();
        lblReport = new javax.swing.JLabel();
        txtNameT = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonT = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtIdT = new javax.swing.JTextField();
        txtSearchT = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        comboStatusT = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, -1, -1));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("NEW TEST REPORT MANAGER");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 740, -1));

        lblReport.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblReport.setText("Report:");
        add(lblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));

        txtNameT.setBackground(new java.awt.Color(214, 229, 244));
        txtNameT.setEnabled(false);
        add(txtNameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 212, -1));

        lblID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblID.setText("ID:");
        add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        tblPersonT.setBackground(new java.awt.Color(214, 229, 244));
        tblPersonT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Age", "Address", "Zipcode", "Phone No", "Community"
            }
        ));
        jScrollPane1.setViewportView(tblPersonT);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 720, 183));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, -1));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, -1, -1));

        txtIdT.setBackground(new java.awt.Color(214, 229, 244));
        txtIdT.setEnabled(false);
        add(txtIdT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 212, -1));

        txtSearchT.setBackground(new java.awt.Color(214, 229, 244));
        add(txtSearchT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 220, -1));

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSearch.setText("Person Name:");
        add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        comboStatusT.setBackground(new java.awt.Color(214, 229, 244));
        comboStatusT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detected", "Non-detected" }));
        add(comboStatusT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 210, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons-covid-test.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/5.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = txtSearchT.getText();
        
        DefaultTableModel dtm = (DefaultTableModel) tblPersonT.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[7];
        boolean flag = false;
        for(Person person: system.getPersonDirectory().getPersonList()){
//            System.out.println(person);
            if((search).equals(person.getPersonName())){
                row[0] = person;
                row[1] = person.getPersonID();
                row[2] = person.getAge();
                row[3] = person.getAdress();
                row[4] = person.getZipcode();
                row[5] = person.getPhoneNo();
                row[6] = person.getCommunityName();
                dtm.addRow(row);
                flag = true;
                
                txtIdT.setText(String.valueOf(person.getPersonID()));
                txtNameT.setText(person.getPersonName());
            
            
        }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null, "Person  not Found", "Warning", JOptionPane.WARNING_MESSAGE);
            txtIdT.setText("");
            txtNameT.setText("");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //String personID = txtID.getText();
        //String personName = txtName.getText();
//        String date = txtDate.getText();
//        System.out.println(date);
        Boolean result = false;
        if(comboStatusT.getSelectedItem().toString().equals("Detected")){
            result = true;
        }
        else{
             result = false;
        }
        for(Person person: system.getPersonDirectory().getPersonList()){
            if(txtSearchT.getText().equals(person.getPersonName())){
                person.getTestHistory().newTestReport(result);
                JOptionPane.showMessageDialog(this, "Report Created");
                
//                System.out.println(date);
                
//                System.out.println( person.getTestHistory().getTestReportList().get(0));
            }
        }
        
        
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TestingLabAdminJPanel sysAdminwjp = (TestingLabAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboStatusT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPersonT;
    private javax.swing.JTextField txtIdT;
    private javax.swing.JTextField txtNameT;
    private javax.swing.JTextField txtSearchT;
    // End of variables declaration//GEN-END:variables
}
