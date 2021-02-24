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
public class Chairman {
    void CheckPerformance(Doctor phm) {
   if("good".equals(phm.performance))
                  phm.salary=2000;
  
    }
}
