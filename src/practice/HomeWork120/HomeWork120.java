package practice.HomeWork120;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.Console;
import java.util.Random;

import static java.lang.Integer.min;

public class HomeWork120 {
    String month(int a){
        String mon = "";
        switch(a){
            case 1:{
                mon = "january";
            }
            break;
            case 2:{
                mon = "february";

            }
            break;
            case 3:{
                mon = "march";

            }
            break;
            case 4:{
                mon = "april";

            }
            break;
            case 5:{
                mon = "may";

            }
            break;
            case 6:{
                mon = "june";

            }
            break;
            case 7:{
                mon = "july";

            }
            break;
            case 8:{
                mon = "august";

            }
            break;
            case 9:{
                mon = "september";

            }
            break;
            case 10:{
                mon = "october";

            }
            break;
            case 11:{
                mon = "november";

            }
            break;
            case 12:{
                mon = "desember";

            }
            break;
        }
        return mon;
    }
    void gdeBolsheBukv(String a, String b){
        char one[] = a.toCharArray();
        char two[] = b.toCharArray();
        int quantity = 0;
        if (one.length >= two.length) {
            quantity = one.length;
        }
        else{
            quantity = two.length;
        }
        for(int i = 0; i<quantity; i++){

        }
        String allLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        char allLetter1[] = allLetter.toCharArray();
        int i0 = 0;
        int i1 = 0;
        int quantityLettersOne = 0;
        int quantityLettersTwo = 0;
        for(int i = 0; i<quantity; i++) {
            if(one.length> i){
                while(one[i] != allLetter1[i0] && i0<52){
                    i0++;
                }
                if(i0 != 52){
                    quantityLettersOne++;
                }
                i0 = 0;
            }
            if(two.length> i) {
                while (two[i] != allLetter1[i1] && i1 < 52) {
                    i1++;
                }
                if (i1 != 52) {
                    quantityLettersTwo++;
                }
                i1 = 0;
            }
        }
        System.out.println("kolichestvo bukv v  a " + quantityLettersOne);
        System.out.println("kolichestvo bukv v  b " + quantityLettersTwo);
    }

