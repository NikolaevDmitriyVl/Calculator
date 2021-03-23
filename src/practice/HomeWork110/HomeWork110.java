package practice.HomeWork110;

import java.util.Random;

public class HomeWork110 {
    int faktorial(int f){
        int n = f;
        int faktorial = 1;
        for(int i = 1; i<=n; i++){
            faktorial = faktorial * i;
        }
        return faktorial;
    }
    public static void main(String args[]) {
        System.out.println("ex 4.118");
        int a3 = 3;
        int a2 = 5;
        int a1 = 4;
        int b2 = 4;
        int b1 = 6;
        int one = 0;
        int ten = 0;
        int hundred = 0;

        if (a1 + b1 < 10) {
            one = a1 + b1;
            if (a2 + b2 < 10) {
                ten = a2 + b2;
                hundred = a3;
            } else {
                ten = a2 + b2 - 10;
                hundred = a3 + 1;
            }
        } else {
            one = a1 + b1 - 10;
            if (a2 + b2 + 1 < 10) {
                ten = a2 + b2;
                hundred = a3;
            } else {
                ten = a2 + b2 + 1 - 10;
                hundred = a3 + 1;
            }
        }
        System.out.println(hundred + "" + ten + "" + one);


        System.out.println("ex 8.41");//???
        double k0 = 10;
        double x0 = 0;
        double y0 = 0;
        for (double i = 1; i <= 30; i++) {
            for (double j = i; j <= 30; j++) {
                if ((Math.pow(i, 2) + Math.pow(j, 2)) == Math.pow(k0, 2)) {
                    System.out.println(i + " v kvadrate + " + j + " v kvadrate = " + k0 + " v kvadrate");
                }
            }
        }

        System.out.println("ex 10.16");

        int i0 = 0;
        i0 = 0;
        int a = -5;
        int b = -1;
        for (int i = 1; i <= 200; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    i0++;
                }
            }
            if (i0 == 2) {
                a = b;
                b = i;

                if (a + 2 == b) {
                    System.out.println(a + " " + b);
                }
            }
            i0 = 0;
        }
        System.out.println("ex 11.96");
        int osadki[] = new int[50];
        Random rnd = new Random();
        int summa = 0;
        for (int i = 0; i < osadki.length; i++) {
            osadki[i] = rnd.nextInt(20) + 10;
            summa = summa + osadki[i];
        }
        int otkloneniya = 0;
        int srednee = summa / osadki.length;
        System.out.println("srednee arifmeticheskoe osadkov za 50 let = " + srednee);
        for (int i = 0; i < osadki.length; i++) {
            if (srednee > osadki[i]) {
                otkloneniya = srednee - osadki[i];
                System.out.println("osadki za " + (i + 1) + " god menshe srednego na " + otkloneniya);
            } else if (srednee < osadki[i]) {
                otkloneniya = osadki[i] - srednee;
                System.out.println("osadki za " + (i + 1) + " god bolshe srednego na " + otkloneniya);
            } else if (srednee == osadki[i]) {
                System.out.println("osadki za " + (i + 1) + " god ravni srednim osadkam ");
            }
        }
        System.out.println("ex 12.22");//???kak viravnyat ryadi?
        int dvumMassiv[][] = new int[9][9];
        i0 = 0;
        int i1 = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                dvumMassiv[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(dvumMassiv[i][j] + "\t");
            }
            System.out.println();
        }

        Random   r = new Random();
        System.out.println("ex 13.16");//??? mozno inicializirovat neskolko ob'ektov v odnoy stroke? 2. mozno ispolzovat Random pri zapolnenii ob'ektov?
        Momenti m1 = new Momenti(), m2 = new  Momenti(), m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20 = new Momenti();
        Momenti d1 = new Momenti();
        d1.hours = 1;
        d1.minutes = 2;
        d1.seconds = r.nextInt(10);
        Momenti d2 = new Momenti();
        d2.hours = 4;
        d2.hours = 5;
        d2.hours = 6;
        Momenti d3 = new Momenti();
        d3.hours = 7;
        d3.hours = 8;
        d3.hours = 9;
        Momenti[] listMomenti = new Momenti[3];
        for(int i = 1; i<=3; i++){
            listMomenti[i] = new Momenti();
            listMomenti[i].hours = r.nextInt(12);
        }





        if (d3.hours > d1.hours) {
            System.out.println("d1 bil ranshe");
        } else if (d3.hours < d1.hours) {
            System.out.println("d3 bil ranshe");
        } else if (d3.hours == d1.hours) {
            if (d3.minutes > d1.minutes) {
                System.out.println("d1 bil ranshe");
            } else if (d3.minutes < d1.minutes) {
                System.out.println("d3 bil ranshe");
            } else if (d3.minutes == d1.minutes) {
                if (d3.seconds > d1.seconds) {
                    System.out.println("d1 bil ranshe");
                } else if (d3.seconds < d1.seconds) {
                    System.out.println("d3 bil ranshe");
                } else {
                    System.out.println("dva momenta proizoshli odnovremenno)");
                }
            }
        }
        System.out.println("ex 4.119");
        int pole1Gorizont = 5;
        int pole1Vertikal = 2;//ladya

        int pole2Gorizont = 3;
        int  pole2Vertikal = 7;
        if(pole1Gorizont == pole2Gorizont || pole1Vertikal == pole2Vertikal){
            System.out.println("bita");
        }
        else{
            System.out.println("mimo");
        }
        System.out.println("ex 4.119(b");
        int poleGorizont = 3;
        int poleVertikal = 1;
        int slonGorizont = 5;
        int slonVertikal = 3;
        if((poleGorizont - slonGorizont) == (poleVertikal - slonVertikal)){
            System.out.println("bita");
        }
        else{
            System.out.println("mimo");
        }
        System.out.println("ex 4.119(c");
        int korolGorizont = 3;
        int korolVertikal = 2;
        poleGorizont = 2;
        poleVertikal = 3;
        if (poleGorizont < korolGorizont + 2 && poleGorizont > korolGorizont - 2 && poleVertikal < korolVertikal + 2 && poleVertikal > korolVertikal - 2) {
            System.out.println("bita");
        }
        else{
            System.out.println("mimo");
        }
        System.out.println("ex 4.119(d");
        int ferzGorizont = 3;
        int ferzVertikal = 5;
        if(poleGorizont == ferzGorizont || poleVertikal == ferzVertikal    || (poleGorizont - ferzGorizont) == (poleVertikal - ferzVertikal)){
            System.out.println("bita");
        }
        else{
            System.out.println("mimo");
        }
        System.out.println("ex 4.119(e");
        int peshkaGorizont = 2;
        int peshkaVertikal = 3;
        if(poleGorizont == peshkaGorizont && (poleVertikal == peshkaVertikal+1 || poleVertikal == peshkaVertikal+2)){
            System.out.println("mozet");
        }
        else{
            System.out.println("no");
        }
        System.out.println("ex 4.119(e(b");
        if(poleGorizont+1 == peshkaGorizont && poleVertikal+1 == peshkaVertikal || poleVertikal-1 == peshkaVertikal){
            System.out.println("mozet");
        }
        else{
            System.out.println("no");
        }

        System.out.println("ex 8.42");//???
        int m = 10;
        int n = 3;
        double summa0 = 0;
        for(int i =1; i<=m; i++){
            summa0 = summa0 + Math.pow(i,n);
            System.out.println(summa0);
        }

        System.out.println("ex 10.17");
        HomeWork110 answer = new HomeWork110();
        System.out.println("FAKTORIAL " + ((2*answer.faktorial(5)) + (3*answer.faktorial(8)))/(answer.faktorial(6)+answer.faktorial(4)));

        System.out.println("ex 11.97");
        int massiv[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sredneeZnachenie = 0;
        summa = 0;
        int max = 0;
        for(int i = 0; i<massiv.length; i++){
        summa = summa + massiv[i];
        if(max<massiv[i]){
            max = massiv[i];
        }
        }
        sredneeZnachenie = summa/massiv.length;
        int blizkoe1 = 0;
        int blizkoe2 = max;
        i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] == sredneeZnachenie) {
              blizkoe1 = massiv[i]-sredneeZnachenie;
            }
            else if (massiv[i] > sredneeZnachenie) {
                blizkoe1 = massiv[i]-sredneeZnachenie;
            } else if (massiv[i] < sredneeZnachenie) {
                blizkoe1 = sredneeZnachenie - massiv[i];
            }
            if (blizkoe1 < blizkoe2) {
                blizkoe2 = blizkoe1;
                i0 = (i+1);
            }
        }
        System.out.println(i0);







    }
}
