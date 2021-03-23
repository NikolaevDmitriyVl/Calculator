package practice;

public class HomeWork047 {
    public static void main(String[] args){
        System.out.println("ex 5.57");
        double uchenik1[] = {3,2,4,5};
        double uchenik2[] = {4,4,5,3};
        double summa1 = 0;
        double summa2 = 0;
        for(int i = 0; i<uchenik1.length;i++){
            summa1 = summa1+uchenik1[i];
        }
        for(int i = 0; i<uchenik2.length; i++){
            summa2 = summa2 + uchenik2[i];
        }
        System.out.println("summa pervogo uchenika = " + summa1 + " summa vtorogo uchenika = " + summa2);

        System.out.println("ex 5.58");
        int sportsmen1[] = {8,5,6,3,4};
        int sportsmen2[] = {5,6,3,7,1};
        int summa1sp = 0;
        int summa2sp = 0;
        for(int i = 0; i<sportsmen1.length; i++){
            summa1sp = summa1sp + sportsmen1[i];
        }
        for(int i = 0; i<sportsmen2.length; i++ ){
            summa2sp = summa2sp + sportsmen2[i];
        }
        System.out.println("summa 1 sportsmena = " + summa1sp);
        System.out.println("summa 2 sportsmena = " + summa2sp);

        System.out.println("ex 5.59");
        double klass1[] = {13,12,12,13.5,14.2,13.5,12.6,15,13,12,9};
        double klass2[] = {9.2,8.6,8.3,9.5,8.5,7.9,8.1,9.4,8.5,7.6};
        double summa1kl = 0;
        double summa2kl = 0;
        double sredniyVozrast1 = 0;
        double sredniyVozrast2 = 0;
        for(int i = 0; i<klass1.length; i++){
            summa1kl = summa1kl + klass1[i];
        }

        for(int i = 0; i<klass2.length; i++){
            summa2kl = summa2kl + klass2[i];
        }
        sredniyVozrast1 = summa1kl / klass1.length;
        sredniyVozrast2 = summa2kl / klass2.length;
        System.out.println("sredniy vozrast klassa 1 " + sredniyVozrast1);
        System.out.println("sredniy vozrast klassa 2 " + sredniyVozrast2);

        System.out.println("ex 5.60");
        int osadkiYanvar[] = {12,23,34,53};
        int osadkiMart[] = {312,432,543,543};
        int summaYanvar = 0;
        int summaMart = 0;
        int srednieYanvar = 0;
        int srednieMart = 0;
        for(int i = 0; i< osadkiYanvar.length; i++){
            summaYanvar = summaYanvar + osadkiYanvar[i];
        }
        srednieYanvar = summaYanvar/osadkiYanvar.length;
        for(int i = 0; i<osadkiMart.length; i++){
            summaMart = summaMart + osadkiMart[i];
        }
        srednieMart = summaMart/osadkiMart.length;
        System.out.println("kolichestvo osadkov za yanvar " + srednieYanvar);
        System.out.println("kolichestvo osadkov za mart " + srednieMart);

        System.out.println("ex 5.61");
        int kl1[] = {123,134,126,130,149};
        int kl2[] = {128,137,125,127,131};
        int summaK1 = 0;
        int summaK2 = 0;
        int sredniyRost1 = 0;
        int sredniyRost2 = 0;
        for(int i  = 0; i<kl1.length; i++){
            summaK1 = summaK1 + kl1[i];
        }
        sredniyRost1 = summaK1/ kl1.length;
        for(int i = 0; i<kl2.length;i++){
            summaK2 = summaK2 + kl2[i];
        }
        sredniyRost2 = summaK2/ kl2.length;
        System.out.println("sredniy rost klass 1 = " + sredniyRost1);
        System.out.println("sredniy rost klass 2 = " + sredniyRost2);

        System.out.println("ex 5.62");
        double k1[] = {2,3,4,5,4};
        double k2[] = {3,4,3,4,5};
        double summak1 = 0;
        double summak2 = 0;
        double srednyayaOcenka1 = 0;
        double srednyayaOcenka2 = 0;
        for(int i = 0; i<k1.length; i++){
            summak1 = summak1 + k1[i];

        }
        System.out.println(summak1);
        srednyayaOcenka1 = summak1 / k1.length;
        for(int i = 0; i<k2.length; i++){
            summak2 = summak2 + k2[i];
        }
        srednyayaOcenka2 = summak2 / k2.length;
        System.out.println("srednyaya ocenka klassa1 = " + srednyayaOcenka1);
        System.out.println("srednyaya ocenka klassa2 = " + srednyayaOcenka2);

        System.out.println("ex 5.63");
        //oblast = 10 rayonov
        int ploshhad[] = {23,43,65,78,23,54,76,45,87,34};
        int summaPl = 0;
        int summaUr = 0;
        for(int i = 0; i<ploshhad.length; i++){
        summaPl = summaPl + ploshhad[i];
        }
        int srednyayaUrozaynost[] = {500,421,64,6436,654,8678,9657,3465,765,345};//centnerov
        for(int i = 0; i<srednyayaUrozaynost.length; i++){
            summaUr = summaUr + srednyayaUrozaynost[i];
            int kolvoPshenici = summaUr * summaPl;
            int sredUrOb = summaPl/(kolvoPshenici /100);
            System.out.println(kolvoPshenici);
            System.out.println(sredUrOb);
        }
    }
}
