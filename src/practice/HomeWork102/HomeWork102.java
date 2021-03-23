package practice.HomeWork102;

import java.util.Random;

public class HomeWork102 {
    public void funkciya
        (double tochka1X,
                double tochka1Y,
        double tochka2X,
        double tochka2Y,
        double tochka3X,
        double tochka3Y){
        double katet1St1 = (tochka1X - tochka2X);
        if (katet1St1 < 0) {
            katet1St1 = katet1St1 * (-1);
        }
        double katet2St1 = (tochka1Y - tochka2Y);
        if (katet2St1 < 0) {
            katet2St1 = katet2St1 * (-1);
        }
        double gipotenuzaSt1 = Math.sqrt(Math.pow(katet1St1,2) + Math.pow(katet2St1,2));
        double katet1St2 = (tochka1X - tochka3X);
        if (katet1St2 < 0) {
            katet1St2 = katet1St2 * (-1);
        }
        double katet2St2 = (tochka1Y - tochka3Y);
        if (katet2St2 < 0) {
            katet2St2 = katet2St2 * (-1);
        }
        double gipotenuzaSt2 = Math.sqrt(Math.pow(katet1St2,2) + Math.pow(katet2St2,2));
        double katet1St3 = (tochka2X - tochka3X);
        if (katet1St3 < 0) {
            katet1St3 = katet1St3 * (-1);
        }
        double katet2St3 = (tochka2Y - tochka3Y);
        if (katet2St3 < 0) {
            katet2St3 = katet2St3 * (-1);
        }
        double gipotenuzaSt3 = Math.sqrt(Math.pow(katet1St3,2) + Math.pow(katet2St3,2));
        System.out.println("storona 1 = " + gipotenuzaSt1 + " storona 2 = " + gipotenuzaSt2 + " storona 3 " + gipotenuzaSt3 + " perimetr = " + (gipotenuzaSt1 + gipotenuzaSt2 + gipotenuzaSt3));
        //postavit ifi gde minusi
    }

