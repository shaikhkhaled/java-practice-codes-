package pjava;

import java.util.Scanner;

public class numberdowillloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num= 0;
        System.out.println("Enter Tabale digith :");
        num= sc.nextInt();
        int i =1;


        do {
            System.out.println(num*i);
            i++;
        }while (i<=10);
    }
}
