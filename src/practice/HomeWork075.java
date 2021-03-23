package practice;

import java.util.Random;

public class HomeWork075 {
    public static void main(String[] args) {
        System.out.println("ex 4.50");
        int a = 3;
        int b = 5;
        int c = 2;
        int d = 3;
        int maxStoronaAB = 0;
        int minStoronaAB = 0;
        int maxStoronaCD = 0;
        int minStoronaCD = 0;
        if (a > b) {
            maxStoronaAB = a;
            minStoronaAB = b;
        } else {
            maxStoronaAB = b;
            minStoronaAB = a;
        }
        if (c > d) {
            maxStoronaCD = c;
            minStoronaCD = d;
        } else {
            maxStoronaCD = d;
            minStoronaCD = c;
        }
        if (maxStoronaAB > maxStoronaCD && minStoronaAB > minStoronaCD) {
            System.out.println("pryamougolnik pomestitsya");
        } else {
            System.out.println("pryamougolnik ne pomestitsya");
        }

        System.out.println("ex 5.50");
        int q[] = {1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        int summa = 0;
        int sredneeArifmeticheskoe = 0;
        for (int i = 0; i < q.length; i++) {
            summa = summa + q[i];
        }
        sredneeArifmeticheskoe = summa / q.length;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 6.72");
        int komandi[] = new int[10];
        Random rnd = new Random();
        int i0 = 0;
        for (int i = 0; i < komandi.length; i++) {
            komandi[i] = rnd.nextInt(20);
        }

        for (int i = 0; i < komandi.length - 1; i++) {
            if (komandi[i] > komandi[i + 1]) {
                i0++;
            }
        }
        if (i0 == komandi.length - 1) {
            System.out.println("mesta rasstavleni pravilno");
        } else {
            System.out.println("mesta rasstavleni ne pravilno");
        }

        System.out.println("ex 7.74");
        int n = 10;
        int w[] = {1, 2, 10, 7, 10, 9, 10, 2, 3, 4};
        i0 = 1;
        int maxChislo1 = w[0];
        int maxChislo2 = w[0];
        for (int i = 1; i < n; i++) {
            if (maxChislo2 == w[i]) {
                i0++;
            }
            if (maxChislo1 < w[i]) {
                maxChislo1 = w[i];
                i0 = 1;
                maxChislo2 = maxChislo1;
            }
        }
        System.out.println(i0);
        System.out.println("ex 7.74(b");
        int minChislo = w[0];
        int minChislo2 = w[0];
        i0 = 1;
        for (int i = 1; i < n; i++) {
            if (minChislo2 == w[i]) {
                i0++;
            }
            if (minChislo > w[i]) {
                minChislo = w[i];
                i0 = 1;
                minChislo2 = minChislo;
            }
        }
        System.out.println(i0);

        System.out.println("ex 11.41");
        int e[] = {1, 2, 3, 4, 5, 6};
        String chetnie = "";
        String neChetnie = "";
        int chetn[] = new int[e.length];
        int neChetn[] = new int[e.length];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] % 2 == 0) {
                chetn[i1] = e[i];
                chetnie = chetnie + chetn[i1] + " ";
                i1++;
            } else {
                neChetn[i2] = e[i];
                neChetnie = neChetnie + neChetn[i2] + " ";
                i2++;
            }
        }
        System.out.print(chetnie);
        System.out.print("\n" + neChetnie + "\n");

        System.out.println("ex 11.42");
        int r[] = {1, 2, 3, 10, 4, 5, 100, 6, 7, 10};
        int nomeraElementov[] = new int[r.length];
        i0 = 0;
        for (int i = 0; i < r.length; i++) {
            if (r[i] % 10 == 0) {
                nomeraElementov[i0] = i;
                i0++;
            }
        }
        for (int i = 0; i < i0; i++) {
            System.out.print(nomeraElementov[i] + " ");
        }
        System.out.println();

        System.out.println("ex 4.51");
        a = 12;
        b = 10;
        c = 8;
        d = 6;
        if (a >= c + 1 && b >= d + 1) {
            System.out.println("konvert pomestitsya");
        } else {
            System.out.println("konvert ne pomestitsya");
        }

        System.out.println("ex 5.51");
        n = 6;
        double q0[] = {3.2, 5.6, 7.8, 9.1, 4.2, 8.1};
        double summa0 = 0;
        double sredneeArifmeticheskoe0 = 0;
        for (int i = 0; i < n; i++) {
            summa0 = summa0 + q0[i];
        }
        sredneeArifmeticheskoe0 = summa0 / n;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 6.73");
        int t[] = {1, 1, 1, 1, 1, 1};
        a = t[0];
        b = 0;
        for (int i = 1; i < t.length; i++) {
            if (a == t[i]) {
                b++;
            }
        }
        if (b == t.length - 1) {
            System.out.println("chisla odinakovie");
        } else {
            System.out.println("chisla ne odinakovie");
        }

        System.out.println("ex 7.75");
        int kolvo[] = {125, 78, 956, 342, 956, 99};
        int bolshe2 = kolvo[0];
        int bolshe1 = kolvo[0];
        i0 = 1;
        for (int i = 1; i < kolvo.length; i++) {
            if (bolshe2 == kolvo[i]) {
                i0++;
            }
            if (bolshe1 < kolvo[i]) {
                bolshe1 = kolvo[i];
                i0 = 1;
                bolshe2 = bolshe1;
            }
        }
        System.out.println(i0);

        System.out.println("ex 11.43");
        int osadki[] = new int[31];
        Random rnd1 = new Random();
        int a1[] = new int[osadki.length];
        i0 = 0;
        for (int i = 0; i < osadki.length; i++) {
            osadki[i] = rnd1.nextInt(10);
            if (osadki[i] == 0) {
                a1[i0] = i + 1;
                i0++;
            }
        }
        if (i0 == 0) {
            System.out.println("ne bilo dney kogda osadkov ne bilo");
        } else {
            for (int i = 0; i < i0; i++) {
                System.out.println(a1[i]);
            }
        }

        System.out.println("ex 11.44");
        int komandi0[] = new int[10];
        Random rnd2 = new Random();
        int nomera[] = new int[komandi0.length];
        i0 = 0;
        for (int i = 0; i < komandi0.length; i++){
            komandi0[i] = rnd2.nextInt(4)+1;
            if (komandi0[i] < 3) {
                nomera[i0] = i+1;
                i0++;
            }
        }
        if (i0 == 0) {
            System.out.println("komand oderzashhih menee treh pobed net");
        }
        else{
            for(int i = 0; i<i0; i++){
                System.out.print(nomera[i] + " ");
            }
        }

        System.out.println("ex 4.52");
        a = 30;
        b = 25;
        int x = 0;
        d = 23;
        if (a > b) {
            x = b;
        }
        if (a < b) {
            x = a;
        }
        if (d + 1 < x) {
            System.out.println("golova prolezet");
        }
        else{
            System.out.println("golova ne prolezet");
        }

        System.out.println("ex 5.52");
        int ocenki[] = new int[20];
        Random rnd3 = new Random();
        summa = 0;
        sredneeArifmeticheskoe = 0;
        for(int i = 0; i<ocenki.length; i++){
            ocenki[i] = rnd3.nextInt();
            summa = summa + ocenki[i];
        }
        sredneeArifmeticheskoe = summa/ocenki.length;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 6.74");
        int y[] = {1,2,3,4,-5};
        int u = y[0];
        a = 0;
        for(int i = 1; i<y.length; i++){
            if(u == y[i]){
                a++;
            }
        }
        if(a == y.length-1){
            System.out.println("chisla ravni");
        }
        else{
            System.out.println("chisla ne ravni");
        }

        System.out.println("ex 6.76");
        int k = 24;
        if(k%3 == 0 ){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println("ex 6.76(b");
        if(k%5 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("ex 7.76");
        int temperatura[] = new int[30];
        Random rnd4 = new Random();
        int naimenshaya2 = temperatura[0];
        int naimenshaya1 = temperatura[0];
        i0 = 0;
        for(int i = 0; i<temperatura.length; i++){
            temperatura[i] = rnd4.nextInt(20);
            if(naimenshaya2 == temperatura[i]){
                i0++;
            }
            if(naimenshaya1 > temperatura[i]){
                naimenshaya1 = temperatura[i];
                i0 = 0;
                naimenshaya2 = naimenshaya1;
            }
        }
        System.out.println(i0);

        System.out.println("ex 11.45");
        int o[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i< o.length; i+=2){
            System.out.print(o[i+1] + " ");
        }
        System.out.println();
        for(int i = 0; i<o.length; i+=2){
            System.out.print(o[i] + " ");
        }
System.out.println();

        System.out.println("ex 11.46");
        double p[] = {1.1,-2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1};
        double absolyutnayaVelichina[] = new double[p.length];
        for(int i = 0; i<p.length; i++){
            if(p[i]<0){
                absolyutnayaVelichina[i] = Math.abs(p[i]);
            }
            else{
                absolyutnayaVelichina[i] = p[i];
            }
            System.out.println(absolyutnayaVelichina[i]);
        }
        System.out.println("ex 11.46(b");
        double kvadratniyKoren[] = new double[p.length];
        for(int i = 0; i<p.length; i++){
            if(i%2>0){
                kvadratniyKoren[i] = Math.pow(p[i],2);
            }
            else{
                kvadratniyKoren[i] = p[i];
            }
            System.out.println(kvadratniyKoren[i]);
        }


    }
    }

