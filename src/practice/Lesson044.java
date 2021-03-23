package practice;

public class Lesson044 {
    public static void main(String[] args) {
        System.out.println("ex 5.13");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * 7 = " + (i * 7));
        }

        System.out.println("ex 5.14");
        for (int i = 1; i <= 10; i++) {
            System.out.println("9 * " + i + " = " + (9 * i));
        }

        System.out.println("ex 5.15");
        double z = 1;
        double t = 1;
        for (int i = 2; i <= 17; i++) {
            t = 4 * i;
            z = 3.5 * Math.pow(t, 2) - 7 * t + 16;
            System.out.println(z);
        }

        System.out.println("ex 5.19");
        for (double i = 0.1; i < +1.1; i += 0.1) {
            System.out.println(Math.sin(i));
        }

        System.out.println("ex 5.20");
        for(double i = 0.1; i<= 0.9; i+=0.1){
            System.out.println(Math.sqrt(i));
        }

        System.out.println("ex 5.21");
        double kg = 100;
        double g = kg/1000;
        for(int i = 50; i<= 1000; i+=50){
            System.out.println(i + " gramm = " + (i*g) + " rubley");
        }
    }
}
