package practice.BarryBird;
import java.io.File;
import java.util.Scanner;
public class BarryBird23_12_2020 {

    public static void main(String args[]){
        for(int verse = 1; verse <= 3; verse++) {
            System.out.println("ehl ves' mokriy.");
            System.out.println("pocheme ehl ves' mokryy?");
            System.out.println("potomu, chto on stoit pod dozhdem");
            System.out.println("pochemu ehl stoit pod dozhdyom");
            switch (verse) {
                case 1:
                    System.out.println("potomu chto dozhd' idet ochen' dolgo");
                    break;
                case 2:
                    System.out.println("Potomu chto on ochen' neschastliv");
                    break;
                case 3:
                    System.out.println("Potomu chto on vsyo ravno uzhe mokryy");
                    break;
            }
            switch (verse) {
                case 3:
                    System.out.println("Ochen' dolgo, ochen' dolgo...");
                case 2:
                    System.out.println("Ochen', ochen neschastliv.");
                case 1:
                    System.out.println("Vsyo ravno, vsyo ravno uzhe mokryy");
            }
            System.out.println("Pod dozhdyom, pod dozhdyom");
            System.out.println("O-ooooooo");
            System.out.println();
        }
            System.out.println("Ehl ves' mokryy");
            System.out.println("Pochemu Ehl ves' mokryy?");
            System.out.println("Potomu chto on stoit pod dozhdyom.");
            System.out.println("Pod dozhdyom, pod dozhdyom.");

            File evidence = new File("cookeBooks.txt");
            Scanner keyboard = new Scanner(System.in);
            char reply;
            do{
                System.out.println("Udalit' fail? (y/n) ");
                reply = keyboard.findWithinHorizon(".",0).charAt(0);
            }while (reply != 'y' && reply != 'n');
            if(reply == 'y'){
                System.out.println("Ladno, udalyayu.");
                evidence.delete();
                System.out.println("Fayl udalyon.");
            }else{
                System.out.println("Ladno, ne udalyayu");
            }
        }
    }

