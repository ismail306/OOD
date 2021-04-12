package hospitor;


class Admin1 extends Admin {
    
       //Encapsulation

    protected String ENTTrxID="ISMAIL427";

   Admin1(String ID,int Salary){
       super(ID,Salary);
       
       
   }
   //Encapsulation Implements
    protected void VerifyTrancsection(ENT_patient entp) {
        if(this.ENTTrxID==entp.TrxID){
             System.out.println("We Have Received Your Payment");
          // if(entp.AmbuLance=="Need Ambulance" && entp.AmbulanceType=="AC") {
             AC_Ambulance aca=new AC_Ambulance("AC Ambulance","019-XXXXXXXX");
             aca.Ambulance_Status();
             aca.Display_AmbulanceInfo();
             aca.AmbulanceLoation("Dhanmondy");
               
          // }
           //if(entp.department=="ENT"){
               ENT en =new ENT(entp.department,10,"3.15 PM",entp.DocType,entp.disease);
               en.ShowVisitingTime();
               en.waitingtime();
               en.CheckDocType();
           //}
        }
         else
        {
                System.out.println("PLease Pay First");
                
                }
            
    }
  
     
 }   

