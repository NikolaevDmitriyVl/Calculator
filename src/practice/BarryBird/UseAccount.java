package practice.BarryBird;
import static java.lang.System.out;
public class UseAccount {
    public static void main(String args[]){
        Account myAccount = new Account();
        Account yourAccount = new Account();
        myAccount.name = "Barry";
        myAccount.address = "222 Inner Lane";
        myAccount.balance = 24.02;
        yourAccount.name = "Dzheyn";
        yourAccount.address = "121 Outer Street";
        yourAccount.balance = 55.63;
        myAccount.display();
        System.out.println();
        yourAccount.display();

        System.out.println();
        double n = 1.009999999998;
        out.printf("$%4.2f\n", n);
        double x = 7;
        out.println(x);

        Account n1 = new Account();
        Account n2 = new Account();


        n1.n1 = 1;
        n1.n2 = 2;
        n2.n2 = 2;


        //n1.n1( + 1.00);
    }
}
