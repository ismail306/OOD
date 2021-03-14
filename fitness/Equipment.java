
package fitness;

public class Equipment {
    int EquipID;
    String Name,availability;
    Equipment (int eid,String enm,String ava ){
       EquipID=eid;
       Name=enm;
       availability = ava;
        
    }
 void seeeqip(){
    System.out.println("Equpment name :" +Name ); 
    System.out.println("Available equpment ID :" +EquipID ); 
    System.out.println("Available Status :" +availability ); 
     
 }
    
}
