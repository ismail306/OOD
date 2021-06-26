
package hospitor;


public class Department  {
    String Depnm;
    int serial_No;
    String Time,DocType,Disease;
    Department(String depnm,int srl,String tm,String pd){
        Depnm=depnm;
        serial_No=srl;
        Time =tm;  
        Disease=pd;
    }
   
    
    void ShowVisitingTime(){
      System.out.println("Your SErial no is : "+serial_No);
      System.out.println("Your Time  is : "+Time);
      
        
    }
    
    
}
