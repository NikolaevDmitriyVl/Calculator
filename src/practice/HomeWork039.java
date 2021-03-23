package practice;

public class HomeWork039 {
    public static void main(String[] args){
        System.out.println("ex 2.10");
        int q = 12;
        int ten = q/10;
        int one = q%10;
        int summa = ten+one;
        int proizvedenie = ten*one;
        System.out.println(ten);
        System.out.println(one);
        System.out.println(summa);
        System.out.println(proizvedenie);

        System.out.println("ex 2.11");
        int w = 12;
        int ten0 = w/10;//1
        int one0 = w%10;//2
        int e = one0*10 + ten0;
        System.out.println(e);

        System.out.println("ex 2.12");
        int r = 123;
        int hundred = r/100;
        int ostatokHundred = r%100;//23
        int ten1 = ostatokHundred/10;
        int one1 = ostatokHundred%10;
        int summa0 = hundred + ten1 + one1;
        int proizvedenie0 = hundred*ten1*one1;
        System.out.println(one1);
        System.out.println(ten1);
        System.out.println(summa0);
        System.out.println(proizvedenie0);

        System.out.println("ex 2.13");
        int t = 123;
        int hundred0 = t/100;
        int ostatokHundred0 = t%100;
        int ten2 = ostatokHundred0/10;
        int one2 = ostatokHundred0%10;
        int summa1 = hundred0+ ten2+ one2;
        int proizvedenie1 = hundred0 + ten2 + one2;
        System.out.println(one2);
        System.out.println(ten2);
        System.out.println(summa1);
        System.out.println(proizvedenie1);

        System.out.println("ex 2.14");
        int y = 123;
        int hundred1 = y/100;
        int ostatokHundred1 = y%100;
        int ten3 = ostatokHundred1/10;
        int one3 = ostatokHundred1%10;
        int chislo = ten3*100 + one3*10 + hundred1;
        System.out.println(chislo);

        System.out.println("ex 2.15");
        int u = 123;
        int hundred2 = u/100;
        int ostatokHundred2 = u%100;
        int ten4 = ostatokHundred2/10;
        int one4 = ostatokHundred2%10;
        int chislo0 = one4*100 + hundred2*10 + ten4;
        System.out.println(chislo0);

        System.out.println("ex 2.16");
        int i = 123;
        int hundred3 = i/100;
        int ostatokHundred3 = u%100;
        int ten5 = ostatokHundred3/10;
        int one5 = ostatokHundred3%10;
        int chislo1 = ten5*100 + hundred3*10 + one5;
        System.out.println(chislo1);
    }
}
