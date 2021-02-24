/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario1;

/**
 *
 * @author ikemo
 */
public class Employee {
      int emp_id;
    int working_hour;
    String shift;
    
    Employee (int e,int w,String s){
     emp_id=e;
     working_hour =w;
     shift =s;
        
        
    }
     void check_documents_status(Documents d){
         if("good".equals(d.status))
             System.out.println("We can deal");
         else 
            // if ("Done".equals(d.status))
         System.out.println("Process");
       
   } 
}
