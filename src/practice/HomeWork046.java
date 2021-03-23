package practice;

public class HomeWork046 {
    public static void main(String[] args){
        System.out.println("ex 5.36");
        double x = 2;
        double summa = 0;
        for(double i = 1; i<= 11; i+=2){
            summa = summa + Math.pow(x,i)/i;
            System.out.println(summa);
        }

        System.out.println("ex 5.37(");
        double x0 = 2;
        double summa0 = 1;
        double sign = -1;
        for(double i = 2; i<= 11; i++){
            summa0 = summa0 - i/(i-1)*Math.pow(x,i-1)*sign;
            sign = sign * (-1);
            System.out.println(summa0);
        }

        System.out.println("ex 5.38(a");
        double sign0 = 1;
        double summa1 = 0;
        for(double i = 1; i<= 100; i++){
            summa1 = summa1 + (1/i) * sign0;
            sign0 = sign0 * -1;
            System.out.println(summa1);
        }

        System.out.println("ex 5.38(b");
        double summa2 = 0;
        for(double i = 1; i<= 100;i++){
            summa2 = summa2 + (1/i);
        }
            System.out.println(summa2);
    }
}
