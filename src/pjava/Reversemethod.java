package pjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reversemethod {
    public int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Reversemethod num=new Reversemethod();
        System.out.println("enter number");
        int n = sc.nextInt();
        int Revrsemumber=num.reverse(n);
        System.out.println("num"+ Revrsemumber);
    }
}