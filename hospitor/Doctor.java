

package hospitor;

import java.util.Scanner;
public class Doctor {
    int count,salary=100000;
    String Medicine;
    Scanner input =new Scanner(System.in);
  
      void seePatient(Patient details){
      System.out.println ("Patient Name : "+details.name);
      System.out.println ("Patient problem : "+details.disease);
    
      Medicine =input.nextLine();
       Report dis =new Report();
      dis.Display(Medicine);
     count++; 
  
  }

          
}
