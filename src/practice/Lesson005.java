package practice;

public class Lesson005 {
    public static void main(String[] args){
        System.out.println("ex 1.22" + "a");
        double y = 1;
        double x = 2;
        y = 7*Math.pow(x,2)-7*x+6;
        double a = 3;
        x = 12*Math.pow(a,2)+7*a-16;

        System.out.println("ex 1.25");
        double perimetr = a*4;
        System.out.println("otvet =" + perimetr);

        System.out.println("ex 1.31");
        int c = 2;
        int b = 2;
        int result = (c+b)/2;
        System.out.println(result);

        System.out.println("ex 1.40");
        double d = 1;
        double i = 2;
        double sin = 3;
        x = (2/Math.pow(d,2)+i)/(Math.sqrt(i)+(d+i)/2);
        y = (Math.abs(d)+2*sin*i)/5.5*d;
        System.out.println(x);
        System.out.println(y);
    }
}
