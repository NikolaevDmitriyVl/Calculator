package practice;

public class Lesson033 {
    public static void main(String[] args){
        System.out.println("ex 5.75");
        int q = 2;
        int q1 = q*2;
        int summa = 0;
        for(int i = 1; i<= 10; i++) {
            q = q * 2;
            summa = summa + q;
        }
            System.out.println(summa);

        System.out.println("ex 5.76");
        double a = 3;
        double proizvedenie = a;
        int n = 5;
        System.out.println(proizvedenie);
        for(int i = 1; i <= n; i++){
            proizvedenie = proizvedenie* a;
            System.out.println(proizvedenie);
        }

        System.out.println("ex 5.77");
        double w = 1;
        double stepen = 1;
        double sign = -1;
        for(int i = 1; i <= 10; i++){
            stepen = Math.pow(w,2)*sign;
            w = w+1;
            sign = sign * (-1);
            System.out.println(stepen);
        }

        System.out.println("ex 5.");


    }
}
