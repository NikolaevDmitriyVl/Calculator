package practice;

public class HomeWork045 {
    public static void main(String[] args){
        System.out.println("ex 5.67");
        int k = 5;
        int q = k-2;
        int a1 = 1;
        int a2 = 1;
        int a3 = a1+ a2;
        for(int i = 1; i<=q; i++ ){
            a3 = a1+ a2;
            a1 = a2;
            a2 = a3;
            System.out.println(a3);
        }

        System.out.println("ex 5.67(b");
        int e1 = 1;
        int e2 = 1;
        int e3 = 1;
        System.out.println(e1);
        System.out.println(e2);
        int n = 8;
        int nn = 8-2;
        for(int i= 1; i<=nn; i++ ){
            e3 = e1+ e2;
            e1 = e2;
            e2 = e3;
            System.out.println(e3);
        }

        System.out.println("ex 5.67(c");
        int b1 = 1;
        int b2 = 1;
        int b3 = 1;
        int summa = 0;
                int r = 3;
                int rr = r-2;
                int result = 1;
        for(int i = 1; i<=1; i++ ) {
            b3 = b1 + b2;
            System.out.println(b3);
            b1 = b2;
            b2 = b3;
            summa = summa + b3;
            System.out.println("summa " +  summa);
            System.out.println(summa +2);

        }
        int summa2 = summa + 2;
        if(summa2 %2 == 0){
            System.out.println("r chislo yavlyaetsya chetnim");
        }
        else {
            System.out.println("r chislo yavlyaetsya ne chetnim");

        }

        System.out.println("ex 5.31");//???

        System.out.println("ex 5.32");
         int t = 6;
         int summa1 = 0;
         for(int i = 0; i <= t; i++){
             summa1 = summa1 + (1/i);
             System.out.println(summa1);
         }

         System.out.println("ex 5.33");



    }
}
