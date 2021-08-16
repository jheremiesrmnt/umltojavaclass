package Tables;

import java.util.Scanner;

public class Admissions extends User {

    private int a_id=301;
    private String a_name="Marites";

    public int getA_id(){
        return a_id;
    }
    public void setA_id(int a_id){
        this.a_id = a_id;
    }

    public String getA_name(){
        return a_name;
    }

    public void setA_name(String a_name) {

        this.a_name = a_name;
    }

    public void Choice(){
        System.out.println("Enter your choice:1)CheckStudent");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1: CheckStudent();
                break;
            case 2: main(null);
    }
}

public void CheckStudent(){
    Student S = new Student();
    String s_name =S.getS_name();
    System.out.println("Admissions: "+a_name+" has admitted student "+s_name);
    }
}
