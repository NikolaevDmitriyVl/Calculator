package practice;

public class HomeWork028 {
    public static void main(String[] args){
        System.out.println("ex 5.44");
        int massa[] = {87,43,98,54};
        int summa = 0;
        for(int i = 0; i<massa.length;i++){
            summa = summa + massa[i];
        }
        System.out.println(summa);

        System.out.println("ex 5.45");
        int soprotivlenie[] = {8,4,5,2};
        int summa1 = 0;
        for(int i = 0; i<soprotivlenie.length;i++){
            summa1 = summa1 + soprotivlenie[i];
        }
        System.out.println(summa1);

        System.out.println("ex 5.47");
        int a[] = {1,2,3,4,5,6};
        int proizvedenie = 1;
        for(int i = 0; i<a.length; i++){
            proizvedenie = proizvedenie*a[i];
        }
        System.out.println(proizvedenie);

        System.out.println("ex 5.48");
        int a1[] = {1,2,3,4,5,6};
        double summa2 = 0;
        for(int i = 0; i<a1.length; i++){
            summa2 = summa2 + Math.pow(a1[i],2);
        }
        System.out.println(summa2);

        System.out.println("ex 5.49");
        int n = 4;
        double q[] = {8.5,3.8,5.2,7.9};
        double summa3 = 0;
        for(int i = 0; i<q.length; i++){
            summa3 = summa3 + Math.pow(q[i],2);
        }
        System.out.println(summa3);


        System.out.println("ex 5.50");
        double a2[] = {1,2,3,4,5,6,7,8,9,10};
        double summa4 = 0;
        double sredneeArifmeticheskoe = 0;
        for(int i = 0; i<a2.length;i++){
            sredneeArifmeticheskoe = (summa4+a2[i])/a2.length;
        }
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 5.51");
        int n1 = 3;
        double a3[] = {6.7,4.8,9.3};
        int summa5 = 0;
         double sredneeArifmeticheskoe1 = 1;
        for(int i = 0; i<a3.length; i++){
        sredneeArifmeticheskoe1 = (summa5+a3[i])/n1;
        }
        System.out.println(sredneeArifmeticheskoe1);

        System.out.println("ex 5.52");
        int ucheniki = 20;
        double ocenki[] = {3,3,4,5,4,3,3,4,4,5,5,4,4,5,5,3,3,4,4,4};
        double sredneeArifmeticheskoe2 = 0;


    }
}
