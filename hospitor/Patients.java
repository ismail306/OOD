
package hospitor;
public abstract class Patients {
    String name,department, disease, phone, TrxID,DocType,AmbuLance,AmbulanceType;
    Patients(String name,String department,String disease,String phone,String TrxID,String DocType,String AmbuLance,String AmbulanceType){
    this.name=name;
    this.department=department;
        this.disease=disease;
        this.phone=phone;
        this.TrxID=TrxID;
        this.DocType=DocType; 
        this.AmbuLance=AmbuLance;
        this.AmbulanceType=AmbulanceType;
}
    abstract void  DilplayTRX_Address();
   void DisplayPatientInfo(){
       System.out.println("Patient Name       :"+name);
       System.out.println("Patient Phone      :"+phone);
       System.out.println("Patient Disease    :"+disease);
       
   } 
   void makePayment(){
       
       System.out.println("Your Payment Has been Done");
       
       
   } 
    
}
