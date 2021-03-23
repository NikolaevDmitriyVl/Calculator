package practice;

import java.util.Random;

public class HomeWork087 {
    public static void main(String[] args) {
        System.out.println("ex 4.79");
        double chis1 = 1.2;
        double chis2 = 2.3;
        double chis3 = 3.5;
        if (chis1 > 0) {
            chis1 = Math.pow(chis1, 2);
        }
        if (chis2 > 0) {
            chis2 = Math.pow(chis2, 2);
        }
        if (chis3 > 0) {
            chis3 = Math.pow(chis3, 2);
        }
        System.out.println("chislo 1 = " + chis1 + " chislo 2 = " + chis2 + " chislo 3 = " + chis3);

        System.out.println("ex 5.77");
        double summa0 = 0;
        double znak = (-1);
        for (int i = 1; i < 10; i++) {
            summa0 = summa0 + Math.pow(i, 2) * znak;
            znak = znak * (-1);
            System.out.println(summa0);
        }

        System.out.println("ex 6.101");
        int chislo1 = 24;
        int chislo2 = 20;
        int naibolshee = 0;
        int naimenshee = 0;
        if (chis1 > chis2) {
            naibolshee = chislo1;
            naimenshee = chislo2;
        }
        if (chis2 > chis1) {
            naibolshee = chislo2;
            naimenshee = chislo1;
        }
        int raznica = 0;
        int ostatok = 0;
        if ((naibolshee / naimenshee) % 2 == 0) {
            System.out.println("menshee chislo " + naimenshee + " yavlyaetsya naibolshim obshhim delitelem");
        }
        if ((naibolshee / naimenshee) % 2 > 0) {
            naibolshee = (naibolshee / naimenshee) % 2;
            for (int i = 0; ostatok == 0; i++) {
                if ((naibolshee / naimenshee) % 2 > 0) {
                    naibolshee = (naibolshee / naimenshee) % 2;
                }
                if ((naibolshee / naimenshee) % 2 == 0) {
                    System.out.println(naimenshee);
                    break;
                }
            }
        }

        System.out.println("ex 7.102");
        int ziteli[] = {12, 13, 22, 43, 56, 84, 95, 103, 19, 22};
        int summaChetnih = 0;
        int summaNeChetnih = 0;
        for (int i = 0; i < ziteli.length; i++) {
            if ((i + 1) % 2 == 0) {
                summaChetnih = summaChetnih + ziteli[i];
            } else {
                summaNeChetnih = summaNeChetnih + ziteli[i];
            }
        }
        if (summaChetnih > summaNeChetnih) {
            System.out.println("v chetnih domah ziteley bolshe");
        }
        if (summaNeChetnih > summaChetnih) {
            System.out.println("v nechetnih domah ziteley bolshe");
        }

        System.out.println("ex 8.13");
        int ocenki[][] = new int[18][3];
        Random rnd = new Random();
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                ocenki[i][j] = rnd.nextInt(4) + 1;
            }
        }
        int i0 = 0;
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                if (ocenki[i][j] == 5) {
                    i0++;
                }
            }
        }
        System.out.println("vsego pyaterok " + i0);
        System.out.println("ex 8.13(b");
        i0 = 0;
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                if (ocenki[i][j] == 3) {
                    i0++;
                }
            }
            System.out.println("troek u " + (i + 1) + " uchenika = " + i0);
            i0 = 0;
        }
        System.out.println("ex 8.13(c");
        i0 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 18; j++) {
                if (ocenki[j][i] == 2) {
                    i0++;
                }
            }
            System.out.println("dvoek po " + (i + 1) + " predmetu = " + i0);
            i0 = 0;
        }

        System.out.println("ex 11.74");
        int komandi[] = new int[20];
        Random rnd0 = new Random();
        int viigrish = 0;
        int proigrish = 0;
        int nichya = 0;
        for(int i = 0; i<komandi.length; i++){
            komandi[i] = rnd0.nextInt(2)+1;
            if (komandi[i] == 3) {
                viigrish++;
            }
            if (komandi[i] == 2) {
                proigrish++;
            }
            if (komandi[i] == 1) {
                nichya++;
            }
        }
        System.out.println("igra zakonchilas viigrishem " + viigrish + " raz");
        System.out.println("igra zakonchilas proigrishem " + proigrish + " raz");
        System.out.println("igra zakonchilas nichey" + nichya + " raz");

        System.out.println("ex 12.7");
        int massiv[][] = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        massiv[4][0] = 1949;
        System.out.println("ex 12.7(b");
        int a = 99;
        massiv[0][4] = a;

        System.out.println("ex 4.80");
        double chisl01 = 2.2;
        double chisl02 = 3.4;
        double chisl03 = 5.6;
        if (chisl01 >= 1.6 && chisl01 <= 3.8) {
            System.out.print(chisl01 + " ");
        }
        if(chisl02 >= 1.6 && chisl02 <= 3.8){
            System.out.print(chisl02 + " ");
        }
        if(chisl03>= 1.6 && chisl03 <= 3.8){
            System.out.print(chisl03);
        }

        System.out.println("ex 5.78");//???

        System.out.println("ex 4.81");
        chisl01 = -1.1;
        chisl02 = -2.2;
        chisl03 = -3.3;
        double chisl04 = -4.4;
        if (chisl01 < 0 && chisl02 < 0 && chisl03 < 0 && chisl04 < 0) {
            System.out.println("4");
        }
        else if(chisl01< 0 && chisl02 < 0 && chisl03< 0 || chisl01<0 && chisl02< 0 && chisl04 < 0 || chisl02 < 0 && chisl03 < 0 && chisl04<0 || chisl03 < 0 && chisl04 < 0 && chisl01< 0){
            System.out.println("3");
        }
        else if (chisl01 < 0 && chisl03 < 0 || chisl01 < 0 && chisl03 < 0 || chisl01 < 0 && chisl04 < 0 || chisl02 < 0 && chisl03 < 0 || chisl02 < 0 && chisl04 < 0 || chisl03 < 0 && chisl04 < 0) {
            System.out.println("2");
        }
        else if (chisl01 < 0 || chisl02 < 0 || chisl03 < 0 || chisl04 < 0) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        System.out.println("ex 5.79");//???

        System.out.println("ex 6.102");
        int chisl1 = 13;
        int chisl2 = 10;
        int bolshee = 0;
        int menshee = 0;
        if (chisl1 > chisl2) {
        bolshee = chisl1;
        }
        if (chisl2 > chisl1) {
            bolshee = chisl2;
        }
        if (chisl1 == chisl2) {
            bolshee = chisl1;
        }
        for(int i = 2; i<=bolshee; i++){
            if (chisl1 % i == 0 && chisl2 % i == 0) {
                System.out.println("naimenshee obshhee kratnoe = " + i);
                break;
            }
        }

        System.out.println("ex 7.103");
        int chisla[] = {1,2,3,4,5,6,7,8,9,10};
        i0 = 0;
        for(int i =  0; i<chisla.length; i++){
            if (chisla[i] > 0) {
                i0++;
            }
        }
        if (i0 < 5) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 8.14");
        int ekzameni[][] = new int[15][3];
        Random rnd2 = new Random();
        for(int i = 0; i<15; i++){
            for(int j = 0; j<3; j++){
                ekzameni[i][j] = rnd2.nextInt(4);
            }
        }
        i0 = 0;
        int i1 = 0;
        for(int i = 0; i<15; i++){
            for(int j = 0; j<3; j++){
                if (ekzameni[i][j] != 2) {
                    i0++;
                }
            }
            if (i0 == 3) {
                i1++;
            }
            i0 = 0;
        }
        System.out.println(i1);
        System.out.println("ex 8.14(b");
        i0 = 0;
        i1 = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<15; j++){
                if (ekzameni[j][i] == 4 || ekzameni[j][i] == 5) {
                    i0++;
                }
            }
            if (i0 == 15) {
                i1++;
            }
            i0 = 0;
        }
        System.out.println(i1);
        System.out.println("ex 8.14(c");
        i0  = 0;
        i1 = 0;
        for(int i = 0; i<15; i++){
            for(int j = 0; j<3; j++){
                if (ekzameni[i][j] == 2) {
                    i0++;
                }
            }
            System.out.println("dvoek po " + (i+1) + " predmetu = " + i0);
            i0 = 0;
        }

        System.out.println("ex 11.75");
        int inYaz[] = new int[22];
        Random rnd3 = new Random();
        int pyaterki = 0;
        int chetverki = 0;
        int troyki = 0;
        int dvoyki = 0;
        for(int i = 0; i<inYaz.length; i++){
            inYaz[i] = rnd3.nextInt(10);
            if (inYaz[i] == 5) {
                pyaterki++;
            }
            if (inYaz[i] == 4) {
                chetverki++;
            }
            if (inYaz[i] == 3) {
                troyki++;
            }
            if (inYaz[i] == 2) {
                dvoyki++;
            }
        }
        System.out.println("pyaterok " + pyaterki);
        System.out.println("chetverok " + chetverki);
        System.out.println("troek " + troyki);
        System.out.println("dvoek " + dvoyki);

        System.out.println("ex 12.8");
        int massiv1[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        massiv1[2][1] = 13;
        System.out.println("ex 12.8(b");
        int b = 10;
        massiv1[3][3] = b;

        System.out.println("ex 4.82");
        a = 1;
        b = 2;
        int c = 3;
        int d = 4;
        i0 = 0;
        if (a % 2 == 0) {
            i0++;
        }
        if (b % 2 == 0) {
            i0++;
        }
        if(c%2 == 0){
            i0++;
        }
        if(d%2 == 0){
            i0++;
        }
        System.out.println(i0);

        System.out.println("ex 5.80");//???

        System.out.println("ex 6.103");
        int chislitel = 5;
        int znamenatel = 3;
        int chisl = chislitel;
        int znam = znamenatel;
        for(int i = 0; i<(chislitel + znamenatel); i++){
            if (chisl / 2 > 0 && znam / 2 > 0) {
                chisl = chislitel/2;
                znam = znamenatel/2;
            }
        }
        System.out.println("chislitel " + chisl + " znamenatel " + znam);

        System.out.println("ex 7.104");
        double q0[] = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1};
        for(int i = 0; i<10; i++){
            if (q0[i] < 50.55) {
                i0++;
            }
        }
        if (i0 % 4 == 0) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 8.15");
        int massiv0[][] = new int[8][5];
        Random rnd4 = new Random();
        int maxChislo = 0;
        for(int i = 0; i<8; i++){
            for(int j = 0; j<5; j++){
                massiv0[i][j] = rnd.nextInt(5);
                if(maxChislo<massiv0[i][j]){
                    maxChislo = massiv0[i][j];
                }
            }
        }
        System.out.println(maxChislo);
        System.out.println("ex 8.15(b");
        int massiv2[] = new int[8];
        int summa = 0;
        for(int i = 0; i<8; i++){
            for(int j = 0; j<5; j++){
               summa =  summa + massiv0[i][j];
            }
            massiv2[i] = summa;
            summa = 0;
        }
        maxChislo = 0;
        for(int i = 0; i<massiv2.length; i++){
            if(maxChislo<massiv2[i]) {
                maxChislo = massiv2[i];

            }
        }
        System.out.println(maxChislo);


    }
}


