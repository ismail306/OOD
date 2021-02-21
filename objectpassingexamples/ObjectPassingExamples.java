
package objectpassingexamples;

public class ObjectPassingExamples {

    
    public static void main(String[] args) {
        int a=10;
        Student ali =new Student(123,3.4,12500,500);
        Student joy =new Student(123,3.4,13500,000);
        Admin a1  =new Admin();
        a1.waiver_calculation(joy);
        a1.waiver_calculation(ali);
        a1.Reg_Fee(joy);
        a1.Reg_Fee(ali);
        a1.Check_clearance(joy);
        a1.Check_clearance(ali);
        
    }
    
}
