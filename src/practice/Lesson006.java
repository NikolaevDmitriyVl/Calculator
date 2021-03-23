package practice;

public class Lesson006 {
    public static void main(String[] args) {
        System.out.println("ex 2.1");
        int rasstoyanieVSm = 235;
        int rasstoyanieVMetrah = rasstoyanieVSm / 100;
        System.out.println(rasstoyanieVMetrah);
        int ostatok = rasstoyanieVSm - (rasstoyanieVMetrah * 100);
        System.out.println(ostatok);
        ostatok = rasstoyanieVSm % 100;
        System.out.println(ostatok);

        System.out.println("ex 2.2");
        int massa = 352;
        int centner = massa / 100;
        System.out.println(centner);

        System.out.println("ex 2.5");
        int day = 234;
        int week = day / 7;
        System.out.println(week);

        System.out.println("ex 2.7");
        

    }
}
