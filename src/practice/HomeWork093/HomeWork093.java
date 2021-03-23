package practice.HomeWork093;

import java.util.Random;

public class HomeWork093 {

    public double function01(){
        double x01 = ((15 + Math.sqrt(8)) / (8 + Math.sqrt(15))) + ((6 + Math.sqrt(12)) / (12 + Math.sqrt(6))) + ((7 + Math.sqrt(21)) / (21 + Math.sqrt(7)));
                return x01;
    }

    public double function02(){
        double x02 = ((1 + Math.sin(4)) / (4 + Math.sin(1))) + ((7 + Math.sin(5)) / (5 + Math.sin(7))) + ((3 + Math.sin(2)) / (2 + Math.sin(3)));
        return x02;
    }





    public static void main(String[] args){
        System.out.println("ex 4.95");
        int vesBoxera = 80;
        if (vesBoxera <= 60) {
            System.out.println("legkiy ves");
        }
        if (vesBoxera > 60 && vesBoxera <= 64) {
            System.out.println("perviy polusredniy ves");
        }
        if(vesBoxera < 64 && vesBoxera<=69){
            System.out.println("polusredniy ves");
        }

        System.out.println("ex 5.93");
        int n = 5;
        double q01 = 0;
        double q02 = 0;
        for(int i = 1; i<=n; i++){
            q01 = q01 + Math.sin(i);
            q02 = 1/q01;
        }
            System.out.println(q02);
        System.out.println("ex 5.93(b");//???

        System.out.println("ex 5.93(c");
        n = 5;
        double a1 = 0;
        double a2 = 0;
        double a3 = 0;
        for(int i = 1; i<=5; i++){
            a1 = a1 + Math.cos(i);
            a2 = a2 + Math.sin(i);
            a3 = a3 + (a1/a2);
        }
        System.out.println(a3);

        System.out.println("ex 5.93(d");//???
        double result = Math.sqrt(2);
        for (int i = 0; i < 10; i++) {
            result =2 + Math.sqrt(result);
        }

        System.out.println("ex 6.114");
        int chislo = 125;
        int otvet = 0;
        for(int i = chislo ; i>0; i--){
            if (chislo % i == 0 && i != 1) {
                otvet = i;
            }
        }
        System.out.println(otvet);

        System.out.println("ex 7.113");
        double chisla[] = {1.1,2.2,3.3,4.4,5.5,6.6};
        int i0 = 0;
        double summa0 = 0;
        for(int i = 0; i<chisla.length; i++){
            if (chisla[i] < 10) {
                summa0 = summa0 + chisla[i];
                i0++;
            }
        }
        double sredneeArifmeticheskoe = summa0/i0;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 8.24");
        int gruppa1[] = new int[20];
        int gruppa2[] = new int[20];
        int gruppa3[] = new int[20];
        Random rnd = new Random();
        int sr1 = 0;
        int sr2 = 0;
        int sr3 = 0;
        for(int i = 0; i<gruppa1.length; i++){
            gruppa1[i] = rnd.nextInt(10);
            gruppa2[i] = rnd.nextInt(10);
            gruppa3[i] = rnd.nextInt(10);
        }

        System.out.println("ex 10.1(c");
        HomeWork093 homeWork = new HomeWork093();
        double a01 =  homeWork.function01();
        System.out.println(a01);

        System.out.println("ex 10.2(d");
        HomeWork093 homeWork2 = new HomeWork093();
        double a02 = homeWork2.function02();
        System.out.println(a02);


        System.out.println("ex 11.84");

        System.out.println("ex 12.14");

        System.out.println("ex 13.11");

    }
}