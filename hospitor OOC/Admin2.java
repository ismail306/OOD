
package hospitor;
import java.util.*; 

public class Admin2 extends Admin implements IBonus { 
    
    String time;
    
int serialno;
   
        Admin2(String id,int Salary){

super(id,Salary);

}
          @Override
    public void CalculateBoishakhBonus(){
        
       System.out.println("Admin Boishakh Bonus is "+Salary*0.50);  
    }
    
     void VerifyTrancsection(CovidPatient CP) {
         if("SAJID407".equals(CP.TrxID) ){
        System.out.println("We Have Received Your Payment");
       Scanner input= new Scanner(System.in); 
     System.out.print("Enter Patient Visiting Time : ");
     time= input.nextLine();
     System.out.print("Enter Patient  Serial NO : ");
      serialno= input.nextInt(); 
               Covid cv =new Covid(CP.department,serialno,time,CP.disease);
               cv.ShowVisitingTime();
               cv.Checksit();
               
          
          
}
     
  else
        {
                System.out.println("PLease Pay First");
                
                }   
}
   
     
    Admin2(){
      
  } 
     
}