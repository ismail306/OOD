/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitor;

/**
 *
 * @author khan
 */
public class BonusFactory {
    public IBonus getAdmin( String AdminType,String ID,int Salary){
        
        if(AdminType== null)
            return null;
        
        if("Admin1".equals(AdminType)){
            return new Admin1("19135391",150000) ;
        }
        if("Admin2".equals(AdminType)){
            return new Admin2("19135427",100000) ;
        }
        return null;
    }
}
