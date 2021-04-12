
package hospitor;

public class AC_Ambulance extends Ambulance{
    String AmbName="Khan Ambulance Service";
  AC_Ambulance(String AmType,String Phone){
      super(AmType,Phone);
      
  }
    void Ambulance_Status(){
        System.out.printf("Ambulance Available.Ambulance Company Name  : %s  \nPleace Wait In your Address\n",AmbName);
        
    }
    
}
