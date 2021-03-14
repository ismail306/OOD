
package fitness;

public class Main {
    public static void main(String[] args) {
     
        
     SeniorTrainers S1=new  SeniorTrainers(427,"Ismail","Aerobic","Morning","Push Up Bar",60000,24);  
     JuniorTrainers J1=new  JuniorTrainers(427,"Mehedy","Flexibility","Day","Six Pack Care with Cycle",40000); 
     Equipment eq1=new Equipment(191,"Push Up Bar","Available");
     Equipment eq2=new Equipment(192,"Six Pack Care with Cycle"," Not Available");
     eq1.seeeqip();
     eq2.seeeqip();
     Customers c1=new Customers();
     c1.checkstrainerstimeandtype(S1);
     c1.checkstrainerstimeandtype(J1);
     S1.checkSenioranualSalary();
     J1.checkJunioranualSalary();
   
    }
}
