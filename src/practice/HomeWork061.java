package practice;

public class HomeWork061 {
    public static void main(String[] args) {
        System.out.println("ex 4.15");
        int mesyacR = 1;
        int mesyacN = 1;
        int godR = 1992;
        int godN = 2020;
        int let = godN - godR;
        if (mesyacN < mesyacR) {
            let = let - 1;
        }
        System.out.println(let);

        System.out.println("ex 5.15");
        int n = 6;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * 6  = " + (i * 6));
        }

        System.out.println("ex 6.41(b");
        int chislo = 121456;
        int chisl = chislo;
        int cifra = 0;
        int cifr = 0;
        int i = 0;
        int i0 = 0;
        int i1 = 0;
        int minCifra1 = 10;
        int minCifra2 = 10;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
            i++;
            if (cifra < minCifra1) {
                minCifra1 = cifra;
            }
        }
        while (chisl > 0) {
            cifr = chisl % 10;
            chisl = chisl / 10;
            i0++;
            if (cifr == minCifra1) {
                i1++;
            }

            if (cifr < minCifra2 && cifr > minCifra1) {
                minCifra2 = cifr;
            }
            if (i1 > 1) {
                minCifra2 = minCifra1;
            }
        }

        System.out.println("pervaya minimalnaya cifra = " + minCifra1 + " vtoraya minimalnaya cifra = " + minCifra2);

        System.out.println("ex 4.16");
        double ploshhadKruga = 100;
        double ploshhadKvadrata = 120;
        double storonaKvadrata = Math.sqrt((ploshhadKvadrata / 3.14));
        double diagonalKvadrata = Math.sqrt((Math.pow(storonaKvadrata, 2) + Math.pow(storonaKvadrata, 2)));
        double diametrKruga = 2 * Math.sqrt((ploshhadKruga / 3.14));
        if (diametrKruga < storonaKvadrata) {
            System.out.println("krug umestitsya v kvadrat");
        } else {
            System.out.println("krug ne umestitsya v kvadrat");
        }
        System.out.println("ex 4.16(b");
        if (diametrKruga > diagonalKvadrata) {
            System.out.println("kvadrat umestitsya v kruge");
        } else {
            System.out.println("kvadrat ne umestitsya v kruge");
        }

        System.out.println("ex 5.16");
        for (i = 2; i < 21; i++) {
            System.out.println("sin " + i + " = " + Math.sin(i));
        }

        System.out.println("ex 6.42(a");
        chislo = 123456;
        cifra = 0;
        i = 0;
        int maxCifra1 = 0;
        int maxCifra2 = 0;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
            i++;
            if (cifra > maxCifra1) {
                maxCifra1 = cifra;
            } else if (cifra > maxCifra2) {
                maxCifra2 = cifra;
            }
        }
        System.out.println("dve max cifri schitaya ot konca " + maxCifra1 + "," + maxCifra2);

        chislo = 123758;
        int chislo1 = chislo;
        cifra = 0;
        int cifra1 = cifra;
        i = 0;
        i0 = i;
        maxCifra1 = 0;
        maxCifra2 = 0;
        i1 = 0;
        int i2 = 0;
        int poryadkoviyNomer1 = 0;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
            i++;
        }
        double w = Math.pow(10, i - 1);
        while (chislo1 > 0) {
            cifra1 = chislo1 / (int) w;
            chislo1 = chislo1 - ((int) w * cifra1);
            w = w / 10;
            i0++;
            // 8 (7)
            if (cifra1 > maxCifra1) {

                maxCifra2 = maxCifra1;
                maxCifra1 = cifra1;
                i1 = i0;
            } else if (cifra1 > maxCifra2) {

                maxCifra2 = cifra1;
                System.out.println(maxCifra2);
                i2 = i0-1;
            }
            i++;
        }
        System.out.println(maxCifra1 + " i " + maxCifra2);
        System.out.println(i1 + " i " + i2);
    }
}
