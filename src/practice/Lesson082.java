package practice;

import java.util.Random;

public class Lesson082 {
    public static void main(String[] args) {
        System.out.println("ex 6.89");
        int a = 100;
        do {
            System.out.println(a);
            a--;
        }
        while (a >= 80);

        System.out.println("ex 6.90");
        a = 50;
        int b = 60;
        do {
            System.out.println(a);
            a++;
        }
        while (a <= b);

        System.out.println("ex 7.90");
        int osadki[] = new int[28];
        Random rnd = new Random();
        int proshliyGod = 100;
        int i0 = 0;
        int summa = 0;
        do {
            osadki[i0] = rnd.nextInt(30);
            i0++;
            summa = summa + osadki[i0];
        }
        while (i0 < osadki.length - 1);
        if (proshliyGod < summa) {
            System.out.println("v etom godu osadkov bolshe");
        }
        if (proshliyGod > summa) {
            System.out.println("v proshlom godu osadkov bolshe");
        }

        System.out.println("ex 7.91");
        int perviy = 1;
        int vtoroy = 1;
        int n = 7;
        int tretiy = 0;

        for (int i = 0; i < n - 2; i++) {
            tretiy = perviy + vtoroy;
            perviy = vtoroy;
            vtoroy = tretiy;
            System.out.println(tretiy);
        }

        perviy = 1;
        vtoroy = 1;
        System.out.println(perviy);
        System.out.println(vtoroy);
        i0 = 0;
        tretiy = 0;
        do{
            tretiy = perviy + vtoroy;
            perviy = vtoroy;
            vtoroy = tretiy;
            i0++;
            System.out.println(tretiy);
        }
        while(i0 <n - 2);

        System.out.println();

    }
}
