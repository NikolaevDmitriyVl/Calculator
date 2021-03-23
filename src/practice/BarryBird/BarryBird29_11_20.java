package practice.BarryBird;

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;



public class BarryBird29_11_20 {
    public static void main(String args[]) {
        Random rnd = new Random();
        int numberOfGuests[] = new int[100];
        int roomNumber = 0;
        for(int i = 0; i<100;i++) {
            numberOfGuests[i] = rnd.nextInt(5)+1;
        }
        while(roomNumber < 100){
            if (numberOfGuests[roomNumber] == 0) {
                out.println("room " + (roomNumber+1) + " free.");
                System.exit(0);
            } else {
                roomNumber++;
            }

        }
        out.println("Trere are no available rooms");
        out.println("ex");
        int n = 0;
        ++n;
        int d = 0;
        --d;
        out.println("inkrement " + n);
        out.println("dekrement " + d);
        out.println("d " + d++);
        out.println(d);
        int x = 1;
        out.println((x + 1));
        out.println(x++);
        out.println(x);
        out.println(x);

        x = 1;
        out.println(x=2);
        out.println(x-=7);


       Scanner keyboard = new Scanner(System.in);
        out.print("vvedite chislo ot 1 do 10: ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;
        if(inputNumber == randomNumber){
            out.println("**********");
            out.println("vi *viigrali.*");
            out.println("**********");
        }
        else{
            out.println("vi proigrali.");
            out.println("sluchaynoe chislo ravno ");
            out.println(randomNumber + ".");
        }
        out.println("spasibo za igru.");
        int q = 5;
        if(q != 4 ){
            out.println("proverka " + q);
        }
       // String f =" 12345";
       // int numberOfBunnies = Integer.parseInt
       //         (f);
       // out.println(" proverka " + numberOfBunnies);
    }

}
