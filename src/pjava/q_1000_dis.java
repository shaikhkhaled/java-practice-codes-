package pjava;
import java.util.Scanner;
public class q_1000_dis {
    public static void main() {
        Scanner sc=new Scanner(System.in);

        double quantity=0;
        System.out.println(" Enter Total Quantity");
        quantity= sc.nextInt();


        double total=0;

        double cost =100;

        if (quantity>=1000){
            total=quantity-0.9;
            System.out.println("10% Discount Available"+total);
        }
        else {
            System.out.println("Paid Bill Amount");
        }




    }
}
