
package hospitor;

public class ENT_patient extends Patients {
     //Encapsulation implements
   private String Address; //Private use only same class
    
    ENT_patient(String EPname,String Address,String department,String EPdisease,String EPphone,String EPTrxID,String DocType,String Ambulance,String AmbulanceTp){
        super(EPname,department, EPdisease, EPphone, EPTrxID,DocType,Ambulance,AmbulanceTp);
        this.Address=Address;
        
    }
    
     //Encapsulation implements(Default)
    @Override
   void  DilplayTRX_Address(){
     System.out.println("Patient Transection ID : "+TrxID);
     System.out.println("Patient Address : "+Address);
     
       
   }

   
    
}
