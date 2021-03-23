package practice;

public class Lesson049 {
    public static void main(String[] args){
        System.out.println("ex 5.70");
        int summa = 1;
        int delitsyaNa = 2;
        for(int i = 0; i < 24; i+= 3){
            summa =  summa * delitsyaNa;
            System.out.println(summa);
        }

        System.out.println("ex 5.71");
        double vklad = 1000;
        double summaVklada = 1000;
        for(int i = 0; i<10; i++){
            summaVklada = summaVklada * 1.02;
            System.out.println(summaVklada);
        }

        System.out.println("ex 5.72");
        double den1 = 10;
        double pribavka = 10;
        for(int i = 2; i<den1; i++){
            pribavka = pribavka * 1.1;
            System.out.println(pribavka);
        }

        System.out.println("ex 5.72(b");
        double pribav = 10;
        double summa1 = 0;
        for( int i = 0; i<7; i++){
            pribav = pribav * 1.1;
            summa1 = summa1 + pribav;
        }
        System.out.println(summa1);

        System.out.println("ex 5.73");
        double uchastok = 100;
        double srednyayaUrozayanost = 20;

        for(int i = 2; i<8 ; i++){
            uchastok =uchastok * 1.05;
            srednyayaUrozayanost = srednyayaUrozayanost * 1.02;

        }
    }
}
