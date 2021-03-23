package practice;

public class Lesson042 {
    public static void main(String[] args){
        System.out.println("ex 4.28(a");
        int q = 123;
        int hundred = q/100;//1
        int ostatokHundred = q%100;//23
        int ten = ostatokHundred/10;//2
        int one = ostatokHundred%10;//3
        int summa = hundred + ten + one;
        if(summa>9){
            System.out.println("yavlyaetsya dvuznachnim");
        }
        else{
            System.out.println("ne yavlyaetsya dvuznachnim");
        }

        System.out.println("ex 4.35");
        int a = 8;
        int b = 4;

        int c = 2;
        int d = 1;

        int dlinnoyAC = a/c;
        int dlinnoyBD = b/d;

        int korotkoyAD = a/d;
        int korotkoyBC = b/c;
        if(dlinnoyAC+dlinnoyBD>korotkoyAD+korotkoyBC){
            System.out.println("dlinnoy vmestitsya bolshe");
        }
        else{
            System.out.println("korotkoy vmestitsya bolshe");
        }

        System.out.println("ex 4.36");
        double zel = 3;
        double kras = 2;
        double t = 2;
        if(t%5>3){
            System.out.println("gorit krasniyniy");
        }
        else{
            System.out.println("gorit zeleniy");
        }

        System.out.println("ex 4.37");
        int e = 4;
        if(e>=-5 && e<=3){
            System.out.println("prinadlezit intervalu");
        }
        else{
            System.out.println("ne prinadlezit intervalu");
        }

        System.out.println("ex 4.38(a");
        int x = 0;
        int y = x-(x*2);
        if (x==0){
            y = 0;
        }
        System.out.println(y);

        System.out.println("ex 4.38(b");
        if(x<0){
            x= x*(-1);
            y = x;
        }
        if(x>0){
            y = x -(x*2);
        }
        System.out.println(y);

    }
}
