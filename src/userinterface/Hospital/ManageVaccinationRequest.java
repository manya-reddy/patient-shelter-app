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
import Business.WorkQueue.Order;
import Business.WorkQueue.VaccinatePatient;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nishigandha
 */
public class ManageVaccinationRequest extends javax.swing.JPanel {

    /**
     * Creates new form PlaceVaccinationRequest
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public ManageVaccinationRequest(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
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

        lblPharm = new javax.swing.JLabel();
        cmbPharm = new javax.swing.JComboBox<>();
        btnSendRequestPharm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPharm.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPharm.setText("Select Pharmacy:");
        add(lblPharm, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 121, 32));

        cmbPharm.setBackground(new java.awt.Color(214, 229, 244));
        cmbPharm.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbPharm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbPharm, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 170, 30));

        btnSendRequestPharm.setBackground(new java.awt.Color(0, 0, 0));
        btnSendRequestPharm.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSendRequestPharm.setForeground(new java.awt.Color(255, 255, 255));
        btnSendRequestPharm.setText("Send Request");
        btnSendRequestPharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestPharmActionPerformed(evt);
            }
        });
        add(btnSendRequestPharm, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SEND VACCINE REQUEST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 1000, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons-vaccine.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestPharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestPharmActionPerformed
     //   String vaccineName;
    //int qty;
    try{
    String message = "Please Vaccinate";
    String status = "Active";
    
    //vaccineName = txtVaccineName.getText();
    //qty = Integer.parseInt(txtQty.getText());
    ArrayList<Patient> pd = new ArrayList<>();
    Hospital hospital = (Hospital)enterprise;
    for(Patient p : hospital.getPatientDirectory().getPatientDir()){
        if(!p.getVacStatus().equals("Fully Vaccinated")){
            pd.add(p);
        }
    }
    String VaccineCenterName = (String) cmbPharm.getSelectedItem();
    for(City city : system.getCityList()){
        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseArrayList()) {
            if((e.getName()).equals(VaccineCenterName)){
                UserAccount receiver = e.getUserAccountDirectory().getUserAccountList().get(0);
                VaccinatePatient vp = e.getWorkQueue().addWorkRequestList2(message, userAccount, receiver, status);
                vp.setNonVaccPatientList(pd);
                //System.out.println(e.getWorkQueue().getWorkRequestList().get(0));
            }
            
        }
        }
    JOptionPane.showMessageDialog(this,"Request sent");
    }
catch(Exception e){
        JOptionPane.showMessageDialog(this,"Vaccination request cannot be sent");// TODO add your handling code here:
}
    }//GEN-LAST:event_btnSendRequestPharmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendRequestPharm;
    private javax.swing.JComboBox<String> cmbPharm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPharm;
    // End of variables declaration//GEN-END:variables
private void populateComboBox() {
        cmbPharm.removeAllItems();
        for(City city : system.getCityList()){
        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseArrayList()) {
            //System.out.println(e.getClass().getName());
            if((e.getClass().getName()).equals("Business.Enterprise.Pharmacy"))
            cmbPharm.addItem(e.getName());
        } //To change body of generated methods, choose Tools | Templates.
    }
    }


}

