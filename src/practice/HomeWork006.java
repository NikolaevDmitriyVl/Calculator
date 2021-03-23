package practice;

public class HomeWork006 {
    public static void main(String[] args) {
        System.out.println("ex 2.6");
        int n = 7265;
        int vsegoMinute = n / 60;
        int hour = vsegoMinute / 60;
        int minute = vsegoMinute % 60;
        int sekond = n % 60;
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(sekond);

        System.out.println("ex 2.5");
        int s = 234;
        int week = s / 7;
        System.out.println(week);

        System.out.println("ex 2.4");
        int distance = 7387;
        int km = distance / 1000;
        System.out.println(km);

        System.out.println("ex 2.3");
        int massa = 4786;
        int tonn = massa / 1000;
        System.out.println(tonn);

        System.out.println("ex 2.2");
        int centner = massa / 100;
        System.out.println(centner);

        System.out.println("ex 2.1");
        int sm = 234;
        int m = sm / 100;
        System.out.println(m);

        System.out.println("ex 1.6" + "1");
        double a = 1;
        double b = 2;
        double c = 3;
        double sin = 4;
        double x = 5;
        double cos = 6;
        double R = 7;
        double d = 8;
        double result = a / b / c;

        System.out.println("ex 1/16" + "2");
        result = a * b / c;

        System.out.println("ex 1.6" + "3");
        result = a / b * c;
        System.out.println("ex 1.6" + "4");
        result = a + b / c;
        System.out.println("ex 1.6" + "5");
        result = a + b / c;
        System.out.println("ex 1.6" + "6");
        result = a + b / b + c;
        System.out.println("ex 1.6" + "7");
        result = a + b / a + c;
        System.out.println("ex 1.6" + "8");
        result = a / sin * b;
        System.out.println("ex 1.6" + "9");
        result = 0.5 * a * b * sin * x;
        System.out.println("ex 1.6" + "10");
        result = 2 * b * c * cos * a / 2 / b + c;
        System.out.println("ex 1.6" + "11");
        result = 4 * R * sin * a / 2 * sin * b / 2 * sin * c / 2;
        System.out.println("ex 1.6" + "12");
        result = a * x + b / c * x + d;
        System.out.println("ex 1.6" + "13");
        result = 2 * sin * a + b / 2 * cos * a - b / 2;
        System.out.println("ex 1.6" + "14");
        result = a * b * c * 2 * sin - 3 * a * b * s * x / 2;


    }
}
