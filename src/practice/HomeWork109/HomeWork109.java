package practice.HomeWork109;

import java.util.Random;

public class HomeWork109 {
    void prostoeChislo(int k) {
        int i0 = 0;

        for (int i = 1; i <= k; i++) {
            if (k % i == 0) {
                i0++;
            }
        }
        if (i0 == 2) {
            System.out.println("chislo " + k + " yavlyaetsya prostim");
            i0 = 0;
        }
    }

    public void stepen5(int x) {
        int i0 = 0;
        int d = x;
        int t = x;
        if (d == 0) {
            System.out.println("5 v " + 0 + " stepeni = 1");
        }
        if (d == 1) {
            System.out.println(" 5 v " + 1 + " stepeni = 5");
        }

        while (x > 5) {
            x = x / 5;
            i0++;
        }
        if (x == 5) {
            System.out.println(" 5 " + " v " + (i0 + 1) + " sstepeni = " + t);
        }
    }

    public static void main(String args[]) {
        System.out.println("ex 4.116");
        int a1 = 1;
        int a2 = 3;
        int b = 4;
        int edinici = 0;
        int desyatki = 0;
        if (b <= a1) {
            edinici = a1 - b;
            desyatki = a2;
        } else {
            edinici = (a1 + 10) - b;
            desyatki = a2 - 1;
        }
        System.out.println(desyatki + "" + edinici);

        System.out.println("ex 8.39(b");
        int s = 20;
        int massivI[] = new int[s];
        int massivJ[] = new int[s];
        int i0 = 0;
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                if (i * j == s) {
                    massivI[i0] = i;
                    massivJ[i0] = j;
                    i0++;
                    System.out.println(" first number = " + i + " second nubber = " + j);
                }
            }
        }
        for (int i = 0; i < massivI.length; i++) {
            if (massivI[i] != massivJ[i + 1] && massivJ[i] != massivI[i + 1]) {
                System.out.println(massivI[i] + " and " + massivJ[i]);
            } else {
                System.out.println(massivI[i] + " and " + massivJ[i]);
                break;
            }
        }
        System.out.println("ex 10.14");
        int n = 5;
        int a[] = {0, 1, 625, 3, 4, 25};
        double stepen = 0;
        i0 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println("5 v " + 0 + " stepeni = 1");
            }
            if (a[i] == 1) {
                System.out.println(" 5 v " + 1 + " stepeni = 5");
            }
            stepen = a[i];
            while (stepen > 5) {
                stepen = stepen / 5;
                i0++;
            }
            if (stepen == 5) {
                System.out.println(" 5 " + " v " + (i0 + 1) + " sstepeni = " + a[i]);
            }
            i0 = 0;
        }
        System.out.println("***************");
        HomeWork109 lesson = new HomeWork109();
        for (int i = 0; i < a.length; i++) {

            lesson.stepen5(a[i]);
        }

        System.out.println("ex 11.94");
        Random rnd = new Random();
        int osadki[] = new int[31];
        int summa = 0;
        int sredneeArifmeticheskoe = 0;
        for (int i = 1; i <= 31; i++) {
            osadki[i - 1] = rnd.nextInt(20) + 10;
            summa = summa + osadki[i - 1];
        }
        sredneeArifmeticheskoe = summa / osadki.length;
        for (int i = 0; i < 31; i++) {
            if (osadki[i] > sredneeArifmeticheskoe) {
                System.out.println(i + " january " + " vipalo osadkov = " + osadki[i]);
            }
        }


        System.out.println("ex 12.20");
        int dvumMassiv[][] = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        if (dvumMassiv[0][0] % 2 == 0 || dvumMassiv[dvumMassiv.length - 1][0] == 0) {
            System.out.println("imeyutsya chetnie chisla v levom verhnem ili levom niznih uglah");
        } else {
            System.out.println("ne imeyutsya chetnie chilsa v levom verhnih ili levom niznih uglah");
        }

        if (dvumMassiv[0][dvumMassiv[0].length - 1] % 10 == 0 || dvumMassiv[dvumMassiv.length - 1][dvumMassiv[dvumMassiv.length - 1].length - 1] % 10 == 0) {
            System.out.println("imeyutsya chisla okanchivayushhiesya nulem v pravom verhnem ili v pravom niznem uglah");
        } else {
            System.out.println("v pravom verhnem ili pravom niznem uglah , chisel okanchivayushhih nulem net");
        }

        System.out.println("ex 13.15");
        Sobitiya sobitie1 = new Sobitiya();
        sobitie1.day = 9;
        sobitie1.month = 5;
        sobitie1.year = 1945;
        sobitie1.uslovniyPoryadkoviyNomer = 1;

        Sobitiya sobitie2 = new Sobitiya();
        sobitie2.day = 12;
        sobitie2.month = 4;
        sobitie2.year = 1961;
        sobitie2.uslovniyPoryadkoviyNomer = 2;

        if (sobitie1.year > sobitie2.year) {
            System.out.println(sobitie1.uslovniyPoryadkoviyNomer + " sobitie proizoshlo pozze");
        } else if (sobitie2.year > sobitie1.year) {
            System.out.println(sobitie2.uslovniyPoryadkoviyNomer + " sobitie proizoshlo pozze");
        } else if (sobitie1.year == sobitie2.year) {
            if (sobitie1.month > sobitie2.month) {
                System.out.println(sobitie1.uslovniyPoryadkoviyNomer + " sobitie proizoshlo pozze");
            } else if (sobitie2.month > sobitie1.month) {
                System.out.println(sobitie2.uslovniyPoryadkoviyNomer + " sobitie proizoshlo pozze");
            } else if (sobitie1.month == sobitie2.month) {
                if (sobitie1.day > sobitie2.day) {
                    System.out.println(sobitie1.uslovniyPoryadkoviyNomer + " sobitie proizoshlo pozze");
                } else if (sobitie2.day > sobitie1.day) {
                    System.out.println(sobitie2.uslovniyPoryadkoviyNomer + " sobitie proizoshlo pozze");
                } else {
                    System.out.println("sobitie " + sobitie1.uslovniyPoryadkoviyNomer + " proizoshlo v odno i to ze vremya chto i " + sobitie2.uslovniyPoryadkoviyNomer + " sobitie");
                }
            }
        }
        System.out.println("ex 4.117");
        a1 = 2;
        a2 = 7;
        int b1 = 3;
        int b2 = 5;
        int chisloEdinic = 0;
        int chisloDesyatkov = 0;
        if (b1 < a1) {
            chisloEdinic = a1 - b1;
            chisloDesyatkov = a2 - b2;
        } else if (b1 > a1) {
            chisloEdinic = (a1 + 10) - b1;
            chisloDesyatkov = a2 - b2 - 1;
        } else if (a1 == b1) {
            chisloEdinic = 0;
            chisloDesyatkov = a2 - b2;
        }
        System.out.println(chisloDesyatkov + "" + chisloEdinic);

        System.out.println("ex 8.40(a");
        int v = 100;
        a1 = 0;
        a2 = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                a1 = i * j;
                for (int y = 1; y <= 100; y++) {
                    if (a1 * y == v) {
                        System.out.println(i + " * " + j + " * " + y + " = " + v);
                    }
                }
            }
        }
        System.out.println("ex 8.40(b");//???

        System.out.println("ex 10.15");

        for (int i = 100; i <= 999; i++) {
            lesson.prostoeChislo(i);
        }

        System.out.println("ex 11.95");
        Random rnd2 = new Random();
        int ocenki[] = new int[22];
        summa = 0;
        for (int i = 0; i < ocenki.length; i++) {
            ocenki[i] = rnd.nextInt(3) + 2;
            summa = summa + ocenki[i];
        }
        sredneeArifmeticheskoe = summa / ocenki.length;

        for (int i = 0; i < ocenki.length; i++) {
            if (ocenki[i] < sredneeArifmeticheskoe) {
                System.out.println((i + 1));
            }
        }
        System.out.println("ex 12.21");
        int dvumMassiv2[][] = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        if (dvumMassiv2[0][dvumMassiv2[0].length - 1] % 2 == 1 || dvumMassiv2[dvumMassiv2.length - 1][dvumMassiv[dvumMassiv.length - 1].length - 1] == 1) {
            System.out.println("v pravom verhnem ili v pravom niznem uglu est nechetnoe chislo");
        } else {
            System.out.println("v pravom verhnem i v pravom niznem net nechetnogo chisla");
        }
        System.out.println("ex 12.21(b");
        if (dvumMassiv2[0][0] % 10 == 5 || dvumMassiv2[dvumMassiv.length - 1][0] % 10 == 5) {
            System.out.println("v levom verhnem ili v levom niznem est chislo okanchivayushhee na cifru 5");
        } else {
            System.out.println("v levom verhnem i v levom niznem net chisla okanchivayushhego na cifru 5");
        }

        System.out.println("ex 13.16");

    }
}
