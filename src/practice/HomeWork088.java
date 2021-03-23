package practice;

import java.util.Random;

public class HomeWork088 {
    public static void main(String[] args){
        System.out.println("ex 4.83");
        double chis01 = 1.1;
        double chis02 = 2.2;
        double chis03 = 3.3;
        double chis04 = 4.4;
        double slozenie1 = 0;
        double slozenie2 = 0;
        double slozenie3 = 0;
        double slozenie4 = 0;
        if (chis01 > 5) {
            slozenie1 = chis01;
        }
        if (chis02 > 5) {
            slozenie2 = chis02;
        }
        if (chis03> 5) {
            slozenie3 = chis03;
        }
        if (chis04 > 5) {
            slozenie4 = chis04;
        }
        System.out.println(slozenie1 + slozenie2 + slozenie3 + slozenie4);

        System.out.println("ex 5.81");
        int x = 2;
        int y = 4;
        int naibolshee = 0;
        int naimenshee = 0;
        if (x > y) {
            naibolshee = x;
            naimenshee = y;
        }
        if (x < y || x == y) {
            naibolshee = y;
            naimenshee = x;
        }
        int x1 = naimenshee;
        int summa = 0;
        for(int i = 0; i<naibolshee; i++){
            summa = summa + x1;
        }
            System.out.println(summa);


        System.out.println("ex 6.104");
        x = 425;
        y = 131;
        int i0 = 0;
        while(x>1 &&  y>1) {
            if (x > y) {
                x = x - y;
                i0++;
                System.out.println(y);
            }
            if (x < y) {
                y = y-x;
                i0++;
                System.out.println(x);
            }

        }
        System.out.println(i0);
        
        System.out.println("ex 7.105");
        int n = 5;
        i0 = 0;
        int chisla[] = {1,2,3,4,5};
        for(int i = 0; i<n; i++){
            if (chisla[i] < 20) {
                i0++;
            }
        }
        if (i0 > 5) {
            System.out.println("verno");
        }

        System.out.println("ex 8.16");
        int zarplata[][] = new int [12][3];
        Random rnd = new Random();
        for(int i = 0; i<12;i++){
            for(int j = 0; j<3; j++){
                zarplata[i][j] = rnd.nextInt(5);
            }
        }
        int maxZarplata = 0;
        for(int i = 0; i<12; i++){
            for(int j = 0; j<3; j++){
                if(zarplata[i][j] > maxZarplata){
                    maxZarplata = zarplata[i][j];
                }
            }
        }
        System.out.println(maxZarplata);
        System.out.println("ex 8.16(b");
        int maxZaKvartal = 0;
        summa = 0;
        for(int i = 0; i<12; i++){
            for(int j = 0; j<3; j++){
                summa = summa + zarplata[i][j];
            }
            if (maxZaKvartal < summa) {
                maxZaKvartal = summa;
            }
            summa = 0;
        }
        System.out.println(maxZaKvartal);
        System.out.println("ex 8.16(c");
        int maxObshhaya = 0;
        summa = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0;  j<12; j++){
                summa = summa + zarplata[j][i];
            }
            if (maxObshhaya < summa) {
                maxObshhaya = summa;
            }
            summa = 0;
        }
        System.out.println(maxObshhaya);


        System.out.println("ex 11.76");


        System.out.println("ex 12.9");

        System.out.println("ex 4.84");
        int chisl1 = 1;
        int chisl2 = 2;
        int chisl3 = 3;
        int chisl4 = 4;
        summa = 0;
        if (chisl1 % 3 == 0) {
            summa = summa + chisl1;
        }
        if (chisl2 % 3 == 0) {
            summa = summa + chisl2;
        }
        if (chisl3 % 3 == 0) {
            summa = summa  + chisl3;
        }
        if (chisl4 % 3 == 0) {
            summa = summa + chisl4;
        }
        System.out.println(summa);

        System.out.println("ex 5.82");
        n = 5;
        int faktorial = 1;
        for(int i = 1; i<= n; i++){
            faktorial = faktorial  * (i+1);
            System.out.println(faktorial);
        }


    }
}
