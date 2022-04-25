/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Org;

import java.util.ArrayList;
import GlobalEcoSystem.Org.Org.Type;


public class OrganizationDirectory {
    
      private ArrayList<Org> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Org> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Org> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Org createOrganization(Type type){
        Org organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new HealthCareOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Person.getValue())){
            organization=new PopulationOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Type.Nursing.getValue())){
            organization=new AidOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization=new PharmacyOrganization();
            organizationList.add(organization);
        } 
        
        else if (type.getValue().equals(Type.Grocery.getValue())){
            organization=new SupplyOrganisation();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Driver.getValue())){
            organization=new TransportationOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Helper.getValue())){
            organization=new SupportServicesOrganization();
            organizationList.add(organization);
        }
            else if (type.getValue().equals(Type.DeliveryMan.getValue())){
            organization = new LogisticsOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
