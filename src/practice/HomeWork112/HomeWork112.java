package practice.HomeWork112;

import java.util.Random;

public class HomeWork112 {
    int palindrom(int a) {
        int chislo1 = a;
        int cifra = 0;
        int i0 = 0;
        int chis = chislo1;

        while (chislo1 > 0) {
            cifra = chislo1 % 10;
            chislo1 = chislo1 / 10;
            i0++;
        }
        double w0 = Math.pow(10, i0 - 1);
        cifra = 0;
        int i1 = 0;
        int newChislo = 0;
        while (chis > 0) {
            cifra = chis % 10;
            chis = chis / 10;
            newChislo = newChislo + cifra * (int) w0;
            w0 = w0 / 10;
        }
        return newChislo;
    }

    public static void main(String[] args) {
        System.out.println("ex 4.123");
        double a0 = 1.1;
        double b0 = 2.2;
        double c0 = 3.3;
        if (a0 + b0 > c0 || a0 + c0 > b0 || c0 + b0 == a0) {
            System.out.println("treugolnik mozhet byt'");
            if ((Math.pow(a0, 2) + Math.pow(b0, 2)) == Math.pow(c0, 2) ||
                    (Math.pow(a0, 2) + Math.pow(c0, 2)) == Math.pow(b0, 2) ||
                    (Math.pow(b0, 2) + Math.pow(c0, 2)) == Math.pow(a0, 2)
            ) {
                System.out.println("treugolnik pryamougolniy");
            } else {
                System.out.println("treugolnik ne pryamougolniy");
            }
        } else {


            System.out.println("treugolnika ne mozhet byt'");
        }

        System.out.println("ex 8.46");//???
        int n[] = {12, 18, 20, 8, 22};
        Random rnd = new Random();
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        int i0 = 0;
        int nOD = 0;
        for (int i = 1; i < max; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[j] % i == 0) {
                    i0++;
                }
            }
            if (i0 == 5) {
                if (nOD < i) {
                    nOD = i;
                }
            }
            i0 = 0;

        }
        System.out.println("NOD = " + nOD);

        System.out.println("ex 10.21");
        HomeWork112 homeWork = new HomeWork112();

        int chislo1 = 22122;
        int chislo2 = 5096;
        if (chislo1 == homeWork.palindrom(chislo1)) {
            System.out.println(chislo1 + " chislo palindrom");
        } else {
            System.out.println(chislo1 + " ne chislo palindrom");
        }
        if (chislo2 == homeWork.palindrom(chislo2)) {
            System.out.println(chislo2 + " chislo palindrom");
        } else {
            System.out.println(chislo2 + " ne yavlyaetsya chislom palindromom");
        }

        System.out.println("ex 11.100");
        int massiv[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 2};
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (i != j && massiv[i] == massiv[j]) {
                    i0++;
                    System.out.println("imeyutsya " + massiv[i] + " i " + massiv[j]);
                }
            }
            if (i0 > 0) {
                break;
            }
        }
        System.out.println("ex 12.25");
        int dvumMassiv[][] = new int[12][10];
        int x = 0;
        for (int i = 0; i < dvumMassiv.length; i++) {
            for (int j = 0; j < dvumMassiv[0].length; j++) {
                x = x + 1;
                dvumMassiv[i][j] = x;
                System.out.print(dvumMassiv[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("ex 12.25(b");
        int dvumMassiv2[][] = new int[12][10];
        x = 0;
        int y = 0;
        for (int i = 0; i < dvumMassiv2.length; i++) {
            x = i + 1;
            for (int j = 0; j < dvumMassiv2[0].length; j++) {
                dvumMassiv2[i][j] = x;
                System.out.print(dvumMassiv2[i][j] + "\t");
                x = x + 12;
            }
            System.out.println();
        }
        System.out.println("ex 12.25(c");
        int dvumMassiv3[][] = new int[12][10];
        x = 10;
        for (int i = 0; i < dvumMassiv3.length; i++) {
            for (int j = 0; j < dvumMassiv[0].length; j++) {
                dvumMassiv3[i][j] = x;
                x--;
                System.out.print(dvumMassiv3[i][j] + "\t");
            }
            System.out.println();
            x = x + 20;
        }
        System.out.println("ex 21.25(g");
        int dvumMassiv4[][] = new int[12][10];
        x = 12;
        for (int i = 0; i < dvumMassiv4.length; i++) {
            for (int j = 0; j < dvumMassiv4[0].length; j++) {
                dvumMassiv4[i][j] = x;
                x = x + 12;
                System.out.print(dvumMassiv4[i][j] + "\t");
            }
            System.out.println();
            x = x - 121;
        }
        System.out.println("ex 12.25(d");//???
        int dvumMassiv5[][] = new int[12][12];
        x = 1;
        int sign = 1;
        for (int i = 0; i < dvumMassiv5.length; i++) {
            for (int j = 0; j < dvumMassiv5.length; j++) {
                if (sign == 1) {
                    dvumMassiv5[i][j] = x;

                }
                if (sign == -1) {
                    dvumMassiv5[i][((j - 11) * (-1))] = x;

                }
                x++;


            }
            System.out.println();
            sign = sign * (-1);
        }
        for (int i = 0; i < dvumMassiv5.length; i++) {
            for (int j = 0; j < dvumMassiv5.length; j++) {
                System.out.print(dvumMassiv5[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("ex 13.20");
    }
}
