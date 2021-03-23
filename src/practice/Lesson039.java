package practice;

public class Lesson039 {
    public static void main(String[] args){
        System.out.println("ex 2.6(a");
        int proshloSek = 7322;
        int polnihChasov = proshloSek/60/60;
        System.out.println("chasov " + polnihChasov);

        int polnihMinut = proshloSek/60;
        int ostatokMinut = polnihMinut%60;
        System.out.println("minut " + ostatokMinut);

        int ostatokSek = proshloSek%60;
        System.out.println("sekund " + ostatokSek);

        System.out.println("ex 2.7");
        int dlina = 543;
        int shirina = 130;
        int kvadratovMoznoOtrezat = dlina/shirina;
        System.out.println(kvadratovMoznoOtrezat);

        System.out.println("ex 2.8");
        int k = 10;
        int d = 7;
        int denD = (k%7) + d;
        int den = denD%7 ;
        System.out.println(den);

        System.out.println("ex 2.9");
        int mesyac = 3;
        int den0 = 2;
        int x = mesyac + 1;
        int a = x %12;
        System.out.println(a);




    }
}
