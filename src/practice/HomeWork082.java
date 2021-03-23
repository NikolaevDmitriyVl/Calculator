package practice;

public class HomeWork082 {
    public static void main(String[] args){
        System.out.println("ex 4.66");
        int a = 6;
        int b  = 11;
        int c = 2;
        int d = 4;
        int e = 1;
        int stolStBolshe = 0;
        int stolStMenshe = 0;
        int dominoStBolshe = 0;
        int dominoStSrednyaya = 0;
        int dominoStMenshe = 0;
        if (a > b) {
            stolStBolshe = a;
            stolStMenshe = b;
        }
        else{
            stolStBolshe = b;
            stolStMenshe = a;
        }
        if (c > d && c > e) {
            dominoStBolshe = c;
        }
        if (d > c && d > e) {
            dominoStBolshe = d;
        }
        if (e > c && e > d) {
            dominoStBolshe = e;
        }
        if (c < d && c < e) {
            dominoStMenshe = c;
        }
        if (d < e && d < c) {
            dominoStMenshe = d;
        }
        if (e < c && e < d) {
            dominoStMenshe = e;
        }
        if (c < dominoStBolshe && c > dominoStMenshe) {
            dominoStSrednyaya = c;
        }
        if (d < dominoStBolshe && d > dominoStMenshe) {
            dominoStSrednyaya = d;
        }
        if (e < dominoStBolshe && e > dominoStMenshe) {
            dominoStSrednyaya  = e;
        }

        System.out.println("stol dlinnaya storona " + stolStBolshe);
        System.out.println("stol korotkaya storona " + stolStMenshe);
        System.out.println("domino srednyaya " + dominoStSrednyaya);
        System.out.println("domino menshaya " + dominoStMenshe);

        if (((stolStMenshe / dominoStSrednyaya) * (stolStBolshe / dominoStMenshe)) >= ((stolStMenshe / dominoStMenshe) * (stolStBolshe / dominoStSrednyaya))) {
            System.out.println((stolStMenshe / dominoStSrednyaya) * (stolStBolshe / dominoStMenshe));
        }
        if(((stolStMenshe / dominoStMenshe) * (stolStBolshe / dominoStSrednyaya))>=((stolStMenshe / dominoStSrednyaya) * (stolStBolshe / dominoStMenshe))){
            System.out.println((stolStMenshe / dominoStMenshe) * (stolStBolshe/dominoStSrednyaya));
        }

        System.out.println("ex 5.66");
        int a1[] = new int[10];
        a1[0] = 1;
        for(int i = 1 ; i< a1.length; i++){

            a1[i] = (i*a1[i-1]) + (1/i);
            System.out.println(a1[i]);
        }

        System.out.println("ex 6.91");
        int chislo = 123;
        int cifra = 0;
        int i0 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i0++;
        }
        System.out.println("kolichestvo cifr = " + i0);
        System.out.println("ex 6.91(b");
        chislo = 123;
        cifra  = 0;
int proizvedenie = 1;
        int summa = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            summa = summa+ cifra;
            proizvedenie = proizvedenie * cifra;
        }
        System.out.println("summa cifr" + summa);
        System.out.println("ex 6.91(c");
        System.out.println("proizvedenie = " + proizvedenie);
        System.out.println("ex 6.91(d");
        System.out.println("srednee arifmeticheskoe " + summa / i0);
        System.out.println("ex 6.91(e");
        double summa0 = 0;
        double summaKub = 0;
        chislo = 123;
        cifra = 0;
        while (chislo > 0) {
            cifra = chislo %10;
            chislo = chislo/10;
            summa0 = Math.pow(cifra,2) + summa0;
            summaKub = summaKub + Math.pow(cifra,3);
        }
        System.out.println("summa kvadratov " + summa0);
        System.out.println("ex 6.91(d");
        System.out.println("summa kubov " + summaKub);
        System.out.println("ex 6.91(e");
        chislo =123;
        double w = Math.pow(10,i0-1);
        System.out.println(w);
        System.out.println("pervaya cifra " + chislo/(int)w);
        System.out.println("ex 6.91(function10_1");
        System.out.println("summa pervoy i posledney " + ((chislo/(int)w) + (chislo%10)));

        System.out.println("ex 7.92");
        int sportsmen1[] = {1,2,3,4,5,6,7,8,9,10};
        int sportsmen2[] = {11,10,9,8,7,6,5,4,3,2};
        int summa1 = 0;
        int summa2 = 0;
        for(int i = 0; i<sportsmen1.length; i++){
            summa1 = summa1 + sportsmen1[i];
            summa2 = summa2 + sportsmen2[i];
        }
        if (summa1 > summa2) {
            System.out.println("luchshiy rezultat pokazal perviy sportsmen");
        }
        if (summa2 > summa1) {
            System.out.println("luchshiy rezultat pokazal vtoroy sportsmen");
        }

    }
}
