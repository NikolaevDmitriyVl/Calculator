package practice;

public class Lesson020 {
    public static void main(String[] args){
        System.out.println("ex 4.75");
        double p = 28;
        if(p < 0){
            p = p * -1;
        }

        double a = 39;
        if (a<0){
            a = a * -1;
        }
        double poluSumma = (p + a) / 2;
        double kvadratniyKoren = Math.sqrt((p * a));

        System.out.println("ex 4.104");
        int dayNumber = 3;
        String answer = "Now are ";
        switch(dayNumber){
            case 1:
                answer = answer + "пн";
                break;
            case 2:
                answer += "вт";
                break;
            case 3:
                answer += "ср";

            case 4:
                answer += "чт";
            case 5:
                answer += "пт";
            case 6:
                answer += "сб";
            case 7:
                answer += "вс";


        }

        System.out.println(answer);

        System.out.println("ex 4.105");
        int month = 8;
        answer = "";
        switch (month) {
            case 1:
                answer += "yanvar";
                break;
            case 2:
                answer += "fevral";
                break;
            case 3:
                answer += "mart";
                break;
            case 4:
                answer += "aprel";
                break;
            case 5:
                answer += "may";
                break;
            case 6:
                answer += "iyun";
                break;
            case 7:
                answer += "iyul";
                break;
            case 8:
                answer += "avgust";
                break;
            case 9:
                answer += "sentyabr";
                break;
            case 10:
                answer += "oktyabr";
                break;
            case 11:
                answer += "noyabr";
                break;
            case 12:
                answer += "dekabr";
        }
        System.out.println(answer);

    }
}
