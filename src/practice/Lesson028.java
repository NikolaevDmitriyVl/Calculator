package practice;

public class Lesson028 {
    public static void main(String[] args){

        int[]  zarplata = {100, 97, 95, 120, 78, 132, 177, 54, 26};
        zarplata[8] = 126;
        zarplata[0] = zarplata[1] + zarplata[2]/2;
        int length = zarplata.length;

        System.out.println("ex 5.39");
        int a [] = {2,5,7,23,66,45,83,6,2, 7};
        int summa = 0;
        for(int i = 0; i<10; i++){
            summa = summa + a[i];
        }

        System.out.println("ex 5.40");
        int n = 8;
        double summa1 = 0;
        double a1[] = {1.3, 6.5 , 8.4, 9.5, 9.4, 8.4 , 9.4, 8.5};
        for(int i = 0; i < 8; i++){
            summa1 = summa1 + a1[i];
        }

        System.out.println("ex 5.41");
        int massa[] = {8, 3, 4, 665, 76, 24, 87, 97, 67, 57,34, 46};
        int summa2 = 0;
        for(int i = 0; i < 10; i++){
            summa2 = summa2 + massa[i];
        }
         System.out.println(summa2);

        System.out.println("ex 5.42");
        int ekzameni[] = {89,45,38,76};
        int summa3 = 0;
        for(int i = 0; i< ekzameni.length; i ++){
            summa3 = summa3 + ekzameni[i];
        }
        System.out.println(summa3);

        System.out.println("ex 5.43");
        int sotrudnikov = 7;
        int zarplata1[] = {87,467,478,90,34,54,65,};
        int summa4 =0;
        for(int i = 0; i <zarplata1.length; i++){
            summa4 = summa4 + zarplata1[i];
        }
        System.out.println(summa4);

        System.out.println("ex 5.44");
        

    }
}
