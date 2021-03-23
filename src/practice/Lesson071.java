package practice;

import java.util.Scanner;

public class Lesson071 {
    public static void main(String[] args){
        System.out.println("ex 11.1");
        int q[] = {37,0,50,46,34,46,0,13};

        int w[] = new int [8];
        w[0] = 37;
        w[1] = 0;
        w[2] = 50;
        w[3] = 46;
        w[4] = 34;
        w[5] = 46;
        w[6] = 0;
        w[7] = 13;

        System.out.println("ex 11.2");
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("vvedite chislo");
        //int e = scanner.nextInt();
        //int r[] = new int [5];
        //for(int i = 0; i<5; i++){
         //   r[i] = scanner.nextInt();
        //}

        //Scanner scanner = new Scanner(System.in);
        //int e = scanner.nextInt();
        //int r[] = new int [10];
        //int i = 0;
        //while(i < r.length){
           // r[i] = scanner.nextInt();
           // i++;
       // }

        //System.out.println("ex 11.3");
        //Scanner scanner = new Scanner(System.in);
        //double u[] = new double [15];
        //for(int i = 0; i<15; i++){
            //u[i] = scanner.nextDouble();
       // }

        //System.out.println("ex 11.3(b");
        //Scanner scanner = new Scanner(System.in);
        //double o[] = new double [15];
        //int i = 0;
        //while (i < o.length) {
            //double h = scanner.nextDouble();
           // if(h>= 22 && h< 23){
           //     o[i] = h;
           //     i++;
           // }

       // }

        System.out.println("ex 11.3(c");
        Scanner scanner = new Scanner(System.in);
        double p[] = new double [15];
        int i = 0;
        while (i < p.length) {
            double j = scanner.nextDouble();
            if(j>=0 && j<10){
                p[i] = j;
                i++;
            }
        }
    }
}
