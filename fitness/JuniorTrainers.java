
package fitness;


public class JuniorTrainers extends Trainers {
   public  JuniorTrainers(int Id,String nm,String trTp,String trti,String eqi,int sL){
   super(Id,nm,trTp,trti,eqi,sL);
        
    }
     void checkJunioranualSalary(){
    salary+=  salary*0.04+5000;
annualsalary as =new annualsalary();
       as.DisplySalarry(salary);
   }
    
}
