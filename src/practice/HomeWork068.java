package practice;

public class HomeWork068 {
    public static void main(String[] args){
        System.out.println("ex 4.30");
        int chislo = 123;
        int hundred = chislo/100;
        int ostatokHundred = hundred%100;
        int ten = ostatokHundred/10;
        int one = ostatokHundred%10;
        int summa = hundred+ ten + one;
        if(summa > 9 && summa <100){
            System.out.println("summa cifr yavlyaetsya dvuhznachnim chislom");
        }
        else{
            System.out.println("summa cifr ne yavlyaetsya dvuznachnim chislom");
        }
        System.out.println("ex 4.30(b");
        int proizvedenie = hundred * ten * one;
        if (proizvedenie < 1000 && proizvedenie > 99) {
            System.out.println("proizvedenie cifr yavlyaetsya trehznachnim chislom");
        }
        else{
            System.out.println("proizvedenie cifr ne yavlyaetsya trehznachnim chislom");
        }
        System.out.println("ex 4.30(c");
        int a = 22;
        if (proizvedenie > a) {
            System.out.println("proizvedenie bolshe a");
        }
        else{
            System.out.println("proizvedenie menshe a");
        }
        System.out.println("ex 4.30(d");
        if (summa % 5 == 0) {
            System.out.println("summa cifr kratna pyati");
        }
        else{
            System.out.println("summa cifr ne kratna pyati");
        }
        System.out.println("ex 4.30(e");
        a = 7;
        if (summa % a == 0) {
            System.out.println("summa cifr kratna a");
        }
        else{
            System.out.println("summa cifr ne kratna a");
        }

        System.out.println("ex 5.30");
        double summaKubov = 0;
        for(int i = 20; i<41; i++){
            summaKubov = summaKubov + Math.pow(i,3);
        }
            System.out.println(summaKubov);
        System.out.println("ex 5.30(b");
        a = 3;
        double summaKvadratov = 0;
        for(int i = a; i<51; i++){
            summaKvadratov = summaKvadratov + Math.pow(i,2);
        }
        System.out.println(summaKvadratov);
        System.out.println("ex 5.30(c");
        int n = 63;
        summaKvadratov = 0;
        for(int i = 1; i<=n; i++ ){
            summaKvadratov =summaKvadratov + i;
        }
        System.out.println(summaKvadratov);
        System.out.println("ex 5.30(d");
        a = 6;
        int b = 8;
        summaKvadratov = 0;
        for(int i = a; i<=b; i++){
            summaKvadratov = summaKvadratov + Math.pow(i,2);
        }
        System.out.println(summaKvadratov);

        System.out.println("ex 6.52");//???
        chislo = 13;
        int i = chislo-1;
        int q = 0;
        int prostoeChislo = 0;
        while (i > 1) {


            if (chislo % i == 0) {
                prostoeChislo++;
            }
            i--;
        }
        if (prostoeChislo == 0) {
            System.out.println("yavlyaetsya prostim chislom");
        }
        else{
            System.out.println(" ne yavlyaetsya prostim chislom");
        }

        System.out.println("ex 7.37");//???
        int chisl[] = {-10,5,-3,-2,-2,-6,-4,8};
        int znak = 0;
        int r =0;
        if (chisl[0] > 0) {
            znak = 1;
        }
        if (chisl[0] < 0) {
            znak = -1;
        }
        for(i = 0; i<chisl.length; i++){
            if (chisl[i]*znak > 0) {

            }
            else{
                r++;
                znak = znak*(-1);
            }
            }
        System.out.println(r);

        System.out.println("ex 7.38");//???

        System.out.println("ex 7.39");//???

        System.out.println("ex 7.40");
        int komanda1[] = {2,2,5,10,5,2};
        int komanda2[] = {5,10,2,2,5,5,5,5,};
        summa = 0;
        int summa2 = 0;
        for(i = 0; i<komanda1.length;i++){
            summa = summa + komanda1[i];
        }
        for(i = 0; i<komanda2.length; i++){
            summa2 = summa2 + komanda2[i];
        }
        System.out.println("obshhee chislo udaleniy 1 komandi = " + komanda1.length);
        System.out.println("obshhee vremya udaleniy 1 komandi = " + summa);
        System.out.println("obshhee chislo udaleniy 2 komandi = " + komanda2.length);
        System.out.println("obshhee vremya udaleniy 2 komandi = " + summa2);

        System.out.println("ex 4.31");
        chislo = 123;
        hundred = chislo/100;
        ostatokHundred = chislo%100;
        ten = ostatokHundred/10;
        one = ostatokHundred%10;
        if (hundred == ten && hundred == one && ten == one) {
            System.out.println("vse cifri odinakovie");
        }
        else{
            System.out.println("ne vse cifri odinakovie");
        }
        System.out.println("ex 4.31(b");
        if (hundred == ten || hundred == one || ten == one) {
            System.out.println("est odinakovie cifri");
        }
        else{
            System.out.println("net odinakovih cifr");
        }

        System.out.println("ex 5.31");
        chislo = 12;
        n = 4;
        double summ = 0;
        for(i =0; i<chislo; i++){
            summ = summ + (chislo + Math.pow(i,2));
            System.out.println(summ);
        }

        System.out.println("ex 6.53");
        chislo = 321;
        int cifra = 0;
        int cifra2 = 0;
        i = 0;
        q = 0;
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;
            if(cifra>=cifra2){
                q++;
            }
            cifra2 = cifra;
            i++;

        }
        if(q == i){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("ex 7.41");
        int ucheniki[] = {2,3,2,3,4,5,5,5,4,2,2};
        int dvoyka = 0;
        int troyka = 0;
        int chetverka = 0;
        int pyaterka = 0;
        for(i =0 ; i<ucheniki.length; i++){
            if (ucheniki[i] == 2) {
                dvoyka++;
            }
            if(ucheniki[i] == 3){
                troyka++;
            }
            if (ucheniki[i] == 4) {
                chetverka++;
            }
            if (ucheniki[i] == 5) {
                pyaterka++;
            }
        }
        System.out.println("dvoek = " + dvoyka);
        System.out.println("troek = " + troyka);
        System.out.println("chetverok = " + chetverka);
        System.out.println("pyaterok = " + pyaterka);

        System.out.println("ex 7.42");
        int chempionat[] = {3,1,0,0,0,3,0,1};
        int nichya = 0;
        int viigrish = 0;
        int proigrish = 0;
        i = 0;
        while (i < chempionat.length) {
            if (chempionat[i] == 1) {
                nichya++;
            }
            if (chempionat[i] == 3) {
                viigrish++;
            }
            if(chempionat[i] == 0){
                proigrish++;

            }
            i++;
        }
        System.out.println("viigrishey = " + viigrish);
        System.out.println("nichih = " + nichya);
        System.out.println("proigrishey = " + proigrish);

        System.out.println("ex 4.32(a");
        chislo = 1234;
        int thousand = chislo/1000;
        int ostatokThousand = chislo%1000;//234
        hundred = ostatokThousand/100;
        ostatokHundred = ostatokThousand%100;//34
        ten = ostatokHundred/10;
        one = ostatokHundred%10;
        int summa1 = thousand + hundred;
        summa2 = ten + one;
        if (summa1 == summa2) {
            System.out.println("summi ravni");
        }
        else{
            System.out.println("summi ne ravni");
        }

        System.out.println("ex 4.32(b");
        summa = thousand + hundred + ten + one;
        if(summa%3 == 0){
            System.out.println("summa chisla kratna trem");
        }
        else{
            System.out.println("summa chisla ne kratna trem");
        }

        System.out.println("ex 4.32(c");
        proizvedenie = thousand + hundred + ten + one;
        if (proizvedenie % 4 == 0) {
            System.out.println("proizvedenie chisla kratno chetirem");
        }
        else{
            System.out.println("proizvedenie chisla ne kratno chetirem");
        }

        System.out.println("ex 4.32(d");
        a = 5;
        if (proizvedenie % a == 0) {
            System.out.println("proizvedenie cifr chisla kratno a");
        }
        else{
            System.out.println("proizvedenie cifr chisla ne kratno a");
        }

        System.out.println("ex 5.32");
        n = 6;
        double sum = 0;
        for(double w = 1; w<= n; w++){
            sum = sum + 1/w;
            System.out.println(sum);
        }

        System.out.println("ex 6.54");
        chislo = 322;
        cifra = 0;
        cifra2 = 9;
        i = 0;
        q  = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            if (cifra <= cifra2) {
               q++;
            }
            cifra2 = cifra;
            i++;
        }
        if (q == i) {
            System.out.println("posledovatelnost  ubivaet");
        }
        else{
            System.out.println("posledovatelnost ne ubivaet");
        }

        System.out.println("ex 7.43");
        int chisla[] = {2,1,3,34,79,64,99,50,4};
        summa = 0;
        q = 0;
        for( i = 0; i<chisla.length; i++){
            if (chisla[i] > 10) {
                summa = summa + chisla[i];
                q ++;
            }
        }
        int sredneeArifmeticheskoe = summa/q;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 7.44");
        int e = 6;
        int t = 7;
        q = 0;
        int x[] = {1,2,3,87,56,68};
        summa = 0;
        for(i = 0; i<x.length; i++){
            if (x[i] > t) {
                summa = summa + x[i];
              q++;
            }
        }
        sredneeArifmeticheskoe = summa/q;
        }
    }

