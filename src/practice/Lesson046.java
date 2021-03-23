package practice;

public class Lesson046 {
    public static void main(String[] args) {
        System.out.println("ex 5.31");
        double n = 3;
        double result = 0;
        for (double i = 0; i <= n; i++) {
            result = result + n + Math.pow(i, 2);
        }
        System.out.println(result);

        System.out.println("ex 5.32");
        double n1 = 6;
        double summa = 0;
        for(int i = 1; i<= n1; i++){
            summa = summa + (1.0/i);
            System.out.println(summa);
        }

        System.out.println("ex 5.33");
        double q = 10;
        double summa1 = 0;
        for(double i = 2; i<=q ;i++){
summa1 = summa1 + i/(i+1);
System.out.println(summa1);
        }

        System.out.println("ex 5.34");
        double w = 8;
        double summa2 = 1;
        double proizv = 3;
        for(double i = 1; i<= w; i++){
            summa2 = summa2 + 1 / proizv;
            proizv *= 3;
            System.out.println(summa2);
        }

        System.out.println("ex 5.35");
        double e = 7;
        int sign = -1;
        double summa3 = 0;
        for(double i = 1; i<= e; i++){
            summa3 = summa3 - (1/i) * sign;
            sign = sign * -1;
            System.out.println(summa3);
        }

    }
}
