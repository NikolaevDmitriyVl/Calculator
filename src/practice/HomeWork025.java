package practice;

public class HomeWork025 {
    public static void main(String[] args) {
        System.out.println("ex 5.28(b");
        int a = 5;
        int proizvedenie = 1;
        for (int i = a; i < 20; i++) {
            proizvedenie = proizvedenie * i;
        }
        System.out.println(proizvedenie);


        System.out.println("ex 5.28(c");
        int b = 11;
        int proizvedenie1 = 1;
        for (int i = 1; i <= b; i++) {
            proizvedenie1 = proizvedenie1 * i;
        }
        System.out.println(proizvedenie);

        System.out.println("ex 5.28(d");
        int q = 15;
        int w = 12;
        int proizvedenie2 = 1;
        for (int i = w; i <= q; i++) {
            proizvedenie2 = proizvedenie2 * i;
        }
        System.out.println(proizvedenie2);

        System.out.println("ex 4.114(a");
        int year = 2019;
        int month = 1;
        int day = 1;
        int nextYear;
        int nextMonth;
        int nextDay;
        int prevYear;
        int prevMonth;
        int prevDay;

        String answer = "";
        prevYear = year;
        prevMonth = month;
        prevDay = day - 1;

        switch (month) {
            case 1:
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                if (month == 1 && day == 1) {
                    prevYear = year - 1;
                }
                if (day == 1) {
                    if (month - 1 == 0) {
                        prevMonth = 12;
                    } else {
                        prevMonth = month - 1;
                    }
                    prevDay = 31;
                }
                break;

            case 5:
            case 7:
            case 10:
            case 12:
                if (prevMonth == 1 && day == 1) {
                    prevYear = year - 1;
                }
                if (day == 1) {
                    if (month - 1 == 0) {
                        prevMonth = 12;
                    } else {
                        prevMonth = month - 1;
                    }
                    prevDay = 30;
                }
                break;

            case 3:
                if (month == 1 && day == 1) {
                    prevYear = year - 1;
                }
                if (day == 1) {
                    if (month - 1 == 0) {
                        prevMonth = 12;
                    } else {
                        prevMonth = month - 1;
                    }
                    prevDay = 28;
                }

        }
        System.out.println(prevYear + " " + prevMonth + " " + prevDay);
    }
}
