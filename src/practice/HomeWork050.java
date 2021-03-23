package practice;

public class HomeWork050 {
    public static void main(String[] args) {
        System.out.println("ex 5.78");
        int x = 4;
        int q = x;
        int y = 6;
        int e = 1;

        for (int i = 0; i < 6; i++) {

            x = x + q;
            System.out.println(x);
        }

        System.out.println("ex 5.81");
        int x0 = 5;
        int y0 = 3;
        int proizvedenie = 0;
        for (int i = 0; i < y0; i++) {
            proizvedenie = proizvedenie + x0;
            System.out.println(proizvedenie);
        }

        System.out.println("ex 5.82");
        int n = 6;
        int faktorial = 1;
        for (int i = 2; i <= n; i++) {
            faktorial = faktorial * i;

    }
            System.out.println(faktorial);

        System.out.println("ex 5.83");
        double a = 5.5;
        double n0 = 1;
        double stepen = 1;
        if ( n0 == 0){
            System.out.println("1");
        }

        else{
            for(int i = 1; i<=n0; i++) {
                stepen = stepen * a;
            }
                System.out.println(stepen);

        }
    }
}
