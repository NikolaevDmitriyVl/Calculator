package practice;

public class Lesson029 {
    public static void main(String[] args){
        System.out.println("ex 5.52");
        int ucheniki = 20;
        int ocenki[] = {3,3,4,5,4,3,3,4,4,5,5,4,4,5,5,3,3,4,4,4};
        double sredneeArifmeticheskoe = 0;
        int summa = 0;
        for(int i = 0; i<ocenki.length; i++){
            summa = summa + ocenki[i];

        }
        sredneeArifmeticheskoe = summa/ocenki.length;
        System.out.println(sredneeArifmeticheskoe);


        System.out.println("ex 5.53");
        int predmetov = 10;
        int ocenki1[] = {3,3,4,4,5,5,5,5,4,3};
        double sredneeArifmeticheskoe1 = 0;
        int summa1 = 0;
        for(int i = 0; i<ocenki1.length; i++){
            summa = summa + ocenki[i];
        }
        sredneeArifmeticheskoe1 = summa / ocenki.length;
        System.out.println(sredneeArifmeticheskoe1);


        System.out.println("ex 5.54");
        // ucheniki1 10;
        int ocenki2[] = {3,3,4,4,4,5,5,5,5,5};
        int summa2 = 0;
        double srednyayaOcenka = 0;
        for(int i = 0; i<ocenki2.length; i++ ){
            summa2 = summa2 + ocenki2[i];
        }
        srednyayaOcenka = summa2 / ocenki2.length;
        System.out.println(srednyayaOcenka);


        System.out.println("ex 5.55");
        int priedmeti = 4;
        int kolvoPr[]  = {5,4,6,8,};
        int summaPr = 0;

        for(int i = 0; i<kolvoPr.length; i++){
            summaPr = summaPr + kolvoPr[i];
        }
        double sredneeKolvo = summaPr/kolvoPr.length;
        System.out.println(sredneeKolvo);


        System.out.println("ex 5.56(a");




    }
}
