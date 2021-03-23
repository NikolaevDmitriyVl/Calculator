package practice.HomeWork103;

import java.util.Random;

public class HomeWork103 {
    public void funkciya(double a, double b, double c, double d, double e, double f, double g){
        double poluPerimetr1 = ((a+b+g) / 2);
        double p1 = Math.sqrt(poluPerimetr1 * (poluPerimetr1 -a) * (poluPerimetr1 -b) * (poluPerimetr1 -g));
        double poluPerimetr2 = ((c+ g + f) / 2);
        double p2 = Math.sqrt(poluPerimetr2 *(poluPerimetr2 -c) * (poluPerimetr2 - g) * (poluPerimetr2 -f));
        double poluPerimetr3 = ((e + d + f) / 2);
        double p3 = Math.sqrt(poluPerimetr3 * (poluPerimetr3 - e) * (poluPerimetr3 -d) * (poluPerimetr3 -f));
        double s = p1 + p2 + p3;
        System.out.println(s);
    }
    public static void main(String[] args){
        System.out.println("ex 4.107(a");
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }
        System.out.println("ex 4.107(b");
        boolean visokosniy = true;
        month = 2;
        switch(month){
            case 1:
                System.out.println("31");
                break;
            case 2:
                if (visokosniy == true) {
                    System.out.println("29");
                    break;
                }
                else{
                    System.out.println("28");
                    break;
                }
            case 3:
                System.out.println("31");
            case 4:
                System.out.println("30");
            case 5:
                System.out.println("31");
            case 6:
                System.out.println("30");
            case 7:
                System.out.println("31");
            case 8:
                System.out.println("31");
            case 9:
                System.out.println("30");
            case 10:
                System.out.println("31");
            case 11:
                System.out.println("30");
            case 12:
                System.out.println("31");
        }
            System.out.println("ex 7.124");
        int massiv[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20,20};
        int cifra = 0;
        int i0 = 1;
        for(int i = 0; i<massiv.length-1; i++){
            if (massiv[i] == massiv[i+1]) {
                cifra = massiv[i];
                i0++;
            }
        }
        System.out.println("povtoryayushhayasya cifra = " + cifra + " kolichestvo povtoreniy cifri = " + i0 + " kolichestvo ostalnih cifr = " + (massiv.length - i0));
        System.out.println("ex 8.34");
        int summa = 0;
        for(int i = 100; i<=300; i++){
            for(int j = 1; j<i; j++){
                if (i % j == 0) {
                    System.out.println(i + " " + j);
                    summa = summa + j;
                }
            }
            if (summa == 50) {
                System.out.println(i);
            }
            summa = 0;
        }
        System.out.println("ex 10.10");
        HomeWork103 otvet = new HomeWork103();
        double a = 5;
        double b = 5;
        double c = 5;
        double d = 5;
        double e = 5;
        double f = 5;
        double g = 5;
        otvet.funkciya(a,b,c,d,e,f,g);
        //System.out.println(answer);

        System.out.println("ex 11.90");
        int massiv2[] = new int[10];
        i0 = 0;
        Random rnd = new Random();
        for(int i = 0; i<massiv2.length; i++){
            massiv2[i] = rnd.nextInt(20)+5;
            if (massiv2[i] > massiv2.length) {
                i0++;
            }
        }
        System.out.println(i0);
        
        System.out.println("ex 12.18");
        System.out.println("ex 13.13");

        System.out.println("ex 4.108");
        int mast = 3;
        switch(mast){
            case 1:
                System.out.println("piki");

        case 2:
            System.out.println("trefi");
            case 3:
                System.out.println("bubni");
            case 4:
                System.out.println("chervi");
    }
        System.out.println("ex 7.125");
        i0 = 0;
        int i1 = 0;
        int posledovatelnost[] = {1,2,2,4,5,6,7,9,9,9};
        for(int i = 0; i<posledovatelnost.length-1; i++){
            if(posledovatelnost[i]<posledovatelnost[i+1]){
                i0++;
            }
        }
        System.out.println(i0+1);
        System.out.println("ex 8.35");
        summa = 0;
        for(int i = 300; i<=600; i++){
            for(int j = 1; j<=i; j++){
                if (i % j == 0) {
                    summa = summa + j;
                }
            }
            if (summa % 10 == 0) {
                System.out.println(i);
            }
            summa = 0;
        }
        //System.out.println("ex 10.");
        double a1 = 5;
        double b1 = 5;
        double c1 = Math.sqrt(Math.pow(a1,2)+ Math.pow(b1,2));
        double p = (a1 + b1 + c1) / 2;
        double s1 = Math.sqrt(p * (p-a1) * (p-b1) * (p-c1));
        System.out.println("ploshhad " + s1);
    }
}
