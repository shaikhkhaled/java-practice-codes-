package pjava;
import java.util.Scanner ;
public class books_fine_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double days = 0 ;


        System.out.println("Enter A day's Holding Book's");
        days = sc.nextInt();

        if (days <= 7){
            System.out.println("Thank's for return book's");
            days= days - days ;

        }
        else if (days >= 8 && days <= 30){
            days =  1.0 * days ;
            System.out.println( "ADD FINE PAR DAY 1rs");


        }
        else {
            days = 2.0 * days;
            System.out.println("ADD FINE PAR DAY 2rs");

        }
        System.out.println("TOTAL FINE : RS" + days);

    }
}
