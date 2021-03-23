package practice.HomeWork092;

import java.util.Random;

public class HomeWork092 {
    public static void main(String[] args){
        System.out.println("ex 4.93");
        double y0 = 5;
        if (y0 < 2.5) {
            System.out.println("tochka popadaet v pervuyu oblast");
        }
        if (y0 > 2.5 && y0 < 5) {
            System.out.println("tochka popadaet vo vtoruyu oblast");
        }
        if (y0 > 5) {
            System.out.println("tochka popadaet v tretyu oblast");
        }

        System.out.println("ex 5.91");
        int n = 5;
        double summa0 = 0;
        double faktorial = 1;
        double x0 = 5;
        for(int i = 1; i<=n; i++){
            faktorial = faktorial * i;
            summa0 = summa0 + Math.pow(x0,i)/faktorial;
        }
        System.out.println(summa0 + 1);

        System.out.println("ex 6.112");
        int chislo = 123456;
        int cifra;
        int i0 = 0;
        int i1 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i0++;
            if (cifra == 3) {
                i1 = i0;
                break;
            }
        }
        if (i1 > 0) {
            System.out.println("cifra 3 v chilse " + i1 + " po chetu s prava");
        }
        if (i1 == 0) {
            System.out.println("cifra 3 v chisle otsutstvuet");
        }

        System.out.println("ex 7.112");
        int rost[] = new int[25];
        int znak = 1;
        int obshhiyRostM  = 0;
        int obshhiyRostZ = 0;
        int m = 0;
        int z = 0;
        Random rnd = new Random();
        for(int i = 0; i<rost.length; i++){
            rost[i] = rnd.nextInt(40)+150 * (znak);
            znak = znak * (-1);
            if (rost[i] > 0) {
                obshhiyRostZ = obshhiyRostZ + rost[i];
                z++;
            }
            if (rost[i] < 0) {
                obshhiyRostM = obshhiyRostM + (rost[i]*(-1));
                m++;
            }

        }
        int sredniyRostM = obshhiyRostM/m;
        int sredniyRostZ = obshhiyRostZ/z;
        if (sredniyRostM > sredniyRostZ) {
            System.out.println("sredniy rost malchikov boshse chem sredniy rost devochek");
        }
        if (sredniyRostZ > sredniyRostM) {
            System.out.println("sredniy rost devochek bolshe chem sredniy rost malchikov");
        }

        System.out.println("ex 8.23");
        int stoimostTovarov[] = {12,11,32,34,36};
        int tovari[][] = new int [5][6];
        Random rnd0 = new Random();
        for(int i = 0; i<5; i++){
            for(int j = 0; j<6; j++){
                tovari[i][j] = rnd0.nextInt(10);
            }
        }
        int summa = 0;
        int result = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<6; j++){
                summa = summa + tovari[i][j];
            }
            result = summa*stoimostTovarov[i];
            summa = 0;
            System.out.println(result);
        }

        System.out.println("ex 8.23(b");
        int obshhayaStoimost = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<6; j++){
                obshhayaStoimost = stoimostTovarov[i] * tovari[i][j];
                summa = summa + obshhayaStoimost;
            }
            System.out.println("obshhiy dohod za " + i + "den " + summa);
            summa = 0;
        }
        System.out.println("ex 8.23(c");
        int obshhiyDohod  = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<6; j++){
                obshhiyDohod = obshhiyDohod * tovari[i][j];

            }
        }





        System.out.println("ex 11.83");
        m = 120;// srednee arifmeticheskoe chisel menshe chisla 12
        int massiv[] = {12,13,14,15,16,17,18,19,20};
        summa = 0;
        i0=0;
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] < m) {
                summa = summa + massiv[i];
                i0++;
            }
        }
        int sredneeArif = summa/i0;
        System.out.println(sredneeArif);

        System.out.println("ex 12.13");
        int massiv2[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        //summa dvuh lyubih 3 stolbca
        summa = massiv2[massiv2.length-1][2] + massiv2[0][2];
        System.out.println(summa);
        //proizvedenie vtoroy stroki
        int proizvedenie = massiv2[1][massiv2[1].length-1] + massiv2[1][3];
        System.out.println(proizvedenie);

        System.out.println("ex 13.10");//??? boolean???
        //25 chel s/p , deti.. opr surname sem lyudey
        Semeynie family[] = new Semeynie[3];
        family[0] = new Semeynie();
        family[0].surname = "Ivanov";
        family[0].semPol = "holost";
        family[0].deti = "yes";

        family[1] = new Semeynie();
        family[1].surname = "Petrov";
        family[1].semPol = "zenat";
        family[1].deti = "yes";

        family[2] = new Semeynie();
        family[2].surname = "Nikolaev";
        family[2].semPol = "zenat";
        family[2].deti = "yes";

        System.out.print("zenat, imeet detey: ");
        for(int i = 0; i<family.length; i++){
            if(family[i].semPol == "zenat" && family[i].deti == "yes"){
                System.out.print(family[i].surname + " ");
            }
        }

        System.out.println("ex 4.94");
        int kolichestvoOchkov = 3;
        if (kolichestvoOchkov == 0) {
            System.out.println("proigrish");
        }
        if (kolichestvoOchkov == 1) {
            System.out.println("nichya");
        }
        if (kolichestvoOchkov == 3) {
            System.out.println("viigrish");
        }

        System.out.println("ex 5.92");
        summa0 = 0;
        for(int i = 1; i<=50; i++){
            summa0 = Math.sqrt(i) + Math.sqrt(i+1);
            System.out.println(summa0);
        }
        System.out.println("ex 6.113");
        chislo = 123456;
        cifra = 0;
        i0 = -1;
        int mm = 3;
        int massiv3[] = new int[6];
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;
            i0++;
            massiv3[i0] = cifra;
        }
        summa = 0;
        for(int i = 0; i<3; i++) {
            summa = summa + massiv3[i];
        }
            System.out.println(summa);

        System.out.println("ex 7.113");
    }
}