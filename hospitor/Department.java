
package hospitor;


public class Department  {
    String Depnm;
    int serial_No;
    String Time,DocType,Disease;
    Department(String depnm,int srl,String tm,String DT,String pd){
        Depnm=depnm;
        serial_No=srl;
        Time =tm;  
        DocType=DT;
        Disease=pd;
    }
   
    
    void ShowVisitingTime(){
      System.out.println("Your SErial no is : "+serial_No);
      System.out.println("Your Time  is : "+Time);
      
        
    }
    void CheckDocType(){
        if(DocType=="Intern Doctor"){
         InternDoctor Id=new InternDoctor(Disease);
         Id.give_prescription();
        }
        else{
         SeniorDoctor Sd=new SeniorDoctor(Disease);
          Sd.give_prescription();
        }
        
        
    }
    
}
