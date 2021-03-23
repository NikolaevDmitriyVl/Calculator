package practice;

public class Lesson047 {
    public static void main(String[] args) {
        System.out.println("ex 5.39");
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa = summa + a[i];
        }
        System.out.println(summa);

        System.out.println("ex 5.50");
        int q[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summa0 = 0;
        int sredneeArifmeticheskoe = 0;
        for (int i = 0; i < q.length; i++) {
            summa = summa + q[i];
        }
        sredneeArifmeticheskoe = summa / q.length;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 5.56(a");
        double w[] = {1,2,3,4,5,6};
        double summa1 = 0;
        for(int i = 0; i<w.length; i++){
            summa1 = summa1 + Math.abs(w[i]);
        }
        System.out.println(summa1);

        System.out.println("ex 5.56(b");
        double e[] = {1,2,3,4,5};
        double proizvedenie = 1;
        for(int i = 0; i<e.length; i++){
            proizvedenie = proizvedenie * Math.abs(e[i]);
        }
        System.out.println(proizvedenie);

        System.out.println("ex 5.56(c");
        double r[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<r.length - 1; i++) {
            double summa2 = r[i] + r[i + 1];

            System.out.println(summa2);
        }
        System.out.println("ex 5.56(d");
        double t[] = {1,2,3,4,5,6};
        double summa3 = 0;
        double sign = -1;
        for(int i = 0; i<t.length; i++){
            summa3 = t[i] * sign;
            sign = sign * -1;
        }
        System.out.println(summa3);

        System.out.println("");

        }
    }

