/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Hospital;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TestPatient;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nishigandha
 */
public class ManagePatientsLeaveJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientsDischargeJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;

    public ManagePatientsLeaveJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization,
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.city = city;
        this.organization = organization;
        populateTestingCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDisplayTable1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        lblManagePatient = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        lblPName1 = new javax.swing.JLabel();
        txtPatientNameH1 = new javax.swing.JTextField();
        lblLabH1 = new javax.swing.JLabel();
        comboLabsH1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblAddPat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDisplayTable1.setBackground(new java.awt.Color(0, 0, 0));
        btnDisplayTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDisplayTable1.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayTable1.setText("Display Patients List");
        btnDisplayTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayTable1ActionPerformed(evt);
            }
        });
        add(btnDisplayTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        tblPatients.setBackground(new java.awt.Color(214, 229, 244));
        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 790, 183));

        lblManagePatient.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblManagePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManagePatient.setText("PATIENT TEST BEFORE DISCHARGE");
        add(lblManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1288, -1));

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, -1, -1));

        lblPName1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPName1.setText("Patient Name:");
        add(lblPName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        txtPatientNameH1.setBackground(new java.awt.Color(214, 229, 244));
        add(txtPatientNameH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 220, -1));

        lblLabH1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblLabH1.setText("Assign Laboratory:");
        add(lblLabH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, -1, -1));

        comboLabsH1.setBackground(new java.awt.Color(214, 229, 244));
        comboLabsH1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboLabsH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 220, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Schedule Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, -1, -1));

        lblAddPat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons-male-user.png"))); // NOI18N
        add(lblAddPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/6.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void populateTestingCombo() {
        comboLabsH1.removeAllItems();
        for (City ecity : system.getCityList()) {
            for (Enterprise e : ecity.getEnterpriseDirectory().getEnterpriseArrayList()) {
                if (e.getEnterpriseType().toString().equals("Laboratory")) {
                    comboLabsH1.addItem(e.getName());
                }
            }

        }

    }

    private void btnDisplayTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayTable1ActionPerformed
        // TODO add your handling code here:
        populatePatientTable();
    }//GEN-LAST:event_btnDisplayTable1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
            String patient = (String) dtm.getValueAt(selectedRow, 0);
//            System.out.print(patient);
            txtPatientNameH1.setText(patient);
        }
//    
    }//GEN-LAST:event_btnViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Row");
        } else {

            DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
            String patientName = (String) dtm.getValueAt(selectedRow, 0);
            int patientID = (int) dtm.getValueAt(selectedRow, 1);
//            System.out.println(patientName);
//            System.out.println(patientID);
            String receiver = comboLabsH1.getSelectedItem().toString();
            String status = "Null";
//            System.out.println(receiver);


            for (City city : system.getCityList()) {
                for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseArrayList()) {
                    if(e.getName().equals(receiver)){
                          System.out.println(e.getName());
                          UserAccount account = e.getUserAccountDirectory().getUserAccountList().get(0);
                          TestPatient testingPatient = e.getWorkQueue().addWorkRequestList3(patientName, userAccount, account, status);
                          testingPatient.setPatientID(patientID);
                          testingPatient.setPatientName(patientName);
                          JOptionPane.showMessageDialog(this, "Test Scheduled");
                         
                    }
                    

                }
            }
            

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayTable1;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboLabsH1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddPat;
    private javax.swing.JLabel lblLabH1;
    private javax.swing.JLabel lblManagePatient;
    private javax.swing.JLabel lblPName1;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtPatientNameH1;
    // End of variables declaration//GEN-END:variables

    private void populatePatientTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
        dtm.setRowCount(0);
        Hospital hospitalEnterprise = (Hospital) enterprise;
        String doctorName = userAccount.getEmployee().getEmpName();
//                 System.out.println(doctorName);

        for (Patient p : hospitalEnterprise.getPatientDirectory().getPatientDir()) {
            if (p.getDoctorName().equals(doctorName)) {
                Object[] row = new Object[2];
                row[0] = p.getPersonName();
                row[1] = p.getPatientId();
                dtm.addRow(row);
            }

        }
    }
    //  }                
    //} 
}
