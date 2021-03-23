package practice;

public class Lesson059 {
    public static void main(String[] args){
        System.out.println("ex 6.40");
        int chislo = 1465;
        int cifra = 0;
        int i = 0;
        int a[] = new int[16];
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            a[i] = cifra;
            i++;
        }
        //System.out.println(a[i-3]);

        System.out.println("ex 6.40(b");
        chislo = 123;
        int number = chislo;
        int chisl = chislo;
        cifra = 0;
        int cifr = 0;
        i = 0;
        int i0 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i++;
        }
        double w = Math.pow(10,i-1);
        System.out.println(w);
        System.out.println("chisl " + chisl);
        System.out.println(chisl/(int)w);
        while (i0 >= 3) {
            cifr = chisl/(int)w;
            chisl = chisl-((int)w*cifra);
            w = w/10;
            i0++;
            System.out.println(cifr);
        }

    }
}
