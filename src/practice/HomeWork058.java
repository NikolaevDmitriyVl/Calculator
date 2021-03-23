package practice;

public class HomeWork058 {
    public static void main(String[] args) {
        System.out.println("ex 5.10");
        double dollar = 1;
        double rubl = 63.59;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " dollar = " + i * rubl + " rubl");
        }

        System.out.println("ex 6.38");
        int chislo = 323456111;
        int x = chislo;
        int cifra = 0;
        int i = 0;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
            i++;
        }
        int cifra0 = 0;
        int i0 = 0;
        int i1 = 0;
        while (x > 0) {
            cifra0 = x % 10;
            x = x / 10;
            if (cifra0 == cifra) {
                i1++;
            }
            i0++;
        }
        System.out.println(i1);

        System.out.println("ex 4.11");
        double obem1 = 22;
        double massa1 = 23;
        double obem2 = 43;
        double massa2 = 24;
        double plotnost1 = massa1 / obem1;
        double plotnost2 = massa2 / obem2;
        if (plotnost1 > plotnost2) {
            System.out.println("plotnost 1 tela (" + plotnost1 + ") bolshe plotnosti 2 tela (" + plotnost2 + ")");
        }
        if (plotnost2 > plotnost1) {
            System.out.println("plotnost 2 tela (" + plotnost2 + ") bolshe plotnosti 1 tela (" + plotnost2 + ")");
        }

        System.out.println("ex 5.11");
        for (double h = 1; h <= 10; h++) {
            double r = 6350;
            double s = Math.pow((r + h), 2) - Math.pow(r, 2);
            System.out.println("visota nad zemley " + h + "m ravna " + s + "m rasstoyaniyu do gorizonta");
        }

        System.out.println("ex 6.39");
        chislo = 123456;
        cifra = 0;
        i = 0;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
        }
        System.out.println(cifra);

        System.out.println("ex 4.12");
        double sopr1 = 1;
        double sopr2 = 2;
        double napr1 = 3;
        double napr2 = 4;
        double moshhnost1 = Math.pow(napr1, 2) / sopr1;
        double moshhnost2 = Math.pow(napr2, 2) / sopr2;
        if (moshhnost1 > moshhnost2) {
            System.out.println("po vtoromu uchastku protekaet menshiy tok");
        }
        if (moshhnost1 < moshhnost2) {
            System.out.println("po pervomu uchastku protekaet menshiy tok");
        }

        System.out.println("ex 5.12");
        double visota = 0;
        double p0 = 1.29;
        double z = 1.25 * Math.pow(10, -4);
        double e = 1.6;
        for (visota = 0; visota <= 1000; visota += 100) {
            double plotnost = p0 * Math.pow(e, -visota * z);
            System.out.println("visota " + visota + "m = " + plotnost + " plotnosti vozduha");
        }


    }
}
