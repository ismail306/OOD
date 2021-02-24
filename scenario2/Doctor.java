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
public class Doctor {
int salary;
String performance;
Doctor(String per){
    performance=per;
}
void check_report(Report r){
         if("Normal".equals(r.catagory) &&"Green".equals(r.location) )
             System.out.println("Forwarded to hospital");
         else if("Advanced".equals(r.catagory) &&"Better".equals(r.status))
                  System.out.println("Stay here");
       
   } 
}
