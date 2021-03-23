package practice;

import java.util.Random;

public class HomeWork084 {
    public static void main(String[] args){
        System.out.println("ex 4.68");//???
        double i0 = 1;
        double pi = 3.14;
        double t = 3;//vremya
        double v0 = 200;//nachalnaya skorost
        double alfa = 2*pi/6;//ugol
        double g = 9.8;//uskorenie svobodnogo padeniya
        double y = 1;
    y = (v0*t*(Math.sin(alfa))-(Math.pow((g*t),2))/2);
        System.out.println("proverka " + y);


        System.out.println("ex 5.68");
        int chisl1 = 1;
        int chisl2 = 2;
        int chisl = 0;
        int znam1 = 1;
        int znam2 = 1;
        int znam = 0;
        int k = 5;
        for(int i = 0; i<k; i++){
            chisl = chisl1 + chisl2;
            chisl1 = chisl2;
            chisl2 = chisl;
            znam = znam1 + znam2;
            znam1 = znam2;
            znam2 = znam;
        }
            System.out.print(chisl + "/" + znam + " " );
        System.out.println();

        System.out.println("ex 5.68(b");
        chisl1 = 1;
        chisl2 = 2;
        chisl = 0;
        znam1 = 1;
        znam2 = 1;
        znam =  0;
        int n = 3;
        int summa = 0;
        for(int i = 0; i<n; i++){
            chisl = chisl1 + chisl2;
            chisl1 = chisl2;
            chisl2 = chisl;
            znam = znam1 + znam2;
            znam1 = znam2;
            znam2 = znam;
            summa = summa + (chisl/znam);
            System.out.print(chisl + "/" + znam + " ");
        }
        System.out.println("ex 5.68(c");
        int a = 100;
        if (a < summa) {
            System.out.println("summa bolshe chisla a");
        }
        if (a > summa) {
            System.out.println("summa menshe chisla a");
        }

        System.out.println("ex 4.69(a");
        int oneX1 = 2;
        int oneY1 = 2;
        int twoX1 = 6;
        int twoY1 = 4;
        int storonaX1 = 5;
        int storonaY1 = 3;
        int storonaX2 = 8;
         int storonaY2 = 4;
        int oneX2 = oneX1 + storonaX1;//7
        int oneY2 = oneY1 + storonaY1;//5
        int twoX2 = twoX1 + storonaX2;//14
        int twoY2 = twoY1 + storonaY2;//8

        if(oneX1>=twoX1 && oneX1<twoX2 && oneX2>twoX1 && oneX2<=twoX2 && oneY1>=twoY1 && oneY1<twoY2 && oneY2>twoY1 && oneY2<=twoY2){
            System.out.println("pervogo pryamougolnika tochki prenadlezit vtoromu");
        }
        else{
            System.out.println("pervogo pryamougolnika tochki ne prenadlezit vtoromu");
        }
        System.out.println("ex 4.69(b");
        if(oneX1>=twoX1 && oneX1<twoX2 && oneX2>twoX1 && oneX2<=twoX2 && oneY1>=twoY1 && oneY1<twoY2 && oneY2>twoY1 && oneY2<=twoY2 ||
                twoX1>=oneX1 && twoX1<oneX2 && twoX2>oneX1 && twoX2<=oneX2 && twoY1>=oneY1 && twoY1<oneY2 && twoY2>oneY1 && twoY2<=oneY2){
            System.out.println("tochki odnogo iz pryamougolnika prinadlezat vtoromu");
        }
        else{
            System.out.println("tochki pryamougolnikov ne prenadlezat drug drugu");
        }
        System.out.println("ex 4.69(c");int x1 = 2;
        int y1 = 2;
        storonaX1 = 5;
        storonaY1 = 3;


        int x2 = 7;
        int y2 = 4;
        storonaX2 = 8;
        storonaY2 = 4;

        if (x2 > x1 && x2 < x1 + storonaX1 && y2 > y1 && y2 < y1 + storonaY1) {
            System.out.println("peresekayutsya");
        }
        else{
            System.out.println("ne peresekayutsya");
        }

        System.out.println("ex 6.92");//???

        System.out.println("ex 6.93");//???
        int osadkiMay[] = new int[31];
        osadkiMay[0] = 0;
        Random rnd = new Random();
        for(int i = 1; i<osadkiMay.length-1; i++){
           osadkiMay[i] = rnd.nextInt(4);
        }
        int i1 = 0;
        i0 = 0;
        while (osadkiMay[i1] == 0) {
            i1++;
            i0++;
        }
        System.out.println(i0);

        System.out.println("ex 7.94");
        int chisla[] = {1,2,3,4,5,6,7,8};
        int proizvedenie = 1;
        for(int i = 0; i<chisla.length; i++){
            proizvedenie = proizvedenie * chisla[i];
        }
        if (proizvedenie < 1000) {
            System.out.println("proizvedenie chisel menshe 1000");
        }
        else{
            System.out.println("proizvedenie chisel ne menshe 1000");
        }

        System.out.println("ex 8.4");
        n = 1;
        int x = 0;
        for(int i = 0; i<5; i++){
            x = i;
            for(int j = 0; j < n; j++){

                System.out.print(x + " ");
                x--;
            }
            n++;
            System.out.println();
        }
        System.out.println("ex 8.4(b");
        n = 4;
        int pervayaCifra = 6;
        x = pervayaCifra-1;
        y1 = 0;
        for(int i = 0; i<4; i++){
            System.out.print(pervayaCifra + " ");
            y1 = x;
            for(int j = 0; j<n; j++){
              System.out.print(y1 + " ");
              y1--;
            }
            x--;
            n--;
            System.out.println();
            pervayaCifra++;
        }
        System.out.println(2);
        System.out.println("ex 8.4(c");
        n = 1;
        x = 31;
        y1  = 0;
        for(int i = 0; i<5; i++){
            x--;
            y1 = x;
            for(int j = 0; j<n; j++){
            System.out.print(y1 + " ");
            y1++;
            }
            System.out.println();
            n++;
        }
        System.out.println("ex 8.4(d");
        n = 5;
        y1 = 20;
        for(int i = 0; i<5; i++){
x = y1;
            for(int j = 0; j<n; j++){
                
                System.out.print(x + " ");
                x++;
            }
            n--;
            System.out.println();
            y1--;
        }

        System.out.println("ex 11.68");
        int rost[] = new int[20];
        Random rnd2 = new Random();
        int r = 190;
        i0 = 0;
        for(int i = 0; i< rost.length; i++){
            rost[i] = rnd2.nextInt(50)+150;
            if (rost[i]<r) {
                i0++;
            }
        }
        System.out.println(i0);

        System.out.println("ex 4.70");
        double a0 = 2.1;
        double b0 = 4.3;
        if (a0 > b0) {
            System.out.println("a bolshe b");
        }
        if (b0 > a0) {
            System.out.println("b bolshe a");
        }
        System.out.println("ex 4.70(b");//??
        double x0 = a0;
        if (b0 > a0) {
            x0 = b0;
        }
        System.out.println(x0);

        System.out.println("ex 5.69");
        double i01  = 0;
        double i2 = 0;
        double i3 = 1.5;
        n = 6;
        for(int i = 4;i<n; i++) {

        }

        double d[] = new double[1000];
        d[0] = 0;
        d[1] = 0;
        d[2] = 0;
        d[3] = 1.5;
        for(int i = 4; i<=n; i++){
            d[i] = ((i-1)/(Math.pow(i,2)+1) * d[i-1]) - d[i-2] + d[i-3];
        }
        System.out.println(d[n]);

        System.out.println("ex 6.94");
        x = 0;
        y = 0;
        for(int i = 200; x==0;i++){
            if(i%17 == 0){
                y = i;
                x = 1;
            }

        }
            System.out.println(y);

        System.out.println("ex 7.95");
        n = 5;
        double chis[] = {1.2,2.3,3.4,4.5,5.6};
        double proizveden = 1;
        double s = 1000;
        for(int i = 0; i<n; i++){
            proizveden = proizveden * chis[i];
        }
        if (proizveden > s) {
            System.out.println("proizvedenie bolshe");
        }
        else{
            System.out.println("proizvedenie ne bolshe");
        }










        System.out.println("ex 12.24");
        int massiv[][] = new int[6][6];
        a = 0;
        int b = 1;
        for(int i = 1; i<massiv.length; i++){
            for(int j = 1; j<massiv.length; j++){
                
            }
        }
    }
}
