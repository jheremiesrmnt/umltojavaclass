package Tables;

import java.io.*;
import java.util.Scanner;

public class Finance extends User{

    private int f_id;
    private String f_name;

    public void Choice(){
        System.out.println("Enter your choice:1)GiveAppoint 2)GenerateBill");
        Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

        switch (choice){
            case 1: GiveAppoint();
            break;
            case 2: GenerateBill();
            break;
            case 3: main(null);
        }

}

    public void GenerateBill() {

        Billing B = new Billing();
        int b_no = B.getB_no();
        String s_name =B.getS_name();
        int b_amt = B.getB_amt();
        System.out.println("Bill number: " + b_no +"\nStudentName: " + s_name);

    }

    public void GiveAppoint(){

        Student S = new Student();
        String s_name =S.getS_name();
        Admissions A = new Admissions();
        int a_id = A.getA_id();
        String a_name = S.getS_name();
        System.out.println("\nStudentName: "+s_name+"\nAppointment with Admissions \nAdmissionsID: "+a_id);

    }
}
