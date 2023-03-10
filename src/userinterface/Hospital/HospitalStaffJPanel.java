/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Nishigandha
 */
public class HospitalStaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalStaffJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public HospitalStaffJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMVitalSign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMVitalSign.setBackground(new java.awt.Color(0, 0, 0));
        btnMVitalSign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMVitalSign.setForeground(new java.awt.Color(255, 255, 255));
        btnMVitalSign.setText("Manage Vital Signs");
        btnMVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMVitalSignActionPerformed(evt);
            }
        });
        add(btnMVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 230, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STAFF MEMBER PANEL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 70, 630, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/icons-nurse.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/4.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMVitalSignActionPerformed
        // TODO add your handling code here:
        ManageVitalSignsReportJPanel manageVitalSignsJPanel = new ManageVitalSignsReportJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("manageTestCenterJPanel", manageVitalSignsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMVitalSignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMVitalSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
