package practice;

public class Lesson045 {
    public static void main(String []args){
        System.out.println("ex 5.39");
        int summa = 0;
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i< a.length; i++){
            summa = summa + a[i];
        }
        System.out.println(summa);

        System.out.println("ex 5.40");
        double summa0 = 0;
        double q[] = {2.2,4.5,6.7,8.5};
        for(int i = 0; i<q.length; i++){
            summa0 = summa0 + q[i];
        }
        System.out.println(summa0);

        System.out.println("ex 5.41");
        int summa1 = 0;
        int massa[] = {12,6456,743,35,75,234,47,858,97,57,333,45};
        for(int i = 0; i<massa.length; i++){
            summa1 = summa1 + massa[i];
        }
        System.out.println(summa1);

        System.out.println("ex 5.42");
        int summa2 = 0;
        int ocenki[] = {3,3,4,5};
        for(int i = 0; i<ocenki.length; i++){
            summa2 = summa2 + ocenki[i];
        }
        System.out.println(ocenki);

        System.out.println("ex 5.43");
        int summa3 = 0;
        int zp[] = {35,645,754,235,35,43};
        for(int i = 0; i<zp.length; i++){
            summa3 = summa3 +zp[i];
        }
        System.out.println(summa3);

        System.out.println("ex 5.44");
        int summa4 = 0;
        int mass[] = {3542,645,745,422};
        for(int i = 0; i<mass.length; i++){
            summa4 = summa4 + mass[i];
        }
        System.out.println(summa4);

        System.out.println("ex 5.45");
        int summa5 = 0;
        int soprotivlenie[] = {434,435,645,233};
        for(int i =0; i<soprotivlenie.length; i++){
            summa5 = summa5 + soprotivlenie[i];
        }
        System.out.println(summa5);

        System.out.println("ex 5.68");
        int k = 4;
        int chisl1 = 1;
        int znam1 = 1;
        int chisl2 = 2;
        int znam2 = 1;
        int chisl = 0;
        int znam = 0;
        for(int i = 0; i<=k; i++){
            chisl = chisl1 + chisl2;
            znam = znam1 + znam2;
            System.out.println(chisl + "/" + znam );
            chisl2 = chisl1;
            chisl1 = chisl;
            znam2 = znam1;
            znam1 = znam;



        }
        System.out.println(chisl + "/" + znam);
        // 1. 1 + 1 = 2
        // 2/ 1 + 2 = 3
        //    2 + 3 = 5
    }
}
