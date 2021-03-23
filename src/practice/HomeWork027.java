package practice;

public class HomeWork027 {
    public static void main(String[] args){
        System.out.println("ex 5.36");
        double x = 2;
        double a = 11;
        double summa = 1;
        for(int i = 1; i<=a; i+=2){
            summa = summa + Math.pow(x,i)/i;
        }
        System.out.println(summa);

        System.out.println("ex 2.18");
        int chislo = 123;
        int handred = 123/100;//1
        int ostatok = 123%100;//23
        int ten = ostatok/10;//2
        int one = ostatok%10;//3
        System.out.println(handred+""+ ten+ ""+ one);
        System.out.println(handred+""+one+""+ten);
        System.out.println(ten+""+handred+""+one);
        System.out.println(ten+""+one+""+handred);
        System.out.println(one +""+ handred +""+ ten);
        System.out.println(one +""+ ten +""+ handred);

        System.out.println("ex 2.19(a");
        int q = 4567;
        int thousand = q/1000;
        int ostatokThousand = q%1000;
        int hundred = ostatokThousand/100;
        int ostatokHundred = ostatokThousand%100;
        int ten1 = ostatokHundred /10;
        int one1 = ostatokHundred %10;
        int summa1 = thousand+hundred+ten1+one1;
        System.out.println(summa1);

        System.out.println("ex 2.19(b");
        int proizvedenie = thousand*hundred*ten1*one1;
        System.out.println(proizvedenie);

        System.out.println("ex 5.37");
        double w = 2;
        double summa2 = 1;
        int sing = -1;
        for(double i = 1; i<=11; i++){
            summa2 = summa2 + sing * (i/(i+1)*Math.pow(w,i-1));
            sing = sing * -1;

        }
        System.out.println(summa2);




    }
}
