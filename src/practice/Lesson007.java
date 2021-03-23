package practice;

public class Lesson007 {
    public static void main(String[] args){
        System.out.println("ex 1.14" + "и");
        double sin = 1;
        double cos = 2;
        double alpha = 3;
        double betta = 4;
        double result = Math.sin(alpha)*Math.cos(betta)+Math.cos(alpha)*Math.sin(betta);

        System.out.println("ex 1.14" + "м");
        double x = 5;
        double y = 6;
        result = -5*Math.sqrt(x+Math.sqrt(y));

        System.out.println("ex 2.10" + "a");
        int n = 87;
        int desyatki = n/10;
        System.out.println(desyatki);
        System.out.println("ex 2.10" + "b");
        int edinici = n%10;
        System.out.println(edinici);
        System.out.println("ex 2.10" + "c");
        int summa = desyatki+edinici;
        System.out.println(summa);
        System.out.println("ex 2.10" + "d");
        int proizvedenie = desyatki*edinici;
        System.out.println(proizvedenie);

        System.out.println("ex 2.19" + "a");
        int m = 2356;
        int tis = m/1000;
        System.out.println(tis);
        int sotni = m%1000;
        System.out.println(sotni);
        int sot = sotni/100;
        System.out.println(sot);
        int desyat = sotni%100;
        System.out.println(desyat);
        int des = desyat/10;
        System.out.println(des);
        int edini = desyat%10;
        System.out.println(edini);
        System.out.println(tis+sot+des+edini);

        System.out.println("ex 2.19" + "b");
        System.out.println(tis*sot*des*edini);





    }
}
