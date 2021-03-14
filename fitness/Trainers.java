/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;

/**
 *
 * @author ikemo
 */
public class Trainers {
    //training type will be either Aerobic or Flexibility
    int id;
    double salary;
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
