package Tables;

import java.util.Scanner;

public class Student extends User {

    private int s_id=101;
    private String s_name="Dodong";

   public void  Choice(){
       System.out.println("Enter your choice:1)PayBill");
       Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1: PayBill();
            break;
            case 2: main(null);
        }
   }
   public void setS_id(int s_id){
       this.s_id = s_id;
   }

   public String getS_name(){
       return  s_name;
   }
   public void PayBill(){
       System.out.println("Thanks for paying!");
   }
}