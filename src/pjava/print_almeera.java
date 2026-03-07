package pjava;

import java.util.Scanner;

public class print_almeera {




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=32;
        int b=30;

        String D="almeera";
        String e="ashmeera";


        String c;
        System.out.println("enter name ");
        c=sc.nextLine();

        if (c.equals(D)){
            System.out.println("almeer teeth"+a);
        }
        else if (c.equals(e)){
            System.out.println("Ashmeera teeth"+b);

        }
        else {
            System.out.println("dan..");
        }







    }
}
