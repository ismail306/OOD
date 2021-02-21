/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpassingexamples;

/**
 *
 * @author ikemo
 */
public class Admin {
   void waiver_calculation (Student s) {
    
    if(s.cgpa>3.8)
        System.out.println("10% waiver");
    else
        System.out.println("No waiver");
    
    
    
}
   void Reg_Fee (Student s) {
    
    if(s.reg_fee<13500)
    System.out.println("payment Clearance not done");
     
}
   void Check_clearance (Student s) {
    
    if(s.id==3421 && s.total_dues<10000)
    System.out.println("Exam Clearance  done");
     
}
}
