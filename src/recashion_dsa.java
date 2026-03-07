public class recashion_dsa {

    public static int fact(int n){
        int f =1;
                if(n==0 || n==1){
                    return 1;
                }
            return f= n * fact(n-1);
    }



    public static void main(String[] args) {


        System.out.println(fact(5));



    }
}
