package pjava;

public class patterns {
    public static void main(String[] args) {
        int i = 0 ;
        int j = 0 ;
        int num=5;
        int k;

        for (i =0;i <= num; i++) {

            for (k = num; k > i; k--) {
                System.out.print(" ");
            }
                for (j = 0; j <= i; j++) {

                    System.out.print(" * ");
                }

                System.out.println(" ");

            }
        }
    }

