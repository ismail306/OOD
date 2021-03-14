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
public class SeniorTrainers extends Trainers {
   int age;
   
   SeniorTrainers(int Id,String nm,String trTp,String trti,String eqi,double sL,int ag){
   super(Id,nm,trTp,trti,eqi,sL);
   age=ag;
   
   }
   
   void checkSenioranualSalary(){
    salary=  salary*0.1+10000;
annualsalary as =new annualsalary();
       as.DisplySalarry(salary);
   }
}
