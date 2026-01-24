package pjava;
import java.util.Scanner;
public class simpleinterest {
 public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      double principal= 0;
      double rat = 0;
      double year = 0;

     System.out.println("Enter principal amount");
     principal=sc.nextDouble();

     System.out.println("Enter rate of interest");
     rat=sc.nextDouble();

     System.out.println("Enter time period");
     year=sc.nextDouble();

     double simpleinterest=(principal*rat*year)/100;
     System.out.println("simple interest :" + simpleinterest);
 }
}
