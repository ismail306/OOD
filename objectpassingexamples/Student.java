/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpassingexamples;


public class Student {
  int id;
double cgpa;
int reg_fee;
int total_dues;
Student (int i,double c,int r,int t){
    id=i;
    cgpa=c;
    reg_fee=r;
    total_dues=t;
    
    
}
/*void Reg_Fee(int rf){
    reg_fee=rf;
    if(reg_fee<13500)
    System.out.println("payment Clearance not done");
    
}*/
}
