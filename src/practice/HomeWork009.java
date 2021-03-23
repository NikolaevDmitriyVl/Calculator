package practice;

public class HomeWork009 {
    public static void main(String[] args) {
        System.out.println("ex 1.47");
        int a = 36;
        int b = 57;
        int rastoyanieMegdu = b - a;
        System.out.println(rastoyanieMegdu);

        System.out.println("ex 1.48");
        int a1 = 6;
        int b1 = 4;
        int c = (a1 - b1) / 2;
        int h = 3;
        double bokStorona = Math.sqrt(Math.pow(h, 2) + Math.pow(c, 2));
        double perimetr = a1 + b1 + (bokStorona * 2);
        System.out.println(perimetr);

        System.out.println("ex 1.49");
        int a2 = 9;
        int b2 = 3;
        int c2 = (a2 - b2) / 2;
        int gradus = 45;
        int h2 = c2;
        double d2 = Math.sqrt(Math.pow(c2, 2) + Math.pow(h2, 2));
        double S = ((a2 + b2) / 2) * h2;
        System.out.println(S);

        System.out.println("ex 1.50");
        int a3 = 5;
        double d3 = a3 / 2;
        double h3 = 3;
        double b3 = Math.sqrt(Math.pow(d3, 2) + Math.pow(h3, 2));
        double c3 = b3;
        double perimetr2 = a3 + b3 + c3;
        double ploshchad = 0.5 * a3 * h3;
        System.out.println(perimetr2);
        System.out.println(ploshchad);

        System.out.println("ex 1.51");
        int konfet = 3;
        int pechenye = 5;
        int apple = 7;
        int stoimost = (konfet * 2) + (pechenye * 1) + (apple * 4);
        System.out.println(stoimost);

        System.out.println("ex 1.53");
        int monitor = 33;
        int sisBlok = 25;
        int klaviatura = 44;
        int mish = 5;
        int computer = monitor + sisBlok + klaviatura + mish;
        int triComputer = computer * 3;
        int n = computer * 5;
        System.out.println(triComputer);
        System.out.println(n);


    }
}
