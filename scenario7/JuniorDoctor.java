
package scenario7;

public class JuniorDoctor extends Doctor {

    void Write_prescription() {
        System.out.println("Writing prescription on new medicine.");
    }

    // Overload
    void Write_prescription(Prescription the_prescription) {
        System.out.println("Writing prescription on serial : ." + the_prescription.serial);
    }

}
