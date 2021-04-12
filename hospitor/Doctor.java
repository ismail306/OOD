

package hospitor;
import java.util.Scanner;
public abstract class Doctor  implements IPrescription  {
    String id,disease,Medicine,Monthly;
    int Salary,Month;
    
    Doctor(String ID,int salary){
      id=ID;
      Salary=salary;
    }
     Doctor(String Dis){
      disease=Dis;
    }
   abstract void CalculateAnnualBonus();
   
    @Override
    public void give_prescription(){
        Scanner input= new Scanner (System.in);
         System.out.println("Patient Disease : "+disease); 
        System.out.println("Enter Medicine For Patient : "); 
       
        
        Medicine=input.nextLine();
      System.out.printf("Your Medicine is : %s \n\n\n",Medicine);  
        
    } //methodOverLOad   1
   void CalculateSalary(String Y_N){
       Monthly=Y_N;
       if(Monthly=="YES"){
            System.out.println("Doctor ID: "+id); 
         System.out.println("Monthly Salary is : "+Salary);  
       }
   }
    void CalculateSalary(){
        System.out.println("Doctor ID: "+id);  
         System.out.println("Annual Salary is : "+Salary*12);  
           
       }
    //methodOverLOad   2
    void CalculateSalary(int month){
        Month=month;
        System.out.println("Doctor ID: "+id);  
         System.out.printf("Salary Of %d Month  :  %d \n", Month ,Salary*Month);  
           
       }
    
}
