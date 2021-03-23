package practice;

import java.util.Random;

public class HomeWork086 {
    public static void main(String[] args) {
        System.out.println("ex 4.75");
        double x0 = 2.2;
        double y0 = 3.4;
        double c01 = 0;
        double c02 = 0;

        if (x0 > 0 && y0 > 0) {
            c01 = x0;
            c02 = y0;
        } else if (x0 < 0 && y0 > 0) {
            c01 = x0 * (-1);
            c02 = y0;
        } else if (x0 > 0 && y0 < 0) {
            c01 = x0;
            c02 = y0 * (-1);
        } else if (x0 < 0 && y0 < 0) {
            c01 = x0 * (-1);
            c02 = y0 * (-1);
        }
        double polusumma = (x0 + y0) / 2;
        System.out.println(polusumma);
        System.out.println("ex 4.75(b");
        double kvadratniyKoren = Math.pow((c01 * c02), 2);
        System.out.println(kvadratniyKoren);

        System.out.println("ex 5.73");
        double uchastok = 100;
        double srednyayaUrozaynost = 20;
        double urozaynost = 0;
        for (int i = 2; i <= 8; i++) {
            uchastok = uchastok + (uchastok * 0.05);
            srednyayaUrozaynost = srednyayaUrozaynost + (srednyayaUrozaynost * 0.02);
            urozaynost = uchastok * srednyayaUrozaynost;

            System.out.println(urozaynost);
        }

        System.out.println("ex 6.98");
        double vklad = 1000;
        double m = 0;
        double rost = 0;
        double n = 0;
        double i0 = 0;
        for (int i = 0; m < 30; i++) {
            n = vklad;
            vklad = vklad + (vklad * 0.02);
            m = vklad - n;
            i0++;
        }
        System.out.println(i0);

        System.out.println("ex 7.99");
        n = 5;
        int chisla[] = {9,8,7,6,5};
        m = 2;
        int summa = 0;
        int q = 15;
        for(int i = 0; i<chisla.length; i++){
            if (chisla[i] < m) {
                summa = summa + chisla[i];
            }
        }
        if (summa > q) {
            System.out.println("verno");
        }

        System.out.println("ex 8.9");
        int massiv[][] = new int[8][5];
        Random rnd = new Random();
        for(int i = 0; i<8; i++){
            for(int j = 0; j < 5; j++){
                massiv[i][j] = rnd.nextInt(500)+300;
            }
        }
        for(int i = 0; i<5; i++){
            for(int j = 0; j<8; j++){
                System.out.print(massiv[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("ex 8.9(b");
        for(int i = 0; i<8; i++){
            for(int j = 0; j<5; j++){
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("ex 11.72");
        int massiv0[] = {1,2,3,4,5,6,7,8,-9,-6,-4};
        int polozitelnie = 0;
        int otricatelnie = 0;
        for(int i = 0; i<massiv0.length; i++){
            if(massiv0[i]<0){
                otricatelnie++;
            }
            if(massiv0[i]>0){
                polozitelnie++;
            }
        }
        System.out.println("kolichestvo polozitelnih elementov massiva = " + polozitelnie);
        System.out.println("kolichestvo otricatelnih elementov massiva = " + otricatelnie);

        System.out.println("ex 12.6");
        int massiv1[][] = {{1,2,3},
                {2,3,4},
                {5,6,7}};
        for(int i = 0; i<massiv1.length;i++){
            System.out.print(massiv1[i][1] + " ");
        }
        System.out.println();
        System.out.println("ex 12.6(b");
        int b = 2;
        for(int i = 0; i<massiv1.length; i++){
            System.out.print(massiv1[b-1][i] + " ");
        }

        System.out.println("ex 4.76");
        double pervoeChislo = 20;
        double vtoroeChislo = 10;
        if(pervoeChislo > Math.abs(vtoroeChislo)){
            pervoeChislo = pervoeChislo/2;
        }

        System.out.println("ex 5.74");
        double shar = 10;
        double stenka = 0.5;
        double vseShari = 10;
        double obyem = 0;
        double pi = 3.14;
        double r = 0;
        double summa0 = 0;
        double obyemPervogo = (4/3)*pi*Math.pow((vseShari/2),2);
        for(int i = 2; i<=12; i++){
            vseShari = vseShari + stenka;
            r = vseShari/2;
            obyem =(4/3)*pi*Math.pow(r,2);
            summa0 = summa0 + obyem;
        }
        System.out.println("obshhiy obyem = " + (summa0 + obyemPervogo));

        System.out.println("ex 4.77");
        double pervoeChisl = 2.2;
        double vtoroeChisl = 1.1;
        if(pervoeChisl > Math.sqrt(vtoroeChislo)){
            vtoroeChislo = vtoroeChislo * 5;
        }

        System.out.println("ex 5.75");
        n = 2;
        double stepen = 2;
        summa0 = 0;
        for(int i = 2; i<=10; i++){
            n = n*2;
            summa0 = summa0 + n;
        }
            System.out.println(summa0);

        System.out.println("ex 6.99");
        double probezal = 10;
        double a0 = 0;
        int den = 0;
        for(int i = 2; a0<20; i++){
            probezal = probezal + (probezal*0.2);
            a0 = probezal;
            den = i;
        }
            System.out.println(den);

        System.out.println("ex 7.100");
        int osadki[]  = new int[31];
        Random rnd1 = new Random();
        int osadkovNeBilo = 0;
        int otwet = 0;
        for(int i = 0; i<osadki.length; i++){
            osadki[i] = rnd1.nextInt(10);
            if (osadki[i] == 0) {
                osadkovNeBilo++;
                }
        }
        if (osadkovNeBilo >= 10) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 8.11");
        int sotrudniki[][] = new int[12][3];
        Random rnd2 = new Random();
        summa = 0;
        int zarplataRabotniku = 0;
        for(int i = 0; i<12; i++){
            for(int j = 0; j<3; j++){
                sotrudniki[i][j] = rnd.nextInt(10);
                summa = summa + sotrudniki[i][j];
            }

        }
        System.out.println(summa);
        System.out.println("ex 8.11(b");
        summa = 0;
        for(int i = 0; i<12; i++){
            for(int j = 0; j<3; j++){
                summa = summa + sotrudniki[i][j];
            }
            System.out.println("zarplata rabotniku " + (i+1) +  " " + summa);
            summa = 0;
        }
        System.out.println("ex 8.11(c");
        summa = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<12; j++){
                summa = sotrudniki[j][i];
            }
            System.out.println(summa);
            summa = 0;
        }

        System.out.println("ex 11.73");
        int massiv2[] = {1,2,3,4,5,6,7,8};
        int chetnie = 0;
        int okanchivaetsyaNaPyat = 0;
        for(int i = 0; i<massiv2.length; i++){
            if (massiv2[i] % 2 == 0) {
                chetnie++;
            }
            if (massiv2[i] % 10 == 5) {
                okanchivaetsyaNaPyat++;
            }
        }
        System.out.println("chetnih chisel = " + chetnie);
        System.out.println("cifr okanchivayushhihsya na pyat = " + okanchivaetsyaNaPyat);

        System.out.println("ex 12.7");
        int massiv3[][] = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        massiv3[4][0] = 1948;
        System.out.println("ex 12.7(b");
        int a = 1234;
        massiv3[1][2] = a;

        System.out.println("ex 1.1");
        double chislo = 3.14;
        System.out.println(chislo);

        System.out.println("ex 1.2");
        int chislo0 = 256;
        System.out.println(chislo0);

        System.out.println("ex 1.3");
        int chislo1 = 5;
        System.out.println("vi vveli chislo " + chislo1);
        System.out.println(chislo1 + " vot takoe chislo vi vveli");

        System.out.println("ex 1.12(a");
        int s = 5;
        int g = 10;
        System.out.println(s + " " + g);
        System.out.println("7 sm");

        System.out.println("ex 4.78");
        int chis1 = 2;
        int chis2 = 3;
        int chis3 = 4;
        if (chis1 % 2 == 0) {
            System.out.println(chis1);
        }
        if(chis2%2 == 0){
            System.out.println(chis2);
        }
        if(chis3%2 == 0){
            System.out.println(chis3);
        }

        System.out.println("ex 5.76");
        n = 3;
        a0 = 2.2;
        double chisl2 = a0;
        for(int i = 1; i<=n; i++){
            chisl2 = chisl2 * a0;
            System.out.println("a0 v " + i + " stepeni " + " = " + chisl2);
        }

        System.out.println("ex 6.100");
        double uchastok0 = 100;//gektar
        double srUr = 20;//centnerov
        double m0 = 0;
        i0 = 0;
        for(int i = 1; m0<22; i++){
            uchastok0 = uchastok0 + (uchastok0*0.05);
            srUr = srUr + (srUr * 0.02);
            m0 = srUr;
            i0 = i;
        }
        System.out.println(i0);
        System.out.println("ex 6.100(b");
        uchastok0 = 100;
        srUr = 20;
        m0 = 0;
        i0 = 0;
        for(int i = 1; m0<120; i++ ){
            uchastok0 = uchastok0 + (uchastok0 * 0.05);
            m0 = uchastok0;
            i0 = i;
        }
        System.out.println(i0);
        System.out.println();
        System.out.println("ex 6.100(c");
        uchastok0 = 100;
        srUr = 20;
        m0  = 0;
        i0 = 0;
        summa0 = 0;
        for(int i = 1; summa0<800; i++){
            uchastok0 = uchastok0 + (uchastok0 * 0.05);
            srUr = srUr + (srUr * 0.02);
            m0 = uchastok0 * srUr;
            summa0 = summa0 + m0;
            i0 = i;
        }
        System.out.println(i0);

        System.out.println("ex 7.101");
        int february[] = new int[28];
        Random rnd3 = new Random();
        int summaChetnih = 0;
        int summaNeChetnih = 0;
        for(int i = 0; i<february.length; i++){
            february[i] = rnd3.nextInt(10);
            if (i + 1 % 2 == 0) {
               summaChetnih = summaChetnih + february[i];
            }
            else {
                summaNeChetnih = summaNeChetnih + february[i];
            }
        }
        if (summaChetnih < summaNeChetnih) {
            System.out.println("po nechetnim chislam osadkov vipalo bolshe");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 8.12");
        int programma[][] = new int[18][3];
        Random rnd4 = new Random();
        summa = 0;
        for(int i = 0; i<15; i++){
            for(int j = 0; j<3; j++){
                programma[i][j] = rnd4.nextInt(4);
                summa = summa + programma[i][j];
            }
            System.out.println("srednee kolichestvo ballov " + (i+1) + " uchastnika = " + summa/3);
            summa = 0;
        }
        System.out.println("ex 8.12(b");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<15; j++){
                summa = summa + programma[j][i];
            }
            System.out.println("srednee kol-vo ballov po kazdoy programme " + summa/15);
        }
        System.out.println("ex 8.12(c");








    }
}