    public static void main(String[] args){
        System.out.println("ex 4.106");
        int mesyac = 4;
        if (mesyac == 12 || mesyac == 1 || mesyac == 2) {
            System.out.println("winter");
        } else if (mesyac == 3 || mesyac == 4 || mesyac == 5) {
            System.out.println("spring");
        } else if (mesyac == 6 || mesyac == 7 || mesyac == 8) {
            System.out.println("summer");
        }
        else{
            System.out.println("autumn");
        }
        System.out.println("ex 7.123");
        int etapi[] = new int[22];
        Random rnd = new Random();
        for(int i = 0; i<etapi.length-1; i++){
            etapi[i] = rnd.nextInt(10)+10;
        }
        int maximum = 0;
        int minimum = 1000*1000;
        int i1 = 0;
        int i2 = 0;
        for(int i  = 0; i<etapi.length-1; i++){
            if(maximum<etapi[i]){
                maximum = etapi[i];
                i1 = i;
            }
            if(minimum> etapi[i]){
                minimum = etapi[i];
                i2 = i;
            }
            if (i1 > i2) {
                System.out.println("etap na kotorom on viigral bil ranshe chem etap na kotorom on proigral");
            }
            else{
                System.out.println("etap na kotorom on viigral bil pozve chem etap na kotorom on proigral");
            }

        }
        System.out.println("ex 8.33");
        int summa = 0;
        int summaKonechnaya = 0;
        for(int i = 50; i<=70; i++){
            for(int j = 1; j<=i; j++){
                if (i % j == 0) {
                    summa = summa + i;
                }
            }
            summaKonechnaya = summa;
            summa = 0;
        }
        System.out.println("summa deliteley cifr ot 50 do 70 = " + summaKonechnaya);

        System.out.println("ex 10.9");
        HomeWork102 otwet = new HomeWork102();


        double tochka1X = 1;
        double tochka1Y = 1;
        double tochka2X = 3;
        double tochka2Y = 7;
        double tochka3X = 6;
        double tochka3Y = 2;
        otwet.funkciya(tochka1X,tochka1Y, tochka2X, tochka2Y, tochka3X, tochka3Y);



        System.out.println("ex 11.89");
        int rost[] = new int[30];
        Random malchikiMinus = new Random();
        Random devochkiPlyus = new Random();
        int summaMalchiki = 0;
        int summaDevochki = 0;
        for(int i = 0; i<rost.length-2; i++){
            rost[i] = (malchikiMinus.nextInt(50)+150) *(-1);
            rost[i+1] = devochkiPlyus.nextInt(50)+130;
            summaMalchiki = summaMalchiki   + (rost[i] * (-1));
            summaDevochki = summaDevochki + rost[i+1];
        }
        System.out.println("summaMalchiki = " + summaMalchiki);
        System.out.println("summa devochki = " + summaDevochki );
        if((summaMalchiki/15) > ((summaDevochki/15 + 10))){
            System.out.println("sredniy rost malchikov previshaet sredniy rost devochek bolee chem na 10 sm");
        }
        else{
            System.out.println("sredniy rost malchikov ne previshaet sredniy rost devochek bolee chem na 10 sm");
        }
        System.out.println("ex 12.17");
        int dvumMassiv[][] = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        if(dvumMassiv[dvumMassiv.length-1][dvumMassiv[dvumMassiv.length-1].length-1] > dvumMassiv[dvumMassiv.length-1][0]){
        System.out.println("element v pravom niznem uglu bolshe chem element v levom niznem uglu massiva");
        }
        if(dvumMassiv[dvumMassiv.length-1][0] > dvumMassiv[dvumMassiv.length-1][dvumMassiv[dvumMassiv.length-1].length-1]){
            System.out.println(" element v levom niznem uglu bolshe chem element v pravom niznem uglu");
        }

        System.out.println("ex 13.12");
        Sotrudniki sotrudniki[] = new Sotrudniki[5];
        sotrudniki[0] = new Sotrudniki();
        sotrudniki[0].surName = "Petrov";
        sotrudniki[0].name = "Petr";
        sotrudniki[0].patronymic = "Petrovich";
        sotrudniki[0].address = "Krasnostudencheskiy Proezd 1";
        sotrudniki[0].dateOfEmployment = 1998;

        sotrudniki[1] = new Sotrudniki();
        sotrudniki[1].surName = "Ivanov";
        sotrudniki[1].name = "Ivan";
        sotrudniki[1].patronymic = "Ivanovich";
        sotrudniki[1].address = "Priorova 40";
        sotrudniki[1].dateOfEmployment = 2001;

        sotrudniki[2]  = new Sotrudniki();
        sotrudniki[2].surName = "Sidorov";
        sotrudniki[2].name = "Sidor";
        sotrudniki[2].patronymic = "Sidorovich";
        sotrudniki[2].address = "dubki 2";
        sotrudniki[2].dateOfEmployment = 1992;

        sotrudniki[3] = new Sotrudniki();
        sotrudniki[3].surName = "Egorov";
        sotrudniki[3].name = "Egor";
        sotrudniki[3].patronymic = "Egorovich";
        sotrudniki[3].address = "Zivopisnaya 5";
        sotrudniki[3].dateOfEmployment = 2015;

        sotrudniki[4] = new Sotrudniki();
        sotrudniki[4].surName = "Vladimirov";
        sotrudniki[4].name = "Vladimir";
        sotrudniki[4].patronymic = "Vladimirovich";
        sotrudniki[4].address = "Vrachebniy pr 8k2";
        sotrudniki[4].dateOfEmployment = 2016;
        for(int i = 0; i<sotrudniki.length; i++){
            if (2020 - sotrudniki[i].dateOfEmployment > 3) {
                System.out.println(sotrudniki[i].surName + " " + sotrudniki[i].name + " " + sotrudniki[i].patronymic + " " + sotrudniki[i].dateOfEmployment);
            }
        }

    }
}
