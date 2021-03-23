package practice;

import java.util.Random;

public class Lesson075 {
    public static void main(String[] args){
        System.out.println("ex 11.36");
        int q[] = new int[5];
        Random rnd = new Random();
        int neotricatelnie = 0;
        for(int i = 0; i<q.length; i++){
            q[i] = rnd.nextInt(100)-50;
            if(q[i]>=0){
                neotricatelnie = q[i];
                System.out.println(neotricatelnie);
            }
        }
        System.out.println("ex 11.36(b");
        int w[] = new int[10];
        int mensheSta = 0;
        Random rnd0 = new Random();
        for(int i = 0; i<w.length; i++){
            w[i] = rnd0.nextInt(200);
            if(w[i]<100){
                mensheSta = w[i];
                System.out.println(mensheSta);
            }
        }

        System.out.println("ex 11.39(a");
        int e[] = new int[10];
        Random rnd1 = new Random();
        for(int i = 0; i<e.length; i++){
            e[i] = rnd1.nextInt(20);
            System.out.print(e[i] + " ");
        }
        System.out.println(" ");
        for(int i = 1; i<e.length; i+=2){
            System.out.print(e[i] + " ");
        }

        System.out.println("\nex 11.40");
        int r[] = new int[20];
        Random rnd2 = new Random();
        int r1[] = new int[20];
        int r2[] = new int[20];
        int i1 = 0;
        int i2 = 0;
        String pozitiv = "";
        String negativ = "";
        for(int i = 0; i<r.length; i++){
            r[i] = rnd2.nextInt(40)-20;
            System.out.print(r[i]+" ");
            if(r[i]>=0){
                r1[i1] = r[i];
                pozitiv = pozitiv + r1[i1] + " ";
                i1++;
            }
            if(r[i]<0){
                r2[i2] = r[i];
                negativ = negativ + r2[i2] + " ";
                i1++;
            }
        }
        System.out.print("\n"+pozitiv);
        System.out.print("\n" + negativ);

    }
}
