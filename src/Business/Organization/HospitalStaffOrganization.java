/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.HospitalStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class HospitalStaffOrganization extends Organization{
     public HospitalStaffOrganization(String staffName) {
        super(Organization.Type.HospitalStaffOrganization.getValue(), staffName);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalStaffRole());
        return roles;
    }
}
