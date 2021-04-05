
package scenario7;

public class Doctor implements VerifyReports {

    Report the_report;

    public void verify_reports() {
        // Doctor verifies the report ID

        if (the_report.id == 44) // Just for example
        {
            System.out.println("Report ID verified!");
        } else {
            System.out.println("Report ID not verified!");
        }
    }

    void Write_prescription() {
        System.out.println("Writing prescription.");
    }
}
