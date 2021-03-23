package practice.HomeWork089;

import java.util.Random;

public class HomeWork089 {
    public static void main(String[] args) {
        System.out.println("ex 4.85");
        int x = 12;
        int y = 0;
        if (x < (-1)) {
            y = -1;
        }
        if (x > (-1)) {
            y = x;
        }
        if (x == -1) {
            y = 1;
        }
        System.out.println("ex 5.83");
        int stepen = 5;
        double a0 = 1.1;
        double vozvedVStepen = 1;
        for (int i = 1; i <= 5; i++) {
            vozvedVStepen = vozvedVStepen * a0;
            System.out.println(vozvedVStepen);
        }

        System.out.println("ex 6.105");
        x = 110;
        y = 20;
        int chislo = y;
        int nomer = 1;
        int i0 = 0;
        System.out.println("chislo nomer  " + nomer + " = " + chislo);
        while (x != 0 && y != 0) {
            if (x != 0 && y != 0 && x >= y) {
                x = x - y;
                i0++;
                if (chislo > y) {
                    chislo = y;
                    nomer++;
                    System.out.println("chislo nomer " + nomer + " = " + chislo);
                }
            }
            if (y != 0 && x != 0 && y >= x) {
                y = y - x;
                i0++;
                if (chislo > x) {
                    chislo = x;
                    nomer++;
                    System.out.println("nomer chisla " + nomer + " = " + chislo);
                }
            }
        }
        System.out.println(i0);

        System.out.println("ex 7.106");

        Nazvaniya[] nazvaniya = new Nazvaniya[26];
        Nazvaniya one = new Nazvaniya();
        one.nameCentury = "Germaniya";
        one.nameCity = "Berlin";

        nazvaniya[0] = one;

        Nazvaniya two = new Nazvaniya();
        two.nameCentury = "Franciya";
        two.nameCity = "Pariz";

        nazvaniya[1] = two;

        System.out.println("ex 8.17");
        int zarplata[][] = new int[12][3];
        Random rnd = new Random();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                zarplata[i][j] = rnd.nextInt(10);
            }
        }
        int naibolshaya = 0;
        i0 = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                if (naibolshaya < zarplata[i][j]) {
                    naibolshaya = zarplata[i][j];
                    i0++;
                }
            }
            System.out.println((i + 1) + " rabotnik poluchil naibolshuyu zp v " + i0 + " mesyace");
            i0 = 0;
            naibolshaya = 0;
        }
        System.out.println("ex 8.17(b");
        naibolshaya = 0;
        i0 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                if (naibolshaya < zarplata[j][i]) {
                    naibolshaya = zarplata[j][i];
                    i0++;
                }
            }
            System.out.println("v " + (i + 1) + " mesyac max zp poluchil " + i0 + " rabotnik");
            naibolshaya = 0;
            i0 = 0;
        }

        System.out.println("ex 11.77");
        int massiv[]  = {1,2,0,0,5,6,7,8,9,10};
        i0 = 0;
        for(int i = 0; i<massiv.length-1; i++){
            if(massiv[i] == 0 && massiv[i+1] == 0){
                i0++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 12.9");
        int massiv0[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        x = massiv0[0][massiv0[0].length-1];
        massiv0[0][massiv0[0].length-1] = massiv0[massiv0.length-1][0];
        massiv0[massiv0.length-1][0] = x;
        System.out.println("ex 12.9(b");
        x = massiv0[massiv0.length-1][massiv0[massiv0.length-1].length-1];
        massiv0[massiv0.length-1][massiv0[massiv0.length-1].length-1] = massiv0[0][0];
        massiv0[0][0] = x;

        System.out.println("ex 13.4");//???
        Sotrudniki sotrudniki[] = new Sotrudniki[16];
        Sotrudniki one0 = new Sotrudniki();
        one0.surname = "Ivanov";
        one0.voennoobyazan = "yes";

        sotrudniki[0] = one0;

        Sotrudniki two0 = new Sotrudniki();
        two0.surname = "Petrov";
        two0.voennoobyazan = "no";
        sotrudniki[0]  = two0;

       // for(int i = 0;i<2 ; i++){
            //if (sotrudniki[i] == yes) {

          //  }
        //}

        System.out.println("ex 4.86");
        int a = 3;
        int z = 0;
        if (a > 0) {
            z = 1;
        }
        if (a == 0) {
            z = 0;
        }
        if (a < 0) {
            z = (-1);
        }

        System.out.println("ex 5.84");
        double virazenie = Math.pow((Math.pow(Math.pow(20,2)-Math.pow(Math.pow(19,2),2)-Math.pow(18,2),2))-Math.pow(1,2),2);
        System.out.println("vichislenie virazeniya = " + virazenie);

        System.out.println("ex 6.106");
        a = 10;
        int b = 2;
        int a1 = a;
        int b1 = b;
        i0 = 1;
        while (b1+1 < a1) {
            b1 = b1+b;
            i0++;
        }
        System.out.println(a + " / " + b + " = " + i0);

        System.out.println("ex 7.107");
        int n = 5;
        int massiv1[] = {1,2,3,4,5};
        x = 3;
        i0 = 0;
        for(int i = 0; i<massiv1.length; i++){
            if (massiv1[i] < 0) {
                i0++;
            }
        }
        if (i0 > x) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 8.18");
        Random rnd1 = new Random();
        int ucheniki[][] = new int[11][4];
        int maximum = 0;
        for(int i = 0; i<11; i++){
            for(int j = 0; j<4; j++){
                ucheniki[i][j] = rnd1.nextInt(10)+20;
                maximum = maximum + ucheniki[i][j];
            }
        }

        int summa = 0;
        i0 = 0;
        int i1 = 0;
        int malochislenniyKlass = maximum;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<11; j++){
                summa = summa + ucheniki[j][i];
                i0++;
            }
            if (malochislenniyKlass < summa) {
                malochislenniyKlass = summa;
                i1 = i0;
            }
            summa = 0;
        }
        System.out.println("malochislenniyKlass " + i1);

        System.out.println("ex 11.78");
        int massiv2[] = {1,2,4,4,4};
        i0 = 0;
        for(int i = 1; i<massiv2.length-1; i++){
            if(massiv2[i]==massiv2[i-1] && massiv2[i] == massiv2[i+1]){
                i0++;
            }
        }
        System.out.println(i0);


        System.out.println("ex 12.9");
        int massiv3[][] = {{1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};
        System.out.println(massiv3[0][massiv3[0].length-1]);
        System.out.println("n2 " + massiv3[massiv3.length-1][0]);
        x = massiv3[0][massiv3[0].length-1];
        massiv3[0][massiv3[0].length-1] = massiv3[massiv3.length-1][0];
        massiv3[massiv3.length-1][0] = x;

        System.out.println("ex 13.5");
        Vershini vershini[] = new Vershini[2];

        Vershini one1 = new Vershini();
        one1.name = "everest";
        one1.visota = 2000;

        vershini[0] = one1;

        Vershini two1 = new Vershini();
        two1.name = "elbrus";
        two1.visota = 3500;

        vershini[1] = two1;
        for(int i = 0; i<vershini.length; i++){
        }

        System.out.println("ex 4.87");
        double x0 = 1.1;
        double f = 0;
        if (x0 <= 0) {
            f= 0;
        }
        if (x0 > 0 && x0 <= 1) {
            f = x0;
        }
        else{
            f = Math.pow(x0,2);
        }
        System.out.println(f);

        System.out.println("ex 5.85");
        int pyatiZnachnoeChislo = 12345;
        int cifra = 0;
        x = 10000;
        chislo = 0;
        summa = 0;
        while (pyatiZnachnoeChislo > 0) {
            cifra = pyatiZnachnoeChislo %10;
            pyatiZnachnoeChislo = pyatiZnachnoeChislo/10;
            chislo = cifra * x;
            x = x/10;
            summa = summa + chislo;
            System.out.println("proverka " + summa);
        }

        System.out.println("ex 6.107");//???
        n = 6;
        int m = 10;
        for(int i = n; i<(n*m);i+=n){
            System.out.println(i);
        }


        System.out.println("ex 7.108");
        m = 5;
        int p = 22;
        i0 = 0;
        int massiv4[] = {6,2,3,4,5};
        for(int i =  0; i<massiv4.length-1; i++){
            if (massiv4[i] > m) {
                i0++;
            }
        }
        if (p % i0 == 0) {
            System.out.println("verno");
        }

        System.out.println("ex 8.19");
        Random rnd2 = new Random();
        int uchen[][] = new int[11][4];
        for(int i = 0; i<11; i++){
            for(int j = 0; j<4; j++){
                uchen[i][j] = rnd2.nextInt(10);
            }
        }
        int menshiyVParaleli = 1000;
        for(int i = 0; i<11; i++){
            for(int j = 0; j<4; j++){
                if(menshiyVParaleli>uchen[i][j]){
                    menshiyVParaleli = uchen[i][j];
                }
            }
                System.out.println("chislennost samogo malochislennogo klassa v paraleli. parallel " + (i+1) + " = " + menshiyVParaleli);

            menshiyVParaleli = 0;
        }


    }
}
