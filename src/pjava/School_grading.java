package pjava;
import java.util.Scanner;
public class School_grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = 0;
        System.out.println("Enter your max");
        a = sc.nextInt();

        if (a<25){
            System.out.println("YOUR GRAD IS F");
        }
        else if (a>=25 && a<=45) {
            System.out.println("YOUR GRAD IS E");

        }
        else if (a>=45 && a<=50){
            System.out.println("YOUR GRAD IS D");
        }
        else if (a>=50 && a<=60){
            System.out.println("YOUR GRAD IS C");
        }
        else if (a>=60 && a<=80){
            System.out.println("YOUR GRAD IS b");
        }
        else if (a>=90 && a<=100){
            System.out.println("YOUR GRAD IS A");
        }
        else {
            System.out.println("Invalid max");
        }



        System.out.println();




    }
}
