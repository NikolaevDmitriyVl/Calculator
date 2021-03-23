package practice.HomeWork115;

import java.sql.SQLOutput;

public class HomeWork115 {
    public static void main(String args[]){
        System.out.println("ex 4.128");
        int chislo = 188;
        int age = 800;
        int vozrastLet = age/12;
        int vozrastMesyacev = age%12;
        //1 god, 2,3,4 goda, 5,6,7,8,9 let, 10,20,30...let
        //1 mesyac, 2,3,4 mesyaca, 5,6,7,8,9 mesyacev, 10,11

        if (vozrastLet%10 == 1) {
            System.out.print(vozrastLet + " god ");
        } else if (vozrastLet % 10 > 1 && vozrastLet % 10 < 5) {
            System.out.print(vozrastLet + " goda ");
        } else if (vozrastLet % 10 > 4 && vozrastLet % 10 < 10 || vozrastLet % 10 == 0) {
            System.out.print(vozrastLet + " let ");
        }

        if (vozrastMesyacev % 10 == 1) {
            System.out.print(vozrastMesyacev + " mesyac");
        } else if (vozrastMesyacev % 10 > 1 && vozrastMesyacev % 10 < 5) {
            System.out.print(vozrastMesyacev + " mesyaca ");
        } else if (vozrastMesyacev % 10 > 4) {
            System.out.print(vozrastMesyacev + " mesyacev");
        }

        System.out.println("ex 8.48");
        int money[] = {1,2,5,10};
        int n = 12;
        // 1 , 2 , 3 , 4
        // 12, 13, 14,
        // 23, 24,
        // 34
        //123, 134
        // 234
        // 1,2,3,4

        int x = 0;
        for(int i = 0; i<money.length; i++){
            x = money[i];
            for(int i2 = 0; i2<money.length; i2++){
                for(int i3 = 0; i3<money.length; i3++){
                    for(int i4 = 0; i4<money.length; i4++){

                    }
                }
            }
        }
        int i0 = 0;

            x = money[i0];


            i0++;
            if(i0>money.length-1){
                i0 = 0;
            }

        System.out.println("ex 10.24");
            int a = 10;
            int b = 8;
            int max = 0;
            int min = 0;
        if (a > b) {
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        double x0 = Math.pow(max,10);
        int answer = 0;
        for(int i = 2; i<(int)x0; i++){
            if (i % a == 0 && i % b == 0) {
                answer = i;
                break;
            }
        }
        System.out.println("NOK = " + answer);

        System.out.println("ex 10.25");
        a = 25;
        b = 40;
        x = 0;
        if (a > b) {
            max = a;
            min = b;
        }
        else{
            min = a;
            max = b;
        }
        answer = max;
        x = max;
        for(int i = max; i >= 2; i--){
            if(a%i == 0 && b%i == 0){
                x = i;
            }
            if (x < answer) {
                answer = x;
            }
        }
        System.out.println("NOD = " + answer);

        System.out.println("ex 11.103");
        int massiv[] = {1,2,3,-4,5,6,7,8,9,10};
        int znak  = 0;
        if (massiv[0] > 0) {
            znak = 1;
        }
        else{
            znak = -1;
        }
        i0 = 0;
        int znak2 = 0;
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] > 0) {
                znak2 = 1;
            }
            else{
                znak2 = -1;
            }
            if (znak2 != znak) {
             i0++;
             znak = znak*(-1);
            }
        }
        System.out.println(i0 + " raz menyalsya znak");

        System.out.println("ex 12.25(p");
        int dvumMas[][] = new int[12][10];
        x = 0;
        znak = -1;
        for(int i= dvumMas.length-1; i>= 0; i--){
            for(int j = 0; j<dvumMas[0].length; j++){
                x = x+1;
                if (znak == 1) {
                    dvumMas[i][j] = x;
                }
                else{
                    dvumMas[i][(j-9) * (-1)] = x;
                }
            }
            znak= znak*(-1);
        }
        for(int i = 0; i<dvumMas.length; i++){
            for(int j = 0; j<dvumMas[0].length; j++){
                System.out.print(dvumMas[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ex 12.25(r");
        x = 0;
        int dvumMas2[][] = new int[12][10];
        znak = -1;
        for(int i = dvumMas2[0].length-1; i>=0; i--){
            for(int j = 0; j<dvumMas2.length; j++){
                x = x+1;
                if (znak == 1) {
                    dvumMas2[j][i] = x;
                }
                else{
                    dvumMas2[(j-11) * (-1)][i] = x;
                }
            }
            znak = znak * (-1);
        }

        for(int i = 0; i<dvumMas2.length; i++){
            for(int j = 0; j<dvumMas2[0].length; j++){
                System.out.print(dvumMas2[i][j] + "\t");
            }
            System.out.println();
        }





    }
}