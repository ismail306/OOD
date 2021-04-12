
package hospitor;


public class NonAC_Ambulance extends Ambulance {
    String Ambname="Mehedy Ambulance Service";
     NonAC_Ambulance(String AmType,String Phone){
      super(AmType,Phone);
  }
      void Ambulance_Status(){
                  System.out.printf("Ambulance Available.Ambulance Company Name : %s  \nPleace Wait In your Address\n",Ambname);

        
    }
     
}
