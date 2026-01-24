package pjava;
import java.util.Scanner;
public class switchcare {
    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
        double a, b;
        double result = 0;
        String op;
        System.out.println("Enter First Number :");
        a = scanner.nextInt();
        System.out.println("Enter Second Number :");
        b = scanner.nextInt();
        System.out.println("Enter Operator (+,-,*,/,%) :");
        op = scanner.next();
        scanner.nextLine();
        switch (op)
        {
            case "+" : result = a+b; break;
            case "-" : result = a-b; break;
            case "*" : result = a*b; break;
            case "/" : result = a/b; break;
            case "%" : result = a%b; break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("Result: "+ result); }
    }

