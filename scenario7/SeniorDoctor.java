
package scenario7;

public class SeniorDoctor extends Doctor {

    Prescription the_prescription;

   
    void Write_prescription() {
        System.out.println("Writing prescription on prescription ID : " + the_prescription.id);
    }
}