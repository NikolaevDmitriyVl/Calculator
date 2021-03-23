package practice;

public class HomeWork066 {
    public static void main(String[] args){
        System.out.println("ex 4.25");
        int chislo = 33;
        int ten = chislo/10;
        int one = chislo%10;
        if (one + ten > 9) {
            System.out.println("chislo dvuznachnoe");
        }
        else{
            System.out.println("chislo ne dvuznachnoe");
        }

        System.out.println("ex 5.25");
        for(double i = 2.2; i<4.3; i+=0.2){
            System.out.println(i);
        }

        System.out.println("ex 6.49");
        chislo = 87;
        int cifra = 0;
        int i = 0;
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;

            if (cifra == 3) {
                System.out.println("yes");
                break;
            }
            else{

                System.out.println("no");
                break;
            }
        }

        System.out.println("ex 7.12");//???
        int q = 0;
        for(i = 30; i<100; i++){

            if(i%3 == 0 && i%10==2 ){
                 System.out.println(i);
            }
            if(i%3  == 0 && i%10 == 4){
                System.out.println(i);
            }
            if (i % 3 == 0 && i % 10 == 8) {
                System.out.println(i);
            }
        }


        System.out.println("ex 7.13(a");
        int n = 253;
        int summa = 0;
        for(i = 1; i<= n; i++){
            if (n % i == 0) {
                summa = summa +i;
                System.out.println(i);
            }
        }
        System.out.println("ex 7.13(b");
        System.out.println(summa);
        System.out.println("ex 7.13(c");
        chislo = 256;
        int e = 0;
        summa = 0;
        for(int w = 1; w<=chislo; w++){
            if (chislo % w == 0 && w%2 == 0) {

                summa = summa + w;
            }
        }
        System.out.println(summa);
        System.out.println("ex 7.13(d");
        chislo = 124;
        e = 0;
        for(int w = 1; w<= chislo; w++){
            if(chislo%w == 0){
              e++;
            }
        }
        System.out.println(e);
        System.out.println("ex 7.13(e");
        e = 0;
        for(int w = 1; w<=chislo; w++){
            if (chislo % w == 0 && w % 2 == 1) {
              e++;
            }
        }
        System.out.println(e);
        System.out.println("ex 7.13(function10_1");
        e = 0;
        for(int w = 1; w<=chislo; w++){
            if (chislo % w == 0 && w % 2 == 0) {
              e++;
            }
        }
        System.out.println(e);
        System.out.println("ex 7.13(g");
        int d = 22;
        e = 0;
        for(int w = 1; w<= chislo; w++){
            if(chislo%w == 0 && w<d){
                e++;
            }
        }
        System.out.println(e);

        System.out.println("ex 4.26(a");
        int a = 34;
        ten = a/10;
        one = a%10;
        if ((one + ten) % 3 == 0 ){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println("ex 4.26(b");
        int b = 4;
        if((one + ten) % b == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("ex 5.26");
        for(double r = 4.4; r<6.5 ; r+=0.2){
            System.out.println(r);
        }

        System.out.println("ex 6.50(a");
        chislo = 13345;
        cifra = 0;
        i = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            a = 2;
            e = 0;
            if (cifra == a) {
                e++ ;
                System.out.println("yes");
                break;
            }
        }
            if(e==0){
                System.out.println("no");
            }
            System.out.println("ex 6.50(b");
            chislo = 123;
            cifra = 0;
            b = 1;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            e = 0;
            if (cifra == b) {
                e++;
            }
        }
            if(e>0) {
                System.out.println(" ne verno");
            }
        if (e == 0) {
            System.out.println("verno");
        }

        System.out.println("ex 7.14");
        double w[] = {1.2,33.4,55.6,78.9,21.4,70.2,6.4,72.1};
        double summ = 0;
        double u = 0;
        for(int t = 1; t<8; t++){

            if (w[t] > 10.75) {
                summ = summ + w[t];
            }
                System.out.println(summ);
            }

        System.out.println("ex 7.15");
        n = 6;
        double o[] = {1.1,2.3,4.6,8.9,10.1,11.7};
        summ = 0;
        double p = 8.7;
        for(int t = 1; t<n; t++) {
            if (o[t] > p) {
                summ = summ + o[t];
            }

        }
        System.out.println(summ);

        
        }
        }



