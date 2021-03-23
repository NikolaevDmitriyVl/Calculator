package practice;

public class Lesson014 {
    public static void main(String[] args) {
        System.out.println("ex 4.15");
        double gr = 1958;
        double mr = 4;
        double ng = 2019;
        double mNow = 3;
        double let = ng - gr;
        double mes = mNow - mr;
        if (mes > 0) {
            System.out.println(let);
        } else if (mes >= 0) {
            System.out.println(let - 1);
        }
        System.out.println("ex 4.20");
        int m = 40;
        int n = 20;
        if (m % n == 0) {
            System.out.println("delitsya");

        }else{
            System.out.println("ne delitsya");
        }
        System.out.println("ex 4.21");
        int a = 5;
        int b = 3;
        if (b%a == 0) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println("ex 4.22");
        int nChislo = 45;
        if (nChislo%2 == 0 ){
            System.out.println("chetnoe");

        }
        if (nChislo%10==7){
            System.out.println("verno");
        }


    }
}
