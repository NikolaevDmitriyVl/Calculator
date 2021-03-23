package practice.HomeWork116;

public class HomeWork116 {
    public static void main(String args[]){
        System.out.println("ex 4.129");
        int year = 1992;
        int month = 1;
        int day = 6;
        int todayYear = 2021;
        int todayMonth = 1;
        int todayDay = 5;

        int m = 0;
        int y = 0;
        int d = 0;
        if (month == todayMonth) {
            if (day <= todayDay) {
                y = todayYear-year;
            }
            else{
                y = todayYear-year-1;
            }
        }

final String format = "%5.2f gradusov po %s\n";
        System.out.println(format);

        System.out.println(" check = " + y);
        System.out.println("ex 8.48");
        System.out.println("ex 10.26");
        System.out.println("ex 11.104");
        System.out.println("ex 12.26");
        System.out.println("ex 13.22");

    }
}
