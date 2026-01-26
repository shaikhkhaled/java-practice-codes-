package pjava;
import java.util.Scanner;
public class Total_bill_dc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starter=0;
        int main_course =0;
        int  dessert= 0;
        int drinks=0;

        System.out.println( "Enter number of started :");
        starter= sc.nextInt();

        System.out.println("Enter number of main course :");
        main_course= sc.nextInt();

        System.out.println("Enter number of dessert :");
        dessert= sc.nextInt();

        System.out.println("Enter number of drinks:");
        drinks= sc.nextInt();

        double starterprice= 5 ;
        double main_courseprice= 10;
        double dessertprice= 4.50;
        double drinksprice=2.50;

        double total= 0;


        total=(starterprice * starter)+
                (main_courseprice * main_course)+
                (dessertprice * dessert)+
                (drinksprice * drinks);

        System.out.println("TOTAL BILL :"+total);

        if(total>=50){
             double discounttotal=total-0.90;

            System.out.println("Discount Available 10% :"+discounttotal);
        }
       else if ( dessert>1 && main_course>1) {
            double senddiscount=total-0.80;
            System.out.println("Discount Available 20% :"+senddiscount);
            }
        else {
            System.out.println("Thank's for coming ");
        }
    }

}
