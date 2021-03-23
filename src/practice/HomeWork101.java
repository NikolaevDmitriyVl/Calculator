package practice;

import com.sun.org.apache.xml.internal.utils.PrefixResolverDefault;

import java.sql.SQLOutput;
import java.util.Random;

public class HomeWork101 {
    public double reshenie() {
        double a0 = 3;
        double b0 = 7;
        double c0 = 8;
        double x0 = 4;
        double diskriminant = Math.pow(b0, 2) - (4 * a0 * c0);
        if (diskriminant < 0) {
            System.out.println("korney net");
        }

        double koren1 = 0;
        double koren2 = 0;
        if (diskriminant > 0 || diskriminant == 0) {
            koren1 = ((-b0) + Math.sqrt(diskriminant)) / 2;
            koren2 = ((-b0) - Math.sqrt(diskriminant)) / 2;
        }
        return koren1;

    }

    public static void main(String[] args) {
        System.out.println("ex 4.104");
        int denMesyaca = 25;
        if (denMesyaca % 7 == 1) {
            System.out.println("ponedelnik");
        }
        if (denMesyaca % 7 == 2) {
            System.out.println("vtornik");
        }
        if (denMesyaca % 7 == 3) {
            System.out.println("sreda");
        }
        if (denMesyaca % 7 == 4) {
            System.out.println("chetverg");
        }
        if (denMesyaca % 7 == 5) {
            System.out.println("pyatnica");
        }
        if (denMesyaca % 7 == 6) {
            System.out.println("subbota");
        }
        if (denMesyaca % 7 == 0) {
            System.out.println("voskresenie");
        }

        System.out.println("ex 7.121");
        int n = 5;
        int maximalnoe = 0;
        int minimalnoe = 100 * 1000;
        int massiv[] = {12, 13, 14, 15, 16};
        for (int i = 0; i < massiv.length; i++) {
            if (maximalnoe < massiv[i]) {
                maximalnoe = massiv[i];
            }
            if (minimalnoe < massiv[i]) {
                minimalnoe = massiv[i];
            }
        }
        boolean a = true;
        for (int i = 0; i < massiv.length; i++) {
            if (minimalnoe == massiv[i]) {
                a = true;
                break;
            }
            if (maximalnoe == massiv[i]) {
                a = false;
                break;
            }
        }
        if (a == true) {
            System.out.println("pervoe chislo v posledovatelnosti minimalnoe");
        }
        if (a == false) {
            System.out.println("pervoe chislo v posledovatelnosti maximalnoe");
        }

        System.out.println("ex 8.31");
        int i0 = 0;
        System.out.println("prostie chisla iz trehznachnih :");
        for (int i = 100; i < 999; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    i0++;
                }
            }
            if (i0 == 2) {
                System.out.println(i);
            }
            i0 = 0;
        }

        System.out.println("ex 10.8");//???
        HomeWork101 reshenie = new HomeWork101();
        double a0 = 3;
        double b0 = 7;
        double c0 = 8;
        double x0 = 4;
        double diskriminant = Math.pow(b0, 2) - (4 * a0 * c0);
        if (diskriminant < 0) {
            System.out.println("korney net");
        }

        double koren1 = 0;
        double koren2 = 0;
        if (diskriminant > 0 || diskriminant == 0) {
            koren1 = ((-b0) + Math.sqrt(diskriminant)) / 2;
            koren2 = ((-b0) - Math.sqrt(diskriminant)) / 2;
        }


        System.out.println("ex 11.88");
        int avto[] = {5001, 6000, 7000, 12000, 5500};
        int moto[] = {400, 500, 420, 430, 245};
        int summaAvto = 0;
        int summaMoto = 0;
        for (int i = 0; i < avto.length - 1; i++) {
            summaAvto = summaAvto + avto[i];
            summaMoto = summaMoto + moto[i];
        }
        int srednyayaAvto = summaAvto / avto.length;
        int srednyayaMoto = summaMoto / moto.length;
        if (srednyayaAvto > (srednyayaMoto * 3)) {
            System.out.println("srednyaya stoimost avtomobiley previshaet srednyuyu stoimost motociklov bolee chem v tri raza");
        } else {
            System.out.println("srednyaya stoimost avtomobiley ne previshaet srednyuyu stoimost motociklov bolee chem v tri raza");
        }
        System.out.println("ex 12.16(b");
        int massiv2[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int chislo1 = massiv2[massiv2.length - 1][massiv2[massiv2.length - 1].length - 1];
        int chislo2 = massiv2[massiv2.length - 1][3];
        double sredneeGeometricheskoe = Math.sqrt(chislo1 * chislo2);
        System.out.println(sredneeGeometricheskoe);

        System.out.println("ex 13.12");

        System.out.println("ex 4.105");
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;


        }

        System.out.println("ex 7.122");
        int vozrast[] = new int[10];
        Random rnd = new Random();
        int starshiy = 0;
        int molodoy = 1000;
        int starshiyN = 0;
        int molodoyN = 0;
        for (int i = 0; i < 10; i++) {
            vozrast[i] = rnd.nextInt(40) + 20;
            if (starshiy < vozrast[i]) {
                starshiy = vozrast[i];
                starshiyN = i + 1;
            }
            if (molodoy > vozrast[i]) {
                molodoy = vozrast[i];
                molodoyN = i + 1;
            }
            System.out.println(vozrast[i]);
        }
        if (starshiy > molodoy) {
            System.out.println("samiy starshiy stoit pervee v posledovatelnosti chem samiy molodoy");
        } else {
            System.out.println(" samiy molodoy stoit pervee v posledovatelnosti chem samiy starshiy");
        }

        System.out.println("ex 8.32");
        int stoPervihChisel[] = new int[100];
        int i1 = 0;
        i0 = 0;
        for (int i = 1; i0 < 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    i1++;
                }
            }

            if (i1 == 2) {
                stoPervihChisel[i0] = i;
                i0++;
            }
            i1 = 0;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + " " + stoPervihChisel[i]);

        }
        System.out.println();

        System.out.println("ex 10.9");
        int q = 1;
        int w = (-1);
        int e = q * w;
        System.out.println(e);


        double tochka1X = 1;
        double tochka1Y = 1;
        double tochka2X = 3;
        double tochka2Y = 7;
        double tochka3X = 6;
        double tochka3Y = 2;

        double katet1St1 = (tochka1X - tochka2X);
        if (katet1St1 < 0) {
            katet1St1 = katet1St1 * (-1);
        }
        double katet2St1 = (tochka1Y - tochka2Y);
        if (katet2St1 < 0) {
            katet2St1 = katet2St1 * (-1);
        }
        double gipotenuzaSt1 = Math.sqrt(katet1St1 + katet2St1);
        double katet1St2 = (tochka1X - tochka3X);
        if (katet1St2 < 0) {
            katet1St2 = katet1St2 * (-1);
        }
        double katet2St2 = (tochka1Y - tochka3Y);
        if (katet2St2 < 0) {
            katet2St2 = katet2St2 * (-1);
        }
        double gipotenuzaSt2 = Math.sqrt(katet1St2 + katet2St2);
        double katet1St3 = (tochka2X - tochka3X);
        if (katet1St3 < 0) {
            katet1St3 = katet1St3 * (-1);
        }
        double katet2St3 = (tochka2Y - tochka3Y);
        if (katet2St3 < 0) {
            katet2St3 = katet2St3 * (-1);
        }
        double gipotenuzaSt3 = Math.sqrt(katet1St3 + katet2St3);
        System.out.println("storona 1 = " + gipotenuzaSt1 + " storona 2 = " + gipotenuzaSt2 + " storona 3 " + gipotenuzaSt3 + " perimetr = " + (gipotenuzaSt1 + gipotenuzaSt2 + gipotenuzaSt3));
        //postavit ifi gde minusi
    }

}



