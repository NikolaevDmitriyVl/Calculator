package practice.Lesson109;

public class Lesson109 {
    double gipotenuzaKatet(double a, double b, double c){
        double katet = 0;
        double gipotenuza = 0;
        katet = (b-a)/2;
        gipotenuza = Math.sqrt((Math.pow(c,2) + Math.pow(katet,2)));
return gipotenuza;
    }
    double gipotenuza(double a, double b){
        double x = 0;
        x = Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
        return x;
    }
    public static void main(String[] args){

        System.out.println("ex 10.6");
        double ab = 10;
        double ac = 12;
        double dc = 14;
        Lesson109 lesson = new Lesson109();
        double bc = lesson.gipotenuza(ab,ac);
        System.out.println(bc);
        double bd = lesson.gipotenuza(bc,dc);
        System.out.println("perimetr = " + (ab + ac + dc + bd));

        System.out.println("ex 10.7");
        double a = 5;
        double b = 10;
        double h = 5;

        double a2 = 6;
        double b2 = 12;
        double h2 = 6;


        //double gipotenuza = Math.sqrt((Math.pow(h,2) + Math.pow(katet1,2)));

        double katet1 = lesson.gipotenuzaKatet(a,b,h);


    }
}
