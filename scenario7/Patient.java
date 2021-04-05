
package scenario7;
public class Patient implements VerifyReports {

    Report the_report;

    public void verify_reports() {
        // Patient verifies the report status

        if (the_report.status == "OK") // Just for example
        {
            System.out.println("Report status verified!");
        } else {
            System.out.println("Report status not verified!");
        }

    }
 
}
