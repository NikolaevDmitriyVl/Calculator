package practice;

public class Lesson009 {
    public static void main(String[] args) {
        System.out.println("ex 2.20");
        System.out.println("");
        System.out.println("ex 2.20(a");
        int n004 = 2531;

        int tisyachi002 = n004 / 1000;
        int sotniOstatok001 = n004 % 1000;
        int sotni003 = sotniOstatok001 / 100;
        int desyatkiOstatok001 = sotniOstatok001 % 100;
        int desyatki003 = desyatkiOstatok001 / 10;
        int edinici002 = desyatkiOstatok001 % 10;
        int result = edinici002 * 1000 + desyatki003 * 100 + sotni003 * 10 + tisyachi002;
        System.out.println(result);
        System.out.println(edinici002 + "" + desyatki003 + "" + sotni003 + "" + tisyachi002);
        System.out.println("ex 2.20(b");
        System.out.println(sotni003 + "" + tisyachi002 + "" + edinici002 + "" + desyatki003);
        System.out.println("ex 2.20(c");
        System.out.println(tisyachi002 + "" + desyatki003 + "" + sotni003 + "" + edinici002);
        System.out.println("ex 2.20(d");
        System.out.println(desyatki003 + "" + edinici002 + "" + tisyachi002 + "" + sotni003);

        System.out.println("ex 2.8");
        int k = 8;
        int n = k%7;
        System.out.println(n);
        int m = k%7+1;
        System.out.println(m);
        int q = 3;
        int w = n+q;
        System.out.println(w);

        System.out.println("ex 2.9");
        int n1 = 8;
        int x = n+1;
        System.out.println(x);

        System.out.println("ex 2.11");
        int n001 = 36;
        int n002 = n001/10;
        int n003 = n001%10;
        int result1 = n003*10+n002;
        System.out.println(result1);

        System.out.println("ex 2.12");
        int n014 = 675;
        int sotni = n014/100;
        int n005 = n014%100;
        int desyatki = n005/10;
        int edinici = n005%10;
        int summa = sotni+desyatki+edinici;
        System.out.println(edinici);
        System.out.println(desyatki);
        System.out.println(summa);



    }
}
