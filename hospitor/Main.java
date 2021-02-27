
package hospitor;
public class Main {
    public static void main(String [] args){
        
     Doctor doct =new Doctor();
     Admin admin =new Admin();
     TrxID mehedi =new TrxID("8BK54VM");
     admin.check_TrxID(mehedi);
    
     admin.check_Doctor_Performance(doct);
     System.out.println("Doctor Salary : "+doct.salary );
    } 
}
