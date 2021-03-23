package practice.Lesson102;

public class Lesson102 {
    public int sign(double a){
        if (a > 0) {
            return 1;
        }
        else if (a == 0) {
            return 0;
        }
        else {
            return -1;
        }
    }
    public void funkciya(double a, double b, double c){

        double x = 0;
        double x1 = 0;
        double x2 = 0;
        double diskriminant = Math.pow(b,2) - (4 * a * c);
        if (diskriminant > 0) {
            x1 = (-b + Math.sqrt(diskriminant))/(2*a);
            x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if (diskriminant == 0) {
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        if (diskriminant < 0) {
            System.out.println("net korney");
        }
    }
    public static void main(String[] args){
        System.out.println("ex 10.7");

        Lesson102 lesson = new Lesson102();
        double a = 1;
        double b = 6;
        double c = 3;
        lesson.funkciya(a,b,c);
        lesson.funkciya(b,a,c);
        lesson.funkciya(c,a,b);

        System.out.println("ex 10.5");

         int h = 0;
         lesson.sign(h);
         int answer = lesson.sign(h);
         System.out.println(answer);


    }
}
