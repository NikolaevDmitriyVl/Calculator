package practice;

import java.util.Random;

public class HomeWork096 {
    public static void main(String[] args){
        System.out.println("ex 5.88");
        int i0 = 0;
        int i1 = 0;
        int n = -1;
        int y = 0;
        for(int i = 1; i<=5; i++){
            i0++;
            i1 = i0;
            for(int j = 0; i1>0; j++){
                n = n+2;
                y = y+n;
                i1--;
            }
            System.out.println(y);
            y = 0;
        }

        System.out.println("ex 11.84");
        i0++;
        int osadki[] = new int[31];
        Random rnd = new Random();
        int summa = 0;
        for(int i=  0; i<osadki.length-1; i++){
            osadki[i] = rnd.nextInt(10);
            if (osadki[i] > 0) {
                summa = summa + osadki[i];
                i0++;
            }
        }
        int sredneeKolichestvoOsadkov = summa/i0;
        System.out.println(sredneeKolichestvoOsadkov);

        System.out.println("ex 12.14");
        int DvMassiv[][] = {{1,2,3,1,2},
                {4,5,6,1,2},
                {7,8,9,1,2},
                {11,12,13,14,15},
                {16,17,18,19,20}};
        summa = DvMassiv[1][0] + DvMassiv[1][2];
        System.out.println(summa);
        System.out.println("ex 12.14(b");
        int summaPyatogoStolbca = DvMassiv[1][DvMassiv.length-1] + DvMassiv[3][DvMassiv.length-1];
        System.out.println(summaPyatogoStolbca);

        System.out.println("ex 13.11");

        System.out.println("ex 4.98");
        double chislo01 = 1.1;
        double chislo02 = 2.2;
        double chislo03 = 3.3;
        double max0 = 0;
        double min0 = 0;
        if (chislo01 > chislo02 && chislo01 > chislo03) {
            max0 = chislo01;
        }
        if (chislo02 > chislo01 && chislo02 > chislo03) {
            max0 = chislo02;
        }
        if (chislo03 > chislo01 && chislo03 > chislo02) {
            max0 = chislo03;
        }
        if (chislo01 < chislo02 && chislo01 < chislo03) {
            min0 = chislo01;
        }
        if (chislo02 < chislo01 && chislo02 < chislo03) {
            min0 = chislo02;
        }
        if (chislo03 < chislo01 && chislo03 < chislo02) {
            min0 = chislo02;
        }
        System.out.println("maximalnoe chislo = " + max0 + " minimalnoe chislo = " + min0);

        System.out.println("ex 5.95");
        int chislo = 1234;
        int cifra = 0;
        i0 = 0;
        n  = 2;
        summa = 0;
        for(int i = 0; i<n; i++){
            cifra = chislo%10;
            chislo = chislo/10;
            summa = summa + cifra;}
            System.out.println(summa);

        System.out.println("ex 7.116");
        int m = 6;
        n = 3;
        i0 = 0;
        int massiv[] = {1,2,3,4,5,6};
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] % n == 0) {
                i0++;
                summa = summa + massiv[i];
            }
        }
        int sredneeArifmeticheskoe = summa/i0;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 8.27");
        for(int i = 1; i<=300; i++){
            for(int j = 1; j<=300; j++) {
                if (i % j == 0) {
                    i0++;
                }
            }
            if (i0 == 5) {
                System.out.println(i);
            }
            i0 = 0;

        }

        System.out.println("ex 10.3");//???

        System.out.println("ex 11.85");
        //nayti srednie arifmeticheskie polozitelnih i otricatelnih elementov massiva
        int massiv0[] = {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,13,-14};
        int summaPolozitelnih = 0;
        int summaOtricatelnih = 0;
        i1 = 0;
        int i2 = 0;
        for(int i = 0; i<massiv0.length; i++){
            if (massiv0[i] > 0) {
                summaPolozitelnih = summaPolozitelnih + massiv0[i];
                i1++;
            }
            if (massiv0[i] < 0) {
                summaOtricatelnih = summaOtricatelnih + massiv0[i];
                i2++;
            }
        }
        int sredneeArifmeticheskoePolozitelnih = summaPolozitelnih/i1;
        int sredneeArifmeticheskoeOtricatelnih = summaOtricatelnih/i2;
        System.out.println(" srednee arifmeticheskoe polozitelnih " + sredneeArifmeticheskoePolozitelnih);
        System.out.println(" srednee arifmeticheskoe otricatelnih " + sredneeArifmeticheskoeOtricatelnih);

        System.out.println("ex 12.15");
        int massiv1[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        summa = massiv1[massiv1.length-1][massiv1[massiv1.length-1].length-1] + massiv1[0][massiv1.length-1];
        System.out.println(summa);
        System.out.println("ex 12.15(b");
        int chisla[] = new int[6];
        Random rnd0 = new Random();
        for(int i = 0; i<chisla.length; i++){
            chisla[i] = rnd.nextInt(5)-1;
        }
        summa = massiv1[chisla[0]][chisla[1]] + massiv1[chisla[2]][chisla[3]] + massiv1[chisla[4]][chisla[5]];
        sredneeArifmeticheskoe = summa/3;
        System.out.println(sredneeArifmeticheskoe);
        




    }
}
