package practice;

import java.util.Random;

public class HomeWork080 {
    public static void main(String[] args){
        System.out.println("ex 4.62");
        int chislo = 1211;
        int thousand = chislo/1000;
        int ostThousand = thousand%1000;//211
        int hundred = ostThousand /100;//2
        int ostHundred = ostThousand%100;//11
        int ten  = ostHundred/10;//1
        int one  = ostHundred%10;//1
        if(thousand == hundred && thousand == ten || thousand == hundred && thousand == one || thousand == ten && thousand == one || hundred == ten && hundred == one){
            System.out.println("v chisle est tri odinakovih cifri");
        }
        else{
            System.out.println("v chisle net treh odinakovih cifr");
        }

        System.out.println("ex 5.62");
        int klass1[] = {1,2,3,4,5};
        int klass2[] = {9,8,7,6,5};
        int summa1 = 0;
        int summa2 = 0;
        for(int i = 0; i<klass1.length; i++){
            summa1 = summa1 + klass1[i];
            summa2 = summa2 + klass2[i];
        }
        double srAr01 = summa1/klass1.length;
        double srAr02 = summa2/klass2.length;
        System.out.println("srednyaya ocenka klassa 1 = " + srAr01);
        System.out.println("srednyaya ocenka klassa 2 = " + srAr02);

        System.out.println("ex 6.85");
        chislo = 12345;
        int cifra = 0;
        int i0 = 1;
        int i1 = 0;
        int i2 = 0;
        while (chislo > 0) {
           cifra = chislo%10;
           chislo = chislo/10;

            if (cifra == 2) {
                i1 = i0;
            }
            if (cifra == 5) {
                i2 = i0;
            }
            i0++;
        }
        if (i1 > i2) {
            System.out.println("cifra 2 levee chem 5");
        }
        if (i2 > i1) {
            System.out.println("cifra 5 levee chem 2");
        }

        System.out.println("ex 7.86");
        double massiv01[] = {11.1,12.1,3.1,4.1,5.1,16.1,7.1,8.1,9.1,10.1};
        double summa01 = 0;
        for(int i = 0; i<massiv01.length; i++){
            summa01 = summa01 + massiv01[i];
        }
        if (summa01 > 100) {
            System.out.println("summa previhaet 100");
        }
        if (summa01 > 78) {
            System.out.println("summa previshaet 78");
        }

        System.out.println("ex 8.3");
        int a = 1;
        for(int i = 1; i<=5; i++){
            for(int j = 0; j<i; j++){
                System.out.print(a + " ");
            }
            a = a + 1;
            System.out.println();
            System.out.println();
        }
        System.out.println("ex 8.3(b");
        a = 5;
        for(int i = 5; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print(a + " ");
            }
            a = a+1;
            System.out.println();
        }
        System.out.println("ex 8.3(c");
        a= 10;
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(a + " ");
            }
            a = a + 10;
            System.out.println();
        }
        System.out.println("ex 8.3(d");
        a = 5;
        for(int  i = 5; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(a + " ");
            }
            a = a + 5;
            System.out.println();
        }

        System.out.println("ex 8.4");
        a = 0;
        int b = 0;
        for(int i = 1; i<=5; i++){
            for(int j = 0; j<i; j++){
                System.out.print(a + " ");
                a--;
            }
            b = b + 1;
            a = b;
            System.out.println();
        }
        System.out.println("ex 8.4(b");
        a = 5;
        b = a;
        int c = 6;
        for(int i = 4; i>0; i--){
            System.out.print(c + " ");
            for(int j = 0; j<i; j++){
                System.out.print(a + " ");
                a--;
            }
            c ++;
            b--;
            a = b;
            System.out.println();
        }
        System.out.println(2);
        System.out.println("ex 8.4(c");
        a = 30;
        b = a;
        for(int i = 1; i<=5; i++){
            for(int j = 0; j<i; j++){
                System.out.print(a + " ");
                a++;
            }
            b --;
            a = b;
            System.out.println();
        }
        System.out.println("ex 8.4(b");
        a = 20;
        b = a;
        for(int i = 5; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print(a + " ");
                a++;
            }
            b--;
            a = b;
            System.out.println();
        }

        System.out.println("ex 11.65");
        int osadkiFevral[] = new int[28];
        Random rnd = new Random();
        i0 = 0;
        for(int i = 0; i<osadkiFevral.length; i++){
            osadkiFevral[i] = rnd.nextInt(10);
            if(osadkiFevral[i] == 0){
            i0++;
            }
        }
        System.out.println("osadkov ne bilo " + i0 + " dnya");

        System.out.println("ex 12.19");
        double q[][] = {{1,2,3,4},
                {5,6,7,8,9},
                {10,11,12,13,},
                {14,15,16,17}};
        if(Math.abs(q[0][q[0].length-1]) > Math.abs(q[2][2])){
            System.out.println("element v pravom verhnem uglu bolshe");
        }
        if(Math.abs(q[2][2])>Math.abs(q[0][q[0].length-1])){
            System.out.println("element v pravom verhnem uglu menshe");
        }
        System.out.println("ex 12.19(b");
        if(q[0][1]< q[q.length-1][q[q.length-1].length-1]){
            System.out.println("element v pervoy stoke vtorom stolbce menshe");
        }
        if(q[q.length-1][q[q.length-1].length-1]<q[0][1]){
            System.out.println("element v niznem pravom uglu menshe");
        }

        System.out.println("ex 4.63");
        chislo = 1234;
        thousand = chislo/1000;
        ostThousand = thousand%1000;
        hundred = ostThousand/100;
        ostHundred = ostThousand%100;
        ten = ostHundred /10;
        one = ostHundred%10;
        if(thousand!=hundred && thousand!= ten && thousand != one){
            System.out.println("net odinakovih cifr");
        }
        else{
            System.out.println("odinakovie cifri prisutstvuyut");
        }

        System.out.println("ex 5.63");
        int srednyayaUr[] = {10,12,14,16,18,20,22,24,26,28};
        int ploshhadi[] = {2,3,4,3,2,1,7,8,4,5};
        int kolvoPshVObl = 0;
        int summa = 0;
        for(int i = 0; i<srednyayaUr.length; i++){
            kolvoPshVObl = ((srednyayaUr[i]* ploshhadi[i])+ kolvoPshVObl);
            summa = ploshhadi[i] + summa;
        }
        int srUrVObl = kolvoPshVObl/summa;
        System.out.println("kolichestvo pshenici sobrannoe v oblasti = " + kolvoPshVObl);
        System.out.println("srednyaya urozaynost po oblasti s gektara = " + srUrVObl);

        System.out.println("ex 6.86");
        chislo = 123456;
        int chisl = chislo;
        cifra = 0;
        i0 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i0++;
        }
        cifra = 0;
        double w = Math.pow(10,(i0-1));
        a = 3;
        b = 4;
        i1 = 0;
        i2 = 0;
        for(int i = 1; i<=i0; i++){
            cifra = chisl/(int)w;
            chisl = chisl-(cifra*(int)w);
            w = w/10;

            if (cifra == a) {
               i1 = i;
            }
            if(cifra == b ){
                i2 = i;
            }
        }
        if (i1 > i2) {
            System.out.println("a nahoditsya pravee");
        }
        if (i2 > i1) {
            System.out.println("b nahoditsya pravee");
        }

        System.out.println("ex 7.87");
        int n = 6;
        int e[] = {1,2,3,4,5,6};
        int p = 23;
        summa = 0;
        for(int i = 0; i<n; i++){
            summa = summa + e[i];
        }
        if (summa < p) {
            System.out.println("summa menshe p");
        }
        if (summa > p) {
            System.out.println("summa ne menshe p");
        }

        System.out.println("ex 8.5");

        for(int i = 1; i<=9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " + " + i + " = " + (j + i) + "  ");
            }
            System.out.println();
        }

        System.out.println("ex 8.6");
        for(int i = 1; i<=9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " + " + j + " = " + (j + i) + "  ");
            }
            System.out.println();
        }

        System.out.println("ex 11.66");
        int himiya[] = new int[25];
        Random rnd1 = new Random();
        i0 = 0;
        for(int i= 0; i<himiya.length; i++){
            himiya[i] = rnd.nextInt(4)+1;
            if (himiya[i] == 1 || himiya[i] == 2) {
                i0++;
            }
        }
        System.out.println(i0 + " neuspevayushhih uchenikov");

        System.out.println("ex 12.20");
        int r[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        if(r[0][0]%2 == 0 || r[r.length-1][0]%2 == 0){
            System.out.println("chetnie est");
        }
        else{
            System.out.println("chetnih net");
        }
        System.out.println("ex 12.20(b");
        if(r[0][r[0].length-1]%10 == 0 || r[r.length-1][r[r.length-1].length-1]%10 == 0){
            System.out.println("chisla okanchivayushhie nulem imeyutsya");
        }
        else{
            System.out.println("chisel okanchivayushhihsya nulem net");
        }

        System.out.println("ex 4.64");
        chislo = 123456;
        int a1 = chislo/100000;
        int ost1 = chislo%100000;//23456
        int a2 = ost1/10000;//2
        int ost2 = ost1%10000;//3456
        int a3 = ost2/1000;//3
        int ost3 = ost2%1000;//456
        int a4 = ost3/100;//4
        int ost4 = ost3%100;//56
        int a5 = ost4/10;//5
        int a6 = ost4%10;//6
        summa1 = a1 + a2 + a3;
        summa2 = a4 + a5 + a6;
        if (summa1 == summa2) {
            System.out.println("chislo yavlyaetsya schastlivim");
        }
        else{
            System.out.println("chislo ne yavlyaetsya schastlivim");
        }

        System.out.println("ex 5.64");
        int kolvoZiteley[] = {1,2,3,4,5,6};
        int ploshhad[] = {6,7,8,9,10,11};
        //zitel/plo
        summa1 = 0;
        summa2 = 0;
        for(int i = 0; i<kolvoZiteley.length; i++){
            summa1 = summa1 + kolvoZiteley[i];
            summa2 = summa2 + ploshhad[i];
        }
        int plotnost = summa1/summa2;
        System.out.println(plotnost);

        System.out.println("ex 6.87");
        int komandi[] = {11,22,21,22,13,12,13,23,22,11,11,12,28,0};
        summa1 = 0;
        summa2 = 0;

        for(int i = 0; i<komandi.length; i++) {
            if (komandi[i] / 10 == 1) {
                summa1 = summa1 + komandi[i] % 10;
                summa2 = summa2 + 0;
            }
            else {
                summa1 = summa1 + 0;
                summa2 = summa2 + komandi[i]%10;
            }
            if (komandi[i] == 0) {
                System.out.println("konec igri");
                break;
            }
            System.out.println("komanda1 = " + summa1 + " komanda2 = " + summa2);
        }
        if (summa1 > summa2) {
            System.out.println("komanda 1 viigrala");
        }
        if (summa2 > summa1) {
            System.out.println("komanda 2 viigrala");
        }
        if (summa1 == summa2) {
            System.out.println("nichya");
        }

        System.out.println("ex 7.88");
        int massiv[] = {1,2,3,4};
        summa = 0;
        for(int i = 0; i<massiv.length; i++){
            summa = summa + massiv[i];
        }
        if(summa%2 == 0){
            System.out.println("summa chetnoe chislo");
        }
        else{
            System.out.println("summa ne chetnoe chislo");
        }

        System.out.println("ex 8.7");
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                System.out.print(i + " * " + j + " = " + (i*j) + "     ");
            }
            System.out.println();
        }

        System.out.println("ex 8.8");
        for(int i = 1; i<=9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "     ");
            }
            System.out.println();
        }

        System.out.println("ex 11.67");
        int stoimost[] = new int[31];
        Random rnd2 = new Random();
        summa = 0;
        int s = 10;
        i0 = 0;
        for(int i = 0; i<stoimost.length; i++){
            stoimost[i] = rnd2.nextInt(30);
            if (stoimost[i] > s) {
                i0 ++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 12.21");
        int y[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        if(y[0][y[0].length-1]%2 >0 || y[y.length-1][y[y.length-1].length-1]%2 > 0){
            System.out.println("est nechetnie");
        }
        else{
            System.out.println("chetnie");
        }
        System.out.println("ex 12.21(b");
        if(y[0][0]%10 == 5 || y[y.length-1][0]%10 == 5){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }


    }
}
