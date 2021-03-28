
package scenariodemo;


public class ScenarioDemo {

    
    public static void main(String[] args) {
      Manager m1 =new Manager (100000);
      m1.get_bonus();
      stuff s1=new stuff(50000);
      s1.get_bonus();
      
      
      Supplyer sp1 =new Supplyer ();
      sp1.set_sold_item(100);
      sp1.get_bonus();
      Employee e1= new Employee(300000);
      Employee e2= new Employee(400000);
      e1.Calculate_helth_indhurance();
      e2.Calculate_helth_indhurance("YES");
    }
    
}
