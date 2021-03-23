package practice;

public class HomeWork032 {
    public static void main(String[] args) {
        System.out.println("ex 5.73");
        double uchastok = 100;
        double srednyayaUrozaynost = 20;
        for (int i = 1; i <= 7; i++) {
            uchastok = uchastok / 100 * 105;
            srednyayaUrozaynost = srednyayaUrozaynost / 100 * 102;
            System.out.println("urozaynost " + (i + 1) + " goda = " + uchastok * srednyayaUrozaynost);
        }

        System.out.println("ex 5.73(b");
        double ploshchad = 100;
        for (int i = 1; i < 8; i++) {
            ploshchad = ploshchad / 100 * 105;
            if(i>= 4 && i<8) {
                System.out.println(ploshchad);
            }
        }

        System.out.println("ex 5.73(c");
        double uchast = 100;
        double srednyayaUrozayn = 20;
        double procentUchastka = 0;
        double procentSredneyUrozaynosti = 0;
        for (int i = 1; i <= 6; i++) {

            uchast = uchast + procentUchastka;
            procentUchastka = uchast/100*5;
            srednyayaUrozayn = srednyayaUrozayn + procentSredneyUrozaynosti;
            procentSredneyUrozaynosti = srednyayaUrozayn/100*2;
            System.out.println("urozaynost " + i + " goda = " + uchast * srednyayaUrozayn);
        }


        System.out.println("ex 5.74");
        int shari = 12;
        int tolshchina = 5;
        int diametrVnutrennegoShara = 10;
        int radius = (diametrVnutrennegoShara + (shari*tolshchina))/2;
        double pi = 3.14;
        double obem = 4/3 * pi * Math.pow(pi,3);
        System.out.println(obem);

        System.out.println("ex 5.75");
        int q = 2;
        int proizvedenie2 = 2*q;
        int proizvedenie = 1;
        int summa = 0;
        for(int i = 1; i <= 10; i++){
            summa = proizvedenie + proizvedenie2;
            proizvedenie = q * proizvedenie2;
            System.out.println(summa);
        }
    }
}
