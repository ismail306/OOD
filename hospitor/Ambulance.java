
package hospitor;

public class Ambulance {
    String AmbType,Phone,Location;
    Ambulance(String AmT,String phone){
       AmbType=AmT;
       Phone=phone;
        
        
    }
    //Implements Encapsulation
 public void Display_AmbulanceInfo(){
      
      System.out.println("Your Ambulance Type IS: "+AmbType);
      System.out.println("Driver Contract : "+Phone);
      
  }
    void AmbulanceLoation(String location){
        Location=location;
        System.out.println("Your Ambulance is now in : "+Location);
        
        
        
    }
}
