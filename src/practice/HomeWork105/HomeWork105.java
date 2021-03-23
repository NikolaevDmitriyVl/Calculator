package practice.HomeWork105;

import java.util.Random;

public class HomeWork105{
    public int chetnieNeChetnie(int posledovatelnostA[], int posledovatelnostB[]){
        int chetnie = 0;
        int neChetnie = 0;
        for(int i = 0; i<posledovatelnostA.length; i++){
            if(posledovatelnostA[i]%2 == 0){
                chetnie++;
            }
            if (posledovatelnostB[i] % 2 == 0) {
                neChetnie++;
            }
        }



        return chetnie;
    }

    public void funkciya1(int dostoinstvoKarti, int mast){
        switch(dostoinstvoKarti){
            case 6:
                System.out.print("shest");
                break;
            case 7:
                System.out.print("sem");
                break;
            case 8:
                System.out.print("vosem");
                break;
            case 9:
                System.out.print("devyat");
                break;
            case 10:
                System.out.print("desyat");
                break;
            case 11:
                System.out.print("valet");
                break;
            case 12:
                System.out.print("dama");
                break;
            case 13:
                System.out.print("korol");
                break;
            case 14:
                System.out.print("tuz");
                break;
        }
        switch(mast){
            case 1:
                System.out.println(" pik");
                break;
            case 2:
                System.out.println(" tref");
                break;
            case 3:
                System.out.println(" buben");
                break;
            case 4:
                System.out.println(" chervey");
                break;
        }
    }
    public static void main(String[] args){
        System.out.println("ex 4.110");

        int dostoinstvoKarti = 13;
        int mast = 4;
        HomeWork105 answer = new HomeWork105();
        answer.funkciya1(dostoinstvoKarti,mast);


        System.out.println("ex 7.127");//??? i zadacha 6.52
        int chislo = 127;
        int i0 = 1;
        int i1 = 0;
        while (chislo >= i0) {
            if (chislo % i0 == 0) {
                i1++;
            }
            i0++;
        }
        if (i0 == 2) {
            System.out.println("chislo yavlyaetsya prostim");
        }
        else{
            System.out.println("chislo ne yavlyaetsya prostim");
        }
        
        System.out.println("ex 8.37");
        int a = 5;
        int b = 16;
        int summa = 0;
        int max = 0;
        for(int i= a; i<=b; i++){
            for(int j = 1; j<=i; j++){
                if (i % j == 0) {
                    summa = summa + j;
                }
            }
            if(summa > max ){
                max = summa;
            }
            summa = 0;
        }
        System.out.println(max);

        System.out.println("ex 10.12");
        int posledovatelnostA[] = {1,2,3,4,5,6,7,8};// kolichesnvo chetnih chisel
        int posledovatelnostB[] = {9,10,11,12,13,14,15,16};//kolichestvo nechetnih chisel
        HomeWork105 chetnie = new HomeWork105();
        int otvet = chetnie.chetnieNeChetnie(posledovatelnostA, posledovatelnostB );
        System.out.println(" chetnie " + otvet);
        int neChetnie = 0;
        for(int i = 0; i<posledovatelnostA.length; i++){
            if (posledovatelnostB[i] % 2 == 0) {
                neChetnie++;
            }
        }
        System.out.println(" nechetnie " + neChetnie);

        System.out.println("ex 11.92");
        int rost[] = new int[25];
        Random rnd = new Random();
        summa = 0;
        for(int i = 0; i<rost.length; i++){
            rost[i] = rnd.nextInt(50)+150;
            summa = summa + rost[i];
        }
        i0 = 0;
        int srednee = summa/rost.length;
        for(int i = 0; i<rost.length; i++){
            if (rost[i] > srednee) {
                i0++;
            }
        }
        System.out.println(i0 + " uchenikov vishe srednego rosta");

        
        System.out.println("ex 12.18(b");
        //pravo niz < levo verh
        int dvumMassiv[][] = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        if(dvumMassiv[dvumMassiv.length-1][dvumMassiv[dvumMassiv.length-1].length-1] < dvumMassiv[dvumMassiv.length-1][0]){
            System.out.println("v niznem pravom uglu chiso menshe chem v verhnem levom");
        }
        if(dvumMassiv[dvumMassiv.length-1][dvumMassiv[dvumMassiv.length-1].length-1] > dvumMassiv[dvumMassiv.length-1][0]){
            System.out.println("v verhnem levom uglu chislo menshe chem v niznem pravom");
        }
        System.out.println("ex 13.13");
        Stoimost sravnenie1 = new Stoimost();
        sravnenie1.rubli  = 13;
        sravnenie1.kopeyki = 15;
        sravnenie1.nazvanie = "shokolad";

        Stoimost sravnenie2 = new Stoimost();
        sravnenie2.rubli = 12;
        sravnenie2.kopeyki = 10;
        sravnenie2.nazvanie = "konfeti";

        double shokolad = sravnenie1.rubli + (sravnenie1.kopeyki * 0.01);
        double konfeti  = sravnenie2.rubli + (sravnenie2.kopeyki * 0.01);
        if (shokolad > konfeti) {
            System.out.println("shokolad stoyat bolshe");
        }
        if (konfeti > shokolad) {
            System.out.println("konfeti stoyat bolshe");
        }

        System.out.println("ex 4.111");
        int k = 176;
        //365 ponedelnik
        int ostatok = 1%7;
        System.out.println("ostatok " + ostatok);
        switch (ostatok){
            case 1:
                System.out.println("ponedelnik");
                break;
            case 2:
                System.out.println("vtornik");
                break;
            case 3:
                System.out.println("sreda");
                break;
            case 4:
                System.out.println("chetverg");
                break;
            case 5:
                System.out.println("pyatnica");
                break;
            case 6:
                System.out.println("subbota");
                break;
            case 0:
                System.out.println("voskresenie");
        }

        System.out.println("ex 7.128");
        chislo = 6;
        summa = 0;
        for(int i = 1; i<chislo; i++){
            if (chislo % i == 0) {
                summa = summa +i;
            }}
            if (summa == chislo) {
                System.out.println("chislo " + chislo +" yvlyaetsya idealnim ");
            }


        }
    }

