package practice;

public class HomeWork012 {
    public static void main(String[] args) {

        System.out.println("ex 4.3");
        double x = 4;
        if (x < 4) {
            System.out.println("area n1");
        } else {
            System.out.println("area n2");

        }
        System.out.println("ex 4.1");
        double x1 = 5;
        double y = 0;
        if (x > 0) {
            y = Math.pow(Math.sin(x), 2);
        } else
            y = 1 + 2 * Math.pow(Math.sin(x), 2);
        {
            System.out.println("answer" + y);
        }
        System.out.println("ex 4.4");
        double x2 = 0;
        double y2 = 3;
        if (y2 > 3) {
            System.out.println("sfera 1");
        } else {
            System.out.println("sfera 2");
        }
        System.out.println("ex 4.5");
        double x3 = 0;
        double y3 = 0;
        if (x == 2) {
            System.out.println("y=2");
        }
        if (x == 3) {
            System.out.println("y=-3");
        }
        System.out.println("ex 4.6");
        int a = 2;
        int b = 4;
        if (a - b <= 0) {
            System.out.println("a<b");
        } else {
            System.out.println("b>a");
        }
        System.out.println("ex 4.7");
        int c = 2;
        int d = 15;
        int naibolshee = c + d;
        int naimenscee = c - d;
        System.out.println(naibolshee);
        System.out.println(naimenscee);

        System.out.println("ex 4.8");
        double km = 1000;
        double ft = 0.305;
        if (km > ft) {
            System.out.println("km >");
        } else {
            System.out.println(ft > km);
        }
        System.out.println("ex 4.9");
        double kmCh = 1000;
        double mS = 1;
        if (kmCh < mS) {
            System.out.println("kmCh<mS");
        } else {
            System.out.println("kmCh>mS");
        }

    }
}
