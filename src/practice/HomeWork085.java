package practice;

public class HomeWork085 {
    public static void main(String[] args) {
        System.out.println("ex 4.71");
        double a0 = 3.4;
        double b0 = 5.5;
        if (a0 > b0) {
            System.out.println("a0 naibolshee = " + a0);
        }
        if (b0 > a0) {
            System.out.println("b0 naibolshee = " + b0);
        }
        System.out.println("ex 4.71(b");
        double bolshe = a0;
        double menshe = b0;
        if (b0 > a0) {
            bolshe = b0;
            menshe = a0;
        }
        System.out.println("chislo bolshee = " + bolshe);
        System.out.println("chislo menshee = " + menshe);

        System.out.println("ex 5.70");
        int kletka = 1;
        for (int i = 3; i <= 24; i += 3) {
            kletka = kletka * 2;
        }
        System.out.println(kletka);

        System.out.println("ex 6.95");
        int maxChislo = 0;
        for (int i = 1; i <= 5000; i++) {
            if (i % 39 == 0) {
                maxChislo = i;
            }
        }
            System.out.println(maxChislo);


        System.out.println("ex 7.96");
        int chisla[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summa = 0;
        for (int i = 0; i < chisla.length; i++) {
            if (chisla[i] > 20) {
                summa = summa + chisla[i];
            }
        }
        if (summa > 100) {
            System.out.println("verno");
        } else {
            System.out.println("ne verno");
        }

        System.out.println("ex 8.5");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j == 1; j++) {
                System.out.println(j + " + " + i + " = " + (i + j));
            }
        }
        System.out.println("ex 8.5(b");
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j == 2; j++) {
                System.out.println(j + " + " + i + " = " + (j + i));
            }
        }
        System.out.println("ex 8.5(c");
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j == 9; j++) {
                System.out.println(j + " + " + i + " = " + (j + i));
            }
        }

        System.out.println("ex 11.69");
        int a = 12;
        int b = 18;
        int i0 = 0;
        int elementi[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int j = 0; j < elementi.length; j++) {
            if (elementi[j] >= a && elementi[j] <= b) {
                i0++;

            }
        }
        System.out.println(i0);


        System.out.println("ex 12.24");//???
        int massiv[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i][i]);
        }

        a = 1;
        b = 1;
        int c = 1;
        int d = 1;
        int e = 1;
        int f = 1;
        int mass[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mass[i][j] = c;


            }
        }
        System.out.println("ex 12.1");
        int massiv1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(massiv1[0][massiv1.length - 1]);
        System.out.println("ex 12.1(b");
        System.out.println(massiv1[massiv1.length - 1][0]);

        System.out.println("ex 12.2");
        int massiv2[][] = {{99, 98, 97}, {96, 95, 94}, {93, 92, 91}};
        System.out.println(massiv2[massiv.length - 1][massiv2.length - 1]);

        System.out.println("ex 12.2(b");
        System.out.println(massiv2[0][0]);

        System.out.println("ex 12.3(a");
        int n = 2;
        int massiv3[][] = {{90,89,88},{87,86,85},{84,83,82}};
        System.out.println(massiv3[1][n]);
        System.out.println("ex 12.3(b");
        System.out.println(massiv3[2][1]);

        System.out.println("ex 4.72");
        double chislo1 = 2.2;
        double chislo2 = 3.4;
        double chislo3 = 4.6;
        if (chislo1 > chislo2 && chislo1 > chislo3) {
            System.out.println(chislo1);
        }
        if (chislo2 > chislo1 && chislo2 > chislo3) {
            System.out.println(chislo2);
        }
        if (chislo3 > chislo1 && chislo3 > chislo2) {
            System.out.println(chislo3);
        }
        System.out.println("ex 4.72(b");
        if (chislo1 < chislo2 && chislo1 < chislo3) {
            System.out.println(chislo1);
        }
        if (chislo2 < chislo1 && chislo2 < chislo3) {
            System.out.println(chislo2);
        }
        if (chislo3 < chislo1 && chislo3 < chislo2) {
            System.out.println(chislo3);
        }

        System.out.println("ex 5.71");
        double vklad = 1000;
        double summa0 = 0;
        for(int i = 1; i<=10; i++){
            summa0 = vklad + (vklad/100*2);
            vklad = summa0;
            System.out.println(i + " = " + vklad);
        }
        System.out.println("ex 5.71(b");
        double odinMesyac = (vklad+ (vklad*0.02));
        double dvaMesyac = (odinMesyac + (odinMesyac*0.02));
        double triMesyac = (dvaMesyac + (dvaMesyac* 0.02));
        summa0 = 0;
        for(int i = 3; i<=12; i++){
            summa0 = triMesyac +(triMesyac*0.02);
            triMesyac = summa0;
            System.out.println("summa vklada cherez " + i + " mesyaca(ev) = " + triMesyac);
        }

        System.out.println("ex 6.96");
        int rost[] = {190,188,186,184,182,180,178,176};
        int noviyUchenik = 187;
        i0 = 0;
        for(int i = 0; i<rost.length; i++){
            if(noviyUchenik<rost[i]){
               i0++;
            }
        }
        System.out.println(i0+1);

        System.out.println("ex 7.97");
        n = 6;
        int chisl[] = {1,2,3,4,5,6};
        summa = 0;
        for(int i = 0; i<chisl.length; i++){
            if (chisl[i] < 21) {
                summa = summa + chisl[i];
            }
        }
        if (summa < 50) {
            System.out.println("summa ne previshaet 50");
        }
        System.out.println("ex 7.97(b");
        summa = 0;
        for(int i = 0; i<chisl.length; i++){
            if (chisl[i] < 10) {
                summa = summa + chisl[i];
            }
        }
        if (summa % 3 == 0) {
            System.out.println("summa kratna trem");
        }

        System.out.println("ex 8.6");
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                System.out.print("\t" + i + " + " + j + " = " + (i+j) + "   ");
            }
            System.out.println();
        }

        System.out.println("ex 8.7");
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                System.out.print("\t" + i + " * " + j + " = " + (i*j) + " ");
            }
            System.out.println();
        }

        System.out.println("ex 11.70");
        int rezultatiIgr[] = {3,0,1,0,3,3,0,1};
        int tri = 0;
        int nichya = 0;
        for(int i = 0; i<rezultatiIgr.length; i++){
            if (rezultatiIgr[i] == 3) {
                tri++;
            }
            if (rezultatiIgr[i] == 1) {
                nichya++;
            }
        }
        System.out.println("viigrishey = " + tri);
        System.out.println("nichih = " + nichya);

        System.out.println("ex 12.4");
        n = 1;
        int n2 = 2;
        int mas[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(mas[n][2]);
        System.out.println("ex 12.4(b");
        System.out.println(mas[n][n2]);

        System.out.println("ex 4.73");
        a0 = 1.1;
        b0 = 2.2;
        double c0 = 3.3;
        double d0 = 4.4;
        if (a0 > b0 && a0 > c0 && a0 > d0) {
            System.out.println(a0);
        }
        if (b0 > a0 && b0 > c0 && b0 > d0) {
            System.out.println(b0);
        }
        if (c0 > a0 && c0 > b0 && c0 > d0) {
            System.out.println(c0);
        }
        if (d0 > a0 && d0 > b0 && d0 > c0) {
            System.out.println(d0);
        }

        System.out.println("ex 5.72");
        double probeg = 10;
        double procent = 10;
        for(int i = 2; i<=10; i++){
            probeg = procent + (procent * 0.2);
            procent = probeg;
            System.out.println(i + " den " + procent);
        }
        System.out.println("ex 5.72(b");
        probeg = 10;
        procent = 10;
        for(int i = 2; i<=7; i++){
            probeg = procent + (procent * 0.2);
            procent = probeg;
        }
        System.out.println(procent);

        System.out.println("ex 6.97");
        int komandi[] = {10,9,8,7,6,5,4,3,2,1};
        n = 8;
        i0 = 0;
        int i1 = 0;
        while(n<komandi[i0]){
            i1++;
            i0++;
        }
        System.out.println(i0+1);

        System.out.println("ex 7.98");
        n = 5;
        double e0[] = {1.1,2.2,3.3,4.4,5.5};
        summa0 = 0;
        for(int i = 0 ; i<e0.length; i++){
            if (e0[i] > 20.5) {
                summa0 = summa0 + e0[i];
            }
        }
        int p = 3;
        if(summa0<p){
            System.out.println("summa menshe p");
        }

        System.out.println("ex 8.8");
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                System.out.print("\t" + i + " * " + j + " = " + (i*j) + " ");
            }
            System.out.println();
        }

        System.out.println("ex 8.9");//???

        System.out.println("ex 11.71");
        int ocenki[] = {2,3,4,2,3,5,4,3,5,3};
        int chetverki = 0;
        int pyaterki  = 0;
        for(int i = 0; i<ocenki[i]; i++){
            if (ocenki[i] == 5) {
                pyaterki++;
            }
            if (ocenki[i] == 4) {
                chetverki++;
            }
        }
        System.out.println("obshhee kolichestvo chetverok i pyaterok = " + (pyaterki + chetverki));

        System.out.println("ex 12.5");
        int massiv4[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        for(int i = 0; i<massiv4.length; i++){
            System.out.println(massiv4[4][i]);
        }
        System.out.println("ex 12.5(b");
        int s = 3;
        for(int i = 0; i<massiv4.length; i++){
            System.out.println(massiv4[i][s-1]);
        }

        System.out.println("ex 4.74");
        a0 = 2.2;
        if (a0 > 0) {
            System.out.println(a0);
        }
        if (a0 < 0) {
            System.out.println((a0*-1));
        }
        if (a0 == 0) {
            System.out.println(a0);
        }

        System.out.println("ex 5.73");
        double perviyGod = 1000;
        double procent0 = 0.2;
        a0 = perviyGod;
        b0 = 0;
        for(int i = 2; i<8; i++){
            
            a0 = a0 + (a0*0.2);
        }








    }
}
