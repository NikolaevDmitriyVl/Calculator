package practice.HomeWork090;

import java.util.Random;

public class HomeWork090 {
    public static void main(String[] args){
        System.out.println("ex 4.88");
        double y0 = 12.2;
        double f0 = 0;
        if (y0 > 2) {
            f0 = 2;
        }
        if(y0 >0 && y0<=2){
            f0 = 0;
        }
        else{
            f0 = -3*y0;
        }
        System.out.println(f0);

        System.out.println("ex 5.86");
        int n = 6;
        int a1 = 1;
        int a2 = 0;
        System.out.println("1 ^ 2 = 2");
        for(int i = 1; i<=6; i++){
            a1 = a1 + 2;
            a2 = a1 + 1;
            System.out.println(i+1 + " ^ 2" + " = " + a2);
        }

        System.out.println("ex 6.108");//???
        double n0 = 200;
        double kupyura = 1;
        double kupyuri[] = new double[6];
        for(int i = 0; i<6; i++){
            kupyura = kupyura * 2;
            System.out.println("proverka " + kupyura);
            kupyuri[i] = kupyura;
        }
        double x = 0;
        double naimenshee = 200;
        int i0 = 0;
        for(int i = 0; i<kupyuri.length; i++){
            x = n0/kupyuri[i];
            if (naimenshee > x) {
                naimenshee = x;
                i0 = i;
            }
        }
        System.out.println("kupyura " + kupyuri[i0] + " kolichestvo = " + (int)naimenshee);

        System.out.println("ex 7.109");
        int ocenki[] = new int[12];
        Random rnd = new Random();
        for(int i = 0; i<ocenki.length; i++){
            ocenki[i] = rnd.nextInt(4)+1;
        }
        i0 = 0;
        while (ocenki[i0] > 3 || ocenki[i0]<3) {
            i0++;
        }
        if (i0 == 12) {
            System.out.println("troek net");
        }
        else{
            System.out.println("troyki est");
        }

        System.out.println("ex 8.20");// ??? uznat mozno v dvuh forah ispolzovat length v usloviyah
        int firma[][] = new int[3][10];
        Random rnd0 = new Random();
        for(int i = 0; i<3; i++){
            for(int j = 0; j<10; j++){
                firma[i][j] = rnd0.nextInt(100)+100;
            }
        }
        int summa =  0;
        int naibolshayaZp = 0;
        int numberMagazina = 0;
        for(int i = 0; i<3;i++){
            for(int j = 0; j<10; j++){
                summa = summa + firma[i][j];

            }

            if (naibolshayaZp < summa) {
                naibolshayaZp = summa;
                numberMagazina = i+1;
            }
            summa = 0;
        }
        System.out.println(numberMagazina + " magazin poluchil naibolshuyu zarplatu - " + naibolshayaZp);
        System.out.println("ex 8.20");
        int bolshe = 0;
        i0  = 0;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<3; j++){
                summa = summa + firma[j][i];
            }
            if (bolshe < summa) {
                bolshe = summa;
                i0 = i+1;
            }
            summa = 0;
        }
        System.out.println(i0 + " dnya " + " firma poluchila maximalniy dohod = " + bolshe);
        System.out.println("ex 8.20(c");
        int naibolshiy = 0;
        int magazin = 0;
        int den = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<10; j++){
                if(naibolshiy < firma[i][j]){
                    naibolshiy = firma[i][j];
                    magazin = i;
                    den = j;
                }
            }
        }
        System.out.println("magazin " + magazin + " v " + den + " den " + " poluchil maximalniy dohod = " + naibolshiy );

        System.out.println("ex 11.79");
        double massiv[] = {1.1,2.2,3.3,4.4,5.5};
        i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] > 0) {
                i0++;
            }
        }
        if (i0 < 5) {
            System.out.println("kolichestvo polozitelnih chisel ne previshaet pyati");
        }
        else{
            System.out.println("kolichestvo polozitelnih chisel previshaet pyat");
        }
        System.out.println("ex 11.79(b");
        i0 = 0;
        for(int i =0; i<massiv.length; i++){
            if (massiv[i] < 50.5) {
                i0++;
            }
        }
        if (i0 % 4 == 0) {
            System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 12.10");
        int massiv0[][] = {{1,2,3},{4,5,6},{7,8,9}};
        x =  massiv0[0][0];
        massiv0[0][0] = massiv0[massiv0.length-1][massiv0[massiv0.length-1].length-1];
        massiv0[massiv0.length-1][massiv0[massiv0.length-1].length-1] = massiv0[0][0];
        

        System.out.println("ex 13.7");
        Kontakti kontakti[] = new Kontakti[3];
        kontakti[0] = new Kontakti();
        kontakti[0].surname = "Ivanov";
        kontakti[0].adress = "Oktyabrskaya 50";
        kontakti[0].pfouneNumber = 1234567;

        kontakti[1] = new Kontakti();
        kontakti[1].surname = "Sidorov";
        kontakti[1].adress = "Krasnaya 57a";
        kontakti[1].pfouneNumber = 9876543;

        kontakti[2] = new Kontakti();
        kontakti[2].surname = "Petrov";
        kontakti[2].adress = "Proletarskaya 16";
        kontakti[2].pfouneNumber =  3894566;

        x= 0;
        for(int i = 0; i<kontakti.length; i++){
            x = kontakti[i].pfouneNumber%1000000;
            if ((kontakti[i].pfouneNumber - x) / 1000000 == 3) {
                System.out.println("familiya " + kontakti[i].surname + " " + " adress " + kontakti[i].adress + " pfouneNumber " + kontakti[i].pfouneNumber);
            }
        }
        System.out.println("ex 13.7(b");
        Kontakti kont2[] = new Kontakti[3];
        kont2[0] = new Kontakti();
        kont2[0].surname = "Mihaylov";
        kont2[0].adress = "Chapaeva 56";
        kont2[0].nachaloNomera = 123;
        kont2[0].konecNomera = "-12-34";

        kont2[1] = new Kontakti();
        kont2[1].surname = "Vasilev";
        kont2[1].adress = "Lenina 200";
        kont2[1].nachaloNomera = 321;
        kont2[1].konecNomera = "-56-64";

        kont2[2] = new Kontakti();
        kont2[2].surname = "Harchenko";
        kont2[2].adress = "Lenina 200";
        kont2[2].nachaloNomera = 345;
        kont2[2].konecNomera = "-78-95";

        for(int i= 0; i<kont2.length; i++){
            if (kont2[i].nachaloNomera / 100 == 3) {
                System.out.println("familiya " + kont2[i].surname + " adress " + kont2[i].adress + " telefonniy nomer " + kont2[i].nachaloNomera + kont2[i].konecNomera);
            }
        }

        System.out.println("ex 4.89");
        double x0 = 3;
        double k0 = 0;
        if (Math.sin(x) < 0) {
            k0 = Math.pow(x,2);
        }
        if (Math.sin(x) >= 0) {
            k0 = Math.abs(x);
        }

        f0 = 0;
        if (k0 < x0) {
            f0 = x0 * k0;
        }

        if (k0 >= x0) {
            f0 = k0+x0;
        }
        System.out.println(f0);

        System.out.println("ex 5.87");
        int x1 = -3;
        a1 = 2;
        int c1 = 0;
        summa = 0;
        for(int i = 0; i<10; i++){

            a1 = (a1+2)+x1;
            x1 = x1+2;
            c1 = a1+ x1 +1;
            summa = summa + c1;

            System.out.println(i+1 + " ^ 2 " + "  = " + c1);
        }
        System.out.println(summa);

        System.out.println("ex 6.109");
        int chislo = 123456;
        int cifra = 0;
        i0 = 0;
        summa =0;
        int znak  = 1;
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;
            summa = summa + (cifra*znak);
            znak = znak * (-1);
        }
        System.out.println(summa );
        System.out.println("ex 6.109(b");
        chislo = 123456;
        cifra = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i0++;
        }
        double w = Math.pow(10,i0-1);

        chislo = 123456;
        cifra = 0;
        znak = 1;
        summa =0;
        while (chislo > 0) {
        cifra = chislo/(int)w;
        chislo = chislo-cifra*(int)w;
        w = w/10;
        summa = summa + (cifra*znak);
        znak = znak * (-1);

        }
        System.out.println(summa);

        System.out.println("ex 7.110");
        int osadki[] = new int[28];
        Random rnd2 = new Random();
        for(int i = 0; i<osadki.length; i++){
            osadki[i] = rnd2.nextInt(5);
        }
        i0 = 0;
        for(int i = 0; i<osadki.length; i++){
            if (osadki[i] == 0) {
                i0++;
            }
        }
        if (i0 >= 10) {
        System.out.println("verno");
        }
        else{
            System.out.println("ne verno");
        }

        System.out.println("ex 8.21");
        int firm[][] = new int[3][10];
        Random rnd3 = new Random();
        for(int i = 0; i<3; i++){
            for(int j = 0; j<10; j++){
                firm[i][j] = rnd3.nextInt(6);
                System.out.println(firm[i][j]);
            }
        }
        int maxDohod = 0;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<10; j++){
                if(maxDohod<firm[i][j]){
                    maxDohod = firm[i][j];
                }
            }
            System.out.println("maximalniy dohod " + (i+1) + " magazina = " + maxDohod);
            maxDohod = 0;
        }
        System.out.println("ex 8.21(b");
        int maxDoh = 0;
        i0 = 0;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<3; j++){
                if(maxDoh<=firm[j][i]){
                    maxDoh = firm[j][i];
                    i0 = j;
                }
            }
            System.out.println("v " + i + " den " + (i0+1) + " magazin poluchil maximalniy dohod");
        }

        System.out.println("ex 11.80");
        int rost[] = new int[30];
        Random rnd4 = new Random();
        i0 = 0;
        for(int i = 0; i<rost.length; i++){
            rost[i] = rnd4.nextInt(160)+30;
            if (rost[i] > 170) {
                i0++;
            }
        }
        if (i0 >= 5) {
            System.out.println("mozno sformirovat basketbolnuyu komandu");
        }
        else{
            System.out.println("nelzya sformirovat basketbolnuyu komandu");
        }

        System.out.println("ex 12.11");
        int massiv1[][] = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        summa = massiv1[0][0] + massiv1[massiv1.length-1][massiv1[massiv.length-1].length-1];
        System.out.println(summa);
        System.out.println("ex 12.11(b");
        summa = massiv1[0][0] + massiv1[0][massiv1[0].length-1] + massiv1[massiv1.length-1][0] + massiv1[massiv1.length-1][massiv1[massiv1.length-1].length-1];
        System.out.println(summa);

        System.out.println("ex 13.8");
        Uchenik ucheniki[] = new Uchenik[3];
        ucheniki[0] = new Uchenik();
        ucheniki[0].surname = "Ivanov";
        ucheniki[0].name = "Ivan";
        ucheniki[0].patronymic = "Ivanovich";
        ucheniki[0].adress = "Oktyabrskaya 1";
        ucheniki[0].pfouneNumber = 1234567;

        ucheniki[1] = new Uchenik();
        ucheniki[1].surname = "Petrov";
        ucheniki[1].name = "Petr";
        ucheniki[1].patronymic = "Petrovich";
        ucheniki[1].adress = "Sovetskaya 2";
        ucheniki[1].pfouneNumber = 2345678;

        ucheniki[2] = new Uchenik();
        ucheniki[2].surname = "Vasilev";
        ucheniki[2].name = "Vasiliy";
        ucheniki[2].patronymic = "Vasilevich";
        ucheniki[2].adress = "Krasnaya 3";
        ucheniki[2].pfouneNumber = 0;

        for(int i = 0; i<ucheniki.length; i++){
            if (ucheniki[i].pfouneNumber == 0) {
                System.out.println(ucheniki[i].surname + " " +  ucheniki[i].name + " " +  ucheniki[i].adress);
            }
        }
        System.out.println("ex 13.8(b");
        Uchenik2 ucheniki2[] = new Uchenik2[3];

        ucheniki2[0] = new Uchenik2();
        ucheniki2[0].surname = "Nikolaev";
        ucheniki2[0].name = "Nikolay";
        ucheniki2[0].patronymic = "Nikolaevich";
        ucheniki2[0].adress = "Chapaeva 56";
        ucheniki2[0].nachaloNomera = 123;
        ucheniki2[0].konecNomera = "-45-67";

        ucheniki2[1] = new Uchenik2();
        ucheniki2[1].surname = "Aleksandrov";
        ucheniki2[1].name = "Aleksandr";
        ucheniki2[1].patronymic = "Aleksandrovich";
        ucheniki2[1].adress = "Pushkina 34";
        ucheniki2[1].nachaloNomera = 0;

        ucheniki2[2] = new Uchenik2();
        ucheniki2[2].surname = "Alekseev";
        ucheniki2[2].name = "Aleksey";
        ucheniki2[2].patronymic = "Alekseevich";
        ucheniki2[2].adress = "Priorova 40";
        ucheniki2[2].nachaloNomera = 456;
        ucheniki2[2].konecNomera = "-78-90";

        for(int i = 0; i<ucheniki2.length; i++){
            if (ucheniki2[i].nachaloNomera == 0) {
                System.out.println(ucheniki2[i].surname + " " + ucheniki2[i].name + " " + ucheniki2[i].adress);
            }
        }

        System.out.println("ex 4.90");
        x0 = 5;
        k0 = 0;
        f0 = 0;
        if (Math.sin(x0) >= 0) {
            k0 = Math.pow(x0,2);
        }
        if (Math.sin(x0) < 0) {
            k0 = Math.abs(x0);
        }
        if (x0 < k0) {
            f0 = Math.abs(x);
        }
        if(x0>=k0){
            f0 = k0*x0;
        }
        System.out.println(f0);

        System.out.println("ex 5.88");
        x1 = 0;
        int x2 = 2;
        for(int i = 0; i<5; i++){
            x1 = x2;
            x2 = x1 + (x1+2);

        }

        System.out.println("ex 6.110");

        System.out.println("ex 7.111");

        System.out.println("ex 8.22");

        System.out.println("ex 11.81");

        System.out.println("ex 12.12");

        System.out.println("ex 13.9");





    }
}
