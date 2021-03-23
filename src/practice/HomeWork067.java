package practice;

public class HomeWork067 {
    public static void main(String[] args){
        System.out.println("ex 4.27");
        int chislo = 123;
        int hundred = chislo /100;
        int one = chislo%10;
        if (hundred == one) {
            System.out.println("chislo yavlyaetsya palindromom");
        }
        else{
            System.out.println("chislo ne yavlyaetsya palindromom");
        }

        System.out.println("ex 5.27");
        int summa = 0;
        for(int i = 100; i<=500; i++){
            summa = summa + i;
        }
        System.out.println(summa);
        System.out.println("ex 5.27(b");
        summa = 0;
        int a = 456;
        for(int i = a; i<=500; i++){
            summa = summa + i;
        }
        System.out.println(summa);
        System.out.println("ex 5.27(c");
        int b  = 15;
        summa = 0;
        for(int i = -10; i<=b; i++){
            summa = summa + i;
        }
        System.out.println(summa);
        System.out.println("ex 5.27(d");
        a = 15;
        b = 17;
        summa = 0;
        for(int i = a; i<=b; i++){
            summa = summa + i;
        }
        System.out.println(summa);

        System.out.println("ex 6.51");
        chislo = 12345;
        int cifra = 0;
        int i = 0;
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;
        }

        System.out.println("ex 4.28");
        chislo = 123;
        hundred = chislo/100;
        int ostatokHundred = hundred%100;
        int ten = ostatokHundred/10;
        one = ostatokHundred%10;
        if(hundred>one){
            System.out.println("pervaya cifra bolshe posledney");
        }
        else{
            System.out.println("poslednyaya cifra bolshe pervoy");
        }
        System.out.println("ex 4.28(b");
        if (hundred > ten) {
            System.out.println("pervaya bolshe vtoroy");
        }
        else{
            System.out.println("vtoraya bolshe pervoy");
        }
        System.out.println("ex 4.28(c");
        if (ten > one) {
            System.out.println("vtoraya bolshe tretey");
        }
        else{
            System.out.println("tretya bolshe vtoroy");
        }

        System.out.println("ex 5.28(a");
        int proizvedenie = 1;
        for(i = 8; i<=15; i++){
            proizvedenie = proizvedenie * i;
            System.out.println(proizvedenie);
        }
        System.out.println("ex 5.28(b");
        proizvedenie = 1;
        a = 15;
        for(i = a; i<=20; i++){
            proizvedenie = proizvedenie * i;
            System.out.println(proizvedenie);
        }
        System.out.println("ex 5.28(c");
        b = 1;
        proizvedenie = 1;
        for(i = 1; i<= b; i++){
            proizvedenie = proizvedenie * i;
        }
        System.out.println(proizvedenie);
        System.out.println("ex 5.28(d");
        a = 10;
        b = 14;
        proizvedenie = 0;
        for(i = a; i<= b; i++){
            proizvedenie = proizvedenie * i;
        }
        System.out.println(proizvedenie);

        System.out.println("ex 6.51");//???
        chislo = 230032;
         int chisl = chislo;
         int cifr = 0;
         int chisl2 = chislo;
         int cifr2 = 0;
        cifra = 0;
        i = 0;
        int q = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i++;
        }
        int polovinaCifr = i/2;
        int vseCifri = polovinaCifr * 2;
        double w = Math.pow(10,i-1);
        System.out.println(w);
        while(vseCifri > polovinaCifr ){
            cifr = chisl%10;
            chisl = chisl/10;
            cifr2 = chisl2/(int)w;
            chisl2 = chisl2%(int)w;
            w = w/10;
            vseCifri = vseCifri-1;
            if (cifr == cifr2) {
                q++;
            }
        }
        if (q == polovinaCifr) {
            System.out.println("polindrom");
        }
        else{
            System.out.println("ne polindrom");
        }

        System.out.println("ex 7.19");
        double  k[] = {1.2,2.3,5.6,8.9,5.5,4.3,6.5,9.3,7.5,7.5,5.6,2.8,9.5,3.2,7.5};
        double minusK = 0;
        for(int e = 0; e<k.length; e++){
            minusK = k[e] - (k[e] * 2);
            System.out.println(minusK);
        }

        System.out.println("ex 7.20(a");
        int n = 5;
        int v[] = {3,2,7,5,9};
        int minusPlus = 0;
        int minus = -1;
        for(i = 0; i<n; i++){
           minusPlus = minusPlus + (minus * v[i]);
           minus = minus * (-1);
        }
        System.out.println(minusPlus);
        System.out.println("ex 7.20(b");
        System.out.println(v[1]+v[n-1]);
        System.out.println(v[1]-v[2]);

        System.out.println("ex 4.29");
        int e = 123;
        hundred = e/100;
        ostatokHundred = e%100;
        ten = ostatokHundred/10;
        one = ostatokHundred%10;
        if(Math.pow(e,2) == (Math.pow(hundred,3)+Math.pow(ten,3)+ Math.pow(one,3))){
            System.out.println("kvadrat chisla raven summe kubov ego cifr");
        }
        else{
            System.out.println("kvadrat chisla ne raven summe kubov ego cifr");
        }

        System.out.println("ex 5.29");
        summa = 0;
        for(i = 1; i<=1000; i++){
            summa = summa + i;
        }
        int sredneeArifmeticheskoe = summa/1000;
        System.out.println(sredneeArifmeticheskoe);

    }
}
