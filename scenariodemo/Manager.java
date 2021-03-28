
package scenariodemo;


public class Manager extends Employee implements IBonus , IContact {
    Manager (int s){
        super (s); 
    }
    public void get_bonus(){
        System.out.println("Bonus is: "+salary*0.1);
    }
    public void get_product(){


}
    @Override
    void Calculate_helth_indhurance(){
        
        
        System.out.printf("Helth Inshurance : "+salary*0.08);
        
    }
    
}
