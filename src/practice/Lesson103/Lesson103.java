package practice.Lesson103;

public class Lesson103 {
    public boolean funkciya(int chislo){
        int i0 = 0;
        for(int i = 1; i<=chislo; i++) {
            if (chislo % i == 0) {
                i0++;
            }

        }
        if (i0 == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println("ex 10.15");
        Lesson103 lesson = new Lesson103();
        boolean isNumberSimple;

        for(int i = 100; i<1000; i++){
            //isNumberSimple = lesson.funkciya(i);
            //isNumberSimple == true){
            if(lesson.funkciya(i) == true){
                System.out.println(i + " prostoe chislo " + lesson.funkciya(i) );
            }
        }

        System.out.println("ex 10.16");
        int massiv[] = new int[200];
        int i1 = 0;
        int i0 = 0;
        for(int i = 1; i<=200; i++){
if(lesson.funkciya(i) == true){
    massiv[i0] = i;
    i0++;
}
        }

        for(int i = 0; i<199; i++){
            if((massiv[i]+2) == massiv[i+1]){
                System.out.println(massiv[i] + " , " + massiv[i+1] + " yavlyayutsya chislami bliznecami");
            }
        }

        System.out.println("zadacha");
        int chislo = 0;
        int cifra = 0;
        int summa = 0;
        int max = 0;
        for(int i = 1; i<=1000; i++){
            if(lesson.funkciya(i) == true){
                chislo = i;
                cifra = 0;
                summa = 0;
                max = 0;
                i1 = 0;
                while (chislo > 0) {
                    cifra = chislo%10;
                    chislo = chislo/10;
                    summa = summa + cifra;
                }
                if (max < summa) {
                    max = summa;
                    i1 = i;
                }
                summa = 0;
            }
        }
        System.out.println("chislo " + i1 + " summa = " + max);


    }
}
