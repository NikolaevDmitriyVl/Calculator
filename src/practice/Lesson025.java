package practice;

public class Lesson025 {
    public static void main(String[] args) {
        System.out.println("ex 5.26");
        for (double i = 4.4; i < 6.4; i = i + 0.2) {
            System.out.println(i);
        }

        System.out.println("ex 5.27");
        int summa = 0;
        for (int i = 100; i <= 500; i++) {
            summa = summa + i;

        }
        System.out.println("" + summa);































        System.out.println("ex 5.27(b");
        int a = 86;
        int summa2 = 0;
        for(int i = a; i <= 500; i++){
            summa2 = summa2 + i;
        }
        System.out.println(summa2);




























        System.out.println("ex 5.27(c");
        int b = 73;
        int summa3 = 0;
        for(int i = -10; i<b; i++ ){
            summa3 = summa3+i;
        }
        System.out.println(summa3);








        System.out.println("ex 5.27(d");
        int q = 48;
        int w = 48;
        int summa4 = 0;
        for(int i = q; i == w; i++ ){
            summa4 = summa4 + i;
        }
        System.out.println(summa4);

        System.out.println("ex 5.28");
        int proizvedenie = 1;
        for(int i = 8; i<= 15; i++){
            proizvedenie = proizvedenie*i;
        }
        System.out.println(proizvedenie);

    }

}
