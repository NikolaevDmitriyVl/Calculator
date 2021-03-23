package practice;

public class HomeWork056 {
    public static void main(String[] args){
        System.out.println("ex 4.5");
        int q = 4;
        int w = 0;
        if(q >= 0 && q <= 2){
            w = q;
        }
        if(q >2){
            w = 2;
        }
        System.out.println(w);

        System.out.println("ex 4.5(b");
        q = 2;
        w = 0;
        if(q >= 0 && q <= 3){
            w=(q*(-1));
        }
        if(q >3){
            w = -3;
        }
        System.out.println(w);

        System.out.println("ex 5.5");
        for(int i = 21; i>= 10; i--){
            System.out.println(i + " " + (i-1.8));
        }

        System.out.println("ex 6.27");
        int chislo = 123452;
        int cifra = 0;
        int naibolshayaCifra = 0;
        int naimenshayaCifra = 6;
        int i = 0;
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;
            if(cifra>naibolshayaCifra){
                naibolshayaCifra = cifra;
            }
            if(cifra<naimenshayaCifra){
                naimenshayaCifra = cifra;
            }
            i++;

        }
        System.out.println(naibolshayaCifra);
        System.out.println(naimenshayaCifra);

        System.out.println("ex 4.6");
        double a = 6.5;
        double b = 4.3;
        if(a>b){
            System.out.println("a bolshe");
        }
        if(b>a){
            System.out.println("b bolshe");
        }

        System.out.println("ex 5.6");
        for(int t  = 21; t<=35; t++ ){
            System.out.println(t + " "  + (t-0.6));
        }

        System.out.println("ex 5.6(b");
        for(int t = 16; i<24; i++){
            System.out.println(t + " " + (t-0.5) + " " + (t + 0.8));
        }

        System.out.println("ex 6.27(b");
        int chislo0 = 123452;
        int cifra0 = 0;
        int naibolshayaCifra0 = 0;
        int naimenshayaCifra0 = 6;
        i = 0;
        while(chislo0>0){
            cifra0 = chislo0%10;
            chislo0 = chislo0/10;
            if(cifra0>naibolshayaCifra0){
                naibolshayaCifra0 = cifra0;
            }
            if(cifra0<naimenshayaCifra0){
                naimenshayaCifra0 = cifra0;
            }
            i++;

        }
        System.out.println(naibolshayaCifra0-naimenshayaCifra0);

        System.out.println("ex 6.27(c");
        System.out.println(naibolshayaCifra + naimenshayaCifra);

        System.out.println("ex 6.28");
        int chislo1 = 1243;
        int cifra1 = 0;
        i = 0;
        int maxChislo = 0;
        int poryadkoviyNomer = 0;
        while(chislo1>0) {
            cifra1 = chislo1 % 10;
            chislo1 = chislo1 / 10;
            if (cifra1 > maxChislo) {
                maxChislo = cifra1;
                poryadkoviyNomer++;
            }
            i++;
        }
                System.out.println("s konca " + poryadkoviyNomer);
        System.out.println("s nachala " + (i-(poryadkoviyNomer -1)));
    }
}
