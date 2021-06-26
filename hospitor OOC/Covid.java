
package hospitor;

public class Covid  extends Department {
    //Encapsulation Implement
    private int avilableSit=50; //Private use only same class
     Covid(String dep ,int serialNo,String Time,String Disease){
        super(dep,serialNo,Time,Disease);
}
     void Checksit(){
         if(serial_No<=avilableSit){
           System.out.println("You can Admit In Hospital");   
         }
         else{
         System.out.println("Sit is not Available in Hospital");  
     }
         
     }
}