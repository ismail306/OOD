
package fitness;
 //Implemente Inheritance
public class SeniorTrainers extends Trainers {
   int age;
   //Implemente Encapsulation 
   
  public SeniorTrainers(int Id,String nm,String trTp,String trti,String eqi,double sL,int ag){
   super(Id,nm,trTp,trti,eqi,sL);
   age=ag;
   
   }
   
   void checkSenioranualSalary(){
    salary+=  salary*0.1+10000;
annualsalary as =new annualsalary();
       as.DisplySalarry(salary);
   }
}
