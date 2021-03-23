package practice;

import java.util.Random;

public class HomeWork077 {
    public static void main(String[] args){
        System.out.println("ex 4.56");
        int chislo = 23;
        int a = 4;
        int b = 7;
        if(chislo%10 == a || chislo% 10 == b || chislo/10 == a|| chislo/10 == b){
            System.out.println("yes");
        }
        else{
            System.out.println("chislo ne vhodit");
        }
        System.out.println("ex 4.56(b");
        a = 3;
        b = 6;
        int c = 9;
        int ten = chislo/10;
        int one = chislo%10;
        if (a == ten || b == ten || c == ten || a == one || b == one || c == one) {
            System.out.println("chislo vhodit");
        }
        else{
            System.out.println("chislo ne vhodit");
        }

        System.out.println("ex 5.56");
        int n = 6;
        int q0[] = {1,2,3,4,5,6};
        double summa0 = 0;
        for(int i = 0; i<q0.length; i++){
            summa0 = summa0 + Math.abs(q0[i]);
        }
        System.out.println(summa0);
        System.out.println("ex 5.56(b");
        summa0 = 1;
        for(int i = 0; i<q0.length; i++){
            summa0 = summa0 * Math.abs(q0[i]);
        }
        System.out.println(summa0);

        System.out.println("ex 5.56(c");
        int summa = 0;
        int q01[] = new int[q0.length-1];
        for(int i = 0; i<q01.length; i++){
            q01[i] = q0[i] + q0[i+1];
        }
        for(int i = 0; i<q01.length; i++){
            System.out.println(q01[i]);
        }
        System.out.println("ex 5.56(d");
        summa = 0;
        int znak = 1;
        for(int i = 0;i<q0.length; i++){
            summa = summa + (q0[i]*znak);
            znak = znak * (-1);
        }
        System.out.println(summa);

        System.out.println("ex 6.79");
        int m = 20;
        int m0 = 0;
        int g = 2;
        int z = 3;
        for(int i = 0; m0<=20;i++){
            m0 = g * z;
            g = m0;
        }
        if(m0 == m){
            System.out.println("chislo  m prisutstvuet");
        }
        else{
            System.out.println("chislo m otsutstvuet");
        }

        System.out.println("ex 7.80");
        n = 7;
        int ochered[]  = {7,6,5,1,2,3,4};
        int tMaloe = ochered[0];
        int tMaloe0 = 0;
        for(int i = 0; i<ochered.length; i++){
            if(tMaloe>ochered[i]){
                tMaloe = ochered[i];
                tMaloe0 = i+1;
            }
        }
        System.out.println(tMaloe0);

        System.out.println("ex 11.59");
        int massiv[] = {1,-2,3,-4,5,-6,7,-8};
        int summaPolozitelnih = 0;
        double summaOtricatelnih = 0;
        for(int i = 0;i<massiv.length; i++){
            if (massiv[i] > 0) {
            summaPolozitelnih = summaPolozitelnih + massiv[i];
            }
            else{
              summaOtricatelnih = summaOtricatelnih + Math.abs(massiv[i]);
            }
        }
        System.out.println(summaPolozitelnih / (int)summaOtricatelnih);

        System.out.println("ex 12.2");
        int w[][] = {{12,11,10,9},
                {8,7,6,5},
                {4,3,2,1},
                {20,19,18,17}};
        System.out.println(w[3][3]);
        System.out.println("ex 12.2(b");
        System.out.println(w[0][0]);

        System.out.println("ex 12.3");
        int e[][] = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(e[1][2]);
        System.out.println("ex 12.3(b");
        System.out.println(e[2][2]);

        System.out.println("ex 4.57");
        n = 4;
        chislo = 123;
        int hundred = chislo/100;
        int ostatokHundred = chislo%100;//23
        ten = ostatokHundred/10;
        one = ostatokHundred%10;
        if(hundred == n || ten == n || one == n ){
            System.out.println("cifra n vhodit v chislo ");
        }
        else{
            System.out.println("cifra n ne vhodit v chislo");
        }
        System.out.println("ex 4.57(b");
        if(hundred == 6 || ten == 6 || one == 6){
            System.out.println("cifra 6 vhodit v chislo");
        }
        else{
            System.out.println("cifra 6 ne vhodit v chislo");
        }

        System.out.println("ex 5.57");
        int uchenik1[] = {2,3,4,3};
        int uchenik2[] = {5,4,3,1};
        int summa1 = 0;
        int summa2 = 0;
        for(int i = 0;i< uchenik1.length; i++){
            summa1 = summa1 + uchenik1[i];
            summa2 = summa2 + uchenik2[i];
        }
        System.out.println("summa ocenok 1 uchenika = " + summa1);
        System.out.println("summa ocenok 2 uchenika = " + summa2);

        System.out.println("ex 6.80");
        chislo = 123099;
        int cifra = 0;
        int i1 = 0;
        int i2 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            if (cifra == 9) {
                i1++;
            }
            if (cifra == 0) {
                i2++;
            }
        }
        if (i1 > i2) {
            System.out.println("cifra 9 vstrechaetsya chashhe chem 0");
        }
        else{
            System.out.println("cifra 0 vstrechaetsya chashhe chem 9");
        }

