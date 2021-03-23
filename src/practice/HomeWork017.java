package practice;

public class HomeWork017 {
    public static void main(String[] args) {
        System.out.println("ex 4.54");
        int a1 = 40;
        int a2 = 20;
        int a3 = 15;
        int b1 = 34;
        int b2 = 98;
        int b3 = 63;
        if (a1 < b1 && a2 < b2 && a3 < b3) {
            System.out.println("chemodan pomestitsya v korobku");
        } else {
            System.out.println("chemodan ne pomestitsya v korobku");
        }


        System.out.println("ex 4.55");
        int q = 37;
        int ten = q / 10;
        int one = q % 10;
        int a4 = 8;
        if (ten == 3 || one == 3) {
            System.out.println("cifra 3 vhodit v chislo");
        } else {
            System.out.println("cifra 3 ne vhodit v chislo");
        }
        if (ten == a4 || one == a4) {
            System.out.println("a4 vhodit v chislo");
        } else {
            System.out.println("a4 ne vhodit v chislo");
        }

        System.out.println("ex 4.56");
        int w = 87;
        int ten1 = w / 10;
        int one1 = w % 10;
        if (ten1 == 4 || one1 == 4 || ten1 == 7 || one1 == 7) {
            System.out.println("cifri 4 ili 7 vhodyat v chislo");
        } else {
            System.out.println("cifri 4 ili 7 ne vhodyat v chislo");
        }
        if (ten1 == 3 || one1 == 3 || ten1 == 6 || one1 == 6 || ten1 == 9 || one1 == 9){
        System.out.println("cifri 3 ili 6 ili 9 vhodyat v chislo");}
        else {
            System.out.println("cifri 3 ili 6 ili 9 ne vhodyat v chislo");
        }

        System.out.println("ex 4.57");
        int e = 845;
        int n = 4;
        int handred = e/100;
        int ostatok = e%100;
        int ten2 = ostatok/10;
        int one2 = ostatok%10;
        if (handred == 6 || ten2 == 6 || one2 == 6){
            System.out.println("cifra 6 vhodit v chislo");
        }
        else {
            System.out.println("cifra 6 ne vhodit v chislo e");
        }
        if (handred == n || ten2 == n || one2 == n){
            System.out.println("cifra n vhodit v chislo e ");
        }
        else {
            System.out.println("cifra n ne vhodit v cislo e");
        }

        System.out.println("ex 4.58");
        int r = 857;
        int handred1 = r/100;
        int ostatok1 = r%100;
        int ten3 = ostatok1/10;
        int one3 = ostatok1%10;
        if (handred1 == 4 || ten3 == 4 || one3 == 4 || handred1 == 7 || ten3 == 7 || one3 == 7){
            System.out.println("cifra 4 ili 7 vhodyat v chislo");
        }
        else {
            System.out.println("cifra 4 ili 7 ne vhodyat v chislo");
        }
        if (handred1 == 3 || ten3 == 3 || one3 == 3 || handred1 == 6 || ten3 == 6 || one3 == 6 || handred1 == 9 || ten3 == 9 || one3 == 9){
            System.out.println("cifra 3 ili 6 ili 9 vhodyat v chislo r");
        }
        else {
            System.out.println("cifra 3 ili 6 ili 9 ne vhodyat v chislo r");
        }

        System.out.println("ex 4.59");
        int t = 9847;
        int b = 8;
        int thousand = t/1000;//9
        int ostatok2 = t%1000;//847
        int handred2 = ostatok2/100;//8
        int ostatok3 = ostatok2%100;//47
        int ten4 = ostatok3/10;//4
        int one4 = ostatok3%10;//7
        if (thousand == 4 || handred2 == 4 || ten4 == 4 || one4 == 4){
            System.out.println("cifra 4 vhodit v chislo t");
        }
        else {
            System.out.println("cifra 4 ne vhodit v chislo t");
        }
        if (thousand == b || handred2 == b || ten4 == b || one4 == b){
            System.out.println("cifra b vhodit v chislo t");
        }
        else {
            System.out.println("cifra b  ne vhodit v chislo t");
        }

        System.out.println("ex 4.60");
        int y = 8957;
        int thousand1 = y/1000;
        int ostatok4 = y%1000;
        int handred3 = ostatok4/100;
        int ostatok5 = ostatok4%100;
        int ten5 = ostatok5/10;
        int one5 = ostatok5%10;
        if(thousand == 2 || handred == 2 || ten == 2 || one == 2 || thousand == 7 || handred == 7 || ten == 7 || one == 7){
            System.out.println("cifra 2 ili 7 vhodyat v  chislo y");
        }
        else{
            System.out.println("cifra 2 ili 7 ne vhodit v chislo y");
        }

    }
}
