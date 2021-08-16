package Tables;

import java.io.*;
import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        System.out.println("Enter your choice:1)Finance 2)Student 3)Admissions");
        Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

        do {
            switch (choice) {
                case 1:
                    Finance F = new Finance();
                    F.Choice();
                    break;
                case 2:
                    Student S = new Student();
                    S.Choice();
                    break;
                case 3:
                    Admissions A = new Admissions();
                    A.Choice();
                    break;
            }
        }while(choice!=4);
        }
    }

