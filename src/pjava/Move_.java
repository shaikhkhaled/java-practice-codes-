package pjava;
import java.util.Scanner;
public class Move_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int movie=0;
        System.out.println("Enter Movie Code");
        movie= sc.nextInt();

        switch(movie)
            {
                case 1:
                    System.out.println("Action");break;
                case 2:
                    System.out.println("Comedy");break;
                case 3:
                    System.out.println("Drama");break;
                default:
                    System.out.println(" plz Enter ree code ");
            }
        }

    }

