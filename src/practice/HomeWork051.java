package practice;

public class HomeWork051 {
    public static void main(String[] args){
        System.out.println("ex 5.88");
        int n = 3;
        int s = 2;
        int u = 1;
        int a = 2;
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            n = n+ s;
            System.out.println();
            for (int q = 0; q< n; q++) {
                System.out.println(n);

            }
            }

        System.out.println("ex 5.92");
        double summa = 0;
        for(int i = 0; i<10; i++){
            summa = summa + Math.sqrt(Math.sqrt(i));
            System.out.println(summa);
        }

        System.out.println("ex 5.94");
        int q = 123456;
        int w = 1;
        int t = 100000;
        int summa0 = 0;
        for(int i = 1; i<=6; i++){
            w = q/t;
            q = q%t;
            t = t/10;
            summa0 = summa0 + w;
            System.out.println(w);
            System.out.println("summa = " + summa0);
        }

        System.out.println("ex ");

    }
}
