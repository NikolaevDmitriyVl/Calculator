package practice.BarryBird;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class BB21_12_2020 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int numGuesses = 0;
        int randomNumber = new Random().nextInt(2)+1;
        out.println(" ************** ");
        out.println("Dobro pozhalovat' v igru!");
        out.println(" ************** ");
        out.println();
        out.print("Vvedite chislo ot 1 do 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;
        while(inputNumber != randomNumber){
            out.println();
            out.println("Popytaytes' eshche raz...");
            out.print("Vvedite chislo ot 1 do 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        out.print("Vy ugadali posle ");
        out.println(numGuesses + " popytok");

        for(int count = 0; count<10; count++){
            out.print("znachenie schetchika = ");
            out.print(count);
            out.println(".");
        }
        out.println("dostatochno!");
    }
}
