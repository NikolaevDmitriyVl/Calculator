package practice;

public class HomeWork095 {
    public double ex_10_2b(){
        double y = ((2+Math.sin(2))/(Math.sin(3)+5)) + ((6+Math.sin(6))/(Math.sin(3)+3)) + ((1+Math.sin(1))/Math.sin(4)+4);
        return y;
        }





    public static void main(String[] args){
        System.out.println("ex 4.97");
        int chislo1 = 13;
        int chislo2 = 12;
        int chislo3 = 11;
        int naibolshee = 0;
        int naimenshee = 0;

        if (chislo1 >= chislo2 && chislo1 >= chislo3) {
            System.out.println("chislo 1 samoe bolshoe");
            naibolshee = chislo1;
        }
        if (chislo2 >= chislo1 && chislo2 >= chislo3) {
            System.out.println("chislo 2 samoe bolshoe");
            naibolshee = chislo2;
        }
        if(chislo3>=chislo1 && chislo3 >= chislo2){
            System.out.println("chislo 3 samoe bolshoe");
            naibolshee = chislo3;
        }
        System.out.println("ex 4.97(b");
        if (chislo1 < chislo2 && chislo1 < chislo3) {
            System.out.println("chislo 1 samoe menshee");
            naimenshee = chislo1;
        }
        if (chislo2 < chislo1 && chislo2 < chislo3) {
            System.out.println("chislo 2 samoe menshee");
            naimenshee = chislo2;
        }
        if(chislo3< chislo1 && chislo3< chislo2){
            System.out.println("chislo 3 samoe menshee");
            naimenshee = chislo3;
        }


        System.out.println("naibolshee " + naibolshee);
        System.out.println("naimenshee " + naimenshee);
        System.out.println("ex 4.97(c");
        if(chislo1>naimenshee && chislo1<naibolshee){
            System.out.println("po seredine chislo1");
        }
        if(chislo2>naimenshee && chislo2<naibolshee){
            System.out.println("po seredine chislo2");
        }
        if(chislo3>naimenshee && chislo3<naibolshee){
            System.out.println("po seredine chislo3");
        }


        System.out.println("ex 5.94");
        int chislo = 123456;
        int cifra = 0;
        int i0 = 0;
        int summa = 0;
        for(int i = 0; chislo>0; i++) {
            cifra = chislo % 10;
            summa = summa + cifra;
            chislo = chislo / 10;
        }
        System.out.println(summa);

        System.out.println("ex 6.116");


        System.out.println("ex 7.115");
        int massiv[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        summa = 0;
        i0 = 0;
        for(int i = 0; i<massiv.length; i++){
            if (massiv[i] % 2 == 0) {
                summa = summa + massiv[i];
                i0++;
            }
        }
        int sredneeArifmeticheskoe = summa/i0;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 8.26");
        int n = 5;
        for(int i = 1; i<=n; i++){
            System.out.print(i);
            for(int j = 1; j<=n; j++){
                if (i % j == 0) {
                    System.out.print("+");
                }
            }
            System.out.println();
        }

        System.out.println("ex 10.2(d");
        HomeWork095 home = new HomeWork095();
        double w = home.ex_10_2b();
        System.out.println(w);


        System.out.println("ex 11.84");

        System.out.println("ex 12.14");

        System.out.println("ex 13.11");
    }
}
