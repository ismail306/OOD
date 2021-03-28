
package scenariodemo;

public class Employee {
    int salary;
    Employee(int s){
        salary=s;
    }
    void Calculate_helth_indhurance(){
        
 
        System.out.printf("Helth Inshurance : "+salary*0.05);
        
    }
    void Calculate_helth_indhurance(String accident){
        
      if("YES".equals(accident))
            System.out.printf("Helth Inshurance : 300000");   
        
    }
    }
    

