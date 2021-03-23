package practice;

public class HomeWork024 {
    public static void main(String[] args){
        System.out.println("ex 4.113(b");
        int currentDayMonthNumber = 1;
        int currentDayChislo = 1;
        int prevDayMonthNumber;
        int prevDayChislo;

        String answer = "";
        prevDayMonthNumber = currentDayMonthNumber;
        prevDayChislo = currentDayChislo - 1;

        switch (currentDayMonthNumber){
            case 1:
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                if(currentDayChislo == 1){
                    prevDayMonthNumber -= 1;
                    prevDayChislo = 31;
                }
                break;
            case 5:
            case 7:
            case 10:
            case 12:
                if(currentDayChislo == 1){
                    prevDayMonthNumber -= 1;
                    prevDayChislo = 30;
                }
                break;
            case 3:
                if(currentDayChislo == 1){
                    prevDayMonthNumber -= 1;
                    prevDayChislo = 28;
                }

        }
        System.out.println("месяц " + prevDayMonthNumber + " день " + prevDayChislo);

        System.out.println("ex 5.22");
        double oneKg = 50;
        double oneGramm = oneKg / 1000;
        for(int i = 100; i < 2001; i += 100){
            System.out.println(i + " gramm stoit " + (i*oneGramm) + " rubley");

        }

        System.out.println("ex 4.114(a");
        int year = 2019;
        int month = 8;
        int day = 7;
        int nextYear;
        int nextMonth;
        int nextDay;
        int prevYear;
        int prevMonth;
        int prevDay;


    }
}
