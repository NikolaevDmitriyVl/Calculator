package practice;

import java.util.Random;

public class HomeWork076 {
    public static void main(String[] args) {
        System.out.println("ex 4.53");
        int a = 1;
        int b = 2;
        int c = 3;
        int x = 2;
        int y = 4;
        int visotaKirpicha = 0;
        int shirinaKirpicha = 0;
        int dlinaKirpicha = 0;
        int dlinaOtverstiya = 0;
        int shirinaOtverstiya = 0;
        if (a > b && a > c) {
            dlinaKirpicha = a;
        }
        if (b > a && b > c) {
            dlinaKirpicha = b;
        }
        if (c > a && c > b) {
            dlinaKirpicha = c;
        }

        if (a < b && a < c) {
            visotaKirpicha = a;
        }
        if (b < a && b < c) {
            visotaKirpicha = b;
        }
        if (c < a && c < b) {
            visotaKirpicha = c;
        }

        if (a < dlinaKirpicha && a > visotaKirpicha) {
            shirinaKirpicha = a;
        }
        if (b < dlinaKirpicha && b > visotaKirpicha) {
            shirinaKirpicha = b;
        }
        if (c < dlinaKirpicha && c > visotaKirpicha) {
            shirinaKirpicha = c;
        }
        if (x > y) {
            dlinaOtverstiya = x;
        } else {
            shirinaOtverstiya = y;
        }
        if (y > x) {
            dlinaOtverstiya = y;
        } else {
            shirinaOtverstiya = x;
        }
        if (dlinaOtverstiya > shirinaKirpicha && shirinaOtverstiya > visotaKirpicha) {
            System.out.println("kirpich prolezet v otverstie");
        } else {
            System.out.println("kirpich ne prolezet v otverstie");
        }

        System.out.println("ex 5.53");
        int ocenki[] = {2, 3, 2, 4, 5, 4, 5, 4, 2, 1, 3};
        int summa = 0;
        int srednee = 0;
        for (int i = 0; i < ocenki.length; i++) {
            summa = summa + ocenki[i];
        }
        srednee = summa / ocenki.length;
        System.out.println(srednee);

        System.out.println("ex 6.75");
        int posledovatelnost[] = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < posledovatelnost.length; i++) {
            posledovatelnost[i] = rnd.nextInt(66);

            System.out.println(posledovatelnost[i]);
        }
        int i0 = 0;
        for (int i = 0; i < posledovatelnost.length; i++) {
            if (posledovatelnost[i] % 10 == posledovatelnost[i] / 10) ;
            i0++;
        }
        if (i0 == posledovatelnost.length - 1) {
            System.out.println("sootvetstvuet");
        } else {
            System.out.println("ne sootvetstvuet");
        }

        System.out.println("ex 6.75(b");
        i0 = 0;
        for (int i = 0; i < posledovatelnost.length - 1; i++) {
            if (posledovatelnost[i] % 10 == posledovatelnost[i + 1] / 10 || posledovatelnost[i] % 10 == posledovatelnost[i + 1] || posledovatelnost[i] / 10 == posledovatelnost[i + 1] / 10 || posledovatelnost[i] / 10 == posledovatelnost[i + 1] % 10) {
                i0++;
            }
        }
        if (i0 == posledovatelnost.length - 1) {
            System.out.println("sootvetstvuet");
        } else {
            System.out.println("ne sootvetstvuet");
        }


        System.out.println("ex 7.77");//???
        a = 0;
        i0 = 0;
        int posledovatelnost0[] = {1, 8, 2, 8, 3, 8, 4, 5, 8, a};
        for (int i = 0; i < posledovatelnost0.length; i++) {
            if (posledovatelnost0[i] == 8) {
                i0++;
            }
        }
        System.out.println(i0);

