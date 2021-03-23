package practice;

public class HomeWork072 {
    public static void main(String[] args) {
        System.out.println("ex 4.41");
        double x0 = 0.5;
        double funkciya = 0.0;
        if (0.2 <= x0 && x0 <= 0.9) {
            funkciya = Math.sin(x0);
            System.out.println(funkciya);
        } else {
            funkciya = 1;
            System.out.println(funkciya);
        }

        System.out.println("ex 5.41");
        int predmeti[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int summa = 0;
        for (int i = 0; i < predmeti.length; i++) {
            summa = summa + predmeti[i];
        }
        System.out.println(summa);

        System.out.println("ex 6.63");
        int ocenki[] = {1, 3, 4, 3, 4, 5, 4, 5, 4, 1, 3, 4};
        int i = 0;
        int a = 0;
        while (i < ocenki.length) {
            if (ocenki[i] == 2) {
                a++;
            }
            i++;
        }
        if (a > 0) {
            System.out.println("dvoyki imeyutsya");
        } else {
            System.out.println("dvoyki otsutstvuyut");
        }

        System.out.println("ex 7.65");
        int gruppa[] = {176, 191, 186, 201};
        int minimalniyRost = gruppa[0];
        int maximalniyRost = gruppa[0];
        for (i = 0; i < gruppa.length; i++) {
            if (minimalniyRost > gruppa[i]) {
                minimalniyRost = gruppa[i];
            }
            if (maximalniyRost < gruppa[i]) {
                maximalniyRost = gruppa[i];
            }
        }
        System.out.println("rost samogo visokogo previshaet rost samogo nizkogo na " + (maximalniyRost - minimalniyRost) + " sm");

        System.out.println("ex 11.12");//???
        int massiv[] = new int[20];
        a = 0;
        for (i = 300; i < 5000; i++) {
            if (i % 13 == 0 || i % 17 == 0) {

                massiv[a] = i;
                System.out.println(massiv[a]);
                a++;
                if (a == 20) {
                    break;
                }
            }
        }

        System.out.println("ex 11.12(b");//????
        int prostieChisla[] = new int[30];

        i = 0;
        int i0 = 0;
        for (a = 2; a < 5000; a++) {
            i++;

            if (i % a > 0) {
                prostieChisla[i0] = i;
                System.out.println(prostieChisla[i0]);
                if (i0 == 0) {
                    break;
                }
            }
        }

        System.out.println("ex 11.13");
        int schetchik[] = {1, 2, 3, 4, 5, 6};
        System.out.println(schetchik[3]);

        System.out.println("ex 11.14");
        int q[] = {1, 2, 3, 4, 5, 6};
        for (i = q.length - 1; i >= 0; i--) {
            System.out.println(q[i]);
        }

        System.out.println("ex 4.42(a");
        double a0 = 11.3;
        double b0 = 89.5;
        double c0 = 5.6;
        if (a0 < b0 && b0 < c0) {
            System.out.println("neravenstvo vipolnyaetsya");
        } else {
            System.out.println("neravenstvo ne vipolnyaetsya");
        }
        System.out.println("ex 4.42(b");
        if (a0 > b0 && b0 > c0) {
            System.out.println("neravenstvo vipolnyaetsya");
        } else {
            System.out.println("neravenstno ne vipolnyaetsya");
        }

        System.out.println("ex 5.42");
        int ocenka[] = {2, 3, 4, 5};
        summa = 0;
        for (i = 0; i < ocenka.length; i++) {
            summa = summa + ocenka[i];
        }
        System.out.println(summa);

        System.out.println("ex 6.64");
        int moshhnost[] = {100, 400, 200, 500, 150};
        i0 = 0;
        for (i = 0; i < moshhnost.length; i++) {
            if (moshhnost[i] > 200) {
                i0++;
            }
        }
        if (i0 > 0) {
            System.out.println("est bolshe 200");
        } else {
            System.out.println("net bolshe 200");
        }

        System.out.println("ex 7.66");
        int chisloUchenikov[] = {23, 44, 56, 64, 83, 94, 80};
        int naibolshiy = chisloUchenikov[0];
        int naimenshiy = chisloUchenikov[0];
        for (i = 0; i < chisloUchenikov.length; i++) {
            if (naibolshiy < chisloUchenikov[i]) {
                naibolshiy = chisloUchenikov[i];
            }
            if (naimenshiy > chisloUchenikov[i]) {
                naimenshiy = chisloUchenikov[i];
            }
        }
        System.out.println("chislennoct samogo bolshego klassa previshaet chislennost samogo malenkogo na " + (naibolshiy - naimenshiy) + " uchenikov");

        System.out.println("ex 11.15(a");
        double w0[] = {1, 2, 3, 4, 5, 6};
        for (i = 0; i < w0.length; i++) {
            System.out.println(Math.pow(w0[i], 2));
        }
        System.out.println("ex 11.15(b");
        System.out.println((w0[0] + w0[1]) / 2);

        System.out.println("ex 11.16");
        int w[] = {1, 2, 3, 4, 5, 6};
        int s = 3;
        if (w[s] > 0) {
            System.out.println("chislo polozitelnoe");
        } else {
            System.out.println("chislo otricatelnoe");
        }
        System.out.println("ex 11.16(b");
        int k = 5;
        if (w[k] % 2 == 0) {
            System.out.println("chislo yavlyaetsya chetnim");
        } else {
            System.out.println("chislo ne chetnoe");
        }
        System.out.println("ex 11.16(c");
        if (w[s] > w[k]) {
            System.out.println("w[s] bolshe chem w[k]");
        }
        if (w[s] < w[k]) {
            System.out.println("w[k] bolshe chem w[s]");
        }

        System.out.println("ex 4.43");
        a = 15;
        int b = 5;
        if (a % b == 0 || b % a == 0) {
            System.out.println("da, odno iz chisel yavlyaetsya delitelem drugogo");
        } else {
            System.out.println("net, ni odno iz chisel ne yavlyaetsya delitelem drugogo");
        }

        System.out.println("ex 5.43");
        int zarplata[] = {30,20,10,100,145,167};
        summa = 0;
        for(i = 0; i<zarplata.length; i++){
            summa = summa + zarplata[i];
        }
        System.out.println(summa);

        System.out.println("ex 6.65");
        int e[]  = {1,2,3,4,5,6,7,8,9,10,11,9,8,7,8,5,4,3,2,1};
        a = 0;
        b = 0;
        i0 = 0;
        for(i = 0 ; i<e.length-1; i++ ){
            if(e[i] == e[i+1]){
              a = i;
              b = i+1;
              i0++;
              System.out.println(a + " , " + b);
              break;
            }
        }
        if(i0 == 0){
        System.out.println("v posledovatelnosti net pari odinakovih sosednih chisel");
        }

        System.out.println("ex 7.67");//???

        int pari[] = {1,2,3,4,5,6,7,8,9,10};
        int maximalnayaSumma[] = new int[pari.length/2];
        i0 = -1;
        for(i = 0; i< pari.length-1; i+=2){
            i0++;
            maximalnayaSumma[i0] = (pari[i] + pari[i+1]);
        }
        int maximalnayaPara = 0;
        for(i = 0; i<pari.length/2; i++){
            if(maximalnayaPara<maximalnayaSumma[i]){
                maximalnayaPara = maximalnayaSumma[i];
            }
        }
        System.out.println("maximalnayaPara  = " + maximalnayaPara);
        System.out.println("ex 7.67(b");
        int maximalnoeProizvedenie[]  = new int[pari.length/2];
        int i1 = -1;
        for(i = 0; i< pari.length-1; i+=2){
            i1++;
            maximalnoeProizvedenie[i1] = pari[i] * pari[i+1];
        }
        int maximalnayaPara0 = 0;
        for(i = 0; i< pari.length/2; i++){
            if(maximalnayaPara0<maximalnoeProizvedenie[i]){
                maximalnayaPara0 = maximalnoeProizvedenie[i];
            }
        }
        System.out.println("maximalnoe proizvedenie = " + maximalnayaPara0);

        System.out.println("ex 11.17");
        double t[] = {2,1,2,3,4,5};
         a0 = 1;
        for(i = 0; i<t.length; i++){
            System.out.println(t[i]*2);
        }
        System.out.println("ex 11.17(b");
        for(i = 0; i<t.length; i++){
            System.out.println(t[i]-a);
        }
        System.out.println("ex 11.17(c");
        for(i = 0; i<t.length; i++){
            System.out.println(t[i]/t[0]);
        }

        System.out.println("ex 11.18");
        int y[] = { 1,2,3,4,5};
        b = 3;
        for(i = 0; i<y.length; i++){
            System.out.println(y[i]-20);
        }
        System.out.println("ex 11.18(b");
        for(i = 0; i<y.length; i++){
            System.out.println(y[i]*y[y.length-1]);
        }
        System.out.println("ex 11.18(c");
        for(i = 0; i<y.length; i++){
            System.out.println(y[i] + b);
        }
    }
}

