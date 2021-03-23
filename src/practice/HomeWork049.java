package practice;

public class HomeWork049 {
    public static void main(String[] args){
        System.out.println("ex 5.73(a");
        double uchastok = 100;//gektar
        double srednyayaUrozaynost = 20;//centner s gektara

        for(int i = 2; i<9 ; i++){
            uchastok = uchastok * 1.05;
            srednyayaUrozaynost = srednyayaUrozaynost * 1.02;
            double urozaynost = uchastok*srednyayaUrozaynost;
            System.out.println(urozaynost);

        }

        System.out.println("ex 5.74(b");
        double uchast = 100;
        for(int i = 1; i< 4; i++){
            uchast = uchast * 1.05;
        }
        for(int i = 4; i<8; i++){
            uchast = uchast * 1.05;
            System.out.println(uchast);
        }

        System.out.println("ex 5.73(c");
        double uchas = 100;//gektar
        double srednyayaUrozay = 20;//centner s gektara

        for(int i = 2; i<8 ; i++){
            uchas = uchas * 1.05;
            srednyayaUrozay = srednyayaUrozay * 1.02;
        }
        double urozayn = uchas*srednyayaUrozay;
        System.out.println(urozayn);

        System.out.println("ex 5.74");
        double sharov = 12;
        double stenka = 0.5;
        double shar = 10;
        double vnutrenniyDiametrShara = shar-stenka;
        double shar1 = shar- stenka;
        double summaOt2Do12 = 0;
        for(int i = 1; i<  12; i++){
            vnutrenniyDiametrShara = vnutrenniyDiametrShara + 0.5;
            summaOt2Do12 = summaOt2Do12 + vnutrenniyDiametrShara;
        }
        double summa = shar1 + summaOt2Do12;
        System.out.println("summarniy ob'em " + summa);

        System.out.println("ex 5.75");
        double cifra = 2;
        double kvadrat = 2;
        for(int i = 1; i< 10; i++){
            cifra = 2 * kvadrat;
            kvadrat = kvadrat * 2;
            System.out.println(cifra);
        }

        System.out.println("ex 5.76");
        double a = 2.5;
        double b = 1;
        double n = 5;
        for(int i = 1; i<= n; i++){
            b = a * b;
            System.out.println(b);

        }

        System.out.println("ex 5.77");
        int q = 1;
        int sign = -1;
        for(int i = 1; i<=10; i++){
            q = i * i * sign;
            sign = sign * - 1;
            System.out.println(q);
        }
    }
}