    public static void main(String[] args) {
        System.out.println("ex 4.134");
        int year = 1992;
        int month = 3;
        int day = 1;
        //opredelit' datu predydushchego dnya
        int y = 0;
        int m = 0;
        int d = 0;
        if(day == 1){
            if (month == 1) {
                y = year-1;
                m = 12;
                d = 31;
            }
            else{
                y = year;
            }
            if(month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11 ){
                d = 31;
                m = month-1;
            } else if (month == 5 || month == 7 || month == 10 || month == 12) {
                d = 30;
                m = month -1;
            }
            else if(month == 3){
                if (year % 4 == 0 && year % 100 != 0) {
                    d = 29;
                    m = month -1;
                }
                else{
                    d = 28;
                    m = month -1;
                }
            }

        }
        else{
            y = year;
            m = month;
            d = day;
        }
        HomeWork120 answer = new HomeWork120();

        System.out.println(d + " " + answer.month(m) + " " + y + " year");
        System.out.println("ex 4.134(b");
        //if31if30if29if28
        if (month == 12 && day == 31) {
            y = year + 1;
            m = 1;
            day = 1;
        }
        else {
            y = year;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ) {
                if (day == 31) {
                    m = month+1;
                    d = 1;
                }
                else{
                    m = month;
                    d = day+1;
                }

            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                if (day == 30) {
                    m = month+1;
                    d = 1;
                }
                else{
                    m = month;
                    d = d+1;
                }
            } else if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0) {
                    if (day == 29) {
                        m = month+1;
                        d = 1;
                    }
                    else{
                        m = month;
                        d = day + 1;
                    }
                }
                else{
                    if (day == 28) {
                        m = month+1;
                        d = 1;
                    }
                    else{
                        m = month;
                        d = day + 1;
                    }
                }
            }
        }
        System.out.println(d + " " + answer.month(m) + " " + y + " year");


        //System.out.println("ex 8.48");

        System.out.println("ex 9.10");
        String sitiOne = "Moskow";
        String sitiTwo = "Eysk";
        String sitiThree = "Kamyshevatskaya";
        int quantityOne = sitiOne.length();
        int quantityTwo = sitiTwo.length();
        int quantityThree = sitiThree.length();
        if (quantityOne > quantityTwo && quantityOne > quantityTwo) {
            System.out.println(" more " + quantityOne);
        } else if (quantityTwo > quantityThree) {
            System.out.println("more " + quantityTwo);
        }
        else{
            System.out.println("more " + quantityThree);
        }

        if (quantityOne <quantityTwo && quantityOne < quantityTwo) {
            System.out.println("lesser " + quantityOne);
        } else if (quantityTwo < quantityThree) {
            System.out.println("lesser " + quantityTwo);
        }
        else{
            System.out.println("lesser " + quantityThree);
        }






        System.out.println("ex 10.28");
        String a = "Dany dva predlozheniya";
        String b = "Nayti obshchee kolichestvo bukv v nih";
        answer.gdeBolsheBukv(a,b);







        System.out.println("ex 11.105");
        int massiv[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,16,18,19,20,20,22,23,24,25,26,27,28,29,30};
        int count = 0;
        for(int i = 0; i<massiv.length; i++){
            for(int j = i; j<massiv.length; j++){
                if(massiv[i] == massiv[j] && i != j){
                 count++;
                }
            }
        }
        System.out.println(massiv.length - count);


        System.out.println("ex 12.27");
        m = 5;//stroki
        int n = 5;// stolbcy
        int dvumMas[][] = new int [m][n];
        int mN = m * n;
        int mas[] = new int[mN];
        Random rnd = new Random();
        for(int i = 0; i<mas.length; i++){
            mas[i] = (i+1);
        }
        int i0 = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                dvumMas[i][j] = mas[i0];
                i0++;
                System.out.print(dvumMas[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("ex 13.23");
        Car car[] = new Car[5];
        car[0] = new Car();
        car[0].moshchnostDvigatelya = 200;
        car[0].stoimost = 1000000;

        car[1] = new Car();
        car[1].moshchnostDvigatelya = 250;
        car[1].stoimost = 120000;

        car[2] = new Car();
        car[2].moshchnostDvigatelya = 100;
        car[2].stoimost = 130000;

        car[3] = new Car();
        car[3].moshchnostDvigatelya = 150;
        car[3].stoimost = 1590000;

        car[4] = new Car();
        car[4].moshchnostDvigatelya = 87;
        car[4].stoimost = 220000;

        for(int i = 0; i<car.length; i++){
            if (car[i].moshchnostDvigatelya > 100) {
                System.out.println(" moshchnost " + car[i].moshchnostDvigatelya + " price " + car[i].stoimost);
            }
        }

        System.out.println("ex 4.135");
        double t = 2.9;
        double n0 = 0;
        String svetofor = "zelenyy";
        while(n0<t){
            if(svetofor == "zelenyy" ){
                n0 +=3;
                svetofor = "zheltyy";
            } else if (svetofor == "zheltyy" ) {
                n0 +=1;
                svetofor = "krasnyy";

            } else if (svetofor == "krasnyy") {
                n0 +=2;
                svetofor = "zelenyy";
            }
        }
        if(n0 > t){
            if (svetofor == "zelenyy") {
                svetofor = "krasnyy";
            }
            else if(svetofor == "zheltyy"){
                svetofor = "zelenyy";
            } else if (svetofor == "krasnyy") {
                svetofor = "zheltyy";
            }
        }
        System.out.println(svetofor);

        System.out.println("ex 9.11");
        String one = "Russia";
        String two = "USA";
       // String a = "first";
        // String b = "second";
        String a11 = one + two;
        //russiaUsa
        two = a11.substring(0, (a11.length() - two.length()));
        one = a11.substring(two.length());
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        System.out.println("ex 9.12");
        String a1 = "one";
        String b1 = "two";
        String c1 = "three";
        //b>c, a>b, c>a
        String abc = a1+b1 + c1;
        a1 = abc.substring(a1.length(),abc.length() - c1.length());
        b1 = abc.substring(abc.length()-c1.length(), abc.length());
        System.out.println("a1 " + a1);
        System.out.println("b1 " + b1);
        c1 = abc.substring(0,abc.length() - (a1.length()+b1.length()));
        System.out.println("c1 " + c1);


        a1 = "one";
        b1 = "two";
        c1 = "three";
        char abc2[] = (a1+b1+c1).toCharArray();


                char[] Str1 = {'п', 'р', 'и', 'в', 'е', 'т', ' ', 'м', 'и', 'р'};
                String Str2 = "";
                Str2 = Str2.copyValueOf(Str1);
                System.out.println("Возвращаемая строка: " + Str2);
                Str2 = Str2.copyValueOf(Str1, 2, 6);
                System.out.println("Возвращаемая строка: " + Str2);

                String abc3 = "";
                abc3 = abc3.copyValueOf(abc2);
                String abc31 = "";
                abc31 = abc31.copyValueOf(abc2,0,a1.length());
        System.out.println(abc31);
        String abc32 = "";
        abc32 = abc32.copyValueOf(abc2,a1.length(), b1.length());
        System.out.println(abc32);
        String abc33 = "";
        abc33 = abc33.copyValueOf(abc2,(a1.length()+ b1.length()), c1.length());
        System.out.println(abc33);

        String s1 = "s1";
        String s2 = "s2";
        String tmp = s1;
        s1 = s2;
        s2 = tmp;
        System.out.println(s1+' '+s2);
    }
}
