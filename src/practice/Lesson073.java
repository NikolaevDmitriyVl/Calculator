package practice;

import java.util.Random;

public class Lesson073 {
    public static void main(String[] args){
        System.out.println("ex 11.12(b");
        int q[] = new int[30];
        int w = 0;
        int i0 = 0;
        for(int i = 2; w<30; i++){
            boolean isNumberSimple = true;
            for(int e = 2; e<i;e++){
                if(i%e == 0){
                    isNumberSimple = false;
                    break;
                }
            }
            if(isNumberSimple == true){
                q[w] = i;
                w++;
            }
        }

        for(int i = 0; i<q.length; i++){
            System.out.print(q[i] + " ");
        }

        System.out.println("ex 11.19");
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(50);
        int r[] = new int[30];
        int summa = 0;
        int proizvedenie = 1;
        double kvadrat = 1;
        for(int i = 0;i<r.length; i++){
            r[i] = rnd.nextInt(50);
            summa = summa + r[i];
            proizvedenie = proizvedenie * r[i];
            kvadrat = kvadrat + Math.pow(r[i],2);
            System.out.print(r[i] + " ");
        }
        System.out.println();
        System.out.println(summa);
        System.out.println("proizvedenie = " + proizvedenie);
        System.out.println("summa kvadratov = " + kvadrat);

    }
}
