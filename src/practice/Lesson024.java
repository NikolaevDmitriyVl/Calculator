package practice;

public class Lesson024 {
    public static void main(String[] args) {
        System.out.println("ex 4.113");
        int currentDayMonthNumber = 3;
        int currentDayChislo = 1;
        int nextDayMonthNumber;
        int nextDayChislo;
        int prevDayMonthNumber;
        int prevDayChislo;

        String answer = "";

        nextDayMonthNumber = currentDayMonthNumber;
        nextDayChislo = currentDayChislo + 1;

        prevDayMonthNumber = currentDayMonthNumber;
        prevDayChislo = currentDayChislo - 1;




        switch (currentDayMonthNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(currentDayChislo == 31){
                    nextDayMonthNumber += 1;
                    nextDayChislo = 1;
                }
                break;


            case 4:
            case 6:
            case 9:
            case 11:
                if(currentDayChislo == 30){
                    nextDayMonthNumber += 1;
                    nextDayChislo = 1;
                }

                break;
            case 2:
                if (currentDayChislo == 28){
                    nextDayMonthNumber += 1;
                    nextDayChislo = 1;
                }

        }
        System.out.println(nextDayMonthNumber + " " + nextDayChislo);
        }



}