package practice;

public class Lesson023 {
    public static void main(String[] args){
        System.out.println("ex 5.13");
        for(int i = 1; i < 10; i++){
            System.out.println(i + " * 7 = " + (i*7));
        }

        System.out.println("ex 5.14");
        for(int i = 1; i < 10; i++){
            System.out.println(i + " * 9 = " + (i*9));
        }

        System.out.println("ex 5.15");
        int n = 5;
        for(int i = 1; i < 10; i++){
            System.out.println(i + " * " + n + " = " + (i*n));
        }

        System.out.println("ex 5.16");
        for(double i = 2; i < 21; i++){
            double res = Math.sin(i);
            System.out.println("sin ot " + i + " = " + res );
        }

        System.out.println("ex 5.17");
        double y = 0;
        double t = 0;
        for(int i = 4; i < 29; i++){
            t = i + 2;
            y = 2*Math.pow(t,2) + 5.5 * t-2;
            System.out.println(y);
        }



    }
}
