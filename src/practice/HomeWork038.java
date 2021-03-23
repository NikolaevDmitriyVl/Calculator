package practice;

public class HomeWork038 {
    public static void main(String[] args){
        System.out.println("ex 2.1");
        int rastoyanieVSm = 500;
        int metrov = rastoyanieVSm/100;
        System.out.println(metrov);

        System.out.println("ex 2.2");
        int massaVKg = 1000;
        int centnerov = massaVKg/100;
        System.out.println(centnerov);

        System.out.println("ex 2.3");
        int massaVKg0 = 3000;
        int tonn = massaVKg0/1000;
        System.out.println(tonn);

        System.out.println("ex 2.4");
        int rastoyanieVMetrah = 4000;
        int km = rastoyanieVMetrah/1000;
        System.out.println(km);

        System.out.println("ex 2.5");
        int proshloDney = 234;
        int polnihNedel = proshloDney/7;
        System.out.println(polnihNedel);

        System.out.println("ex 2.6(a");
        int proshloSek = 3661;
        int polnihChasov = proshloSek/60/60;
        System.out.println("polnihChasov" + polnihChasov);
        int polnihMinut = proshloSek/60;
        int ostatokSChasov = polnihMinut%60;
        System.out.println(ostatokSChasov);

   }
}