        a = 8;
        i0 = 0;
        int posledovatelnost1[] = {1, 8, 2, 8, 3, 8, 4, 5, 8, a};
        for (int i = 0; i < posledovatelnost1.length; i++) {
            if (posledovatelnost1[i] == 8) {
                i0++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 11.50");
        double posledovatelnost2[] = {1, 2, 3, 4, 5, 6, -6, -5, -4, -3, -2, -1};
        double posledovatelnost3[] = new double[posledovatelnost2.length];
        int k1 = 3;
        int n = 5;
        for (int i = 0; i < posledovatelnost2.length; i++) {
            if (posledovatelnost2[i] > 0) {
                posledovatelnost3[i] = posledovatelnost2[i] - posledovatelnost2[k1];
            }
            if (posledovatelnost2[i] < 0) {
                posledovatelnost3[i] = posledovatelnost2[i] - n;
            }
            if (posledovatelnost2[i] == 0) {
                posledovatelnost3[i] = posledovatelnost2[i];
            }
        }
        for (int i = 0; i < posledovatelnost2.length; i++) {
            System.out.println(posledovatelnost3[i]);
        }
        System.out.println("ex 11.50(b");
        a = 3;
        b = 4;
        double posledovatelnost4[] = new double[posledovatelnost2.length];
        for (int i = 0; i < posledovatelnost2.length; i++) {
            if (posledovatelnost2[i] == 0) {
                posledovatelnost4[i] = posledovatelnost2[i] + n;
            }
            if (posledovatelnost2[i] > 0) {
                posledovatelnost4[i] = posledovatelnost2[i] - a;
            }
            if (posledovatelnost2[i] < 0) {
                posledovatelnost4[i] = posledovatelnost2[i] + b;
            }
        }
        for (int i = 0; i < posledovatelnost2.length; i++) {
            System.out.println(posledovatelnost4[i]);
        }

        System.out.println("ex 11.51");
        int a0[] = {1, 2, 3, -4, -3, -2, 0};
        int a1[] = new int[a0.length];
        k1 = 2;
        for (int i = 0; i < a0.length; i++) {
            if (a0[i] < 0) {
                a1[i] = a0[i] + a0[k1];
            }
            if (a0[i] == 0) {
                a1[i] = a0[i] - b;
            }
            if (a0[i] > 0) {
                a1[i] = a0[i];
            }
        }
        for (int i = 0; i < a0.length; i++) {
            System.out.println(a1[i]);
        }
        System.out.println("ex 11.51(b");
        int a2[] = new int[a0.length];
        c = 5;
        for (int i = 0; i < a0.length; i++) {
            if (a0[i] > 0) {
                a2[i] = a0[i] - a;
            }
            if (a0[i] < 0) {
                a2[i] = a0[i] - b;
            }
            if (a0[i] == 0) {
                a2[i] = a0[i] + c;
            }
        }
        for (int i = 0; i < a0.length; i++) {
            System.out.println(a2[i]);
        }

        System.out.println("ex 4.54");
        int dlinaChemodana = 10;
        int shirinaChemodana = 8;
        int visotaChemodana = 5;
        int dlinaKorobki = 8;
        int shirinaKorobki = 6;
        int visotaKorobki = 4;
        if (dlinaChemodana > dlinaKorobki && shirinaChemodana > shirinaKorobki && visotaChemodana > visotaKorobki) {
            System.out.println("korobka pomestitsya v chemodan");
        } else {
            System.out.println("korobka ne pomestitsya v chemodan");
        }

        System.out.println("ex 5.54");
        int ocenki0[] = {2, 3, 4, 5, 4, 3, 2, 1};
        summa = 0;
        srednee = 0;
        for (int i = 0; i < ocenki0.length; i++) {
            summa = summa + ocenki0[i];
        }
        srednee = summa / ocenki0.length;
        System.out.println(srednee);

        System.out.println("ex 6.77");
        int q = 10;
        a = 0;
        b = 1;
        c = 0;
        int fibonachchi = 1;
        i0 = 0;
        for (int i = 0; i < q; i++) {
            a = b;
            b = c;
            c = a + b;
            fibonachchi = c;
            if (fibonachchi == q) {
                i0++;
            }
        }
        if (i0 > 0) {
            System.out.println("yes");
        }
        if (i0 == 0) {
            System.out.println("no");
        }

        System.out.println("ex 7.78");
        n = 10;
        i0 = 0;
        int i1 = 0;
        int w[] = {1, 2, 2, 4, 5, 6, 7, 8, 9, 10};
        int e[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            if (w[i] % 2 == 0) {
                i0++;
            } else {
                e[i1] = i0;
                i0 = 0;
                i1++;
            }
        }
        int naibolshee = 0;
        for (int i = 0; i < e.length; i++) {
            if (naibolshee < e[i]) {
                naibolshee = e[i];
            }
        }
        System.out.println(naibolshee);

        System.out.println("ex 11.52");
        int r[] = {10, 20, 44, 5, 4, 2};
        int t[] = new int[r.length];
        for (int i = 0; i < r.length; i++) {
            if (r[i] % 10 == 4) {
                t[i] = r[i] / 2;
            } else {
                t[i] = r[i];
            }
        }
        for (int i = 0; i < r.length; i++) {
            System.out.println(t[i]);
        }
        System.out.println("ex 11.52(b");
        double r0[] = {10, 20, 30, 40, 51, 62};
        double t0[] = new double[r.length];
        for (int i = 0; i < r.length; i++) {
            if (i % 2 == 0) {
                t0[i] = Math.pow(r[i], 2);
            } else {
                t0[i] = r0[i] * 2;
            }
        }
        for (int i = 0; i < r0.length; i++) {
            System.out.println(t0[i]);
        }
        System.out.println("ex 11.52(c");
        double t1[] = new double[r0.length];
        double a3 = 3;
        double b0 = 4;
        for (int i = 0; i < r0.length; i++) {
            if (i % 2 == 0) {
                t1[i] = r0[i] + a3;
            } else {
                t1[i] = r0[i] - b0;
            }
        }
        for (int i = 0; i < t1.length; i++) {
            System.out.println(t1[i]);
        }

        System.out.println("ex 4.55");
        int chislo = 34;
        a = 5;
        if (chislo % 10 == 3 || chislo / 10 == 3) {
            System.out.println("vhodit");
        } else {
            System.out.println("ne vhodit");
        }
        System.out.println("ex 4.55(b");
        if (chislo % 10 == a || chislo / 10 == a) {
            System.out.println("vhodit");
        } else {
            System.out.println("ne vhodit");
        }

        System.out.println("ex 5.55");
        int predmeti[] = {1, 2, 3, 10, 9, 8, 7, 6};
        summa = 0;
        srednee = 0;
        for (int i = 0; i < predmeti.length; i++) {
            summa = summa + predmeti[i];
        }
        srednee = summa / predmeti.length;
        System.out.println(srednee);

        System.out.println("ex 6.78");
        n = 14;
        int f = 2;
        int s = 4;
        summa = f;
        i0 = 0;
        for (int i = f; i < n; i++) {
            if (n == summa) {
                i0++;
            }
            summa = summa + s;
        }
        if (i0 > 0) {
            System.out.println("prisutstvuet");
        } else {
            System.out.println("ne prisutstvuet");
        }

        System.out.println("ex 7.79");
        int posledovatelnost5[] = {1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0};
        int posledovatelnost6[] = new int[posledovatelnost5.length];
        i0 = 0;
        i1 = 0;
        for (int i = 0; i < posledovatelnost5.length; i++) {
            if (posledovatelnost5[i] == 0) {
                i0++;
            } else {
                if (i0 > 0) {
                    posledovatelnost6[i1] = i0;
                    i0 = 0;
                    i1++;
                }

            }

        }
        int naimenshee = posledovatelnost6[0];
        for (int i = 0; i < i1; i++) {
            if (naimenshee > posledovatelnost6[i]) {
                naimenshee = posledovatelnost6[i];
            }
        }
        System.out.println("naimenshee " + naimenshee);

        System.out.println("ex 11.53");
        int massiv[] = {1, 2, 3, 4, 5, 6, 90, 8, 7, 6, 5};
        int massiv1[] = new int[massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 10 == 0) {
                massiv1[i] = 0;
            } else {
                massiv1[i] = massiv[i];
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv1[i]);
        }
        System.out.println("ex 11.53(b");
        int massiv2[] = new int[massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 > 0) {
                massiv2[i] = massiv[i] * 2;
            } else {
                massiv2[i] = massiv[i] / 2;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv2[i]);
        }
        System.out.println("ex 11.53(c");
        int m = 10;
        n = 5;
        int massiv3[] = new int[massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 > 0) {
                massiv3[i] = massiv[i] - m;
            } else {
                massiv3[i] = massiv[i] + n;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv3[i]);
        }

        System.out.println("ex 11.54");
        int massiv4[] = {1, 2, 30, 20, 10};
        summa = 0;
        a = 5;

        for (int i = 0; i < massiv4.length; i++) {
            if (massiv4[i] < 20) {
                summa = summa + massiv4[i];
            }
        }
        System.out.println(summa);
        System.out.println("ex 11.54(b");
        summa = 0;
        for (int i = 0; i < massiv4.length; i++) {
            if (massiv4[i] > a) {
                summa = summa + massiv4[i];
            }
        }
        System.out.println(summa);

        System.out.println("ex 11.55");
        int massiv5[] = {20, 10, 1, 3, 7, 8};
        summa = 0;
        for (int i = 0; i < massiv5.length; i++) {
            if (massiv5[i] % 2 > 0) {
                summa = summa + massiv5[i];
            }
        }
        System.out.println(summa);
        System.out.println("ex 11.55(b");
        chislo = 5;
        summa = 0;
        for (int i = 0; i < massiv5.length; i++) {
            if (massiv5[i] % chislo == 0) {
                summa = summa + massiv5[i];
            }
        }
        System.out.println(summa);
        System.out.println("ex 11.55(c");
        a = 3;
        b = 5;
        summa = 0;
        for (int i = 0; i < massiv5.length; i++) {
            if (massiv5[i] % a == 0 || massiv5[i] % b == 0) {
                summa = summa + massiv5[i];
            }
        }
        System.out.println(summa);

    }
}


