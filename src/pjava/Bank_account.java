package pjava;

public class Bank_account {
 private int blance;
 Bank_account(){
     blance=0;
 }
 void deposit(int fund){
     blance+=fund;
     System.out.println("fund deposit successfully");
 }
 void withdreew(int fund){
     if (blance>fund){
         blance-=fund;
         System.out.println(fund +"withdreew successfully");
     }
     else {
         System.out.println("insafficont blance");
     }
 }
 int current_blance(){
     return blance;
 }

    static void main(String[] args) {
     Bank_account ac1=new Bank_account();

     ac1.deposit(10000);
     ac1.withdreew(5000);
     ac1.current_blance();
     ac1.withdreew(19999999);
        System.out.println("My Blace : "+ ac1.blance);



    }
}
