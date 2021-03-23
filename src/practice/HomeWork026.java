package practice;

public class HomeWork026 {
    public static void main(String[] args){
        System.out.println("ex 5.31");

        System.out.println("ex 5.32");

        System.out.println("ex 5.33");
        int a = 2;
        int b = a+1;
        int summa = 1;
        for(int i = a; i<11; i++){
            summa = summa + i/b;
        }
        System.out.println(summa);

        System.out.println("ex 5.34");

        System.out.println("ex 4.114(b");
        int year = 2019;
        int month = 12;
        int day = 31;
        int nextYear;
        int nextMonth;
        int nextDay;

        String answer = "";
        nextYear = year;
        nextMonth = month;
        nextDay = day + 1;

        switch (month) {
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
                if (month == 12 && day == 31) {
                    nextYear = year + 1;
                }
                if (day == 31) {
                    if (month + 1 == 13) {
                        nextMonth = 1;
                    } else {
                        nextMonth = month + 1;
                    }
                    if(day == 31){
                        nextDay = 1;
                    }
                }
                break;

            case 3:
            case 5:
            case 8:
            case 10:
                if (month == 12 && day == 30) {
                    nextYear = year + 1;
                }
                if (day == 30) {
                    if (month + 1 == 13) {
                        nextMonth = 1;
                    } else {
                        nextMonth = month + 1;
                    }
                    if(day == 30){
                    nextDay = 1;
                    }
                }
                break;

            case 1:
                if (month == 12 && day == 28) {
                    nextYear = year + 1;
                }
                if (day == 28) {
                    if (month + 1 == 13) {
                        nextMonth = 1;
                    } else {
                        nextMonth = month + 1;
                    }
                    if (day == 28){
                    nextDay = 1;
                    }
                }

        }
        System.out.println(nextYear + " " + nextMonth + " " + nextDay);

    }
}
