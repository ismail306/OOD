
package hospitor;

public class Admin {
    private String ID;
    private int docFee;
    int Salary;
  
    Admin(String id,int salary){
       ID= id;
       Salary=salary;
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
    
    
   
    

