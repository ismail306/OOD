
package fitness;

public class Trainers {
//Implemente Encapsulation 
    protected int id;
    protected double salary;
    String name, training_type,training_time,equipment_information;
    Trainers(int ID,String n,String TrTp,String Trti,String Eqi,double sl){
        id=ID;
        name=n;
        training_type=TrTp;
        training_time=Trti;
        equipment_information=Eqi;
        salary=sl;
        
        
        
    }
    
}
