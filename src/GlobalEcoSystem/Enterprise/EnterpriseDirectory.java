/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalEcoSystem.Enterprise;

import java.util.ArrayList;


public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   
     public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.SupportServices){
            enterprise=new SupportServicesEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if (type==Enterprise.EnterpriseType.Transport){
            enterprise= new TransportEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type==Enterprise.EnterpriseType.DeliveryServices){
            enterprise=new DeliveryServicesEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type==Enterprise.EnterpriseType.HealthCare){    
            enterprise=new WelfareEnterprise(name);
            enterpriseList.add(enterprise);
           
        }
        return enterprise;
    }
    
    
}
