package practice;

import java.util.Random;

public class Lesson076 {
    public static void main(String[] args){
        System.out.println("ex 11.47");
        double q0[] = new double[7];
        Random rnd = new Random();
        double w0[] = new double[q0.length];
        for(int i = 0; i< q0.length; i++){
            q0[i] = rnd.nextInt(20);
            if(q0[i] > 10){
                w0[i] = Math.pow(q0[i],2);
            }
            else{
                w0[i] = q0[i];
            }
        }
        for(int i = 0; i<q0.length; i++){
            System.out.println(w0[i]);
        }
        System.out.println("ex 11.47");
        double e0[] = new double[q0.length];
        for(int i = 0; i<q0.length; i++){
            if (i % 2 == 0) {
                e0[i] = Math.abs(q0[i]);
            }
            else{
                e0[i] = q0[i];
            }
        }

        for(int i = 0; i< q0.length; i++){
            System.out.println(e0[i]);
        }

        System.out.println("ex 11.48");
        double r[] = new double[8];
        Random rnd1 = new Random();
        double y[] = new double[r.length];
        double k1 = 2;
        double k2 = 3;
        for(int i = 0; i<r.length; i++){
            r[i] = rnd.nextDouble()*20;
            if(r[i]>0){
                y[i] = r[i]-k1;
            }
            else{
                y[i] = r[i]-k2;
            }
        }
        for(int i = 0; i<r.length; i++){
            System.out.println(y[i]);
        }
        System.out.println("ex 11.48(b");
        double u0[] = new double[r.length];
        for(int i = 0; i<r.length; i++){
            if (i % 2 > 0) {
                u0[i] = r[i]+1;
            }
            if(i%2 == 0){
                u0[i] = r[i]-1;
            }
        }
        for(int i = 0; i<r.length; i++){
            System.out.println(u0[i]);
        }

        System.out.println("ex 11.49");
        double o[] = new double[10];
        double m1 = 2;
        double m2 = 3;
        for(int i = 0; i<o.length; i++){
            
        }
    }
}
