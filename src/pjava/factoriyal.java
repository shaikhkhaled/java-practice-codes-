  package pjava;

import java.util.Scanner;

public class factoriyal {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("ENTER NUMBER");
        n = sc.nextInt();
        int fact = 1;
        int i= 1;

        while (i<=n){
            fact*=i;i++;
        }
        System.out.println("number" +fact);






    }
}
