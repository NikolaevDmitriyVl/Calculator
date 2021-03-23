package practice;

public class Lesson008 {
    public static void main(String[] args) {
        System.out.println("ex 1.17(a");
        double x1 = 1;
        double x2 = 2;
        double result = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));

        System.out.println("ex2.34");
        int a2 = 3;
        int a1 = 1;
        int b = 5;

        //r2 = (8 + 5) / 10
        //rr = (8 + 5) % 10

        int re = a1 + b;
        int r2 = a2 + (re / 10);
        int r1 = re % 10;
        System.out.println(r2+" "+r1);



        System.out.println("ex 2.37");
        //10 11 12 13 14 15
        int k = 7;
        //int n = k / 2;
        int n = k / 2 + 1;
        System.out.println("n = " + n);




    }
}
