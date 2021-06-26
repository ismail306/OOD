package hospitor;
import java.util.*; 
public class Main {
    public static void main(String [] args){
     
    String TrxID,Name,Phone,Symptom;
    Scanner input= new Scanner(System.in); 
    
    
    Admin ad =new Admin();
    ad.setFee(1000);
        System.out.println("Senior Doctor fee :"+ad.getfee());
    ad.setFee(500);
        System.out.println("Intern Doctor fee : "+ad.getfee());
        
     
    
    
    System.out.print("Please Enter your Name : ");
    Name= input.nextLine(); 
    System.out.print("Enter your Phone No : ");
    Phone= input.nextLine(); 
    System.out.print("Enter your Transection ID : ");
    TrxID= input.nextLine(); 
    System.out.print("Enter your Symptom : ");
    Symptom= input.nextLine();
     ENT_patient entP = new ENT_patient(Name,"Saver","ENT",Symptom,Phone,TrxID);
     entP.DisplayPatientInfo();
     entP.DilplayTRX_Address();
     
     
     
     Admin1 ad1 = new Admin1();
     ad1.VerifyTrancsection(entP);
      System.out.print("Please Enter your Name : ");
    Name= input.nextLine(); 
    System.out.print("Enter your Phone No : ");
    Phone= input.nextLine(); 
    System.out.print("Enter your Transection ID : ");
    TrxID= input.nextLine(); 
    System.out.print("Enter your Symptom : ");
    Symptom= input.nextLine();
     CovidPatient CP =new CovidPatient (Name,"Abdullahpur","Covid",Symptom,Phone,TrxID);
     CP.DisplayPatientInfo();
     CP.DilplayTRX_Address();
     
    
       Admin2 ad2 = new Admin2();
       ad2.VerifyTrancsection(CP);
       
     
     BonusFactory bonusfactory = new BonusFactory();
         
     IBonus bonus1= bonusfactory.getAdmin("Admin1","19135391",150000);     
     bonus1.CalculateBoishakhBonus();
      
     IBonus bonus2= bonusfactory.getAdmin("Admin2","19135427",100000);     
     bonus2.CalculateBoishakhBonus();
             
  
    } 
}
