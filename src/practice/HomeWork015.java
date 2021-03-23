package practice;

public class HomeWork015 {
    public static void main(String[] args) {
        System.out.println("ex 4.31");
        int q = 121;
        int q1 = q / 100;//1
        int ostatok = q % 100;//21
        int q2 = ostatok / 10;//2
        int q3 = ostatok % 10;//1
        if (q1 == q2 && q2 == q3) {
            System.out.println("vse cifri ravni");
        }
        if (q1 == q2) {
            System.out.println("1=2");
        }
        if (q1 == q3) {
            System.out.println("1=3");
        }
        if (q2 == q3) {
            System.out.println("2=3");
        } else {
            System.out.println("ne ravni");
        }
        System.out.println("ex 2.6(a");
        int sek = 1325;
        int chas = sek / 60 / 60;
        System.out.println(chas);
        System.out.println("ex 2.6(b");
        int sekVChase = 1 * 60 * 60;
        int minutPosleChasa = (sek - sekVChase) / 60;
        System.out.println(minutPosleChasa);
        System.out.println("ex 2.6(c");
        int sekVMin = 1 * 60;
        int sekPosleMinuti = sek - sekVMin;
        System.out.println(sekPosleMinuti);

        System.out.println("ex 4.32");
        int w = 1234;
        int w1 = w / 1000;//1
        int ostatok1 = w % 1000;//234
        int w2 = ostatok1 / 100;//2
        int ostatok2 = ostatok1 % 100;//34
        int w3 = ostatok2 / 10;//3
        int w4 = ostatok % 10;//4
        int summa = w1 + w2 + w3 + w4;
        int proizvedenie = w1 * w2 * w3 * w4;
        if (w1 + w2 == w3 + w4) {
            System.out.println("summa1pari = summe2pari");
        } else {
            System.out.println("summi - ne ravni");
        }
        if (summa % 3 == 0) {
            System.out.println("summa - kratna3");
        } else {
            System.out.println("summa - ne kratna3");
        }
        if (proizvedenie % 4 == 0) {
            System.out.println("proizvedenie - kratno4");
        } else {
            System.out.println("proizvedenie - ne kratno4");
        }
        if (proizvedenie % w == 0) {
            System.out.println("proizvedenie kratno w");
        } else {
            System.out.println("proizvedenie ne kratno w");
        }
        System.out.println("ex 2.7");
        int pryamougolnik = 543 * 130;
        int kvadrat = 130 * 130;
        int kvVpr = pryamougolnik / kvadrat;
        System.out.println(kvVpr);

        System.out.println("ex 4.33");
        int r = 4758;
        if (r % 2 == 0) {
            System.out.println("r - chetnoye");
        } else {
            System.out.println("r - ne chetnoe");
        }
        System.out.println("ex 2.8");
        int t = 25;
        int t1 = t % 7;
        int t2 = t % 7 + 1;
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("ex 4.34");
        int a = 6;
        int b = 8;
        if (b % a == 0) {
            System.out.println("a - delitel");
        } else {
            System.out.println("a ne delitel");
        }
        if (a % b == 0) {
            System.out.println("b - delitel");
        } else {
            System.out.println("b ne delitel");
        }
        System.out.println("ex 2.9");
        int month = 8;
        int day = 2;
        int x = 12 + month - 11;
        System.out.println(x);

        System.out.println("ex 4.35");
        int a1 = 20;
        int b1 = 15;
        int c = 3;
        int d = 2;
        int v1 = (b / d) * (a / c);
        int v2 = (b / c) * (a / d);
        if (v1 > v2) {
            System.out.println("variant1 - bolee");
        } else {
            System.out.println("variant2 - bolee");
        }
        System.out.println("ex 2.10");
        int y = 43;
        int ten = y / 10;
        int one = y % 10;
        int summa1 = ten + one;
        int proizvedenie1 = ten * one;
        System.out.println(ten);
        System.out.println(one);
        System.out.println(summa1);
        System.out.println(proizvedenie1);

        System.out.println("ex 4.36");
        int u = 36;
        int zel = 3;
        int kr = 2;
        int vsego = zel + kr;
        if (u % vsego > 3) {
            System.out.println("krasniy");
        } else {
            System.out.println("zeleniy");
        }
        System.out.println("ex 2.11");
        int i = 33;
        int ten1 = i / 10;
        int one1 = i % 10;
        System.out.println(one1 + "" + ten1);

        System.out.println("ex 4.37");
        int s = 46;
        int o = -5;
        int p = 3;
        if (s < o)
            if (s > p) {
                System.out.println("ne prinadlezit");
            } else {
                System.out.println("prinadlezit");
            }


    }
}
