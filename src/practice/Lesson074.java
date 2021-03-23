package practice;

import java.util.Random;

public class Lesson074 {
    public static void main(String[] args) {
        System.out.println("ex 11.26");
        int osadki[] = new int[28];
        int summa = 0;
        Random rnd = new Random();
        for (int i = 0; i < osadki.length; i++) {
            osadki[i] = rnd.nextInt(10);
            summa = summa + osadki[i];

        }
        int srednee = summa / osadki.length;
        System.out.println(srednee);

        System.out.println("ex 11.27");
        int osadkiSentyabr[] = new int[30];
        int summa1 = 0;
        int summa2 = 0;
        int summa3 = 0;
        Random rnd1 = new Random();
        for (int i = 1; i < osadkiSentyabr.length; i++) {
            osadkiSentyabr[i] = rnd1.nextInt(10);
            if (i <= 10) {
                summa1 = summa1 + osadkiSentyabr[i];
            }
            if (i > 10 && i <= 20) {
                summa2 = summa2 + osadkiSentyabr[i];
            }
            if (i > 20) {
                summa3 = summa3 + osadkiSentyabr[i];
            }
        }
        int srednyayaDekada1 = summa1 / 10;
        int srednyayaDekada2 = summa2 / 10;
        int srednyayaDekada3 = summa3 / 10;
        System.out.println("dekada1 = " + srednyayaDekada1);
        System.out.println("dekada2 = " + srednyayaDekada2);
        System.out.println("dekada3 = " + srednyayaDekada3);

        System.out.println("ex 11.28");
        int q[] = {12, 13, 14, 15, 6};
        summa = 0;
        for (int i = 0; i < q.length; i++) {
            summa = summa + q[i];
        }
        if (summa % 2 >= 0) {
            System.out.println("summa elementov massiva est ne otricatelnoe chislo");

        }
    }
}
