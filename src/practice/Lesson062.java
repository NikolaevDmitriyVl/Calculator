package practice;

public class Lesson062 {
    public static void main(String[] args){
        System.out.println("ex ???");
        int chislo = 134425;
        int chislo0 = chislo;
        int cifra = 0;
        int cifra0 = cifra;
        int i = 0;
        int i0 = 0;
        int i1 = 0;
        int maxCifra = 0;
        int maxCifra2 = 0;
        int maxCifra3 = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i++;}
        double w = Math.pow(10,i-1);
        while (chislo0>0){
            cifra0 = chislo0 / (int) w;
            chislo0 = chislo0 - cifra0 * (int) w;
            w = w/10;
            i0++;
            if(cifra0>maxCifra){
                maxCifra3 = maxCifra2;
                maxCifra2 = maxCifra;
                maxCifra = cifra0;
                i1 = i0;
            }
        }
        System.out.println("cifra " + maxCifra + " poryadkoviy nomer = " + i1);
        System.out.println("maxCifra2 = " + maxCifra2 + " maxCifra3 = " + maxCifra3);


        /// 7 4 6 5
    }
}
