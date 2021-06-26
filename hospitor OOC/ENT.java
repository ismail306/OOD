
package hospitor;

public class ENT extends Department {
    //Encapsulation Implement
   private int currentSerialNO=5; //Private use only same class
   
    ENT(String dep ,int serialNo,String Time,String Disease){
        super(dep,serialNo,Time, Disease);
        
    }
    void waitingtime(){
       if(currentSerialNO<serial_No){
         System.out.printf("YOu Have To Wait for %d  Minutes\n\n\n\n",(serial_No - currentSerialNO)*5);
           
           
       } 
        
    }
}
