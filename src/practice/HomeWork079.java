package practice;

import java.util.Random;

public class HomeWork079 {
    public static void main(String[] args) {
        System.out.println("ex 4.59");
        int chislo = 1234;
        int thousand = chislo / 1000;//1
        int ostThousand = chislo % 1000;//234
        int hundred = ostThousand / 100;//2
        int ostHundred = ostThousand % 100;//34
        int ten = ostHundred / 10;//3
        int one = ostHundred % 10;//4
        if (thousand == 4 || hundred == 4 || ten == 4 || one == 4) {
            System.out.println("cifra 4 vhodit v chislo");
        } else {
            System.out.println("cifra 4 ne vhodit v chislo");
            System.out.println("ex 4.59(b");
            int b = 5;
            if (thousand == b || hundred == b || ten == b || one == b) {
                System.out.println("cifra b vhodit v chislo");
            } else {
                System.out.println("cifra b ne vhodit v chislo");
            }
        }

        System.out.println("ex 5.59");
        double a0[] = new double[20];
        double b0[] = new double[20];
        Random rnd = new Random();
        Random rnd0 = new Random();
        double summa01 = 0;
        double summa02 = 0;
        for (int i = 0; i < a0.length; i++) {
            a0[i] = rnd.nextDouble() * 20;
            summa01 = summa01 + a0[i];
            b0[i] = rnd0.nextDouble() * 20;
            summa02 = summa02 + b0[i];
        }
        double sredneeAr01 = summa01 / a0.length;
        double sredneeAr02 = summa02 / b0.length;
        System.out.println("sredniy vozrast uchenikov klassa1 = " + sredneeAr01);
        System.out.println("sredniy vozrast uchenikov klassa2 = " + sredneeAr02);

        System.out.println("ex 6.82");
        chislo = 123456;
        int cifra = 0;
        int maxCifra = 0;
        int minCifra = 9;
        int i0 = 0;
        while (chislo < 0) {
            cifra = chislo % 10;
            if (maxCifra < cifra) {
                maxCifra = cifra;
            }
            if (minCifra > cifra) {
                minCifra = cifra;
            }
        }
        int raznica = maxCifra - minCifra;
        if (raznica % 2 == 0) {
            System.out.println("raznica chetnoe chislo");
        } else {
            System.out.println("raznica ne chetnoe chislo");
        }

        System.out.println("ex 7.83");
        int beguni[] = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i1 = beguni[0];
        int j = 1000 * 1000;
        int k = 1000 * 1000;
        int m = 1000 * 1000;
        for (int i = 1; i < beguni.length; i++) {
            if (i1 >= beguni[i]) {
                m = k;
                k = j;
                j = i1;
                i1 = beguni[i];

            } else if (j > beguni[i]) {
                m = k;
                k = j;
                j = beguni[i];
            } else if (k > beguni[i]) {
                m = k;
                k = beguni[i];
            } else if (m > beguni[i]) {
                m = beguni[i];
            }
        }
        int summa = 0;
        summa = i1 + j + k + m;
        System.out.println("i = " + i1 + " j = " + j + " k = " + k + " m = " + m + " summa = " + summa);

        System.out.println("ex 11.62");
        int ziteli[] = new int[10];
        Random rnd1 = new Random();
        int chetnie[] = new int[ziteli.length];
        i1 = 0;
        int i2 = 0;
        int summaChetnih = 0;
        int summaNeChetnih = 0;
        int neChetnie[] = new int[ziteli.length];
        for (int i = 0; i < ziteli.length; i++) {
            ziteli[i] = rnd1.nextInt(30);
            if (i % 2 == 0) {
                chetnie[i1] = ziteli[i];
                summaChetnih = summaChetnih + chetnie[i1];
                i1++;
            }
            if (i % 2 > 0) {
                neChetnie[i2] = ziteli[i];
                summaNeChetnih = summaNeChetnih + neChetnie[i2];
                i2++;
            }
        }
        if (summaChetnih > summaNeChetnih) {
            System.out.println("summa chetnih domov bolshe");
        }
        if (summaNeChetnih > summaChetnih) {
            System.out.println("summa ne chetnih domov bolshe");
        }

        System.out.println("ex 12.11");
        int q[][] = {{1, 2, 3},
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}};
        int levVerh = q[0][0];
        int pravNiz = q[q.length - 1][q[q.length - 1].length - 1];
        summa = levVerh + pravNiz;
        System.out.println(summa);
        System.out.println("ex 12.11(b");
        int pravVerh = q[0][q[0].length - 1];
        int nizLevo = q[q.length - 1][0];
        int srAr = (levVerh + pravNiz + pravVerh + nizLevo) / 4;
        System.out.println(srAr);

