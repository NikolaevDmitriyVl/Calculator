package practice;

public class Lesson030 {
    public static void main(String[] args){
        System.out.println("ex 5.59");
        // 2 klassa
        int klass1[] = {12,11,15,11,13,14,12,13,14,15,13,16,15,12,13,13,14,13,14,12};
        int klass2[] = {11,13,14,13,11,12,13,12,14,15,14,13,12,11,15,14,12,13,12,14};
        int summa1Kl = 0;
        int summa2Kl = 0;
        double srednyaya1 = 1;
        double srednyaya2 = 1;
        for(int i = 0; i<20; i++) {
        summa1Kl = summa1Kl + klass1[i];
        srednyaya1 = summa1Kl/20;
        summa2Kl = summa2Kl + klass1[i];
        srednyaya2 = summa2Kl/20;
        }
        System.out.println("sredniy vozrast klass 1 = " + srednyaya1);
        System.out.println("sredniy vozrast klass 2 = " + srednyaya2);


        System.out.println("ex 5.60");
        int yanvar[] = {13,24,55};
        int mart[] = {66,45,23};
        int summa1 = 0;
        int summa2 = 0;
        double srednyaya10 = 1;
        double srednyaya20 = 1;
        for(int i = 0; i< 3; i++){
            summa1 = summa1 + yanvar[i];
            srednyaya10 = summa1/3;
            summa2 = summa2 + mart[i];
            srednyaya20 = summa2/3;
        }
        System.out.println("osadki za yanvar = " + srednyaya10);
        System.out.println("osadki za mart = " + srednyaya20);


        System.out.println("ex 5.61");
        int klassA[] = {123,145,165};
        int klassB[] = {145,134,167};
        int summaKlassa1 = 0;
        int summaKlassa2 = 0;
        double sredniyRost1 = 1;
        double sredniyRost2 = 1;
        for(int i = 0; i< 3; i++){
            summaKlassa1 = summaKlassa1 + klassA[i];
            sredniyRost1 = summaKlassa1/3;
            summaKlassa2 = summaKlassa2 + klassA[i];
            sredniyRost1 = summaKlassa2/3;
        }
        System.out.println(sredniyRost1);
        System.out.println(sredniyRost2);


        System.out.println("ex 5.62");
        int ocenki1[] = {5,4,5,3};
        int ocenki2[] = {3,4,4,3};
        int summaA = 0;
        int summaB = 0;
        int srednyayaOcenka1 = 1;
        int srednyayaOcenka2 = 1;
        for(int i = 0; i<4; i++){
            summaA = summaA + ocenki1[i];
            srednyayaOcenka1 = summaA/4;
            summaB = summaB = ocenki2[i];
            srednyayaOcenka2 = summaB/4;
        }
        System.out.println(srednyayaOcenka1);
        System.out.println(srednyayaOcenka2);


    }
    }