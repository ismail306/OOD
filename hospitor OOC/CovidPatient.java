
package hospitor;

public class CovidPatient extends Patients {
    //Encapsulation implements
  private String Address; //Private use only same class
   
    CovidPatient(String Cname,String Address,String Cdepartment,String Cdisease,String Cphone,String CTrxID){
        super( Cname, Cdepartment, Cdisease, Cphone, CTrxID);
        this.Address=Address;
        
    }

   @Override
    //Encapsulation implements
   public void  DilplayTRX_Address(){
     System.out.println("Patient Transection ID : "+TrxID);
     System.out.println("Patient Patient Address : "+Address);
     
       
   }
    
}