        System.out.println("ex 7.81");
        n = 8;
        summa = 0;
        int x[] = {1,2,3,4,5,6,7,8};
        int maxSumma = x[0]+ x[1];
        for(int i = 0; i<x.length-1; i++){
            summa = x[i]+x[i+1];
            if (maxSumma < summa) {
                maxSumma = summa;
            }
        }
        System.out.println(maxSumma);
        System.out.println("ex 7.81(b");
        int minSumma = x[0]+x[1];
        summa = 0;
        for(int i = 0; i<x.length-1; i++){
            summa = x[i]+x[i+1];
            if (minSumma > summa) {
                minSumma = summa;
            }
        }
        System.out.println(minSumma);
        System.out.println("ex 7.81(c");
        int porNomMax1 = 0;
        int porNomMax2 = 0;
        maxSumma = x[0]+ x[1];
        summa = 0;
        for(int i = 0; i<x.length-1; i++){
            summa = x[i]+x[i+1];
            if (maxSumma < summa) {
                maxSumma = summa;
                porNomMax1 = i;
                porNomMax2 = i+1;
            }
        }
        System.out.println("poryadkovie nomera maxsimalnoy pari = "  + porNomMax1 + " i " + porNomMax2);
        System.out.println("ex 7.81(d");
        int porNomMin1 = 0;
        int porNomMin2 = 0;
        minSumma = x[0] + x[1];
        summa = 0;
        for(int i = 0; i<x.length-1; i++){
            summa = x[i] + x[i+1];
            if (minSumma >= summa) {
                minSumma = summa;
                porNomMin1 = i;
                porNomMin2 = i+1;
            }
        }
        System.out.println("poryadkovie nomera maximalnoy pari = " + porNomMin1 + " i " + porNomMin2);

        System.out.println("ex 11.60");
        int massiv1[] = {1,200,3,4,5,6};
        summa = 0;
        for(int i = 0; i<massiv1.length; i++){
            if (massiv1[i] > 20) {
                summa = summa + massiv1[i];
            }
        }
        if (summa > 100) {
            System.out.println("summa > 100");
        }
        else{
            System.out.println("summa ne > 100");
        }
        System.out.println("ex 11.60(b");
        summa = 0;
        for(int i = 0; i<massiv1.length; i++){
            if (massiv1[i] < 50) {
                summa = summa + massiv1[i];
            }
        }
        if (summa % 2 == 0) {
            System.out.println("chislo chetnoe");
        }
        else{
            System.out.println("chislo ne chetnoe");
        }

        System.out.println("ex 12.4");
        int w0[][] = {{1,2,3},
                {3,2,1}};
        System.out.println(w0[1][2]);
        System.out.println("ex 12.4(b");
        System.out.println(w0[1][1]);

        System.out.println("ex 12.5");
        int e0[][] = {{1,2,3,4},{9,8,7,6},{10,11,12,13},{14,15,16,17},{18,19,20,21}};
        for(int i = 0; i<e0[4].length; i++){
            System.out.print(e0[4][i] + " ");
        }

        System.out.println("\n" + "ex 12.5(b");
        int s = 2;
        for(int i = 0;i<=e0[4].length; i++){
            System.out.println(e0[i][s]);
        }

