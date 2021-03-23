package practice;

public class HomeWork053 {
    public static void main(String[] args){
        System.out.println("ex 6.12");
        double a = 1.3;
        double i = 2;
        double result = 100;
        do{
            result = 1+(1.0/i);
            i++;
        }
        while(result>a);
        System.out.println(result);

        System.out.println("ex 6.13");
        double a0 = 1.3;
        double i0 = 2;
        double result0 = 0;
        do{
            result0 = 1+ (1.0/i0);
            i0++;
            System.out.println(result0);
        }while(result0 > a0);

        System.out.println("ex 6.14");
        double a1 = 1.3;
        double i1 = 2;
        double result1 = 2;
        while(result1 >a){
            i1++;
            result1 = 1+ (1.0/i1);
        }
        System.out.println(i1);

        System.out.println("ex 6.15");
        double a2 = 15.1;
        double w = 1;
        double result2 = 1;
        double i2 = 0;
        System.out.println(result2);
        while(result2<a2){
            i2++;
            result2 = (w/i2) + result2;
        }

        System.out.println("ex 6.16");
        double chisl1 = 1;
        double znamen1 = 1;
        double chisl2 = 2;
        double znamen2 = 1;
        double chisl3 = chisl1 + chisl2;
        double znamen3 = znamen1 + znamen2;
        double i3 = 0;
        double q = Math.abs((chisl3/znamen3) - (chisl2/znamen2));
        System.out.println(q);
        while(Math.abs((chisl3/znamen3) - (chisl2/znamen2)) > 0.0001){
            chisl1 = chisl2;
            znamen1 = znamen2;
            chisl2 = chisl3;
            znamen2 = znamen3;
            chisl3 = chisl1+ chisl2;
            znamen3 = znamen1 + znamen2;
            i3++;
            System.out.println("chisl3 " + chisl3 + "chisl2 " + chisl2);
        }

    }
}
