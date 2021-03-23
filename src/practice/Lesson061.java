package practice;

public class Lesson061 {
    public static void main(String[] args){
        System.out.println("ex 6.41");
        int chislo = 123456;
        int cifra = 0;
        int maxCifra = 0;
        int maxCifra2 = 0;
        int i = 0;
        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            i++;
            if (cifra > maxCifra) {
                maxCifra2 = maxCifra;
                maxCifra = cifra;

            }
            else if (cifra > maxCifra2) {
                maxCifra2 = cifra;
            }
        }
        System.out.println("maximalnaya cifra = " + maxCifra + " vtoraya maksimalnaya cifra = " + maxCifra2);

        chislo = 155556;
        cifra = 0;
        i = 0;
        int cifra1 = 0;
        int cifra2 = 0;
        int cifra3 = 0;
        int cifra4 = 0;
        while (chislo > cifra) {
            cifra = chislo%10;
            chislo = chislo/10;
            i++;
            if(cifra > cifra1){
                cifra1 = cifra;
            } else if (cifra > cifra2) {
                cifra2 = cifra;
            } else if (cifra > cifra3) {
                cifra3 = cifra;
            } else if (cifra > cifra4) {
                cifra4 = cifra;
            }
        }
        System.out.println("cifra1 = " + cifra1 + " cifra2 = " + cifra2 + " cifra 3 = " + cifra3 + " cifra4 = " + cifra4 );
        }
    }

