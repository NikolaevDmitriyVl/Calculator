package practice;

public class HomeWork044 {
    public static void main(String[] args){
        System.out.println("ex 5.22");
        double kg = 300;
        double g = kg/1000;
        for(double i = 100; i<= 2000; i+=100){
            System.out.println(i + " gramm konfet stoyat " + (i*g) + " rubley");
        }

        System.out.println("ex 5.23");
        for(double i = 2.1; i<=2.81; i+=0.1){
            System.out.println(i);
        }

        System.out.println("ex 5.24");
        for(double i = 3.2; i<= 3.91; i+=0.1){
            System.out.println(i);
        }

        System.out.println("ex 5.25");
        for(double i = 2.2; i<= 4.21; i+=0.2){
            System.out.println(i);
        }

        System.out.println("ex 5.26");
        for(double i = 4.4; i<=6.41; i+=0.2){
            System.out.println(i);
        }

        System.out.println("ex 5.27(a");
        int summa = 0;
        for(int i = 100;i<=500;i++){
            summa = summa + i;
        }
        System.out.println(summa);

        System.out.println("ex 5.27(b");
        int a = 489;
        int summa0 = 0;
        for(int i = a; i<= 500; i++){
            summa = summa + i;
        }
        System.out.println(summa);

        System.out.println("ex 5.27(c");
        int b = 20;
        int summa1 = 0;
        for(int i = -10; i<=b; i++){
            summa1 = summa1+ i;
        }
        System.out.println(summa1);

        System.out.println("ex 5.27(d");
        int a0 = 3;
        int b0 = 4;
        int summa2 = 0;
        for(int i = a0; i <= b; i++){
            summa2 = summa2 + i;
        }
        System.out.println(summa2);

        System.out.println("ex 5.28(a");
        int proizvedenie = 1;
        for(int i = 8; i<=15; i++){
            proizvedenie = proizvedenie * i;
        }
        System.out.println(proizvedenie);

        System.out.println("ex 5.28(b");
        int proizvedenie0 = 1;
        int a1 = 18;
        for(int i = a1; i <= 20; i++){
            proizvedenie0 = proizvedenie0 * i;
        }
        System.out.println(proizvedenie0);

        System.out.println("ex 5.28(c");
        int b1 = 5;
        int proizvedenie1 = 1;
        for(int i = 1; i<= b1; i++){
            proizvedenie1 = proizvedenie1 * i ;
        }
        System.out.println(proizvedenie1);

        System.out.println("ex 5.28(d");
        int a2 = 2;
        int b2 = 3;
        int proizvedenie2 = 1;
        for(int i = a2; i<=b2; i++){

         proizvedenie2 = proizvedenie2 * i;
    }
        System.out.println(proizvedenie2);

        System.out.println("ex 5.29(a");
        int summa3 = 0;
        int sredneeArifmeticheskoe = 0;
        for(int i = 1; i<= 1000; i++){
            summa3 = summa3 + i;
        }
            sredneeArifmeticheskoe = summa3 * 1000;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 5.29(b");
        int summa4 = 0;
        int sredneeArifmeticheskoe0 = 0;
        int b3 = 102;
        int a3 = 100;
        int kolichestvoCifr = b3-a3+1;
        for(int i = a3; i<=b3; i++){
            summa4 = summa4+i;}
            sredneeArifmeticheskoe = summa4/kolichestvoCifr;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 5.29(c");
        int a4 = 196;
        int b4 = 200;
        int kolvoCifr = b4-a4+1;
        int summa5 = 0;
        for(int i = a4; i<= b4; i++){
            summa5 = summa5 + i;
        }
        System.out.println(summa5 /kolvoCifr);

        System.out.println("ex 5.29(d");
        int a5 = 3;
        int b5 = 5;
        int kolvoCifr0 = b5-a5+1;
        int summa6 = 0;
        for(int i = a5; i<=b5; i++){
            summa6 = summa6 + i;
        }
        System.out.println(summa6 /kolvoCifr0);

        System.out.println("ex 5.30");
        double q = 20;
        double w = 40;
        double summaKubov = 0;
        for(double i = q; i<=w; i++){
            summaKubov = summaKubov + Math.pow(i,3);
        }
        System.out.println(summaKubov);

        System.out.println("ex 5.30(b");
        double q0 = 48;
        double w0 = 50;
        double summaKvadratov = 0;
        for(double i = q0; i<=w0; i++){
            summaKvadratov = summaKvadratov + Math.pow(i,2);
        }
        System.out.println(summaKvadratov);

    }
}
