
package hospitor;


public class SeniorDoctor extends Doctor {
    String phone= "018xxxxxxxxx";
    SeniorDoctor(String ID,int salary){
        super(ID,salary);
    }
    SeniorDoctor(String Dis){
        super(Dis);
    }
    
    @Override
    void CalculateAnnualBonus(){
        
        System.out.println("Senior Doctor Annual Bonus : "+Salary*12*0.10);   
       }
    
   
    
}