        System.out.println("ex 4.58");
        chislo = 123;
        hundred = chislo/100;
        ostatokHundred = hundred%100;
        ten = ostatokHundred/10;
        one = ostatokHundred%10;
        if(hundred == 4 || hundred == 7 || ten == 4 || ten == 7 || one == 4 || one == 7){
            System.out.println("cifra 4 ili 7 vhodit v chislo");
        }
        else{
            System.out.println("cifra 4 ili 7 ne vhodyat v chislo");
        }
        System.out.println("ex 4.58(b");
        if(hundred == 3 || hundred == 6 || hundred == 9 || ten == 3 || ten == 6 || ten == 9 || one == 3 || one == 6 || one == 9 ){
            System.out.println("cifra 3 ili 6 ili 9 vhodit v chislo");
        }
        else{
            System.out.println("cifra 3 ili 6 ili 9 ne vhodit v chislo");
        }

        System.out.println("ex 5.58");
        int sportsmen1[] = {10,11,12,13,14};
        int sportsmen2[] = {20,21,22,23,24};
        summa1 = 0;
        summa2 = 0;
        for(int i = 0; i<sportsmen1.length; i++){
            summa1 = summa1 + sportsmen1[i];
            summa2 = summa2 + sportsmen2[i];
        }
        System.out.println("summa 1 sportsmena = " + sportsmen1);
        System.out.println("summa 2 sportsmena = " + sportsmen2);

        System.out.println("ex 6.81");
        chislo = 1233;
        a = 2;
        b = 3;
        cifra = 0;
        i1 = 0;
        i2 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            if (cifra == a) {
                i1++;
            }
            if (cifra == b) {
                i2++;
            }
        }
        if (a < b) {
            System.out.println("a vstrechaetsya reze chem b");
        }
        if (a > b) {
            System.out.println("a vstrechaetsya chashhe chem b");
        }

        System.out.println("ex 7.82");//???
        int summaOchkov[] = new int[10];
        Random rnd = new Random();
        int mesto1 = 0;
        int mesto2 = 0;
        int mesto3 = 0;
        for(int i = 0;i<summaOchkov.length; i++){
            summaOchkov[i] = rnd.nextInt(10);
            System.out.println(summaOchkov[i]);
            if(mesto1<summaOchkov[i]){
                if (mesto2 < mesto1) {
                    mesto2 = mesto1;
                }
                mesto1 = summaOchkov[i];

            }
            else if(mesto1==summaOchkov[i]){
                mesto3 = mesto2;
                mesto2 = mesto1;
                mesto1 = summaOchkov[i];
            }
            else if (mesto2 < summaOchkov[i]) {
                if (mesto3 < mesto2) {
                    mesto3 = mesto2;
                }
                mesto2 = summaOchkov[i];
            }
            else if (mesto2 == summaOchkov[i]){
                mesto3 = mesto2;
                mesto2 = summaOchkov[i];
            }
            else if(mesto3 <= summaOchkov[i]){
                mesto3 = summaOchkov[i];
            }

            }


        System.out.println("mesto 1 = " + mesto1 + " mesto 2 = " + mesto2 + " mesto 3 = " + mesto3);

        System.out.println("ex 11.61");
        int osadkiFevralya[] = new int[28];
        Random rnd1 = new Random();
        int chetnie = 0;
        int neChetnie = 0;
        for(int i = 0; i<osadkiFevralya.length; i++){
            osadkiFevralya[i] = rnd1.nextInt(20);
            if (i % 2 == 0) {
                chetnie = chetnie + osadkiFevralya[i];
            }
            if(i%2 >0){
                neChetnie = neChetnie + osadkiFevralya[i];
            }
        }
        if (chetnie > neChetnie) {
            System.out.println("po chetnim vipalo bolshe osadkov");
        }
        if (chetnie < neChetnie) {
            System.out.println("po ne chetnim vipalo bolshe osadkov");
        }

        System.out.println("ex 12.6");
        int t0[][] = {{1,2,3},{3,2,1},{4,5,6},{7,8,9}};
        for(int i = 0; i<t0.length; i++){
            System.out.println(t0[i][1]);
        }
        System.out.println("ex 12.6(b");
        m = 2;
        for(int i = 0; i<t0.length-1; i++){//???
            System.out.println(t0[m][i]);
        }

        System.out.println("ex 12.7");
        int y[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        y[4][1] = 1949;
        for(int i = 0; i<y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.print(y[i][j] + " ");
            }

        }
        System.out.println(" ");

        System.out.println("ex 12.7(b");
        a = 1234;
        y[2][2] = a;
        for(int i = 0; i<y.length; i++){
            for(int j = 0; j < y[i].length;j++){
                System.out.print(y[i][j] + " ");
            }
        }

    }
}
