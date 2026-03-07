package pjava;
public class calculatorQ7 {
     static int kk (int x, int y) {
         return x + y;
     }

    static double kk (double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int add1 = kk(10, 20);
        double add2 = kk(4.3, 6.26);
        System.out.println("int: " + add1);
        System.out.println("double: " + add2);
    }

}

