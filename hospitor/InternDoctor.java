
package hospitor ;

public class InternDoctor extends Doctor{
    String Phone= "013xxxxxxxxx";
    InternDoctor(String ID,int salary){
        super(ID,salary);
    }
    InternDoctor(String pdis){
       super(pdis);
    }
    
 @Override
 void CalculateAnnualBonus(){
           System.out.println("Intern Doctor Annual Bonus : "+Salary*12*0.05);  
               
       }


    
}
