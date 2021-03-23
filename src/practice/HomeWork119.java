package practice;


public class HomeWork119 {
    String month(int a){
        String mon = "";
        switch(a){
            case 1:{
                mon = "january";
            }
            break;
            case 2:{
                mon = "february";

            }
            break;
            case 3:{
                mon = "march";

            }
            break;
            case 4:{
                mon = "april";

            }
            break;
            case 5:{
                mon = "may";

            }
            break;
            case 6:{
                mon = "june";

            }
            break;
            case 7:{
                mon = "july";

            }
            break;
            case 8:{
                mon = "august";

            }
            break;
            case 9:{
                mon = "september";

            }
            break;
            case 10:{
                mon = "october";

            }
            break;
            case 11:{
                mon = "november";

            }
            break;
            case 12:{
                mon = "desember";

            }
            break;
        }
        return mon;
    }
    public static void main(String[] args) {
        System.out.println("ex 4.133");
        int month = 2;
        int day = 1;
        int datePreviousDay = 0;//ne opredelyayut 1 yanvarya
        int dateNextDay = 0;// ne opredelyayut 31 dekabrya
        int m = 0;
        int d = 0;
        //january 31, february 28, march 31, april 30, may 31, june 30, july 31, august 31, september 30, october 31, nowember 30, desember 31
        if (day > 1) {
            m = month;
            d = day-1;
        }
        else{
            m = month-1;
            if(month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11){
                d = 31;
            }
            else if(month == 5 || month == 7 || month == 10 || month == 12){
                d = 30;
            } else if (month == 3) {
                d = 28;
            }
        }
        HomeWork119 homeWork = new HomeWork119();
        System.out.println(d + " " + homeWork.month(m));
        System.out.println("ex 4.133(b");
        month = 2;
        day = 28;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if (day == 31) {
                m = month+1;
                d = 1;
            }
            else{
                m= month;
                d = d+1;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                m = month +1;
                d = 1;
            }
            else{
                m = month;
                d = d+1;
            }
        } else if (month == 2) {
            if (day == 28) {
                m = month +1;
                d = 1;
            }
            else{
                m = month;
                d = d+1;
            }
        }
        System.out.println(d + " " + homeWork.month(m));

        System.out.println("ex 8.48");
        System.out.println("ex 10.27");
        int n = 12;
        int mas[] = {4,4,12,4,16,8,20,8,20,8,24,12};
        int max = 0;
        for(int i = 0; i<mas.length; i++){
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        int i0 = 0;
            for(int j = max; j>= 1; j--){
                for(int i = 0; i<mas.length; i++) {
                    if (mas[i] % j == 0) {
                        i0++;
                    }
                }
                if (i0 == mas.length) {
                    System.out.println(j);
                    break;
                }
                else {
                    i0 = 0;
                }
            }


        System.out.println("ex 11.105");
        System.out.println("ex 12.27");
        System.out.println("ex 13.23");
    }
}
