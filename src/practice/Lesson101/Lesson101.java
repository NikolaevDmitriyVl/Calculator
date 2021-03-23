package practice.Lesson101;

public class Lesson101 {
    public static void main(String[] args) {
        System.out.println("ex 4.102");
        int x = -1;
        int y = 2;
        if (x > 0 && y > 0) {
            System.out.println("chetvert 1");
        } else if (x > 0 && y < 0) {
            System.out.println("chetvert 2");
        } else if (x < 0 && y < 0) {
            System.out.println("chetvert 3");
        } else if (x < 0 && y > 0) {
            System.out.println("chetvert 4");
        }

        System.out.println("ex 4.126");

        for (int k = 0; k < 110; k++) {
            if (k % 10 == 1 && k != 11) {
                System.out.println("mi nashli " + k + " гриб");
            } else if (k > 9 && k < 20) {
                System.out.println("mi nashli " + k + " грибов");
            } else if (k % 10 == 2 || k % 10 == 3 || k % 10 == 4) {
                System.out.println("mi nashli " + k + " гриба");
            } else if (k % 10 > 4 && k % 10 < 11 || k % 10 == 0 || k == 11 || k > 0 && k < 10 && k > 19) {
                System.out.println("mi nashli " + k + " грибов");
            }

        }

        System.out.println("ex 4.135");
        double t = 13.3;
        int w = (int) t;
        double chislo = t - w;
        System.out.println(chislo);
        int otwet = (int) t % 6;
        if (chislo > 0) {
            otwet = otwet + 1;
        }
        if (otwet % 6 > 0 && otwet % 6 < 4) {
            System.out.println("zeleniy");
        } else if (otwet % 6 > 3 && otwet < 5) {
            System.out.println("zeltiy");
        } else if (otwet % 6 > 4) {
            System.out.println("krasniy");
        }


    }
}
