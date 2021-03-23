package practice;

public class Lesson056 {
    public static void main(String[] args) {
        System.out.println("ex 6.24");
        int q[] = {4, 2, 3, 4, 5, 6, 0};
        int x = 4;
        int i = 0;
        int summa = 0;
        while (q[i] != 0) {


            if (q[i] > x) {
                summa = summa + q[i];
            }
            i++;
        }
        System.out.println(summa);

        System.out.println("ex 6.24(b");
        int i0 = 0;
        i = 0;
        while (q[i] != 0) {
            if (q[i] % 2 == 0) {
                i0++;
                System.out.println(i0);
            }
            i++;
        }
        System.out.println("ex 6.25");
        int w[] = {1,2,9,7,5,3,-3,4,-5,6,0};
        i = 0;
        i0 = 0;
        while(w[i]!=0) {


            if ((w[i] > 0 && w[i + 1] < 0 ) || (w[i] < 0 && w[i + 1] > 0)) {

                i0++;
            }
            i++;
        }
        System.out.println(i0);

        System.out.println("ex 6.26");
        int e = 125;
        int cifra = 0;
        i = 0;
        int r = 0;
        while(e>0){
            cifra = e%10;
            e  = e/10;
            if(cifra>r){
                r= cifra;
            }
            i++;
        }
        System.out.println(r);

    }
}
