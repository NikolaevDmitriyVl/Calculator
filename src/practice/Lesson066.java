package practice;

public class Lesson066 {
    public static void main(String[] args){
        System.out.println("ex 7.8");
        int chislo = 999;
        int n = 20;
        for(int i = chislo; i>0; i--){
            int hundred = i /100;
            int ostatok = i%100;
            int ten = ostatok/10;
            int one = ostatok%10;
            int summa = hundred + ten + one;
            if (summa == n) {
                System.out.println(summa+" "+i);
            }
        }

        System.out.println("ex 7.9(a");
        chislo = 99;
        double summaKvadratov = 0;
        for(int i = chislo; i>0; i--){
            int ten = i/10;
            int one = i%10;
            summaKvadratov = Math.pow(ten,2) + Math.pow(one,2);
            if(summaKvadratov%13 == 0){
                System.out.println(i);
            }
        }
        System.out.println("ex 7.9(b");
        int summa = 0;
        for(int i = chislo;i>0; i--){
            int ten = i/10;
            int one = i%10;
            summa = ten + one;
            if(summa + Math.pow(summa,2) == i){
                System.out.println(i);
            }
        }

        System.out.println("ex 7.10");
        chislo = 99;
        n = 12;
        for(int i = chislo; i>0; i--){
            if (i % n == 0 || i == n) {
                System.out.println(i);
            }
        }

        System.out.println("ex 7.11");
        chislo = 999;
        double kvadratChisla = 0;
        for(int i = chislo; i>=100; i--){
            int sto = i/100;
            int ost = i%100;
            int desyat = ost/10;
            int odin = ost%10;
            kvadratChisla = Math.pow(i,2);
            int ostatokThousand = (int)kvadratChisla%1000;
            int hundred = ostatokThousand/100;
            int ostatokHundred = ostatokThousand%100;
            int ten = ostatokHundred/10;
            int one = ostatokHundred%10;
            if(sto == hundred && desyat == ten && odin == one){
                System.out.println(i);
            }
        }

    }
}
