package practice;

public class Lesson012 {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 4;

        if (a > b) {
            System.out.println("a > b");
        }

        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a <= b");
        } else {
            System.out.println("a == b");
        }


        // go to

        System.out.println("ex 4.1");
        double x = 45;
        double y = 0;
        if (x > 0) {
            y = Math.pow(Math.sin(x), 2) * x;
        } else {
            y = 1 - 2 * Math.sin(Math.pow(x, 2));
        }


        System.out.println("answer: " + y);

        System.out.println("ex 4.2");
        double x1 = 11;
        double y1 = 0;
        if (x1 > 0) {
            y = Math.sin(Math.pow(x, 2));
        } else {
            y = 1 + 2 * Math.pow(Math.sin(x), 2);
        }
        System.out.println("answer: " + y);

        System.out.println("ex 4.3");
        double x2 = 4;
        if (x2 < 4) {
            System.out.println("area N1");
        } else {
            System.out.println("area N2");
        }



    }
}
