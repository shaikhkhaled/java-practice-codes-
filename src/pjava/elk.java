package pjava;

import java.util.Scanner;

public class elk {


    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

                int un = 0;
        System.out.println("Enter your units");
                un=sc.nextInt();
                int total=0;

                if(un>=100){
                    total=un*5;
                    System.out.println("total bill:"+total);
                }
                else if (un==100 && un<=200){
                    total=un*7;
                    System.out.println("total bill:"+total);
                }
                else if (un==200 && un<=300){
                    total=un*10;
                    System.out.println("total bill:"+total);
                }

    }
}
