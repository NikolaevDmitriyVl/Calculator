package practice;

import java.util.Random;

public class HomeWork074 {
    public static void main(String[] args) {
        System.out.println("ex 4.47");
        int a = 12;
        int b = 14;
        int c = 12;
        if (a == b && a != c || a == c && a != b || b == c && b != a) {
            System.out.println("treugolnik yavlyaetsya ravnobedrennim");
        } else {
            System.out.println("treugolnik ne yavlyaetsya ravnobedrennim");
        }

        System.out.println("ex 5.47");
        int q[] = {1, 2, 3, 4, 5, 6};
        int proizvedenie = 1;
        for (int i = 0; i < q.length; i++) {
            proizvedenie = proizvedenie * q[i];
        }
        System.out.println(proizvedenie);

        System.out.println("ex 6.69");
        double q0[] = new double[15];
        Random rnd = new Random();
        a = 0;
        for (int i = 0; i < q0.length; i++) {
            q0[i] = rnd.nextInt(40);
        }
        for (int i = 0; i < q0.length - 1; i++) {
            if (q0[i] < q0[i + 1]) {
                a = i + 1;
                System.out.println("pervoe chislo narushayusshee posledovatelnost " + q0[i + 1]);
            } else {
                System.out.println("posledovatelnost vozrastaet");
            }
        }

        System.out.println("ex 7.71");
        double dlina[] = {1, 2, 3, 4, 5};
        double vremya[] = {1, 2, 3, 4, 5};
        double kmVchas[] = new double[dlina.length];
        for (int i = 0; i < dlina.length; i++) {
            kmVchas[i] = dlina[i] / vremya[i];

        }
        double maksimalnayaSkorost = kmVchas[0];
        for (int i = 0; i < dlina.length; i++) {
            if (maksimalnayaSkorost < kmVchas[i]) {
                maksimalnayaSkorost = kmVchas[i];
            }
        }
        System.out.println(maksimalnayaSkorost);

        System.out.println("ex 11.29");
        int w[] = {1, 2, 3, 4, 5};
        int summa = 0;
        for (int i = 0; i < w.length; i++) {
            summa = summa + w[i];

        }
        if (summa % 2 == 0) {
            System.out.println("chislo chetnoe");
        }
        if (summa % 2 > 0) {
            System.out.println("chislo ne chetnoe");
        }
        System.out.println("ex 11.29(b");
        double summaKvadratov = 0;
        for (int i = 0; i < w.length; i++) {
            summaKvadratov = summaKvadratov + Math.pow(w[i], i);
        }
        int cifra = 0;
        int i0 = 0;
        while ((int) summaKvadratov > 0) {
            cifra = (int) summaKvadratov % 10;
            summaKvadratov = (int) summaKvadratov / 10;
            i0++;

        }
        if (i0 == 5) {
            System.out.println("summa kvadratov ravna 5");
        } else {
            System.out.println("summa kvadratov ne ravna 5");
        }

        System.out.println("ex 11.30");
        int ucheniki[] = {1, 2, 3, 4, 5};
        summa = 0;
        for (int i = 0; i < ucheniki.length; i++) {
            summa = summa + ucheniki[i];
        }
        cifra = 0;
        i0 = 0;
        while (summa > 0) {
            cifra = summa % 10;
            summa = summa / 10;
            i0++;
        }
        if (i0 == 4) {
            System.out.println("summa yavlyaetsya chetirehznachnim chislom");
        } else {
            System.out.println("summa ne yavlyaetsya chetirehznachnim chislom");
        }

        System.out.println("ex 4.48");
        int rost1 = 183;
        int rost2 = 194;
        int rost3 = 174;
        if (rost1 == rost2 && rost2 == rost3) {
            System.out.println("rost odinakov");
        } else {
            System.out.println("rost ne odinakov");
        }

        System.out.println("ex 5.48");
        int e[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summaKvadrat = 0;
        for (int i = 0; i < e.length; i++) {
            summaKvadrat = summaKvadrat + e[i];
        }
        System.out.println(summaKvadrat);

        System.out.println("ex 6.70");
        int e0[] = {1, 2, 3, 4, 5, 6, 10000};
        int poryadkoviyNomer = 0;
        boolean isTrue = true;
        for (int i = 0; i < e0.length - 1; i++) {
            if (e0[i] > e0[i + 1]) {
                isTrue = false;
                poryadkoviyNomer = i + 1;
                System.out.println("poryadkoviy nomer pervogo chisla narushayushhego vozrastayushhyu posledovatelnost");
                break;
            }
        }
        if (isTrue == true) {
            System.out.println("chisla v posledovatelnosti vozrastayut");
        }
        System.out.println("ex 7.72");
        int volt[] = {2, 1, 3, 4, 5};
        int om[] = {5, 4, 3, 2, 1};
        int tok[] = new int[volt.length];
        for (int i = 0; i < volt.length; i++) {
            tok[i] = volt[i] / om[i];
            System.out.println("proverka" + tok[i]);
        }
        int minimalniyTok = tok[0];
        for (int i = 0; i < om.length; i++) {
            if (minimalniyTok > tok[i]) {
                minimalniyTok = i;
            }
        }
        System.out.println(minimalniyTok);

        System.out.println("ex 11.31");
        int r[] = {1, 2, 3, 4, 5};
        summa = 0;
        for (int i = 0; i < r.length; i++) {
            summa = summa + r[i];
        }
        cifra = 0;
        i0 = 0;
        while (summa > 0) {
            cifra = summa % 10;
            summa = summa / 10;
            i0++;
        }
        if (i0 == 6) {
            System.out.println("chislo shestiznachnoe");
        } else {
            System.out.println("chislo ne shestiznachnoe");
        }

        System.out.println("ex 11.32");
        int massa[] = {10, 22, 34, 56, 70};
        summa = 0;
        int gruzopodemnost = 100;
        for (int i = 0; i < massa.length; i++) {
            summa = summa + massa[i];
        }
        if (summa < gruzopodemnost) {
            System.out.println("gruzopodemnost ne previshaet massu");
        } else {
            System.out.println("gruzopodemnost previshaet massu");
        }


        System.out.println("ex 4.49");
        double a0 = 5;
        double b0 = 4;
        double c0 = 12;
        double diskriminant = Math.pow(b0, 2) - 4 * a * c;
        double x0 = 0;
        double x01 = 0;
        double x02 = 0;
        if (diskriminant < 0) {
            System.out.println("uravnenie ne imeet korney");
        }
        if (diskriminant == 0) {
            x0 = -b / (a * 2);
            System.out.println(x0);
        }
        if (diskriminant > 0) {
            x01 = (-b + Math.sqrt(diskriminant)) / (a * 2);
            x02 = (-b - Math.sqrt(diskriminant)) / (a * 2);
            System.out.println("perviy koren " + x01);
            System.out.println("vtoroy koren " + x02);
        }

        System.out.println("ex 5.49");
        int n = 5;
        double y0[] = {2.3, 4.2, 6.7, 9.8, 2.14};
        double summa0 = 0;
        for (int i = 0; i < n; i++) {
            summa0 = summa0 + Math.pow(y0[i], 2);
        }
        System.out.println(summa0);

        System.out.println("ex 6.71");
        int rost[] = {176, 184, 196, 205};
        int ubivanie = rost[0];
        for (int i = 0; i < rost.length - 1; i++) {
            if (rost[i] < rost[i + 1]) {
                ubivanie++;
            }
        }
        if (ubivanie == rost.length - 1) {
            System.out.println("posledovatelnost ubivaet");
        } else {
            System.out.println("posledovatelnost ne ubivaet");
        }

        System.out.println("ex 7.73");
        n = 5;
        int posledovatelnost[] = {7, 9, 3, 3, 1, 2};
        int naimenshiy = posledovatelnost[0];
        int naimenshiy2 = posledovatelnost[0];
        int naibolshiy = posledovatelnost[0];
        int naibolshiy2 = posledovatelnost[0];
        for (int i = 0; i < posledovatelnost.length; i++) {
            if (naibolshiy <= posledovatelnost[i]) {
                naibolshiy2 = naibolshiy;
                naibolshiy = posledovatelnost[i];
            }
            if (naimenshiy > posledovatelnost[i]) {
                naimenshiy2 = naimenshiy;
                naimenshiy = posledovatelnost[i];
            }
        }
        System.out.println("naiboshee " + naibolshiy + " naibolshee vtoroe " + naibolshiy2);
        System.out.println("naimenshee " + naimenshiy + " naimenshee vtoroe " + naimenshiy2);

        System.out.println("ex 11.33");
        int t[] = {1,2,3,4,5,6,7,8,9,10};
        summa = 0;
        int chislo = 20;
        for(int i = 0; i<t.length; i++){
            summa = summa +t[i];
        }
        if(summa>chislo){
            System.out.println("previshaet");
        }
        else{
            System.out.println("ne previshaet");
        }

        System.out.println("ex 11.34");
        int y[] = {1,2,3,4,5,6};
        int summa1 = 0;
        int summa2 = 0;
        for(int i = 0; i<y.length; i++){
            if(i<3){
                summa1 = summa1 + y[i];
            }
            if (i > 2) {
                summa2 = summa2 + y[i];
            }
        }
        if (summa1 > summa2) {
            System.out.println("v pervuyu polovinu vipalo bolshe osadkov");
        }
        if(summa1< summa2){
            System.out.println("vo vtoruyu polovinu vipalo bolshe osadkov");
        }
        System.out.println("ex 11.34(b");
        int mesyac[] = new int[30];
        Random rnd1 = new Random();
        summa1 = 0;
        summa2 = 0;
        int summa3 = 0;
        for(int i = 0; i<mesyac.length; i++){
            mesyac[i] = rnd1.nextInt(20);
            if (i < 10) {
                summa1 = summa1 + mesyac[i];
            }
            if (i > 9 && i < 20) {
                summa2 = summa2 + mesyac[i];
            }
            if (i > 19) {
                summa3 = summa3 + mesyac[i];
            }
        }
        if (summa1 > summa2 && summa1 > summa3) {
            System.out.println("v pervuyu dekadu");
        }
        if (summa2 > summa1 && summa2 > summa3) {
            System.out.println("vo vtoruyu dekadu");
        }
        if(summa3> summa1 && summa3 > summa2){
            System.out.println("v tretyu dekadu");
        }

    }
}
