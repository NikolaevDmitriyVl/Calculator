package practice;

public class HomeWork014 {
    public static void main(String[] args){
        System.out.println("ex 2.1");
        int sm = 67;
        int m = sm/100;
        System.out.println(m);

        System.out.println("ex 4.23");
        int n = 99;
        int number1 = n/10;
        int number2 = n%10;
        if (number1>number2){
            System.out.println("cifra1 - bolshe");
        }
        else if (number2>number1){
            System.out.println("cifra2 - bolshe");
        }
        else{
            System.out.println("cifri ravni");
        }
        System.out.println("ex 2.2");
        int kg = 325;
        int centner = kg/100;
        System.out.println(centner);

        System.out.println("ex 4.24");
        double nn = 96;
        double n1 = nn/10;
        double n2 = nn%10;
        double a = Math.pow(nn,2);
        double b = 4*(Math.pow(n1,3)+Math.pow(n2,3));
        if (a>b){
            System.out.println("a bolee");
        }
        else{
            System.out.println("b bolee");
        }
        System.out.println("ex 2.3");
        int kg1 = 7947;
        int t = kg1/1000;
        System.out.println(t);

        System.out.println("ex 4.25");
        int aa = 91;
        int aa1 = aa/10;
        int aa2 = aa%10;
        int summa = aa1+aa2;
        if (summa>9){
            System.out.println("chislo - dvuhznachnoe");
        }
        else {
            System.out.println("chislo - nedvuhznachnoe");
        }
        System.out.println("ex 2.4");
        int metr = 7853;
        int km = metr/1000;
        System.out.println(km);

        System.out.println("ex 4.26");
        double g = 56;
        double g1 = g/10;//5
        double g2 = g%10;//6
        double summaG = g1+g2;
        if (summaG%3>0){
            System.out.println("kratna3");
        }
        if (summaG%g>0){
            System.out.println("kratno");
        }
        else {
            System.out.println("ne kratno");
        }
        System.out.println("ex 2.5");
        int q = 234;
        int week =  234/7;
        System.out.println(week);

        System.out.println("ex 4.27");
        int w = 123;
        int w1 = w/100;//1
        int ww = w%100;//23
        int w2 = ww/10;//2
        int w3 = ww%10;//3
        if (w1==w3){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        


    }
}
