/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private int enterpId;

    public int getEnterpId() {
        return enterpId;
    }

    public void setEnterpId(int enterpId) {
        this.enterpId = enterpId;
    }

   
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Laboratory("Laboratory"),
        Pharmacy("Pharmacy"), 
        VaccineProvider("VaccineProvider");  
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(EnterpriseType type, String name){
        super(type.toString(), name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
}
