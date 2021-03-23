package practice;

import java.util.Scanner;

public class HomeWork071 {
    public static void main(String[] args){
        System.out.println("ex 4.38(a");
        int x = 3;
        int y = 2;
        int ax = 5;
        int ay = 7;
        if (ax > x && ay > y) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println("ex 4.38(b");
        x = -2;
        y = -4;
        ax = 0;
        ay = 0;
        if (ax < x && ay < y) {
            System.out.println("yes");
        }
        else{
            System.out.println("ne popadaet");
        }

        System.out.println("ex 5.38");
        double summ = 0.0;
        double zn = 1.0;
        for(int i = 1; i<=100; i++){
            summ = summ + ((1.0/i)*zn);
            zn = zn * -1.0;
        }
        System.out.println(summ);

        System.out.println("ex 6.60");
        int posledovatelnost[] = {1,2,3,4,5,6,8,8,9,10,11,12,13,14,15,16,18,18,19,20};
        int i0 = 0;
        for( int i = 0; i<posledovatelnost.length; i++){
            if (posledovatelnost[i] % 10 == 7) {
                System.out.println(i);
                i++;
                break;
            }
        }
        if (i0 == 0) {
            System.out.println("chisla ne zakanchivayutsya na cifru 7");
        }

        System.out.println("ex 7.62");
        int komandi[] = {235,283,395,403,970,193,225};
        int naimenshiyRezultat = komandi[0];
        int otvet = 0;
        for(int i = 0; i<komandi.length; i++){
            if(naimenshiyRezultat>komandi[i]){
                naimenshiyRezultat = komandi[i];
                otvet = i;
            }
        }
        System.out.println(otvet + 1);

        System.out.println("ex 11.3(d");
        //Scanner scanner = new Scanner(System.in);
        //double a[] = new double[15];
        //for(int i = 0; i<15; i++){
            //double b = scanner.nextDouble();
        //if(b>=-50 && b<50){
          //  a[i] = b;
        //}

        System.out.println("ex 11.3(e");
        //Scanner scanner = new Scanner(System.in);
        //double q[] = new double[15];
        //for(int i = 0; i<15; i++){
          //  double w = scanner.nextDouble();
            //if(w>0 && w<=10){
              //  q[i] = w;
            //}
        //}

        System.out.println("ex 11.4");
        //Scanner scanner = new Scanner(System.in);
        //int e[] = new int[12];
        //for(int i = 0; i<12; i++){
         //   int r = scanner.nextInt();
          //  if(r>=163 && r<=190){
          //      e[i] = r;
         //   }
       // }

        System.out.println("ex 4.39");
        int tochka1 = -1;
        int tochka2 = 5;
        int tochka = 3;
        if (tochka < tochka1 || tochka > tochka2) {
            System.out.println("popadaet");
        }
        else{
            System.out.println("ne popadaet");
        }

        System.out.println("ex 5.39");
        int chisla[] = {1,2,3,4,5,6,7,8,9,10};
        int summa = 0;
        for(int i = 0;i<chisla.length; i++){
            summa = summa + chisla[i];
        }
        System.out.println(summa);

        System.out.println("ex 6.61");
        int posledovat[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,-1};
        otvet = 0;
        for(int i = 0; i<posledovat.length; i++){
            if(posledovat[i]%7 == 0){
                otvet = i;
                break;
            }
        }
        System.out.println(otvet);

        System.out.println("ex 7.63");
        int osadki[] = {1,2,3,4,5,6,7,8,9,10,10,8,7,6,5,4,3,2,1};
        int naibolsheeKolichestvo = osadki[0];
        otvet = 0;
        for(int i = 0; i<osadki.length; i++){
            if(naibolsheeKolichestvo <= osadki[i]){
                naibolsheeKolichestvo = osadki[i];
                otvet = i;
            }
        }
        System.out.println(otvet);

        System.out.println("ex 11.5");
        //Scanner scanner = new Scanner(System.in);
        //int u[] = new int[5];
        //for(int i = 0; i<u.length; i++){
          //  int o = scanner.nextInt();
            //if(o > 50 && o<= 100){
              //  u[i] = o;
            //}
        //}

        System.out.println("ex 11.6");
        //Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        //int p[] = new int[12];
        //for(int i = 0; i<p.length; i++){
          //  p[i] = scanner.nextInt();
        //}

        System.out.println("ex 4.40");
        double x0 = 2.2;
        double result = 0;
        if(x0>=-2.4 && x0 <= 5.7){
            result = Math.pow(x0,2);
        }
        else{
            result = 4;
        }
        System.out.println(result);

        System.out.println("ex 5.40");
        int n = 12;
        double chisl[] = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1,11.1,12.2};
        summ = 0;
        for(int i = 0; i<chisl.length; i++){
            summ = summ + chisl[i];
        }
        System.out.println(summ);

        System.out.println("ex 6.62");
        n= 8;
        int chislo[] = {1,2,3,4,5,9,80,12,10000};
        for(int i = 0; i< chislo.length; i++){
            if (chislo[i] > n) {
                System.out.println(i);
                break;
            }
            else{
                System.out.println("chisel bolshih " + n + " net");
            }
        }

        System.out.println("ex 7.64");//???
        int ocenki[] = {2,3,4,2,5,6,8,9,10,10};
        int naimenshayaOcenka = ocenki[0];
        int naibolshayaOcenka = ocenki[0];
        int naimenshayaOcenka0 = 0;
                int naibolshayaOcenka0 = 0;
        summa = 0;
        for(int i = 0; i<ocenki.length; i++){
            if(naimenshayaOcenka >= ocenki[i]){
                naimenshayaOcenka = ocenki[i];
                naimenshayaOcenka0 = i;

            }
            if(naibolshayaOcenka < ocenki[i]){
                naibolshayaOcenka = ocenki[i];
                naibolshayaOcenka0 = i;
            }
        }

        for(int i = 0; i<ocenki.length; i++){
            if(i != naimenshayaOcenka0 && i != naibolshayaOcenka0){
             summa = summa + ocenki[i];
            }
        }

        double sredneeArifmeticheskoe = (double)summa / ((double)ocenki.length-2.0);
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 11.7");
       // Scanner scanner = new Scanner(System.in);
       // int s = scanner.nextInt();
       // int d[] = new int[20];
        //for(int i = 20; i>0; i--){
          //  d[i] = scanner.nextInt();
        //}

        System.out.println("ex 11.8(a");
       // Scanner scanner = new Scanner(System.in);
       // int function10_1[] = new int [8];
       // int h = 0;
       // for(int i = 0;i<function10_1.length; i++){
        //    int g = scanner.nextInt();
         //   if(g > h ){
         //       function10_1[i] = g;
         //   }
        //h = g;

        //}

        System.out.println("ex 11.8(b");
        //Scanner scanner = new Scanner(System.in);
        //int j[] = new int [8];
        //int k = 0;
        //for(int i = 0; i < j.length; i++){
           // int l = scanner.nextInt();

           // if (l > k) {
           //     j[i] = l;
           // }
           // k = l;
        //}
    }
}
