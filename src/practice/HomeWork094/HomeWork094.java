package practice.HomeWork094;

public class HomeWork094 {
    public double home094ex5_93(){
        int n = 10;
        double reshenie = Math.sqrt(3*10);
        for(int i = n-1; i>0; i--) {
            reshenie = Math.sqrt((3 * i) + reshenie);
        }
        return reshenie;

    }

    public static void main(String[] args){
        System.out.println("ex 4.96");
        double a01 = 3;
        double x01 = 0;
        double x02 = 0;
        double x00 = 0;
        double b01 = 4;
        double c01 = 5;
        double d01 = Math.pow(b01,2) - (4*a01*c01);

        if (d01 > 0) {
            x01 = (-b01 + Math.sqrt(d01)) / (2*a01);
            x01 = (-b01 - Math.sqrt(d01)) / (2*a01);
            System.out.println("veshhestvennie korni imeyutsya " + " x1  = " + x01 + " , x2 = " + x02);
        }
        if (d01 == 0) {
            x00 = -b01 / (2*a01);
            System.out.println("veshhestvennie korni imeyutsya " + " x = " + x00);
        }
        if(d01 < 0){
            System.out.println("veshhestvennie korni otsutstvuyut");
        }

        System.out.println("ex 5.93");

        HomeWork094 homeWork01 = new HomeWork094();
        double otvet = homeWork01.home094ex5_93();
        System.out.println(otvet);

        System.out.println("ex 6.115");
        double a0 = 0;
        double b0 = 1;
        double bolshee = 0;
        double menshee = 0;
        if (a0 < 0) {
             menshee = a0;
        }
        else{
            bolshee = b0;
        }

        if (a0 > 0) {
            bolshee = a0;
        }
        else{
            menshee = b0;
        }
        double tochka = bolshee - menshee;
        double uravnenie = Math.pow(tochka,4) + (2 * Math.pow(tochka,3)) - tochka - 1;
        System.out.println(uravnenie);
        System.out.println("ex 6.115(b");
        a0 = 1;
        b0 = 1.5;
        if(a0<0){
            menshee = a0;
        }
        else{
            bolshee = b0;
        }
        if(b0<0){
            menshee = b0;
        }
        else{
            bolshee = a0;
        }

        tochka = bolshee - menshee;
        uravnenie = Math.pow(tochka,3) - (0.2 * Math.pow(tochka,2)) - 0.2*tochka - 1.2;
        System.out.println(uravnenie);


        System.out.println("ex 7.114");
        int n = 8;
        int x = 5;
        int a[] = {12,13,14,15,16};
        int summa = 0;
        int i0 = 0;
        for(int i = 0; i<a.length; i++){
            if (a[i] > n) {
                summa = summa + a[i];
                i0++;
            }
        }
        int sredneeArifmeticheskoe = summa/i0;
        System.out.println(sredneeArifmeticheskoe);

        System.out.println("ex 8.25");
        int deliteli[][] = new int[20][140];
        i0 = 0;
        int j0 = 0;
        for(int i = 120; i<=140; i++){
            for(int j = 1; j<=140; j++){
                if(i%j  == 0){
                    deliteli[i0][j0] = j;
                    j0++;
                }
                else{
                    deliteli[i0][j0] = 0;
                }
            }
            i0++;
        }

        for(int i = 0; i<20; i++){
            for(int j = 0; j<140;j++){
                if (deliteli[i][j] != 0) {
                    System.out.print(deliteli[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("ex 10.2(d");

        System.out.println("ex 11.84");

        System.out.println("ex 12.14");

        System.out.println("ex 13.11");

    }
}
