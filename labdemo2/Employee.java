/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdemo2;

/**
 *
 * @author ikemo
 */
public class Employee {
    int emp_id;
    int working_hour;
    String shift;
    int salary;
    Employee (int e,int w,String s){
     emp_id=e;
     working_hour =w;
     shift =s;
        
        
    }
   void Check_Salary(int sal){
        salary =sal;
        if(salary>10000)
            salary+=salary*.1;
        
                    }
   void Check_Working_Hour(int wh){
      working_hour=wh;
      if(working_hour>10)
          System.out.println("Good");
       
       
       
   }
    
    void check_Doc_status(){
        
        
        
    }    
}
