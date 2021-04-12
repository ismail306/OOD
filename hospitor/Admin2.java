
package hospitor;


public class Admin2 extends Admin{ 
    //Encapsulation
    protected String CovidtrxID="SAJID407";
        Admin2(String id,int Salary){

super(id,Salary);

}
     void VerifyTrancsection(CovidPatient CP) {
         if(this.CovidtrxID==CP.TrxID ){
        System.out.println("We Have Received Your Payment");
         //if(CP.AmbuLance=="Need Ambulance" && CP.AmbulanceType=="Non AC") {
             NonAC_Ambulance naca=new NonAC_Ambulance("NON AC Ambulance","017-XXXXXXXX");
             naca.Ambulance_Status();
             naca.Display_AmbulanceInfo();
             naca.AmbulanceLoation("Uttara");

            
           //}
          //if(CP.department=="Covid"){
               Covid cv =new Covid(CP.department,05,"4.00 PM",CP.DocType,CP.disease);
               cv.ShowVisitingTime();
               cv.Checksit();
               cv.CheckDocType();
          // }
          
}
     
  else
        {
                System.out.println("PLease Pay First");
                
                }   
}
     
}