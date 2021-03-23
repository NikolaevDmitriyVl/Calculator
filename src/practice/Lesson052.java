package practice;

public class Lesson052 {
    public static void main(String[] args){
        System.out.println("ex 5.88");
        int a = 1;
        int n = 5;
        System.out.println(a);
        int step = 1;
        int sum =1;
        for(int i = 2; i<6; i++){

            for(int j = 0; j < i; j++) {
                step = step + 2;
                System.out.print(step + " ");
            }
            System.out.println();
        }

        System.out.println("ex 6.1");
        int ar[] = {2, 3, 4, 5, 0, 8};
        int summa = 0;
        int i =0;
        while(ar[i] != 0){
            summa = summa + ar[i];

            i++;
        }

            System.out.println("summa = "+summa);
        int summ = 0;
        for(int w = 0; w< ar.length; w++) {
            if (ar[w] != 0) {
                summ = summ + ar[w];
            }else{
                break;
            }
            System.out.println(summ);
        }
        System.out.println("ex 6.2");
        int e[] = {1,2,3,4,-5, 5};
        int r = 0;
        int summa0 = 0;
        while (e[r] >=0 ){
            summa0 = summa0 + e[r];
            r++;
        }
        int sredneeArifmeticheskoe = summa0 / r;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 6.3");
        double t[] = {1,2,3,4,5};
        double summa1 = 0;
        int i0 = 0;
        while (t[i0] %2>0) {
            summa1 = summa1 + t[i0];
            i0++;
            System.out.println(summa1);
        }

        System.out.println("ex 6.4");
        double y[] = {-3,4,5,6,7};
        int i1 = 0;
        while(y[i1] <0){

        }
        System.out.println(i1);

        System.out.println("ex 6.5");
        double u[] = {2,2,2,2,3,4,5,6};
        int i2 = 1;
        while(u[i2] == u[0]){
            i2++;
        }
    }
}
