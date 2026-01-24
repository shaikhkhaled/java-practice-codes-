package pjava;
import java.util.Scanner;

public class shopping {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double shopping = 0;

        System.out.println( "enter yor shopping amount");
        shopping = sc.nextInt();

        if (shopping >= 100) {
            System.out.println(" shopping is free ");
        }
            else if (shopping >= 50 && shopping<=99) {
                System.out.println("adding cost" + 5);
            }
        else {
                System.out.println("adding cost 10 ");

            }
        }
    }

