
package hospitor;
public class Main {
    public static void main(String [] args){
     
    Admin ad =new Admin();
    ad.setFee(1000);
        System.out.println("Senior Doctor fee :"+ad.getfee());
    ad.setFee(500);
        System.out.println("Intern Doctor fee : "+ad.getfee());
        
     
     
     ENT_patient entP = new ENT_patient("Ismail Hosain","Saver","ENT","TonTonsil Pain","01929074663","ISMAIL427","Entern Doctor","Need Ambulance","AC") ;
     entP.DisplayPatientInfo();
     entP.DilplayTRX_Address();
     entP.makePayment();
     
     
     Admin1 ad1 = new Admin1("19135391",150000);
     ad1.VerifyTrancsection(entP);
     
     
     CovidPatient CP =new CovidPatient ("Sajid","Abdullahpur","Covid","COvid Symptom","01644944967","SAJID407","Senior Doctor","Need Ambulance","Non AC");
     CP.DisplayPatientInfo();
     CP.DilplayTRX_Address();
     CP.makePayment();
    
       Admin2 ad2 = new Admin2("19135427",100000);
       ad2.VerifyTrancsection(CP);
             
      SeniorDoctor sd=new SeniorDoctor("S35870",200000);
      sd.CalculateSalary("YES");
      sd.CalculateSalary();
      sd.CalculateSalary(6);
      sd.CalculateAnnualBonus();
      InternDoctor ID=new InternDoctor("J35111",50000);
      ID.CalculateSalary("YES");
      ID.CalculateSalary();
      ID.CalculateSalary(10);
      ID.CalculateAnnualBonus();
      ad1.CalculateBoishakhBonus();
      ad2.CalculateBoishakhBonus();
    } 
}
