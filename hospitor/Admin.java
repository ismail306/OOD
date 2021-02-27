package hospitor;

public class Admin {
    int i=0;
     Doctor doct =new Doctor();
    
    
        
    void check_TrxID(TrxID pmnt){
    if(pmnt.payment== true)    
    { i++;
        System.out.println("You can meet with doctor .Your Seriol number : "+i);
    
    Patient mehedy = new Patient("Mehedy Hasan","Tonsil pain");
  
    doct.seePatient(mehedy);
    
    }
    else
     System.out.println("please pay first");   
        
    }
    
    void check_Doctor_Performance(Doctor per){
      if(per.count>=5) 
          per.salary += per.salary*0.1;
    }
    
}
