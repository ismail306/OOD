
package scenariodemo;

public class Supplyer implements IBonus ,IContact{
    int sold_item;
   void set_sold_item (int s){
       sold_item =s;
       
       
   }
    public void get_bonus(){
        System.out.println("Bonus is: "+sold_item*0.15);
    }
public void can_contact(){


}
}
