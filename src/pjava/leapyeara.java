package pjava;

import java.util.Scanner;

public class leapyeara {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=0;

        System.out.println("Enter your year");
        y= sc.nextInt();


        if (y%4==0 && y%100 != 0 || y%400 == 0){
            System.out.println(y+"its leap year");
        }
        else {
            System.out.println(y+"its not leap year");
        }



    }
}
