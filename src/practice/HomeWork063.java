package practice;

public class HomeWork063 {
    public static void main(String[] args) {
        System.out.println("ex 4.18");
        int levo1 = -4;
        int niz1 = -2;
        int pravo1 = 1;
        int verh1 = 1;
        int levo2 = 2;
        int niz2 = 1;
        int pravo2 = 7;
        int verh2 = 4;
        int nizPryamougolnika = 0;
        int levoPryamougolnika = 0;
        int verhPryamougolnika = 0;
        int pravoPryamougolnika = 0;
        if (levo1 < levo2) {
            levoPryamougolnika = levo1;
        }
        else{
            levoPryamougolnika = levo2;
        }
        if (niz1 < niz2) {
            nizPryamougolnika = niz1;
        }
        else{
            nizPryamougolnika = niz2;
        }
        if (pravo1 > pravo2) {
            pravoPryamougolnika = pravo1;
        }
        else{
            pravoPryamougolnika = pravo2;
        }
        if (verh1 > verh2) {
            verhPryamougolnika = verh1;
        }
        else{
            verhPryamougolnika = verh2;
        }
        System.out.println("leviy nizniy ugol: x = " + levoPryamougolnika + " y = " + nizPryamougolnika + " praviy verhniy ugol: x = " + pravoPryamougolnika + " y = " + verhPryamougolnika);

        System.out.println("ex 5.18");
        double t = 0;
        double z = 0;
        for(int a = 1; a<= 17; a++){
            t = 4*a;
            z = Math.pow((3.5*t),2) - 7*t + 16;
            System.out.println("a " + a + " = " + z);
        }

        System.out.println("ex 6.44");
        double a[] = {5.2,5.2,3.4,2.5,1.6,0.0};
        int i = 0;
        int i0 = 1;
        int i1 = 0;
        while (a[i0] > 0) {
            a[i0] = a[i0];
            if (a[i] == a[i0]){
                i1++;
            }
            i++;
            i0++;
        }
        System.out.println(a.length - i1);

        System.out.println("ex 4.19");
        levo1 = -5;
        niz1 = -1;
        levo2 = 1;
        niz2 = 1;
        int visota1 = 3;
        int dlina1 = 4;
        int visota2 = 3;
        int dlina2 = 5;
        int niz = 0;
        int pravo = 0;
        int verh = 0;
        int levo = 0;
        if (levo1 < levo2) {
            levo = levo1;
            pravo = levo2+ dlina2;
        }
        else{
            levo = levo2;
            pravo = levo1 + dlina1;
        }
        if (niz1 < niz2) {
            niz = niz1;
            verh = niz2 + visota2;
        }
        else{
            niz = niz2;
            verh = niz1 + visota1;
        }
        System.out.println("leviy nizniy ugol: x = " + levo + " y = " + niz + " praviy verhniy ugol: x = " + pravo + " y = " + verh);

        System.out.println("ex 5.19");
        double result = 0;
        for(double q = 0.1; q<= 1.1; q+=0.1 ){
            result = Math.sin(q);
            System.out.println(result);
        }

        System.out.println("ex 4.20");
        int n = 11;
        int m = 5;
        if(n%5 == 0){
            System.out.println(n/m);
        }
        else{
            System.out.println("m на n нацело не делится");
        }

        System.out.println("ex 5.20");
        result = 0;
        double q = 0;
        for(q = 0.1; q<=0.9; q+=0.1){
            result = Math.sqrt(q);

        System.out.println("корень из " + q + " = "  + result);
        }

        System.out.println("ex 6.45");
        int aa = 284;
        int b = 132;
        int c = 0;
        i = 0;
        while(aa!= 0 && b!= 0){
            if (aa > b) {
                aa = aa-b;
                c = aa;
                System.out.println( " aa " + aa);
            }
            else{
                b = b-aa;
                c = b;
                System.out.println("b " + b);
            }
            i++;
        }
        System.out.println(c);

    }
    }

