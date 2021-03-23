package practice;

public class HomeWork029 {
    public static void main(String[] args){
        System.out.println("ex 5.56(a");
        double a[] = {Math.abs(5),Math.abs(8),Math.abs(2)};
        double summa = 0;
        for(int i = 0; i < a.length; i++){
            summa = summa+a[i];
        }
        System.out.println(summa);

        System.out.println("ex 5.56(b");
        double q[] = {Math.abs(3),Math.abs(8),Math.abs(4)};
        double proizvedenie = 1;
        for(int i = 0; i < a.length; i++){
            proizvedenie = proizvedenie * q[i];
        }
        System.out.println(proizvedenie);


        System.out.println("ex 5.56(c");


        System.out.println("ex 5.56(d");
        int w[] = {3,4,5,6};
        int summa1 = 0;
        int sign = -1;
        for(int i = 0; i < w.length; i++){
            summa1 = (summa1*sign) + w[i];
            sign = sign*-1;
        }
        System.out.println(summa1);

        System.out.println("ex 5.57");
        int ocenkiUchenika1[] = {3,4,5,4};
        int ocenkiUchenika2[] = {4,4,3,5};
        int summa1Uchenika = 0;
        int summa2Uchenika = 0;
        for(int i = 0; i < 4; i++){
            summa1Uchenika = summa1Uchenika + ocenkiUchenika1[i];
            summa2Uchenika = summa2Uchenika + ocenkiUchenika2[i];
        }
        System.out.println("summa 1 uchenika " + summa1Uchenika);
        System.out.println("summa 2 Uchenika " + summa2Uchenika);


        System.out.println("ex 5.58");
        int sportsmen1[] = {10,11,13,9,22};
        int sportsmen2[] = {8,10,9,15,17};
        int summa1Sportsmena = 0;
        int summa2Sportsmena = 0;
        for(int i = 0; i< 4; i++){
            summa1Sportsmena = summa1Sportsmena + sportsmen1[i];
            summa2Sportsmena = summa2Sportsmena + sportsmen2[i];
        }
        System.out.println("summa 1 sportsmena " + summa1Sportsmena);
        System.out.println("summa 1 sportsmena " + summa1Sportsmena);

    }
}
