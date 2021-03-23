package practice;

public class Lesson050 {
    public static void main(String[] args) {
        System.out.println("ex 4.65");
        int n = 2000;
        if (n % 4 == 0 || n % 100 == 0 && n % 400 == 0) {
            System.out.println("yavlyaetsya visokosnim");

        } else {
            System.out.println("ne yavlyaetsya visokosnim");
        }

        System.out.println("ex 4.66");
        int a = 40;
        int b = 30;

        int c = 5;
        int d = 3;
        int e = 1;

        int n1 = (a / e) * (b / d);
        int n2 = (a / d) * (b / e);
        int n3 = (a / c) * (b / e);
        int n4 = (a / e) * (b / c);
        int n5 = (a / c) * (b / d);
        int n6 = (a / d) * (b / c);
        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5 && n1 > n6) {
            System.out.println("n1 bolshe");
        }
        if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5 && n2 > n6) {
            System.out.println("n2 bolshe");
        }
        if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5 && n3 > n6) {
            System.out.println("n3 bolshe");
        }
        if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5 && n4 > n6) {
            System.out.println("n4 bolshe");
        }
        if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4 && n5 > n6) {
            System.out.println("n5 bolshe");
        }
        if (n6 > n1 && n6 > n2 && n6 > n3 && n6 > n4 && n6 > n5) {
            System.out.println("n6 bolshe");
        }
    }
}
