/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class HospitalOrganization extends Organization {
    public HospitalOrganization(String hospName) {
        super(Type.HospitalOrganization.getValue(), hospName);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalRole());
        return roles;
    }
}
