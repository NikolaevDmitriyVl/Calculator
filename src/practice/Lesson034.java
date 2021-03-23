package practice;

public class Lesson034 {
    public static void main(String[] args){
        System.out.println("ex 4.19(a");
        int q = 1234;
        int thousand = q/1000;//1
        int ostatokThousand = q%1000;//234
        int hundred = ostatokThousand/100;//2
        int ostatokHundred = ostatokThousand%100;//34
        int ten = ostatokHundred / 10;//3
        int one = ostatokHundred%10;
        int summa = thousand + hundred + ten + one;
        System.out.println(summa);

        System.out.println("ex 4.19(b");
        int proizvedenie = thousand * hundred * ten * one;
        System.out.println(proizvedenie);

        System.out.println("ex 4.20(a");
        int w = 1234;
        int thousand1 = w/1000;//1
        int ostatokThousand1 = w%1000;//234
        int hundred1 = ostatokThousand/100;//2
        int ostatokHundred1 = ostatokThousand1 %100;//34
        int ten1 = ostatokHundred1 /10;//3
        int one1 = ostatokHundred1%10;//4
        System.out.println(one1 + "" + ten1 + "" + hundred1 + "" + thousand1);
        System.out.println("ex 2.20(b");
        System.out.println(ten1 + "" + one1 + "" + thousand1 + "" + hundred);
        System.out.println("ex 2.20(c");
        System.out.println(one1 + "" + hundred1 + "" + ten + "" + thousand);
        System.out.println("ex 2.20(d");
        System.out.println(hundred1 + "" + thousand1 + "" + one1 + "" + ten1);

        System.out.println("ex");
        int e = 5084;
        int ten2 = e%100;
        System.out.println(ten2);

        System.out.println("ex 2.36");
        int r1 = 3;
        int r2 = 2;
        int r3 = 1;

        int t1 = 2;
        int t2 = 1;
        System.out.println(r1 + r2 + r3);

        System.out.println("ex 2.26");
        int t = 564;
        int hundred2 = t/100;//5
        int ostatokHandred2 = t%100;//64
        int ten3 = ostatokHandred2 / 10;//6
        int one2 = ostatokHandred2 %10;//4
        System.out.println(one +"" + hundred + "" + ten);
        int first = t % 10 % 10;
        int second = t - first;
        int third = second / 10;
        int result = first * 100 + third;
        System.out.println(result);







    }
}
