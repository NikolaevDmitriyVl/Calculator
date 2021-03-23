package practice;

public class HomeWork055 {
    public static void main(String[] args) {
        System.out.println("ex 4.4");
        int y = 5;
        if (y > 3) {
            System.out.println("oblast 1");
        } else {
            System.out.println("oblast 2");
        }

        System.out.println("ex 5.4");
        for (int i = 10; i <= 25; i++) {
            System.out.println(i + " " + (i + 0.4));
        }

        System.out.println("ex 5.4(b");
        for (int i = 25; i <= 35; i++) {
            System.out.println(i + " " + (i + 0.5) + " " + (i - 0.2));
        }

        System.out.println("ex 6.22(c");
        int chislo = 123456;
        int ostatokOtDeleniya = 0;
        int i = 0;
        int i0 = 0;
        while (chislo > 0) {
            ostatokOtDeleniya = chislo % 10;
            chislo = chislo / 10;
            i++;
            if (ostatokOtDeleniya % 2 == 0) {
                i0++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 6.22(d");
        int chislo0 = 123456;
        int cifra = 0;
        int i1 = 0;
        int summa = 0;
        while (chislo0 > 0) {
            cifra = chislo0 % 10;
            chislo0 = chislo0 / 10;
            i1++;
            summa = summa + cifra;
        }
        System.out.println(summa);

        System.out.println("ex 6.22(e");
        int chislo1 = 123488;
        int cifra0 = 0;
        int i2 = 0;
        int proizvedenie = 1;
        while (chislo1 > 0) {
            cifra0 = chislo1 % 10;
            chislo1 = chislo1 / 10;
            i2++;
            if (cifra0 > 7) {
                proizvedenie = proizvedenie * cifra0;
            }
        }
        System.out.println(proizvedenie);

        System.out.println("ex 6.22(function10_1");
        int chislo2 = 123450;
        int cifra1 = 0;
        int i3 = 0;
        int i4 = 0;
        while (chislo2 > 0) {
            cifra1 = chislo2 % 10;
            chislo2 = chislo2 / 10;
            i3++;
            if (cifra1 == 0 || cifra1 == 5) {
                i4++;
            }
        }
        System.out.println(i4);

        System.out.println("ex 6.23(a");
        int n = 122;
        int a = 2;
        int ostatok = 0;
        int i5 = 0;
        int i6 = 0;
        while(n>0){
            ostatok = n%10;
            n = n/10;
            i5++;
            if(ostatok ==a){
                i6++;
            }
        }
                System.out.println(i6);

        System.out.println("ex 6.23(b");
        int n0 = 124;
        int ostatok1 = 0;
        int z = 2;
        int i7 = 0;
        int i8 = 0;
        while(n0>0) {
            ostatok1 = n0 % 10;
            n0 = n0 / 10;
            i7++;
            if (ostatok1 % z == 0) {
                i8++;
            }
        }
                System.out.println(i8);

        System.out.println("ex 6.23(c");
        int chislo4 = 123456;
        int ostatok2 = 0;
        int q = 4;
        int summa0 = 0;
        int i9 = 0;
        int i10 = 0;
        while(chislo4 >0){
            ostatok2 = chislo4%10;
            chislo4 = chislo4/10;
            i9++;
            if(ostatok2 > q){
                summa0 = ostatok2 + summa0;
                System.out.println(summa0);
            }
        }

        System.out.println("ex 6.23(d");
        int chislo5 = 123456;
        int ostatok3 = 0;
        int x = 2;
        int y0 = 3;
        int i11 = 0;
        int i12 = 0;
        while(chislo5 >0){
            ostatok3 = chislo5%10;
            chislo5 = chislo5/10;
            i11++;
            if(x == ostatok3 || y == ostatok3){
                i12++;
            }
        }
        System.out.println(i12);

        System.out.println("ex 4.5");
        
    }
}
