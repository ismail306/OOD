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
public class Scenario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee AB =new Employee(391,9,"Day");
        Documents Mehedy =new Documents("good");
        Documents Sajid =new Documents("Done");
        AB.check_documents_status(Mehedy);
        AB.check_documents_status(Sajid);
         Admin admin =new Admin();
         admin.CheckWorkingHour(AB);
       
       // ab.check_documents_status("good");
        
        
        
    }
    
}
