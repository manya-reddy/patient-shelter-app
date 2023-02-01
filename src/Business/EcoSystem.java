/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.City.City;
import Business.Person.PersonDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Organization.Organization;
/**
 *
 * @author Nishigandha
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<City> cityArrayList;
    private PersonDirectory personDirectory;

    public EcoSystem(PersonDirectory personDirectory) {

        this.personDirectory = personDirectory;
    }
    
    public City createCity(){
        City city = new City();
        cityArrayList.add(city);
        
        return city;
    }
    
    public PersonDirectory getPersonDirectory(){
        if(personDirectory==null){
            personDirectory = new PersonDirectory();
        }
        return personDirectory;
    }
    
    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null,null);
        cityArrayList = new ArrayList<City>();
    }

    public ArrayList<City> getCityList() {
        return cityArrayList;
    }

    public void setCityList(ArrayList<City> cityArrayList) {
        this.cityArrayList = cityArrayList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
       //
       if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
           return false;
       }
       return true;
    }
}
