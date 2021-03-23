package practice.HomeWork123;

import sun.security.util.ArrayUtil;

import java.sql.SQLOutput;
import java.util.Random;

public class HomeWork123{
    int percent(String one, char bukva){
        char one1[] = one.toCharArray();
        int i0 = 0;
        for(int i = 0; i<one1.length; i++){
            if(one1[i] == bukva){
                i0++;
            }
        }
         return i0;
    }

    public static void main(String[] args) {
        System.out.println("ex 8.48");
        System.out.println("ex 9.33");
        String probel = "пробел";
        char probel2[]  = probel.toCharArray();
        for(int i = 0; i<probel2.length; i++) {
            String a00 = "" + probel2[i];

            if (a00.equals("б")) {
                probel2[i] = 'д';
            }
        }
        String text = String.valueOf(probel2);
        System.out.println(text);
        System.out.println("ex 9.34");
        String stroka = "stroka";
        char strok[] = stroka.toCharArray();
        for(int i = 0; i<strok.length; i++){
            if(strok[i] == 'k'){
                strok[i] = 'f';
            }
        }
        stroka = String.valueOf(strok);
        System.out.println(stroka);
        System.out.println("ex 9.35");
        String muha = "muha";
        String slon = "slon";
        char muh[] = muha.toCharArray();
        char slo[] = slon.toCharArray();
        for(int i = 0; i<muh.length; i++){
            muh[i] = slo[i];
        }
        System.out.println(muh);
        System.out.println("ex 9.36");
        String tetrad = "тетрадь";
        String dnevnik = "дневник";
        for(int i = 0; i<tetrad.length(); i++){
            char newWord = dnevnik.charAt(i);
            char n[] = new char[tetrad.length()];
            n[i] =  newWord;
        }
        String str = "Java";
        char c = str.charAt(2);
        System.out.println(c);





        System.out.println("ex 10.30");
        String one = "predlozhenie one";
        String two = "predlozhenie two";
        char bukva = 'n';

        HomeWork123 answer = new HomeWork123();
        double percentOne = (double)answer.percent(one, bukva) /((double)one.length() /100);
        double percentTwo = (double)answer.percent(two, bukva) /((double)two.length() /100);

        if (percentOne > percentTwo) {
            System.out.println("v predlozhenii one % bukvy " + bukva + " bol'she ");
        }
        else  {
            System.out.println("v predlozhenii two % bukvy " + bukva + " bol'she ");
        }




        System.out.println("ex 11.107");

        int mass[]  = {1,2,3,4,5,6,7,8,9,10};
        int max = 0;
        int indexMax = 0;
        for(int i= 0; i<mass.length; i++){
            if(max<= mass[i]){
                max = mass[i];
                indexMax = i;
            }
        }
        System.out.println("maximal'nyy ehlement = " + max);
        System.out.println("ex 11.107(b");
        int min = max;
        int indexMin = 0;
        for(int i = 0; i<mass.length; i++){
            if(min>=mass[i]){
                min = mass[i];
                indexMin = i;
            }
        }
        System.out.println("minimal'nyy ehlement v massive = " + min);
        System.out.println("ex 11.107(c");
        System.out.println("maximal'nyy ehlement bol'she minimal'nogo na " + (max-min));
        System.out.println("index maximal'nogo ehlementa = " + indexMax);
        System.out.println("index maximal'nogo i minimal'nogo ehlementov = " + "max  = " + indexMax + " min = " + indexMin);

        System.out.println("ex 12.29");
        int length  = 7;
        int mas2[][] = new int[length][length];
        int pravoLevo = 0;
        int verhNiz = 0;
        int total = length*length;
        int count = 1;
        int direction = 1;
        while(count <= total){
            if (direction == 1) {
                while(pravoLevo<length && mas2[verhNiz][pravoLevo] == 0){
                    mas2[verhNiz][pravoLevo] = count;
                    count++;
                    pravoLevo++;
                }
                verhNiz++;
                direction = 2;
                pravoLevo--;
            }
            if (direction == 2) {
                while(verhNiz<length && mas2[verhNiz][pravoLevo] == 0){
                    mas2[verhNiz][pravoLevo] = count;
                    count++;
                    verhNiz++;
                }
                pravoLevo--;
                direction = 3;
                verhNiz--;
            }
              if (direction == 3) {
                while(pravoLevo>=0 && mas2[verhNiz][pravoLevo] == 0){
                    mas2[verhNiz][pravoLevo] = count;
                    count++;
                    pravoLevo--;
                }
                verhNiz--;
                direction = 4;
                pravoLevo++;
            }
             if (direction == 4) {
                while(verhNiz>=0 && mas2[verhNiz][pravoLevo] == 0){
                    mas2[verhNiz][pravoLevo] = count;
                    count++;
                    verhNiz--;
                }
                pravoLevo++;
                direction = 1;
                verhNiz++;
            }
        }
        for(int i = 0; i<length; i++){
            for(int j = 0; j<length; j++){
                System.out.print(mas2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ex 12.31");
        Random rnd = new Random();
        int chislo;
        int dlina = 4;
        int massiv[][] = new int[dlina][dlina];
        int mas[] = new int[dlina*dlina];
        boolean unik;
       int i0 = 0;
        for(int i = 0; i<mas.length; i++) {
            unik = false;
            while(unik == false) {
                chislo = rnd.nextInt(20);
                for (int j = 0; j <= i; j++) {
                    if (chislo == mas[j]) {
                        i0 = 1;
                    }
                }
                if (i0 == 1) {
                    unik = false;
                }
                else{
                    unik = true;
                    mas[i] = chislo;
                }
                i0 = 0;
            }
        }
        i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            for(int j = 0; j<massiv.length; j++){
                massiv[i][j] = mas[i0];
                i0++;
                System.out.print(massiv[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ex 13.23");
        EnginePower powe = new EnginePower();
        Price price[] = new Price[5];

        EnginePower power[] = new EnginePower[5];
        power[0] = new EnginePower();
        power[0].enginePower = 150;
        power[1] = new EnginePower();
        power[1].enginePower = 120;
        power[2] = new EnginePower();
        power[2].enginePower = 170;
        power[3] = new EnginePower();
        power[3].enginePower = 80;
        power[4] = new EnginePower();
        power[4].enginePower = 70;

        price[0] = new Price();
        price[0].price = 2000;
        price[1] = new Price();
        price[1].price = 1800;
        price[2] = new Price();
        price[2].price = 2200;
        price[3] = new Price();
        price[3].price = 880;
        price[4] = new Price();
        price[4].price = 770;

        int totalCost = 0;
        for(int i = 0; i<price.length; i++){
            if(power[i].enginePower > 100){
                totalCost = totalCost + price[i].price;
            }
        }
        System.out.println(" общая стоимость авто у которых мощность двигателя более 100л.с. = " + totalCost);


    }
}