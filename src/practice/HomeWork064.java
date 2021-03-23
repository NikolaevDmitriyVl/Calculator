package practice;

public class HomeWork064 {
    public static void main(String[] args) {
        System.out.println("ex 6.47(b");
        int chislo = 123456;
        int b = 876;
        int cifra = 0;
        int i = 0;
        int proizvedenie = 1;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
            proizvedenie = proizvedenie * cifra;
        }
        if (proizvedenie > b) {
            System.out.println("proizvenie bolshe b");
        } else {
            System.out.println("proizvedenie menshe b");
        }

        System.out.println("ex 6.47(c");
        int k = 3;
        if (k == i) {
            System.out.println("chislo " + k + "-h znachnoe");
        } else {
            System.out.println("chislo " + "ne " + k + "-h znachoe");
        }

        System.out.println("ex 6.47(d");
        int m = 875;
        if (cifra > m) {
            System.out.println("pervaya cifra previshaet m");
        } else {
            System.out.println("pervaya cifra ne previshaet m");
        }

        System.out.println("ex 4.21");
        int a = 5;
        b = 12;
        if (b % a == 0) {
            System.out.println("chislo " + a + " yavlyaetsya delitelem chisla " + b);
        }
        System.out.println("chislo " + a + " ne yavlyaetsya delitelem chisla " + b);


        System.out.println("ex 5.21");
        double stoimostGramm = 0;
        double stoimost1Kg = 400;//rubley
        for(double g = 50; g<= 1000; g+=50 ){
            stoimostGramm = (stoimost1Kg / 1000)*g;
            System.out.println(stoimostGramm);
        }

        System.out.println("ex 4.22(a");
        a = 127;
        if (a % 2 == 0) {
            System.out.println("chislo chetnoe");
        }
        else{
            System.out.println("chislo ne chetnoe");
        }

        System.out.println("ex 4.22(b");
        if (a % 10 == 7) {
            System.out.println("chislo okanchivaetsya na 7");
        }
        else{
            System.out.println("chislo ne zakanchivaetsya na 7");
        }

        System.out.println("ex 5.22");
        stoimost1Kg = 850;
        double stoimostGr = 0;
        for(i = 100; i<=2000; i+=100) {
            stoimostGr = (stoimost1Kg * i) / 1000;
            System.out.println("stoimost " + i + " gramm = " + stoimostGr);
        }
            System.out.println("ex 6.48(a");
            chislo = 123456;
            int chisl = chislo;
            cifra = 0;
            i = 0;
            int summa = 0;
            k = 10;
            b = 356000;
            int x = 1;
            int y = 6;
            proizvedenie = 1;
            a = 123;
            b = 3;
            m = 900;
            int n = 953;
            while (chislo > 0) {
                cifra = chislo%10;
                chislo = chislo/10;
                summa = summa + cifra;
                proizvedenie = proizvedenie * cifra;
                i++;
            }
            if(summa>k && chisl%2==0){
                System.out.println("verno");
            }
            else{
                System.out.println("ne verno");
            }

            System.out.println("ex 6.48(b");
        if (i % 2 == 0 && chisl < b) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 6.48(c");
        if (cifra == x && chisl % 10 == y) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 6.48(d");
        if (proizvedenie < a && chisl % 3 == 0) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 6.48(e");
        if(summa>m && chisl%n == 0){
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }
        }
    }

