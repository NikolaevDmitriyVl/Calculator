package practice;

public class HomeWork019 {
    public static void main(String[] args) {
        System.out.println("ex 4.71(a");
        double q = 36;
        double w = 44;

        if (q > w) {
            System.out.println("q - bolshe , w - menshe");
        }
        if (w > q) {
            System.out.println("w - bolshe , q - menshe");
        }
        System.out.println("ex 4.71(b");
        String otvet = "q - bolshe , w - menshe";
        if (w > q) {
            otvet = "w - bolshe , q - menshe";
        }
        System.out.println(otvet);

        System.out.println("ex 4.72(a");
        double e = 25;
        double r = 33;
        double t = 16;
        if (e > r && e > t) {
            System.out.println("e - bolshe");
        }
        if (r > e && r > t) {
            System.out.println("r - bolshe");
        }
        if (t > e && t > r) {
            System.out.println("t - bolshe");
        }

        System.out.println("ex 4.72");
        if (e < r && e < t) {
            System.out.println("e - menshe");
        }
        if (r < e && r < t) {
            System.out.println("r - menshe");
        }
        if (t < e && t < r) {
            System.out.println("t - menshe");
        }


        System.out.println("ex 4.73");
        double y = 6;
        double u = 25;
        double i = 36;
        double o = 99;
        if (y > u && y > i && y > o) {
            System.out.println("y - bolshe");
        }
        if (u > y && u > i && u > o) {
            System.out.println("u - bolshe");
        }
        if (i > y && i > u && i > o) {
            System.out.println("i - bolshe");
        }
        if (o > y && o > u && o > i) {
            System.out.println("o - bolshe");
        }
        System.out.println("ex 4.73(b");
        if (y < u && y < i && y < o) {
            System.out.println("y - naimenshee");
        }
        if (u < y && u < i && u < o) {
            System.out.println("u - naimenshee");
        }
        if (i < y && i < u && i < o) {
            System.out.println("i - naimenshee");
        }
        if (o < y && o < u && o < i) {
            System.out.println("o - naimenshee");

        }

        System.out.println("ex 4.74");
        double modul = -5;
        double modulPolozitelniy = modul;
        double modulOtricatelniy = modul * (-1);
        if (modul > 0) {
            System.out.println("modulPolozitelniy " + " " + modulPolozitelniy);
        }
        if (modul < 0) {
            System.out.println("modulOtricatelniy" + " " + modulOtricatelniy);
        }

        System.out.println("ex 4.75");
        double p = Math.abs(78);
        if(p < 0){
            p = p * -1;
        }

        double a = Math.abs(39);
        double poluSumma = (p + a) / 2;
        double kvadratniyKoren = Math.sqrt((p * a));


        System.out.println("ex 4.76");
        double s1 = 30;
        double s2 = 20;
        double s3 = 0;
        if (Math.abs(s1) > Math.abs(s2)) {
            s3 = s1 / 2;
            System.out.println(s3);
        }

        System.out.println("ex 4.77");
        double d1 = 10;
        double d2 = 20;
        double d3 = 0;
        if (Math.sqrt(d2) < d1) {
            d3 = d2 * 5;
            System.out.println(d3);
        }

        System.out.println("ex 4.78");
        int f1 = 7;
        int f2 = 4;
        int f3 = 3;
        if (f1 % 2 == 0) {
            System.out.println("f1 - chetnoe");
        }

        if (f2 % 2 == 0) {
            System.out.println("f2 - chetnoe");
        }
        if (f3 % 2 == 0) {
            System.out.println("f3 - chetnoe");
        }

        System.out.println("ex 7.79");
        double g1 = 28;
        double g2 = 62;
        double g3 = -102;
        double otvet1 = 0;
        double otvet2 = 0;
        double otvet3 = 0;
        if (g1>0){
            otvet1 = Math.sqrt(g1);
            System.out.println(otvet1);
        }
        if (g2>0){
            otvet2 = Math.sqrt(g2);
            System.out.println(otvet2);
        }
        if (g3>0){
            otvet3 = Math.sqrt(g3);
            System.out.println(otvet3);
        }

        System.out.println("ex 4.80(a");
        double h1 = 25;
        double h2 = 34;
        double h3 = 61;
        if (h1>1.6 && h1<3.8){
            System.out.println("chislo h1 - podhodit");
        }
        if (h2>1.6 && h2<3.8){
            System.out.println("chislo h2 - podhodit");
        }
        if (h3>1.6 && h3<3.8){
            System.out.println("chislo h3 - podhodit");
        }
        System.out.println("ex 4.80(b");
        if (h1>0.7 && h1<5.1){
            System.out.println("chislo h1 - podhodit");
        }
        if (h2>0.7 && h2<5.1){
            System.out.println("chislo h2 - podhodit");
        }
        if(h3>0.7 && h3<5.1){
            System.out.println("chislo h3 - podhodit");
        }



    }
}
