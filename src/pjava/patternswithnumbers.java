package pjava;

public class patternswithnumbers {public static void main(String[] args) {
    int i = 1 ;
    int j = 0 ;
    int num=5;
    int k;

    for (i =0;i <= num; i++) {

        for (k = num; k > i; k--) {
            System.out.print(" ");
        }
        for (j = 1; j <= i; j++) {

            System.out.print(j);
        }

        System.out.println(" ");

    }
}
}
