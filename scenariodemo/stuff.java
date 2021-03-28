
package scenariodemo;


public class stuff extends Employee implements IBonus {
    stuff (int s){
        super (s); 
    }
    public void get_bonus(){
        System.out.println("Bonus is: "+salary*0.05);
    } 
    
}
