package practice.HomeWork111;

import java.util.Random;

public class HomeWork111 {
    int podschetKolichestvaCifr(int a){
        int chislo = a;
        int i0 = 0;
        while (chislo > 0) {
            chislo = chislo/10;
            i0++;
        }
        return i0;
    }
    int chess(int a, int b){
        int x;
        if ((a % 2 == 0 && b %2 == 0) || (a == 1 && b %2 == 1)) {
            x = 0;
        }
        else{
            x = 1;
        }
        return x;
    }
    int summaChisel(int x) {
        int chislo = x;
        int cifra;
        int summa = 0;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;
            summa = summa + cifra;
        }
        return summa;
    }

    double summa0(int x) {
        int n = x;
        double summa0 = 0;
        for (int i = 1; i <= n; i++) {
            summa0 = summa0 + Math.pow(i, i);
        }
        return summa0;
    }

    public static void main(String args[]) {
        System.out.println("ex 4.120");
        int gorizont = 2;
        int vertikal = 3;
        int aG = 1;
        int aV = 1;
        int bG = 2;
        int bV = 2;
        int cG = 3;
        int cV = 3;
        if (aG == cG || aV == cV) {
            System.out.println("poyti mozet");
            if (cG != bG || cV != bV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("poyti ne mozet");
        }


        System.out.println("ex 4.120(b");
        if (aG == cG || aV == cV) {
            System.out.println("mozet poyti");
            if (bG != cG || bV != cV || bG - cG != bV - cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozet poyti");
        }
        System.out.println("ex 4.120(v");
        if (aG == cG || aV == cV) {
            System.out.println("mozet poyti");
            if (bG + 2 != cG && bV + 1 != cV || bG + 2 != cG && bV - 1 != cV ||
                    bG - 2 != cG && bV + 1 != cV || bG - 2 != cG && bV - 1 != cV ||
                    bV + 2 != cV && bG + 1 != cG || bV + 2 != cV && bG - 1 != cG ||
                    bV - 2 != cV && bG + 1 != cG || bV - 2 != cV && bG - 1 != cG) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozet poyti");
        }
        System.out.println("ex 4.120(g");
        //ladya i slon
        if (aG == cG || aV == cV) {
            System.out.println("mozet poyti");
            if (bG - cG != bV - cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozet poyti");
        }
        System.out.println("ex 4.120(d");
        //ferz i ferz
        if (aG == cG || aV == cV || ((aG - cG) == (aV - cV))) {
            System.out.println("mozet poyti");
            if (((bG - cG) != (bV - cV)) && cG != bG && cV != bV) {
                System.out.println("ne popav pod udar");
            } else {

                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozet poyti");
        }


        System.out.println("ex 4.120(e");
        if (aG == cG || aV == cV || aG - cG == aV - cV) {
            System.out.println("mozet poyti");
            if (bG != cG || bV != cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozet poyti");
        }
        System.out.println("ex 4.120(zh");
        //ferz i kon
        if (aG == cG || aV == cV || aG - cG == aV - cV) {
            System.out.println("mozhet poyti");
            if (bG + 2 != cG && bV + 1 != cV || bG + 2 != cG && bV - 1 != cV ||
                    bG - 2 != cG && bV + 1 != cV || bG - 2 != cG && bV - 1 != cV ||
                    bV + 2 != cV && bG + 1 != cG || bV + 2 != cV && bG - 1 != cG ||
                    bV - 2 != cV && bG + 1 != cG || bV - 2 != cV && bG - 1 != cG) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozet poyti");
        }
        System.out.println("ex 4.120(z");
        //ferz i slon
        if (aG == cG || aV == cV || aG - cG == aV - cV) {
            System.out.println("mozet poyti");
            if (cG != bG && cV != bV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(i");
        //kon i kon
        if (aG + 2 == cG && aV + 1 == cV || aG + 2 == cG && aV - 1 == cV ||
                aG - 2 == cG && aV + 1 == cV || aG - 2 == cG && aV - 1 == cV ||
                aV + 2 == cV && aG + 1 == cG || aV + 2 == cV && aG - 1 == cG ||
                aV - 2 == cV && aG + 1 == cG || aV - 2 == cV && aG - 1 == cG) {
            System.out.println("mozhet poyti");
            if (bG + 2 != cG && bV + 1 != cV || bG + 2 != cG && bV - 1 != cV ||
                    bG - 2 != cG && bV + 1 != cV || bG - 2 != cG && bV - 1 != cV ||
                    bV + 2 != cV && bG + 1 != cG || bV + 2 != cV && bG - 1 != cG ||
                    bV - 2 != cV && bG + 1 != cG || bV - 2 != cV && bG - 1 != cG) {
                System.out.println("ne popav pod udat");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(k");
        //kon i ladya
        if (aG + 2 == cG && aV + 1 == cV || aG + 2 == cG && aV - 1 == cV ||
                aG - 2 == cG && aV + 1 == cV || aG - 2 == cG && aV - 1 == cV ||
                aV + 2 == cV && aG + 1 == cG || aV + 2 == cV && aG - 1 == cG ||
                aV - 2 == cV && aG + 1 == cG || aV - 2 == cV && aG - 1 == cG) {
            System.out.println("mozhet poyti");
            if (bG != cG || bV != cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }

        System.out.println("ex 4.120(l");
        //kon i ferz
        if (aG + 2 == cG && aV + 1 == cV || aG + 2 == cG && aV - 1 == cV ||
                aG - 2 == cG && aV + 1 == cV || aG - 2 == cG && aV - 1 == cV ||
                aV + 2 == cV && aG + 1 == cG || aV + 2 == cV && aG - 1 == cG ||
                aV - 2 == cV && aG + 1 == cG || aV - 2 == cV && aG - 1 == cG) {
            System.out.println("mozhet poyti");
            if (bG != cG && bV != bV && bG - cG != bV - cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }

        System.out.println("ex 4.120(m");
        //kon i slon
        if (aG + 2 == cG && aV + 1 == cV || aG + 2 == cG && aV - 1 == cV ||
                aG - 2 == cG && aV + 1 == cV || aG - 2 == cG && aV - 1 == cV ||
                aV + 2 == cV && aG + 1 == cG || aV + 2 == cV && aG - 1 == cG ||
                aV - 2 == cV && aG + 1 == cG || aV - 2 == cV && aG - 1 == cG) {
            System.out.println("mozhet poyti");
            if (bG - cG != bV - cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(n");
        //slon i slon
        if (aG - cG == aV - cV) {
            System.out.println("mozhet poyti");
            if (bG - cG != bV - cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(o");
        // slon i ferz
        if (aG - cG == aV - cV) {
            System.out.println("mozhet poyti");
            if (bG != cG && bV != cV && bG - cG != bV - cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(p");
        // slon i kon
        if (aG - cG == aV - cV) {
            System.out.println("mozhet poyti");
            if (bG + 2 != cG && bV + 1 != cV || bG + 2 != cG && bV - 1 != cV ||
                    bG - 2 != cG && bV + 1 != cV || bG - 2 != cG && bV - 1 != cV ||
                    bV + 2 != cV && bG + 1 != cG || bV + 2 != cV && bG - 1 != cG ||
                    bV - 2 != cV && bG + 1 != cG || bV - 2 != cV && bG - 1 != cG) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(r");
        // slon i ladya
        if (aG - cG == aV - cV) {
            System.out.println("mozhet poyti");
            if (bG != cG && bV != cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(s");
        //korol i slon
        if (aG == cG && aV + 1 == cV ||
                aG == cG && aV - 1 == cV ||
                aG + 1 == cG && aV == cV ||
                aG - 1 == cG && aV == cV ||

                aG + 1 == cG && aV + 1 == cV ||
                aG + 1 == cG && aV - 1 == cV ||

                aG - 1 == cG && aV + 1 == cV ||
                aG - 1 == cG && aV - 1 == cV ||

                aG + 1 == cG && aV + 1 == cV ||
                aG - 1 == cG && aV + 1 == cV ||
                aG + 1 == cG && aV - 1 == cV ||
                aG - 1 == cG && aV - 1 == cV
        ) {
            System.out.println("mozhet poyti");
            if (bG - cG != bV - cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(t");
        //korol i ferz
        if (aG == cG && aV + 1 == cV ||
                aG == cG && aV - 1 == cV ||
                aG + 1 == cG && aV == cV ||
                aG - 1 == cG && aV == cV ||

                aG + 1 == cG && aV + 1 == cV ||
                aG + 1 == cG && aV - 1 == cV ||

                aG - 1 == cG && aV + 1 == cV ||
                aG - 1 == cG && aV - 1 == cV ||

                aG + 1 == cG && aV + 1 == cV ||
                aG - 1 == cG && aV + 1 == cV ||
                aG + 1 == cG && aV - 1 == cV ||
                aG - 1 == cG && aV - 1 == cV) {
            System.out.println("mozhet poyti");
            if (bG != cG && bV != cG && bG - cG != bV - cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(u");
        //korol i kon
        if (aG == cG && aV + 1 == cV ||
                aG == cG && aV - 1 == cV ||
                aG + 1 == cG && aV == cV ||
                aG - 1 == cG && aV == cV ||

                aG + 1 == cG && aV + 1 == cV ||
                aG + 1 == cG && aV - 1 == cV ||

                aG - 1 == cG && aV + 1 == cV ||
                aG - 1 == cG && aV - 1 == cV ||

                aG + 1 == cG && aV + 1 == cV ||
                aG - 1 == cG && aV + 1 == cV ||
                aG + 1 == cG && aV - 1 == cV ||
                aG - 1 == cG && aV - 1 == cV) {
            System.out.println("mozhet poyti");
            if (bG + 2 != cG && bV + 1 != cV || bG + 2 != cG && bV - 1 != cV ||
                    bG - 2 != cG && bV + 1 != cV || bG - 2 != cG && bV - 1 != cV ||
                    bV + 2 != cV && bG + 1 != cG || bV + 2 != cV && bG - 1 != cG ||
                    bV - 2 != cV && bG + 1 != cG || bV - 2 != cV && bG - 1 != cG) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }
        System.out.println("ex 4.120(f");
        //korol i ladya
        if (aG == cG && aV + 1 == cV ||
                aG == cG && aV - 1 == cV ||
                aG + 1 == cG && aV == cV ||
                aG - 1 == cG && aV == cV ||

                aG + 1 == cG && aV + 1 == cV ||
                aG + 1 == cG && aV - 1 == cV ||

                aG - 1 == cG && aV + 1 == cV ||
                aG - 1 == cG && aV - 1 == cV ||

                aG + 1 == cG && aV + 1 == cV ||
                aG - 1 == cG && aV + 1 == cV ||
                aG + 1 == cG && aV - 1 == cV ||
                aG - 1 == cG && aV - 1 == cV) {
            System.out.println("mozhet poyti");
            if (bG != cG && bV != cV) {
                System.out.println("ne popav pod udar");
            } else {
                System.out.println("popav pod udar");
            }
        } else {
            System.out.println("ne mozhet poyti");
        }


        System.out.println("ex 8.43");
        HomeWork111 summa0 = new HomeWork111();
        int n = 5;
        System.out.println(summa0.summa0(n));

        System.out.println("ex 10.18");
        HomeWork111 summaChisel = new HomeWork111();
        int chisloOne = 555;
        int chisloTwo = 222;
        System.out.println("chislo first " + chisloOne + " = " + summaChisel.summaChisel(chisloOne));
        System.out.println("chislo second " + chisloTwo + " = " + summaChisel.summaChisel(chisloTwo));

        System.out.println("ex 11.98");
        int max = 0;
        int summa = 0;
        int elementi[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 4; i < elementi.length; i++) {
            for (int j = i; j >= (i - 4); j--) {
                summa = summa + elementi[j];
            }
            if (summa > max) {
                max = summa;
            }
            summa = 0;
        }
        System.out.println(max);

        System.out.println("ex 12.23");
        int dvumMassiv[][] = new int[7][7];
        int i0 = 0;
        int x = 0;
        int x2 = 6;
        for (int i = 0; i < dvumMassiv.length; i++) {
            for (int j = 0; j < dvumMassiv.length; j++) {
                if (j == x || j == x2) {
                    dvumMassiv[i][j] = 1;
                } else {
                    dvumMassiv[i][j] = 0;
                }
                System.out.print(dvumMassiv[i][j] + "\t");
            }
            System.out.println();
            x++;
            x2--;
        }
        System.out.println("ex 12.23(b");
        int dvumMassiv2[][] = new int[7][7];
        i0 = 0;
        x = 0;
        x2 = 6;
        for (int i = 0; i < dvumMassiv.length; i++) {
            for (int j = 0; j < dvumMassiv.length; j++) {
                if (j == x || j == x2 || j == 3) {
                    dvumMassiv[i][j] = 1;
                } else {
                    dvumMassiv[i][j] = 0;
                }
                System.out.print(dvumMassiv[i][j] + "\t");
            }
            System.out.println();
            x++;
            x2--;
        }
        System.out.println("ex 12.23(c");//???
        int dvumMassiv3[][] = new int[7][7];
        i0 = 0;
        x = -1;
        x2 = 7;
        for (int i = 0; i < dvumMassiv.length; i++) {
            for (int j = 0; j < dvumMassiv.length; j++) {
                if (j <= x || j >= x2) {
                    dvumMassiv[i][j] = 0;
                } else {
                    dvumMassiv[i][j] = 1;
                }
                System.out.print(dvumMassiv[i][j] + "\t");

            }
            System.out.println();
            if (i0 < 3) {
                x++;
                x2--;
            } else {
                x--;
                x2++;
            }
            i0++;
        }


        System.out.println("ex 13.17");//???


        Sotrudniki listSotrudniki[] = new Sotrudniki[3];
        listSotrudniki[0] = new Sotrudniki();
        listSotrudniki[0].surName = "Smirnov";
        listSotrudniki[0].address = "smirniva 1";
        listSotrudniki[1] = new Sotrudniki();
        listSotrudniki[1].surName = "Kuzin";
        listSotrudniki[1].address = "ivanova 2";
        listSotrudniki[2] = new Sotrudniki();
        listSotrudniki[2].surName = "Sidorov";
        listSotrudniki[2].address = "sidorova 3";


        for(int i = 0; i<listSotrudniki.length; i++){
        if(listSotrudniki[i].surName.equals("Kuzin") || listSotrudniki[i].surName.equals("Kuravlev")){
            System.out.println(listSotrudniki[i].surName + " prozhivaet po adresu - " + listSotrudniki[i].address);
           }
        }

        //kuzin, kuravlev, kudin, kulkov, kubikov

        System.out.println("ex 4.121");
        HomeWork111 chess = new HomeWork111();
        int aGorizont = 2;
        int aVertikal = 3;
        int bGorizont = 4;
        int bVertikal = 5;
        x = chess.chess(aGorizont, aVertikal);
        x2 = chess.chess(bGorizont, bVertikal);
        if((x == 0 && x2 == 0) || (x2 == 1 && x == 1)){
            System.out.println("polya yavlyayutsya odnogo cveta");
        }
        else {
            System.out.println("polla ne yavlyayutsya odnogo cveta");
        }


        System.out.println("ex 8.44");
        n = 26;
        for(int i = 1; i<=9; i++){
            for(int j = 0; j<=9; j++){
                for(int y = 0; y<=9; y++){
                    if (i + j + y == n) {
                        System.out.print(i+""+ j +""+ y);
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("ex 10.19");
        HomeWork111 podschetKolichestvaChisel = new HomeWork111();

        int chislo1 = 12;
        int chislo2 = 123;
        int chislo = chislo1;
        int cifra = 0;
        i0 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i0++;
        }
        if(podschetKolichestvaChisel.podschetKolichestvaCifr(chislo1) > podschetKolichestvaChisel.podschetKolichestvaCifr(chislo2)){
            System.out.println("v pernom chisle cifr boilshe");
        }
        else if(podschetKolichestvaChisel.podschetKolichestvaCifr(chislo1) == podschetKolichestvaChisel.podschetKolichestvaCifr(chislo2)){
            System.out.println("v pernom i vtorom chislah cifr odinakovo");
        }
        else{
            System.out.println("vo vtorom chisle cifr bolshe chem v pervom");
        }


        System.out.println("ex 11.99");
        int temperaturaVIyule[] = new int[31];
        Random rnd = new Random();
        int den1 = 0;
        int den2 = 0;
        int den3 = 0;
        int den4 = 0;
        int den5 = 0;
        int den6 = 0;
        int den7 = 0;
        for(int i = 0; i<temperaturaVIyule.length; i++){
            temperaturaVIyule[i] = rnd.nextInt(30)+10;
        }
        max = 0;
        for(int i = 0; i<temperaturaVIyule.length-7; i++){
            if (temperaturaVIyule[i] + temperaturaVIyule[i + 1] + temperaturaVIyule[i + 2] + temperaturaVIyule[i + 3] + temperaturaVIyule[i + 4] + temperaturaVIyule[i + 5] + temperaturaVIyule[i + 6] > max) {
                max = (temperaturaVIyule[i] + temperaturaVIyule[i + 1] + temperaturaVIyule[i + 2] + temperaturaVIyule[i + 3] + temperaturaVIyule[i + 4] + temperaturaVIyule[i + 5] + temperaturaVIyule[i + 6]);
                den1 = i+1;
                den2 = i+2;
                den3 = i+3;
                den4 = i+4;
                den5 = i+5;
                den6 = i+6;
                den7 = i+7;
            }
        }
        System.out.println("maximalno teplaya temperatura v iyule za 7 dney = " + max + " s " + den1 + " po " + den7 + " dni mesyaca");

        System.out.println("ex 12.24");
        int dvumMassiv4[][] = new int[6][6];
        for(int i = 0; i<dvumMassiv4.length; i++){
            for(int j = 0; j<dvumMassiv4.length; j++){
                if(i == 0){
                    dvumMassiv4[i][j] = 1;
                }
                else{
                    if (j == 0) {
                        dvumMassiv4[i][j] = 1;
                    }
                    else{
                        dvumMassiv4[i][j] = (dvumMassiv4[i-1][j] + dvumMassiv4[i][j-1]);
                    }
                }
                System.out.print(dvumMassiv4[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("ex 12.24(b");
        int dvumMassiv5[][] = new int[6][6];
        x = 1;
        int y = 1;
        for(int i = 0; i<dvumMassiv5.length; i++){
            for(int j=0; j<dvumMassiv5.length; j++){
              dvumMassiv5[i][j] = x;
              x++;
                if (x == 7) {
                    x = 1;
                }
                System.out.print(dvumMassiv5[i][j] + "\t");
            }
            System.out.println();
            y++;
            x = y;
        }


        System.out.println("ex 13.18");
        Strani russia = new Strani();
        Strani usa = new Strani();
        Strani england = new Strani();
        Strani nigeria = new Strani();
        nigeria.name = "Nigeria";
        nigeria.chastSveta = "africa";
        russia.name = "Russia";
        usa.name = "USA";
        england.name = "England";
        russia.chastSveta = "europe, asia";
        usa.chastSveta = "europe";
        england.chastSveta = "europe";
        Strani vseStrani[] = new Strani[4];
        vseStrani[0] = russia;
        vseStrani[1] = usa;
        vseStrani[2] = england;
        vseStrani[3] = nigeria;
        for(int i=  0; i<vseStrani.length; i++){
            if(vseStrani[i].chastSveta == "africa"){
                System.out.println(vseStrani[i].name);
            }
        }
        System.out.println("ex 4.122");
        double a0 = 1;
        double b0 = 2;
        double c0 = 3;
        if((a0+b0)== c0 || (a0+c0) == b0 || (b0+c0) == a0){
            System.out.println("treugolnik vozmozhen");
        }
        else{
            System.out.println("treugolnik ne vozmozhen");
        }

        System.out.println("ex 8.45");
        for(int i = 1; i<=9; i++){
            for(int j = 0; j<=9; j++){
                for(int u = 0; u<=9; u++){
                    if(i!= j && i!=u && u!=j){
                        System.out.print(i+""+j+""+u+" ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("ex 10.20");
        //summa cifr trehznachnogo chisla
        chislo = 0;
        cifra = 0;
        i0 = 0;
        summa = 0;
        for(int i = 123123; i<=123124; i++){
            chislo = i;
            while (i0 < 3) {
               cifra = chislo%10;
               chislo = chislo/10;
               i0++;
               summa = summa + cifra;
            }
        }
        System.out.println(summa);


        chislo = 0;
        cifra = 0;
        i0 = 1;
        summa = 0;
        x = 5;
        double w0 = Math.pow(10.0,x);
        System.out.println("*** "  + w0);

        for(int i = 111123; i<=111124; i++){
            chislo = i;
            while (i0 < 4) {
                cifra = chislo/(int)w0;
                chislo = chislo-(cifra*(int)w0);
                w0 = w0/10;
                i0++;
                summa = summa + cifra;
            }
        }
        System.out.println(summa);



        //??kak sravnivat c pomoshhyu metoda equals?



    }
}
