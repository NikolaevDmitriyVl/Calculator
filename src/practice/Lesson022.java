package practice;

public class Lesson022 {
    public static void main(String[] args){
        System.out.println("4.111(b");
        int currentNumberOfDay = 7;
        int firstDayOfYearNumber = 3;
        int denNedeli = (currentNumberOfDay + firstDayOfYearNumber) % 7;

        // 2 3  16 % 7


        System.out.println(denNedeli);
        String answer = "";
        switch (denNedeli) {
            case 1:
                answer += "ponedelnik";
                break;
            case 2:
                answer += "vtornik";
                break;
            case 3:
                answer += "sreda";
                break;
            case 4:
                answer += "chetverg";
                break;
            case 5:
                answer += "pyatnica";
                break;
            case 6:
                answer += "subbota";
                break;
            case 0:
                answer += "voskresenie";
        }
        System.out.println(answer);

        System.out.println("ex 5.4");
        for(int i = 10; i<=24; i++){
            System.out.println (i+ " " + (i+0.4));
        }
        System.out.println("ex 5.4(b");
        for(int i = 25; i <= 34.8; i++){
            System.out.println(i + " " + (i+0.5) + " " + (i-0.2));
        }


    }
}
