package practice.HomeWork114;

public class HomeWork114 {
    int summa(int a){
        int chislo = a;
        int cifra = 0;
        int i0 = 0;
        int summa = 0;
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;
            summa = summa+cifra;
    }
        return summa;
    }

    void nextDay(int day, int month, int year){
        int y = 0;
        int m = 0;
        int d = 0;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if (day == 31) {
                d = 1;
                m = month+1;
            }
            else{
                d = day+1;
                m = month;
            }
            if(month == 12){

                y = year + 1;
            }
            else{
                y = year;
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11 ){
            if (day == 30) {
                d = 1;
                m = month+1;
            }
            else{
                d = day + 1;
                m = month;
            }
                y = year;
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0) {
                if (day == 29) {
                    d = 1;
                    m = month + 1;
                } else {
                    d = day + 1;
                    m = month;
                }
                y = year;
            } else {
                if (day == 28) {
                    d = 1;
                    m = month + 1;
                } else {
                    d = day + 1;
                    m = month;
                }
                y = year;
            }
        }
        System.out.println("next day  = " + d + "." + m + "." + y);

    }
    void predydushchiyDen(int day, int month, int year){
        int y = 0;
        int m = 0;
        int d = 0;
        if(month == 5 || month == 7  || month == 10 || month == 12){
            if (day == 1) {
                d = 30;
                m= month-1;
            }
            else{
                d = day-1;
                m = month;
            }
            y = year;
        }
        else if(month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11 || month == 1){
            if (day == 1) {
                d = 31;
                m = month-1;
            }
            else{
                d = day - 1;
                m = month;
            }
            if (month == 1) {
                y = year-1;
            }
            else{
                y = year;
            }
        } else if (month == 3) {
            if(day == 1) {
                if (year % 4 == 0 && year % 100 != 0) {
                    d = 29;
                } else {
                    d = 28;
                }
                m = month-1;
            }
            else{
                y = day -1;
                m = month;
            }
            y = year;
        }
        System.out.println("predydushchiy den' = " + d + "." + m + "." + y);

    }
    int bolsheMenshe(int a,int b){
        int bolshee = 0;
        if (a > b) {
            bolshee = a;
        }
        else{
            bolshee = b;
        }
        return b;
    }
    public static void main(String args[]){
        System.out.println("ex 4.125");
        int chislo = 88;
        //mne n let
        if (chislo > 10 && chislo < 20 || chislo% 10 == 0 || chislo%10>4 && chislo%10<10) {
            System.out.println("Mne " + chislo + " let");
        }
        else if (chislo % 10 == 1) {
            System.out.println("Mne " + chislo + " god");
        }
        else if (chislo % 10 > 1 && chislo % 10 < 5) {
            System.out.println("Mne " + chislo + " goda");
        }

       /* System.out.println("ex 8.47");//???
        int giri[] = {100,200,300,500,1000,1200,1400,1500,2000,3000};
        int v = 1300;
        for(int i = 0; i<10; i++){
            for(int i2 = 0; i2<10; i2++){
                for(int i3 = 0; i3<10; i3++){
                    for(int i4 = 0; i4<10; i4++){
                        for(int i5 = 0; i5<10; i5++){
                            for(int i6 = 0; i6<10; i6++){
                                for(int i7 = 0; i7<10; i7++){
                                    for(int i8 = 0; i8<10; i8++){
                                        for(int i9 = 0; i9<10; i9++){
                                            for(int i10 = 0; i10<10; i10++){
                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
*/
        System.out.println("proverka 10^10 " + Math.pow(10,2));

        System.out.println("ex 10.22");//???
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int max = 0;
        HomeWork114 answer = new HomeWork114();
        int massiv[] = {one, two, three, four, five, six};
        for(int i = 0; i<massiv.length; i++){
            max = answer.bolsheMenshe(max,massiv[i]);
        }
        System.out.println(max);

        System.out.println("ex 11.101");//???
        int i0 = 0;
        int i1 = 0;
        int odinakovyeEhlementy =  0;
        int massiv2[] = {1,2,3,4,5,6,6,8,9,10,2,7,7};
        for(int i = 0; i<massiv2.length; i++){
            for(int j = 0; j<massiv2.length; j++){
                if(massiv2[i] == massiv2[j] && i!=j){
                    i0++;
                    odinakovyeEhlementy = massiv2[i];
                }
            }
            if (i0 == 1) {
                i1++;
            }
            i0 = 0;
            odinakovyeEhlementy = 0;
        }
        if (i1 > 1) {
            System.out.println("odinakovyh ehlementov bolshe odnoy pary");
        } else if (i1 == 1) {
            System.out.println("odinakovyh ehlementov odna para");
        } else if (i1 == 0) {
            System.out.println("odinakovyh ehlementov net");
        }


        System.out.println("ex 12.25(e");
        int massivDv[][] = new int[12][10];
        int x = 0;
        int sign = 1;
        for(int i = 0; i<massivDv[0].length; i++){
            for(int j = 0; j<massivDv.length; j++){
                x = x+1;
                if(sign == 1){
                massivDv[j][i] = x;
                }
                if(sign == -1){
                    massivDv[((j - 11) * (-1))][i] = x;
                }
            }
            sign = sign * (-1);
        }
        for(int i = 0; i<massivDv.length; i++){
            for(int j = 0; j<massivDv[0].length; j++){
                System.out.print(massivDv[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("ex 12.25(zh");
        int dvumMassiv[][] = new int[12][10];
        x = 0;
        for(int i = dvumMassiv.length-1; i>=0; i--){
            for(int j = 0; j< dvumMassiv[0].length; j++){
              x = x+1;
              dvumMassiv[i][j] = x;

            }
        }
        for(int i = 0; i<dvumMassiv.length; i++){
            for(int j = 0; j<dvumMassiv[0].length; j++){
                System.out.print(dvumMassiv[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("ex 12.25(z");
        int dvumMassiv2[][] = new int[12][10];
        x = 0;
        for(int i = dvumMassiv2[0].length-1; i>=0; i--){
            for(int j = 0; j<dvumMassiv2.length; j++){
              x = x+1;
              dvumMassiv2[j][i] = x;
                System.out.print(dvumMassiv2[j][i] + "\t");
            }
            System.out.println();
        }
        for(int i = 0; i<dvumMassiv2.length; i++){
            for(int j = 0; j<dvumMassiv2[0].length; j++){
                System.out.print(dvumMassiv2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ex 12.25(i");
        int dvumMassiv4[][] = new int[12][10];
        x = 0;
        for(int i = dvumMassiv4.length-1; i>=0; i--){
            for(int j = dvumMassiv4[0].length-1; j>=0; j--){
                x = x+1;
                dvumMassiv4[i][j] = x;
            }

        }
        for(int i = 0; i<12; i++){
            for(int j = 0; j<10; j++){
                System.out.print(dvumMassiv4[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ex 12.25(k");
        int dvumMassiv3[][] = new int[12][10];
        x = 0;
        sign = 1;
        for(int i = dvumMassiv3[0].length-1; i>=0; i--){
            for(int j = dvumMassiv3.length-1; j>=0; j--){
              x = x+1;
              if(sign == 1){
              dvumMassiv3[j][i] = x;
              }
              if(sign == -1){
                  dvumMassiv3[j][i] = x;
              }
            }
        }
        for(int i = 0; i<dvumMassiv3.length; i++){
            for(int j = 0; j<dvumMassiv3[0].length; j++){
                System.out.print(dvumMassiv3[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ex 13.20");
        PhoneBook n1 = new PhoneBook();
        n1.numberPhone = 1231;
        n1.surName = "Smirnov";

        PhoneBook n2 = new PhoneBook();
        n2.numberPhone  = 1232;
        n2.surName = "Ivanov";

        PhoneBook n3 = new PhoneBook();
        n3.numberPhone = 1233;
        n3.surName = "Petrov";

        PhoneBook spisok[] = new PhoneBook[3];
        spisok[0] = n1;
        spisok[1] = n2;
        spisok[2] = n3;
        for(int i = 0; i<spisok.length; i++){
            if(spisok[i].surName.equals("Petrov")){
                System.out.println(spisok[i].surName + " "+ spisok[i].numberPhone);
            }
        }

        System.out.println("ex 4.126");
        int k = 30;
        //1grib, 2,3,4 griba, 5,6,7,8,9 gribov, 10,20,30... gribov, 21 grib
        if (k % 10 == 1) {
            System.out.println("my nashli " + k + " grib v lesu");
        } else if (k % 10 > 1 && k % 10 < 5) {
            System.out.println("my nashli " + k + " griba v lesu");
        } else if (k % 10 > 4 && k % 10 < 10 || k % 10 == 0) {
            System.out.println("my nashli " + k + " gribov v lesu");
        }

        System.out.println("ex 8.48");//???
        int n = 98;
        int kupyury[] = {1,2,5,10};
        x = 0;


        System.out.println("ex 10.23");
        int year = 1999;
        int month = 9;
        int day = 1;
        HomeWork114 answer2 = new HomeWork114();
        answer2.predydushchiyDen(day, month , year);
        System.out.println("ex 10.23(b");
        answer2.nextDay(day, month, year);

        System.out.println("ex 11.102");
        i0 = 0;
        i1 = 0;
        int massiv1[] = {1,2,3,4,5,6,4,4,2};
        for(int i = 0; i<massiv1.length; i++) {
            for (int j = 0; j < massiv1.length; j++) {
                if (massiv1[i] == massiv1[j] && i != j) {
                    if (massiv1[i] == massiv1[j]) {
                        i0++;
                    }
                }
            }

            if (i0 == 1) {
                i1++;
                if(i1 == 1){
                System.out.println("odivakonvye ehlementy " + massiv1[i]);
                }
            }
            i0 = 0;
        }

        System.out.println("ex 12.25(l");
        int massiv5[][] = new int[12][10];
        x = 0;
        sign = 1;
        for(int i = massiv5.length-1; i>=0; i--){
            for(int j = 0; j<massiv5[0].length; j++){
                x = x+1;
                if(sign == 1){
                massiv5[i][j] = x;
                }
                else{
                    massiv5[i][(j-9) * (-1)] = x;
                }
            }
            sign = sign * (-1);
        }
        for(int i = 0; i<massiv5.length; i++){
            for(int j = 0; j<massiv5[0].length; j++){
                System.out.print(massiv5[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("ex 12.25(n");
        int massiv6[][] = new int[12][10];
         x = 0;
         sign = -1;
        for(int i = 0; i < massiv6.length; i++){
            for(int j = 0; j<massiv6[0].length; j++){
                x = x+1;
                if (sign == 1) {
                    massiv6[i][j] = x;
                }
                else{
                    massiv6[i][(j -9) * (-1)] = x;
                }
            }
            sign = sign * (-1);
        }

        for(int i = 0; i<massiv6.length; i++){
            for(int j = 0; j<massiv6[0].length; j++){
                System.out.print(massiv6[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("ex 12.25(n");
        int massiv7[][] = new int[12][10];
        x = 0;
        sign = 1;
        for(int i = massiv7[0].length-1; i>=0; i--){
            for(int j = 0; j < massiv7.length; j++){
                x = x+1;
                if(sign == 1){
                    massiv7[j][i] = x;
                }
                if (sign == -1) {
                    massiv7[(j-11) * (-1)][i] = x;
                }
            }
            sign = sign * (-1);
        }
        for(int i = 0; i<massiv7.length; i++){
            for(int j = 0; j<massiv7[0].length; j++){
                System.out.print(massiv7[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ex 13.21");//? elementi tipa zapis'?
        Uchashchiesya perechen[] = new Uchashchiesya[4];
        perechen[0] = new Uchashchiesya();
        perechen[0].name = "Ivan";
        perechen[0].surName = "Ivanov";
        perechen[0].address = "Ivanova 1";
        perechen[0].numberSchool = 1;
        perechen[0].clas = 1;

        perechen[1] = new Uchashchiesya();
        perechen[1].name = "Petr";
        perechen[1].surName = "Petrov";
        perechen[1].address = "Petrova 2";
        perechen[1].numberSchool = 2;
        perechen[1].clas = 2;

        perechen[2] = new Uchashchiesya();
        perechen[2].name = "Aleksey";
        perechen[2].surName = "Alekseev";
        perechen[2].address = "Alekseeva 10";
        perechen[2].numberSchool = 10;
        perechen[2].clas = 10;

        perechen[3] = new Uchashchiesya();
        perechen[3].name = "Nikolay";
        perechen[3].surName = "Nikolaev";
        perechen[3].address = "Nikolaeva 11";
        perechen[3].numberSchool = 11;
        perechen[3].clas = 11;

        Uchashchiesya zapis[] = new Uchashchiesya[perechen.length];
        i0 = 0;
        for(int i = 0; i<perechen.length; i++){
            if (perechen[i].clas == 10 || perechen[i].clas == 11) {
                zapis[i0] = perechen[i];
                i0++;
            }
        }
        for(int i = 0; i<zapis.length; i++){
            if(zapis[i] != null){
                System.out.print(zapis[i].surName + " " + zapis[i].name + " prozhivayushchiy po adresu: " + zapis[i].address + " uchashchiysya v shkole №" + zapis[i].numberSchool + " v " + zapis[i].clas + " klasse");
                System.out.println();
            }
        }

        System.out.println("ex 4.127");
        k = 120;
        int rubli = k/100;
        int kopeyki = k%100;
        //1 rubl', 2,3,4 rublya, 5,6,7,8,9rubley, 10,20,30rubley
        //1 kopeyka, 2,3,4 kopeyki, 5,6,7,8,9kopeek, 10,20,30kopeek
        if (rubli % 10 == 1) {
            System.out.print(rubli + " rubl' ");
        } else if (rubli % 10 > 1 && rubli % 10 < 5) {
            System.out.print(rubli + " rublya ");
        }
        else if(rubli % 10 >4 && rubli % 10 <10 || rubli % 10 == 0){
            System.out.print(rubli + " rubley ");
        }

        if (kopeyki % 10 == 1) {
            System.out.print(kopeyki + " kopeyka ");
        } else if (kopeyki % 10 > 1 && kopeyki % 10 < 5) {
            System.out.print(kopeyki + " kopeyki ");
        }
        else if(kopeyki % 10 >4 && kopeyki % 10 <10 || kopeyki % 10 == 0){
            System.out.print(kopeyki + " kopeek ");
        }

        System.out.println();



        System.out.println("ex 8.49");
        int m = 216;
        n = 50;
        //1,2,3,4
        int mas[] = new int[n];
        for(int i = 0; i<n; i++){
            mas[i] = answer.summa(i+1);
        }
        for(int i = 0; i<mas.length; i++){
            System.out.println((i+1) + " = " + mas[i]);
            if (Math.pow((double)mas[i], 3) == m) {
                System.out.println("kvadrat summy cifr chisla " + (i+1) + " raven chislu " + m);
            }
        }


    }
}
