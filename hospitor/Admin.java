
package hospitor;

public class Admin implements IBonus {
    private String ID;
    private int docFee;
    int Salary;
  
    Admin(String id,int salary){
       ID= id;
       Salary=salary;
    }

     @Override
    public void CalculateBoishakhBonus(){
        
       System.out.println("Admin Boishakh Bonus is "+Salary*0.50);  
    }
    
    
    
    public void setFee(int fee) {
    this.docFee = fee;
    }
    
    public int getfee(){
        return docFee;
    }
    
    

    
    
      Admin(){  
    }
  }
    
    
   
    

