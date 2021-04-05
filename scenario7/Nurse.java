
package scenario7;
public class Nurse implements VerifyReports {

    Report the_report;

    public void verify_reports() {
        // Nurse verifies the report name

        if (the_report.name == "Ismail") // Just for example
        {
            System.out.println("Report name verified!");
        } else {
            System.out.println("Report name not verified!");
        }
    }

}