        System.out.println("ex 12.13");
        int w[][] = {{21, 20, 19},
                {18, 17, 16},
                {15, 14, 13},
                {12, 11, 10}};
        summa = w[1][2] + w[2][2];
        System.out.println(summa);
        System.out.println("ex 12.13(b");
        int proizvedenie = w[1][0] + w[1][1];
        System.out.println(proizvedenie);

        System.out.println("ex 12.14");
        int e[][] = {{31, 32, 33, 1, 2}, {34, 35, 36, 1, 2}, {37, 38, 39, 1, 2}, {40, 41, 42, 1, 2}};
        summa = e[1][0] + e[1][1];
        System.out.println("ex 12.15");
        proizvedenie = e[0][4] * e[2][4];
        System.out.println(proizvedenie);

        System.out.println("ex 4.60");
        chislo = 1234;
        thousand = chislo / 1000;
        ostThousand = chislo % 1000;
        hundred = ostThousand / 100;
        ostHundred = ostThousand % 100;
        ten = ostHundred / 10;
        one = ostHundred % 10;
        if (thousand == 2 || thousand == 7 || hundred == 2 || hundred == 7 || ten == 2 || ten == 7 || one == 2 || one == 7) {
            System.out.println("cifra 2 ili 7 vhodit v chislo");
        } else {
            System.out.println("cifra 2 ili 7 ne vhodit v chislo");
        }

        System.out.println("ex 5.60");
        int yanvar[] = new int[31];
        int mart[] = new int[31];
        Random rnd2 = new Random();
        Random rnd3 = new Random();
        int summaYan = 0;
        int summaMar = 0;
        int srArYan = 0;
        int srArMar = 0;
        for (int i = 0; i < yanvar.length; i++) {
            yanvar[i] = rnd2.nextInt(20);
            mart[i] = rnd3.nextInt(30);
            summaYan = summaYan + yanvar[i];
            summaMar = summaMar + mart[i];
        }

        srArYan = summaYan / yanvar.length;
        srArMar = summaMar / mart.length;
        System.out.println("srednee kolichestvo osadkov za yanvar = " + srArYan);
        System.out.println("srednee kolichestvo osadkov za mart = " + srArMar);

