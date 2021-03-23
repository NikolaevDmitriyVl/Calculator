package practice;

public class Lesson069 {
    public static void main(String[] args){
        System.out.println("ex 7.45");
        int q[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int summa = 0;
        int e = 0;
        for(int i = 0; i<q.length; i++){
            if (q[i] % 2 == 0) {
                summa = summa + q[i];
            }
            e++;
        }
        int sredneeArifmeticheskoe = summa/e;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 7.46");
        int m = 6;
        int n = 7;
        int w[] = {12,34,56,78,89,90};
        e = 0;
        summa = 0;
        for(int i = 0; i< m; i++){
            if (w[i] % n == 0) {
                summa = summa + w[i];
            }
            e++;
        }
        sredneeArifmeticheskoe = summa/e;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 7.49(a");
        n = 6;
        int poslednyaya10 = 0;
        int r[] = {12,13,10,45,10,76};
        for(int i = 0; i<n; i++ ){
            if (r[i] == 10) {
                poslednyaya10 = i;
            }
        }
        System.out.println(poslednyaya10);

        System.out.println("ex 7.49(b");
        for(int i = 0; i<n; i++){
            if (r[i] == 10) {
                poslednyaya10 = i;
                break;
            }
        }
        System.out.println(poslednyaya10);

        System.out.println("ex 7.50");
        
    }
}
