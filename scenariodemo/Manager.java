
package scenariodemo;


public class Manager extends Employee implements IBonus , IContact {
    Manager (int s){
        super (s); 
    }
    @Override
    public void get_bonus(){
        System.out.println("Bonus is: "+salary*0.1);
    }
    @Override
    public void can_contact(){
System.out.println("Contact With Customer");

}
     public void can_contact(Boolean complan){
         if(complan ==true)
System.out.println("Contact With Customer");

}
    @Override
    void Calculate_helth_indhurance(){
        
        
        System.out.printf("Helth Inshurance : "+salary*0.08);
        
    }
    
}