        System.out.println("ex 6.83");
        chislo = 1234;
        int chislo0 = chislo;
        cifra = 0;
        maxCifra = 0;
        i0 = 0;
        int a = 3;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
            if (cifra > maxCifra) {
                maxCifra = cifra;
            }
        }
        System.out.println(maxCifra);
        minCifra = maxCifra;
        cifra = 0;
        summa = 0;
        while (chislo0 > 0) {
            cifra = chislo0 % 10;
            chislo0 = chislo0 / 10;
            if (minCifra > cifra) {
                minCifra = cifra;
            }
        }
        a = 2;
        summa = maxCifra + minCifra;
        if (summa % a == 0) {
            System.out.println("summa kratna chislu a");
        } else {
            System.out.println("summa ne kratna chislu a");
        }

        System.out.println("ex 7.84");
        int chislo1[] = new int[20];
        int chislo2[] = new int[20];
        Random rnd4 = new Random();
        Random rnd5 = new Random();
        i1 = 0;
        i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i = 0; i < chislo1.length; i++) {
            chislo1[i] = rnd4.nextInt(9);
            chislo2[i] = rnd5.nextInt(9);
            if (chislo1[i] > chislo2[i]) {
                System.out.println("viigrish");
                i1++;
            }
            if (chislo1[i] == chislo2[i]) {
                System.out.println("nishhya");
                i3++;
            }
            if (chislo1[i] < chislo2[i]) {
                System.out.println("proigrish");
                i2++;
            }
            if (chislo1[i] - chislo2[i] >= 3) {
                i4++;
            }
        }
        System.out.println("ex 7.84(b");
        System.out.println("kolichestvo viigrishey = " + i1);
        System.out.println("ex 7.84(c");
        System.out.println("kolichestvo viigrishey = " + i1 + " kolichestvo proigrishey = " + i2);
        System.out.println("ex 7.84(d");
        System.out.println("kolichestvo viigrishey = " + i1 + " kolichestvo proigrishey = " + i2 + " kolichestvo nishhih = " + i3);
        System.out.println("ex 7.84(e");
        System.out.println("raznost = " + i4);
        System.out.println("ex 7.84(d");
        System.out.println("obshhee kolichestvo ochkov = " + ((i1*3)+(i3*1)));

        System.out.println("ex 11.63");
        i1 = 0;
        int r[] = {1,2,3,0,-20,-19,-18,-17};
        for(int i = 0; i<r.length; i++) {
            if (r[i] >= 0) {
                i1++;
            }
        }
            System.out.println("kolichestvo ne otricatelnih chisel = " + i1);

        System.out.println("ex 12.15");
        int y[][] = {{1,2,3,4,5},{4,5,6,7,8},{7,8,9,10,11},{10,11,12,13,14},{13,14,15,16,17}};
        summa = y[1][3] + y[1][2];
        System.out.println(summa);
        System.out.println("ex 12.15(b");
        summa = y[2][4] + y[3][4];
        System.out.println(summa);

        System.out.println("ex 12.16");
        int raznost = y[0][3] - y[4][2];
        System.out.println(raznost);
        System.out.println("ex 12.16(b");
        double sredneeGeometricheskoe = Math.sqrt(y[2][3]*y[4][0]);
        System.out.println(sredneeGeometricheskoe);

        System.out.println("ex 4.61");
        chislo = 1234;
        thousand = chislo/1000;//1
        ostThousand = thousand%1000;//234
        hundred = ostThousand/100;//2
        ostHundred = ostThousand%100;//34
        ten = ostHundred/10;//3
        one  = ostHundred%10;//4

        System.out.println("ex 5.61");
        int klass1[] = {1,2,3,4,5,6,7,8,9,10};
        int klass2[] = {11,12,13,14,15,16,17,18,19,20};
        int summa1 = 0;
        int summa2 = 0;
        int srAr1 = 0;
        int srAr2 = 0;
        for(int i = 0; i<klass1.length; i++){
            summa1 = summa1 + klass1[i];
            summa2 = summa2 + klass2[i];
        }
        srAr1 = summa1/klass1.length;
        srAr2 = summa2 /klass2.length;
        System.out.println("sredniy rost uchenikov klassa 1 = " + srAr1);
        System.out.println("sredniy rost uchenikov klassa 2 = " + srAr2);

        System.out.println("ex 6.84");
        chislo = 12345;
        cifra = 0;
        maxCifra = 0;
        minCifra = 9;
        i1 = 0;
        i2 = 0;
        int schetchik = 1;
        while (chislo > 0) {
     cifra = chislo%10;
     chislo = chislo/10;
     schetchik++;
            if (maxCifra < cifra) {
                maxCifra = cifra;
                i1 = schetchik;
            }
            if (minCifra > cifra) {
                minCifra = cifra;
                i2 = schetchik;
            }
        }
        if (i1 > i2) {
            System.out.println("maxCifra levee");
        }
        if (i2 > i1) {
            System.out.println("minCifra levee");
        }

        System.out.println("ex 7.85");
        int u[] = new int[20];
        Random rnd6 = new Random();
        for(int i = 0; i<u.length; i++){
            u[i] = rnd6.nextInt(90);
            System.out.println("zabitih = " + u[i]/10 + " propushhenih = " + u[i]%10);
        }

        System.out.println("ex 11.64");
        int massiv[] = {1,2,6,4,5,6};
        i0 = 0;
        System.out.println(massiv[massiv.length-1]);
        for(int i = 0; i<massiv.length; i++){
            if(massiv[i]> massiv[massiv.length-1] || massiv[i] < massiv[massiv.length-1]){
                i0++;
            }
        }
        System.out.println(i0);
        System.out.println("ex 11.64");
        a = 3;
        i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] % a == 0) {
               i0++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 12.17");
        int o[][] = {{1,2,3},
                {4,5,6},
                {7,8,6}};
        if(o[o.length-1][0] < o[o.length-1][o[o.length-1].length-1]){
            System.out.println("element v pravom niznem uglu menshe chem element v levom niznem uglu");
        }
        if (o[o.length-1][o[o.length-1].length-1]< o[o.length-1][0]){
            System.out.println("element v levom viznem uglu menshe chem element v pravom niznem uglu");
        }
        System.out.println("ex 12.17(b");
        if(o[0][o[0].length-1] < o[o.length-1][0]){
            System.out.println("v verhnem pravom uglu element menshe chem v niznem levom");
        }
        if(o[o.length-1][0] < o[0][o[0].length-1]){
            System.out.println("v niznem levom uglu element menshe chem v verhnem levom");
        }
        System.out.println("ex 12.18");
        int p[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        if(p[0][0]>p[0][p[0].length-1]){
            System.out.println("v verhnem levom uglu element bolshe chem v verhnem pravom");
        }
            if(p[0][p[0].length-1]>p[0][0]){
                System.out.println("v verhnem pravom uglu element bolshe chem v verhnem levom");
            }
            System.out.println("ex 12.18(b");
            if(p[p.length-1][p[p.length-1].length-1] < p[0][0]){
            System.out.println("nizniy praviy element menshe chem verhniy leviy");
        }
            if(p[0][0] < p[p.length-1][p[p.length-1].length-1]){
                System.out.println("verhniy leviy element menshe chem nizniy praviy");
            }
        }
        }