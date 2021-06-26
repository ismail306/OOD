
package hospitor;
public abstract class Patients {
    String name,department, disease, phone, TrxID;
    
    
    Patients(String name,String department,String disease,String phone,String TrxID){
    this.name=name;
    this.department=department;
        this.disease=disease;
        this.phone=phone;
        this.TrxID=TrxID;
        
}
    abstract void  DilplayTRX_Address();
   void DisplayPatientInfo(){
       System.out.println("Patient Name       :"+name);
       System.out.println("Patient Phone      :"+phone);
       System.out.println("Patient Symptom    :"+disease);
       
   } 
   
    
}
