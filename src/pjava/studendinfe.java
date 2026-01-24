package pjava;

import java.util.Scanner;


public class studendinfe {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name =  "";
        int age = 0 ;
        char c = ' ';
        String fav = "" ;

        System.out.println("NAME");
        name= sc.nextLine();

        System.out.println("Age");
        age = sc.nextInt();

        System.out.println("Grade");
        c = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("fav");
        fav = sc.nextLine();



    }


}
