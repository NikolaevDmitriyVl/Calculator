package practice.Lesson106;

public class Lesson106 {
    public static void main(String args[]) {
        System.out.println("ex 7.127");
        int chislo = 127;
        int i0 = 0;
        for (int i = 1; i <= chislo; i++) {
            if (chislo % i == 0) {
                i0++;
            }
        }
        if (i0 == 2) {
            System.out.println("chislo yavlyaetsya prostim");
        }

        System.out.println("ex 6.52");
        chislo = 127;
        i0 = 1;
        int i1 = 0;
        while (i0 <= chislo) {
            if (chislo % i0 == 0) {
                i1++;
            }
            i0++;
        }
        if (i1 == 2) {
            System.out.println("chislo yavlyaetsya prostim");
        }

        System.out.println("ex 4.125");
        chislo = 21;
        if (chislo % 10 == 0 || (chislo % 10 > 4 && chislo % 10 < 10)) {
            System.out.println(chislo + " let");
        }
        if (chislo % 10 == 1) {
            System.out.println(chislo + " god");
        }
        if (chislo % 10 == 2 || chislo % 10 == 3 || chislo % 10 == 4) {
            System.out.println(chislo + " goda");
        }

        System.out.println("ex 4.127");
        chislo = 1;
        int rubli = chislo / 100;
        int kopeyki = chislo % 100;
        System.out.println(rubli);
        System.out.println(kopeyki);

        if (rubli > 10 && rubli < 20) {
            System.out.print(rubli + " rubley ");
        }
        else if (rubli % 10 == 0 || (rubli % 10 > 4 && rubli % 10 < 10)) {
            System.out.print(rubli + " rubley ");
        } else if (rubli % 10 == 1) {
            System.out.print(rubli + " rubl ");
        } else if (rubli % 10 == 2 || rubli % 10 == 3 || chislo % 10 == 4) {
            System.out.print(rubli + " rublya ");
        }

        if (kopeyki > 10 && kopeyki < 20) {
            System.out.println(kopeyki + " kopeek");
        }
        else if(kopeyki % 10 == 0 || (kopeyki % 10 > 4 && kopeyki % 10 < 10)) {
            System.out.println(" " + kopeyki + " kopeek");
        } else if (kopeyki % 10 == 1) {
            System.out.println(" " + kopeyki + " kopeyka");
        } else if (kopeyki % 10 == 2 || kopeyki % 10 == 3 || kopeyki % 10 == 4) {
            System.out.println(" " + kopeyki + " kopeyki");
        }




    }
}

