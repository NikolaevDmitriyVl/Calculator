package practice;

public class Lesson026 {
    public static void main(String[] args){
        System.out.println("ex 5.29");
        int summa = 0;
        for(int i = 1; i<=1000; i ++){
            summa = summa + i;
        }
        System.out.println("sredneeArifmeticheskoe = " + summa/1000);

        System.out.println("ex 5.29(b");
        int summa1 = 0;
        int q = 500;
        for(int i = 100; i <= q; i++){
            summa1 = summa1 + i;
        }
        System.out.println("sredneeArifmeticheskoe = " + summa1/q);

        System.out.println("ex 5.29(v");
        int w = 100;
        int summa2 = 0;
        for(int i =  w; i <=200; i++){
            summa2 = summa2 + i;
        }
        System.out.println("sredneeArifmeticheskoe = " + summa2/200);

        System.out.println("ex 5.29(g");
        int e = 30;
        int r = 40;
        int summa3 = 0;
        for(int i = e; i<= r; i++){
            summa3 = summa3 + i;
        }
        System.out.println("sredneeArifmeticheskoe = " + summa3/r);

        System.out.println("ex 5.30");
        double summa4 = 0;
        for(int i = 20; i<= 40; i++){
            summa4 = Math.pow(i,3) + summa4;
        }
        System.out.println(summa4);

        System.out.println("ex 5.30(b");
        double summa5 = 0;
        int t = 50;
        for(int i = t; i <=50; i ++){
            summa5 = Math.pow(i,2) + summa5;
        }
        System.out.println(summa5);


        System.out.println("ex 5.31(v");
        double summa6 = 0;
        int y = 39;
        for(int i = y; i <= y; i ++){
            summa6 = Math.pow(i,2) + summa6;
        }
        System.out.println(summa6);

        System.out.println("ex 5.30(g");
        int u = 20;
        int o = 30;
        double summa7 = 0;
        for(int i = u; i <= o; i++){
            summa7 = Math.pow(i,2) + summa7;
        }
        System.out.println(summa7);


    }
}
