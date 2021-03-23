package practice;

public class Lesson054 {
    public static void main(String[] args){
        System.out.println("ex 6.16");
        double n = 12.2;
        double i = 0;
        double q = 1;
        double result = 1;
        while(result<n){
            i++;
            result = result + (q/i);
        }
        System.out.println(result);

        System.out.println("ex 6.17");
        double a = 6.5;
        double i0 = 0;
        double result0 = 1;
        while(result0 > a){
            i0++;

        }

        System.out.println("ex 6.19");
        double chisl1 = 1;
        double znamen1 = 1;
        double chisl2 = 2;
        double znamen2 = 1;
        double chisl3 = chisl1 + chisl2;
        double znamen3 = znamen1 + znamen2;
        double i3 = 0;
        double w = Math.abs((chisl3/znamen3) - (chisl2/znamen2));
        System.out.println(w);
        while(Math.abs((chisl3/znamen3) - (chisl2/znamen2)) > 0.0001){
            chisl1 = chisl2;
            znamen1 = znamen2;
            chisl2 = chisl3;
            znamen2 = znamen3;
            chisl3 = chisl1+ chisl2;
            znamen3 = znamen1 + znamen2;
            i3++;

        }
        System.out.println("chislo3 " + chisl3 + "chislo2 " + chisl2 + "\t" + Math.abs((chisl3/znamen3) - (chisl2/znamen2)));
    }
}
