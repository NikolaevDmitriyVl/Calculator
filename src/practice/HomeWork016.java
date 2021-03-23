package practice;

public class HomeWork016 {
    public static void main(String[] args) {
        System.out.println("ex 4.46");
        int a = 8;
        int b = 4;
        int c = 7;
        if (a == b && b == c) {
            System.out.println("ravnostoronniy");
        } else {
            System.out.println("ne ravnostoronniy");
        }

        System.out.println("ex 2.11");
        int q = 876;
        int handred = q / 100;
        int ostatok = q % 100;
        int ten = ostatok / q;
        int one = ostatok % q;
        int summa = handred + ten + one;
        int proizvedenie = handred * ten * one;
        System.out.println("сотни: "+ handred);
        System.out.println(ten);
        System.out.println(summa);
        System.out.println(proizvedenie);

        System.out.println("ex 4.47");
        int a1 = 8;
        int b1 = 4;
        int c1 = 7;
        if (a1 == b1 || a1 == c1 || b1 == c1) {
            System.out.println("ravnobedrenniy");
        } else {
            System.out.println("ne ravnobedrenniy");
        }

        System.out.println("ex 2.13");
        int w = 847;
        int handred1 = w / 100;//8
        int ostatok1 = w % 100;
        int ten1 = ostatok1 / 10;//4
        int one1 = ostatok1 % 10;//7
        int w1 = (one1 * 100) + (ten1 * 10) + handred1;
        System.out.println(w1);

        System.out.println("ex 4.48");
        int a2 = 176;
        int b2 = 180;
        int c2 = 193;
        if (a2 == b2 && b2 == c2) {
            System.out.println("rost odinakov");
        } else {
            System.out.println("rost ne odinakov");
        }

        System.out.println("ex 2.14");
        int e = 874;
        int handred2 = e / 100;//8
        int ostatok2 = e % 100;//74
        int ten2 = ostatok2 / 10;//7
        int one2 = ostatok2 % 10;//4
        int operaciya1 = (ten2 * 10) + one2;
        int operaciya2 = (operaciya1 * 10) + handred2;
        System.out.println(operaciya2);

        System.out.println("ex 4.49");
        double a3 = 8;
        double b3 = 4;
        double c3 = 3;
        double x3 = 2;
        double uravnenie = (a3 * Math.pow(x3, 2)) + (b3 * x3) + c3;
        if (uravnenie == 0) {
            System.out.println("verno");
        } else {
            System.out.println("ne  verno");
        }

        System.out.println("ex 2.15");
        int r = 964;
        int handred3 = r / 100;
        int ostatok3 = r % 100;
        int ten3 = ostatok3 / 10;
        int one3 = ostatok3 % 10;
        int op1 = handred3 * 10 + ten3;
        int op2 = one3 + op1;
        System.out.println(op2);

        System.out.println("ex 4.50");
        int a4 = 5;
        int b4 = 4;
        int c4 = 3;
        int d4 = 2;
        if (a4 > c4 && b4 > d4) {
            System.out.println("vmestitsya");
        } else {
            System.out.println("ne vmestitsya");
        }

        System.out.println("ex 2.16");
        int t = 649;
        int handred4 = t / 100;
        int ostatok4 = t % 10;
        int ten4 = ostatok4 / 10;
        int one4 = ostatok4 % 10;
        int chislo = one4 * 100 + ten4 * 10 + handred4;
        System.out.println(chislo);

        System.out.println("ex 4.51");
        int a5 = 200;
        int b5 = 150;
        int c5 = 180;
        int d5 = 130;
        if (a5 > c5 + 1 && b5 > d5 + 1) {
            System.out.println("vmestitsya");
        } else {
            System.out.println("ne vmestitsya");
        }

        System.out.println("ex 2.17");
        int y = 489;
        int handred5 = y / 100;//4
        int ostatok5 = y % 100;//89
        int ten5 = ostatok5 / 10;//8
        int one5 = ostatok5 % 10;//9
        int chislo1 = handred5 * 100 + one5 * 10 + ten;
        System.out.println(chislo1);

        System.out.println("ex 4.52");
        int a6 = 40;
        int b6 = 30;
        int d6 = 25;
        if (b6 > d6 && b6 > d6) {
            System.out.println("smozet");
        } else {
            System.out.println("ne smozet");
        }


    }
}
