/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario2;

/**
 *
 * @author ikemo
 */
public class Scenario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor doct = new Doctor("good");
        
        Report p1 = new Report("Normal","Green","Better");
        Report p2 = new Report("Advance","Green","Better");
        doct.check_report(p1);
        doct.check_report(p2);
        Chairman cm = new Chairman();
        cm.CheckPerformance(doct);
       System.out.println(doct.salary);
    }
    
}
