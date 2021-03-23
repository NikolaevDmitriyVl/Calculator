package practice;

public class Lesson057 {
    public static void main(String[] args) {
        System.out.println("ex 6.30");
        int chislo = 183456;
        int cifra = 0;
        int i = 0;
        int cifra8 = 0;
        while (chislo > 0) {
            cifra = chislo % 10;
            chislo = chislo / 10;

            if (cifra == 8) {
                cifra8 = i;
                break;
            }
            i++;
        }
        System.out.println(cifra8);

        System.out.println("ex 6.31");
        chislo = 1898884586;
        cifra = 0;
        int cifra0 = 0;
        i = 0;
        int i0 = 0;
        int maxCifra = 0;
        while(chislo>0){
            cifra = chislo%10;
            chislo = chislo/10;
            if(cifra > maxCifra){
                i0 = 1;
                maxCifra = cifra;
            }else if (cifra == maxCifra){
                i0++;
            }
            i++;
        }
        System.out.println(i0-1);
    }
}


