
package hospitor;

public class ENT extends Department {
    //Encapsulation Implement
   private int currentSerialNO=5; //Private use only same class
   
    ENT(String dep ,int serialNo,String Time,String DT,String Disease){
        super(dep,serialNo,Time,DT, Disease);
        
    }
    void waitingtime(){
       if(currentSerialNO<serial_No){
         System.out.printf("YOu Have To Wait for %d  Minutes\n",(serial_No-currentSerialNO)*5);
           
           
       } 
        
    }
}
