package hospitor;
import java.util.*;  

class Admin1 extends Admin implements IBonus {
    
       //Encapsulation
String time;
int serialno;


   Admin1(String ID,int Salary){
       super(ID,Salary);
       
       
   }
   
     @Override
    public void CalculateBoishakhBonus(){
        
       System.out.println("Admin Boishakh Bonus is "+Salary*0.50);  
    }
    
   
   //Encapsulation Implements
    protected void VerifyTrancsection(ENT_patient entp) {
        
        if("ISMAIL427".equals(entp.TrxID)){
            
             System.out.println("We Have Received Your Payment");
           Scanner input= new Scanner(System.in); 
     System.out.print("Enter Patient Visiting Time : ");
     time= input.nextLine();
     System.out.print("Enter Patient  Serial NO : ");
      serialno= input.nextInt(); 
               ENT en =new ENT(entp.department,serialno,time,entp.disease);
               en.ShowVisitingTime();
               en.waitingtime();
               
          
        }
         else
        {
                System.out.println("PLease Pay First");
                
                }
            
    }
  Admin1(){
      
  }
     
 }   

