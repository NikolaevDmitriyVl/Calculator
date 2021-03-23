package practice.HomeWork104;

import java.util.Random;

public class HomeWork104{

    public double funkciya(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5){
        double k11 = x2 - x1;
        if (k11 < 0) {
            k11 = k11 *(-1);
        }
        double k12 = y2 - y1;
        if (k12 < 0) {
            k12 = k12 * (-1);
        }
        double g1 = Math.sqrt(Math.pow(k11,2) + Math.pow(k12,2));
        //storona 1

        double k21 = x3 - x2;
        if (k21 < 0) {
            k21 = k21 * (-1);
        }
        double k22 = y3 - y2;
        if (k22 < 0) {
            k22 = k22 * (-1);
        }
        double g2 = Math.sqrt(Math.pow(k21,2) + Math.pow(k22,2));
        //storona 2

        double k31 = x4 - x3;
        if (k31 < 0) {
            k31 = k31 * (-1);
        }
        double k32 = y4 - y3;
        if (k32 < 0) {
            k32 = k32 * (-1);
        }
        double g3 = Math.sqrt(Math.pow(k31,2) + Math.pow(k32,2));
        //storona3

        double k41 = x5 - x4;
        if (k41 < 0) {
            k41 = k41*(-1);
        }
        double k42 = y5 - y4;
        if (k42 < 0) {
            k42 = k42*(-1);
        }
        double g4 = Math.sqrt(Math.pow(k41,2) + Math.pow(k42,2));
        //storona4

        double k51 = x1 - x5;
        if (k51 < 0) {
            k51 = k51*(-1);
        }
        double k52 = y1 - y5;
        if (k52 < 0) {
            k52 = k52*(-1);
        }
        double g5 = Math.sqrt(Math.pow(k51,2) + Math.pow(k52,2));
        //storona5

        double p = g1*g2*g3*g4*g5;
        return p;

    }
    public static void main(String[] args){
        System.out.println("ex 4.109");
        int karta = 11;
        switch(karta){
            case 6:
                System.out.println("shest");
            case 7:
                System.out.println("sem");
            case 8:
                System.out.println("vosem");
            case 9:
                System.out.println("devyat");
            case 10:
                System.out.println("desyat");
            case 11:
                System.out.println("valet");
            case 12:
                System.out.println("dama");
            case 13:
                System.out.println("korol");
            case 14:
                System.out.println("tuz");
        }
        System.out.println("ex 7.126");
        int posledovatelnost[] = new int[20];
        Random rnd = new Random();
        int pravo[] = new int[20];
        int levo[] = new int[20];
        for(int i = 0; i<posledovatelnost.length; i++){
            posledovatelnost[i] = rnd.nextInt(66);
            pravo[i] = posledovatelnost[i]%10;
            levo[i] = posledovatelnost[i]/10;
            System.out.println("levo " + (i+1) +  " " + levo[i] + " pravo " + (i+1) + " " + pravo[i]);
        }
        int i0 = 0;
    for(int i= 0; i<19; i++){
            if(pravo[i] == levo[i+1]){
                i0++;
            }
            else{
                break;
            }
        }
    System.out.println(i0);
    System.out.println("ex 7.126(b");
    i0 = 0;
    for(int i = 0; i<19; i++){
        if(pravo[i] == levo[i+1] || levo[i] == levo[i+1] || pravo[i] == pravo[i+1] || levo[i] == pravo[i+1]){
           i0++;
        }
        else{
            break;
        }

    }
    System.out.println(i0);

        System.out.println("ex 8.36");
        int summaDeliteley = 0;
        for(int i = 1; i<=100000; i++){
            for(int j = 1; j<i; j++){
                if(i%j == 0){
                    summaDeliteley = summaDeliteley + j;
                }
            }
            if (summaDeliteley == i) {
                System.out.println("chislo = " + i + " summa deliteley = " + summaDeliteley);
            }
            summaDeliteley = 0;
        }
        System.out.println("ex 10.11");
        double x1 = -1;
        double y1 = -2;
        double x2 = -6;
        double y2 = -1;
        double x3 = -5;
        double y3 = 3;
        double x4 = 1;
        double y4 = 5;
        double x5 = 3;
        double y5 = 1;
        HomeWork104 otwet = new HomeWork104();
        double answer = otwet.funkciya(x1,y1,x2,y2,x3,y3,x4,y4,x5,y5);
        System.out.println(answer);

        System.out.println("ex 11.91");
        int massiv[] = {1,2,3,4,5};
        int summa = 0;
        for(int i= 0; i<massiv.length; i++){
            summa = summa+massiv[i];
        }
        int sredneeArifmeticheskoe = summa/massiv.length;
        
        System.out.println("ex 12.18");
        int massiv01[][] = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        //levoVerh bolshe ili pravoVerh
        if(massiv01[0][0]>massiv01[0][massiv01[0].length-1]){
            System.out.println("levoVerh bolshe");
        }
        else if(massiv01[0][0]<massiv01[0][massiv01[0].length-1]){
            System.out.println("pravo verh bolshe");
        }
        System.out.println("ex 13.13");

    }
}