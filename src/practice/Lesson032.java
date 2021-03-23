package practice;

public class Lesson032 {
    public static void main(String[] args){
        System.out.println("ex 5.70");
        int ameba = 1;
        for(int i = 3; i<= 24; i+=3 ){
            ameba = ameba * 2;
        }
        System.out.println(ameba);

        System.out.println("ex 5.71");
        double vklad = 1000;
        int srokVklada = 10;
        for(int i = 1; i<= 10; i++){
            double procentVmesyac = vklad/100*2;
            vklad = vklad + procentVmesyac;
        }
        System.out.println(vklad);

        System.out.println("ex 5.71(b");
        double vklad2 = 1000;
        int srokVklada2 = 12;
        for(int i = 1; i<= 12; i++){
            double procentVmesyac2 = vklad2/100*2;
            vklad2 = vklad2 + procentVmesyac2;
            if (i > 3 && i<=12){
            System.out.println(vklad2);
            }
        }

        System.out.println("ex 5.72");
        double den1 = 10;
        int vsegoDney = 10;
        double summa = 0;
        for(int i = 1; i<=10; i++){
            double procentNaKm = den1/100*10;
            den1 = den1 + procentNaKm;
            if(i>1 && i<= 10){
                System.out.println(den1);
            }
            if(i==1 && i<=7){
             summa = summa + den1;
            }
            System.out.println("ex 5.72(b");
            System.out.println(summa);
        }

        System.out.println("ex 5.72(b");


    }
}
