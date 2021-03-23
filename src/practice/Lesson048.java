package practice;

public class Lesson048 {
    public static void main(String[] args) {
        System.out.println("ex 5.66");
        int n = 5;
        double a[] = new double[n];
        a[0] = 1;

        for (int k = 1; k < n; k++) {
            a[k] = k * a[k - 1] + (1.0 / k);
            System.out.println(a[k]);
        }

        System.out.println("ex 5.67");
        int fibonachi = 1;
        int k0 = 5;
        int summa = 1;

        int q1 = 1;
        int q2 = 1;
        int q3 = 1;
        System.out.println(q3);
        for(int i = 0; i<k0-1; i++){
            q3 = q1 + q2;
            q1 = q2;
            q2 = q3;
            q3 = q1;
            summa = summa + q3;
            System.out.println(q3);
        }

            System.out.println("1 " + q3);
        System.out.println("3 " + summa);

    }
}
