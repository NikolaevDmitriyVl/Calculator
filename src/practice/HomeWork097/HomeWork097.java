package practice.HomeWork097;

import java.util.Random;

public class HomeWork097 {
    //public static double signum(double z,double a,double sign,double x, double y){
       // if (a < 0) {
       //     sign = -1;
         //   return -1;
       // }
      //  if (a == 0) {
       //     sign = 0;
       //     return 0;
      //  }
     //   if(a>0){
      //      sign = 1;
      //      return 1;
       // }
       // z = (sign*x) + (sign*y);
    //}
    public static void main(String[] args) {
        System.out.println("ex 4.99");
        int chislo1 = 5;
        int chislo2 = 6;
        int chislo3 = 7;
        int summa = 0;
        if (chislo1 < chislo2 && chislo1 < chislo3) {
            summa = chislo2 + chislo3;
        }
        if (chislo2 < chislo3 && chislo2 < chislo1) {
            summa = chislo1 + chislo3;
        }
        if (chislo3 < chislo1 && chislo3 < chislo2) {
            summa = chislo1 + chislo2;
        }

        System.out.println(summa);

        System.out.println("ex 5.96");
        double otSteniDoPalki = 3;
        double dlinaPalki = 4.5;
        double otZemliDoPalki = Math.sqrt(Math.pow(dlinaPalki, 2) - Math.pow(otSteniDoPalki, 2));
        System.out.println(otZemliDoPalki);
        int zemlya = (int) otSteniDoPalki * 100;
        int palka = (int) dlinaPalki * 100;
        int stena = (int) otZemliDoPalki * 100;
        double result = 0;
        for (int i = zemlya; i <= palka; i += 20) {
            double izmRazmerStena = Math.sqrt(Math.pow(palka, 2) - Math.pow(i, 2));
            result = Math.sin(izmRazmerStena / palka);
        System.out.println(result);
    }

        System.out.println("ex 7.117");
        int n = 5;
        int i0  = n+1;
        int massiv[] = {1,2,100,3,4,5};
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] == 100) {
                i0 = i+1;
            }
        }
        if(i0 == n+1){
            System.out.println("chisla 100 v massive net");
        }
        if(i0 != (n+1)){
            System.out.println(i0);
        }

        System.out.println("ex 8.28");
        //vse celie chisla ot 200 do 500 u kotorih 5 deliteley
        i0 = 0;
        for(int i = 200; i<=500; i++){
            for(int j = 1; j<=i; j++){
                if (i % j == 0) {
                    i0++;
                }
            }
                if (i0 == 6) {
                    System.out.println("u etogo chisla 6 deliteley " + i);
                }
                i0 = 0;
            }

        System.out.println("ex 10.5");
        HomeWork097 otwet = new HomeWork097();
        double a = 10;
        double  x = 5;
        double y = 4;
        double sign = 3;
        //double z0 = otwet.signum();

        System.out.println("ex 11.86");
        int massa[] = new int[25];
        i0 = 0;
        int i1 = 0;
        int summa1 = 0;
        int summa2 = 0;
        Random rnd = new Random();
        for(int i = 0; i<massa.length; i++){
            massa[i] = rnd.nextInt(70)+50;
            if (massa[i] >= 100) {
                summa1 = summa1 + massa[i];
                i0++;
            }
            else{
                summa2 = summa2 + massa[i];
                i1++;
            }
        }
        int srAr1 = summa1/i0;
        int srAr2 = summa2/i1;
        System.out.println("srednee arifmeticheskoe polnih lyudey = " + srAr1);
        System.out.println("srednee arifmeticheskoe ostalnih lyudey = " + srAr2);
        

        }
    }

