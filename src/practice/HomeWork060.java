package practice;

public class HomeWork060 {
    public static void main(String[] args){

        System.out.println("ex 4.13");
        double a = 1.1;
        double b = 2.1;
        double c = 3.1;
        double x, x1, x2;
        double d = b*b - 4*a*c;
        if(d>0){
            x1 = (-b+ Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println(x1+" "+x2+";");
        }
        if (d == 0) {
           x = -b/(2*a);
           System.out.println(x+";");
        }
        if (d < 0) {
            System.out.println("korney ne imeet");
        }

        System.out.println("ex 4.14");
        double a1 = 1.1;
        double b1 = 2.1;
        double c1 = 3.1;
        double x10, x11, x21;
        double d1 = b1*b1 - 4*a1*c1;
        if(d1>0){
            x11 = (-b1+ Math.sqrt(d1))/(2*a1);
            x21 = (-b1 - Math.sqrt(d1))/(2*a1);
            System.out.println(x11+" "+x21+";");
        }
        if (d1 == 0) {
            x10 = -b1/(2*a1);
            System.out.println(x10+";");
        }
        if (d1 < 0) {
            System.out.println("variant ravenstva korney otdelno ne rassmatrivat");
        }

        System.out.println("ex 5.14");
        for(int i = 1; i<= 9; i++){
         System.out.println("9 * " + i + " = " + (i*9));
        }

        System.out.println("ex 6.40");
        int chis = 1465;
        int cif = 0;
        int ii = 0;
        int r[] = new int[16];
        while (chis > 0) {
            cif = chis%10;
            chis = chis/10;
            r[ii] = cif;
            ii++;
        }
        System.out.println(r[ii-3]);

        System.out.println("ex 6.40(b");
        int chislo = 124;
        int number = chislo;
        int chisl = chislo;
        int cifra = 0;
        int cifr = 0;
        int i = 0;
        int i0 = 0;
        int t[] = new int[10];
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i++;
        }
        double w = Math.pow(10,i-1);
        while (i0 < i) {
            cifr = chisl/(int)w;//1,2,3
            chisl = chisl-((int)w*cifr);//23,3,0
            w = w/10;//10,1,0
            i0++;//1,2,3
            t[i0] = cifr;
            //System.out.println(cifr);
           // System.out.println(i0);
            //System.out.println();
            //System.out.println();
        }
        System.out.println(t[3]);
    }
}
