package practice;

public class Lesson027 {
    public static void main(String[] args){
        System.out.println("ex 5.32");
        double q = 10;
        double w = 1;
        double summa = 1;
        for(int i = 1; i <= q; i++ ){
            System.out.print("a: " + w);
            System.out.print(" b: " + i);
            System.out.println(" c: " + w/i);
        }
        System.out.println(summa);

        System.out.println("ex 5.33");
        double e = 3;
        double r = 11;
        double summa1 = 1;
        for( double i = e; i <= r; i++ ){
            summa1 = summa1 + i/(i+1);
        }
            System.out.println(summa1);

        System.out.println("ex 5.34");
        double t = 1;
        double y = 3;
        double summa2 = 1;
        for(double i = 0; i <=8; i++ ){
            summa2 = summa2 + t/Math.pow(y,i);
        }
        System.out.println(summa2);

        System.out.println("ex 5.35");
        double u = 1;
        double o = 9;
        double summa3 = 1;
        int sign = -1;
        for(double i = u; i <= o; i++){
            summa3 = summa3 + (sign *(u / i));

            sign = sign * -1;
        }
        System.out.println(sign);


    }
}
