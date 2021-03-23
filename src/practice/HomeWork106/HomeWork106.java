package practice.HomeWork106;

import java.util.Random;

public class HomeWork106 {
    public static void main(String[] args) {
        System.out.println("ex 4.112");
        int nachalo = 1990;
        int mesyacev = 6;
        int dney = 2;
        switch (mesyacev) {
            case 1:
                System.out.println("february");
                break;
            case 2:
                System.out.println("march");
                break;
            case 3:
                System.out.println("april");
                break;
            case 4:
                System.out.println("may");
                break;
            case 5:
                System.out.println("june");
                break;
            case 6:
                System.out.println("july");
                break;
            case 7:
                System.out.println("august");
                break;
            case 8:
                System.out.println("september");
                break;
            case 9:
                System.out.println("oktober");
                break;
            case 10:
                System.out.println("desember");
                break;
            case 11:
                System.out.println("junuary");

        }

        System.out.println("ex 8.38");//???
        int summaDelit[] = new int[5];
        for (int i = 1; i < summaDelit.length; i++) {

        }


        int massiv1[] = new int[50000];
        int massiv2[] = new int[50000];
        int summa = 0;
        // for(int i = 1; i<=50000; i++){
        //   for(int j = 1; j<i; j++){
        //     if (i % j == 0) {
        //       summa = summa + massiv1[i-1];
        // }
        //}
        // massiv1[i-1] = summa;
        //  summa = 0;
        //  }
        //  for(int i = 1; i<=50000; i++){
        //    for(int j = 0; j<50000; j++){
        //      if(i == massiv1[j]){
        //        if(massiv1[i+1] == j+1){
        //          System.out.println("chislo " + i + " = " + " summe deliteley " + "(" + (massiv1[j]) + ")" + " chisla " + (j+1) );
        //    }
        //}
        //}
        //}


        int summaDeliteley[] = new int[5];
        int i0 = 0;
        summa = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < summaDeliteley.length; j++) {
                if (i % j == 0) {
                    summa = summa + j;
                }
            }
            //System.out.println(summa);
            summaDeliteley[i0] = summa;
            //System.out.println((i) + " - " + summaDeliteley[i0]);
            summa = 0;
            i0++;
        }
        for (int i = 2; i <= summaDeliteley.length; i++) {
            for (int j = 0; j < i; j++) {
                if (i == summaDeliteley[j]) {
                    if ((j + 1) == summaDeliteley[i - 1]) {
                        System.out.println("chislo " + i + " = " + " summe deliteley chisla " + (j + 1) + " a summa deliteley chisla " + i + " ravna chislu " + (j + 1));
                    }
                }
            }
        }

        System.out.println("ex 10.13");
        int n = 18;
        int massiv[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 25};
        double stepenPyaterki[] = new double[massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            stepenPyaterki[i] = Math.pow(5, (i));
        }
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (massiv[i] == stepenPyaterki[j]) {
                    System.out.println(massiv[i]);
                }
            }
        }

        System.out.println("ex 11.93");
        int stoimost[] = new int[20];
        Random rnd = new Random();
        summa = 0;
        for (int i = 0; i < stoimost.length; i++) {
            stoimost[i] = rnd.nextInt(40) + 10;
            summa = summa + stoimost[i];
        }
        int srednyaya = summa / stoimost.length;
        i0 = 0;
        for (int i = 0; i < stoimost.length; i++) {
            if (stoimost[i] < srednyaya) {
                i0++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 12.19");

        // verh pravo s lyubim elementom
        int dvMassiv[][] = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        if (dvMassiv[0][dvMassiv[0].length - 1] > dvMassiv[2][3]) {
            System.out.println("element v verhu sprava bolshe chem vtoroy element");

        } else if (dvMassiv[0][dvMassiv[0].length - 1] == dvMassiv[2][3]) {
            System.out.println("element sprava vverhu raven vtoromu elementu");
        } else if (dvMassiv[0][dvMassiv[0].length - 1] < dvMassiv[2][3]) {
            System.out.println("element sprava vverhu menshe chem vtoroy element");
        }
        System.out.println("ex 12.19(b");
        if (dvMassiv[dvMassiv.length - 1][dvMassiv[dvMassiv.length - 1].length - 1] < dvMassiv[dvMassiv.length - 1][0]) {
            System.out.println("element sprava vnizu menshe chem element sleva vnizu");
        } else if (dvMassiv[dvMassiv.length - 1][0] < dvMassiv[dvMassiv.length - 1][dvMassiv[dvMassiv.length - 1].length - 1]) {
            System.out.println("element sleva vnizu menshe chem element sprava vnizu");
        }

        System.out.println("ex 13.14");//???
        Momenti momentiOne = new Momenti();
        momentiOne.hours = 13;
        momentiOne.minutes = 55;

        Momenti momentiTwo = new Momenti();
        momentiTwo.hours = 14;
        momentiTwo.minutes = 32;

        /*if(momentiOne.compareTo(momentiTwo) == 1 ){
            System.out.println("perviy bil ranshe");
        }*/

        if (momentiOne.hours < momentiTwo.hours) {
            System.out.println("perviy bil ranshe");
        }else if (momentiOne.hours == momentiTwo.hours) {
            if (momentiOne.minutes < momentiTwo.minutes) {
                System.out.println("perviy moment bil ranshe");
            } else if (momentiTwo.minutes < momentiOne.minutes) {
                System.out.println("vtoroy moment bil ranshe");
            }
        }else if (momentiOne.hours > momentiTwo.hours) {
            System.out.println("btoroy moment bil ranshe");
        }

        System.out.println("ex 4.113");
        int m = 3;//month
        n = 1;//chislo
        int month = m;
        int chislo = 0;
        if (n == 1) {
            month = m - 1;
        }
        if (n == 1) {
            if (month == 1) {
                chislo = 31;
            } else if (month == 2) {
                chislo = 28;
            } else if (month == 3) {
                chislo = 31;
            } else if (month == 4) {//april
                chislo = 30;
            } else if (month == 5) {
                chislo = 31;//may
            } else if (month == 6) {
                chislo = 30;//june
            } else if (month == 7) {
                chislo = 31;//july
            } else if (month == 8) {
                chislo = 31;//august
            } else if (month == 9) {
                chislo = 30;//september
            } else if (month == 10) {
                chislo = 31;//october
            } else if (month == 11) {
                chislo = 30;//november
            } else if (month == 12) {
                chislo = 31;//december
            }
        }
        if (n != 1) {
            chislo = n - 1;
        }
        System.out.println("chislo " + chislo + " mesyac " + month);

        System.out.println("ex 8.39");
        System.out.println("ex 10.14");
        System.out.println("ex 11.94");
        System.out.println("ex 12.20");
        System.out.println("ex 13.15");


        int a = 10;
        int b = 11;
        if(false){/*true*/};
    }
}
