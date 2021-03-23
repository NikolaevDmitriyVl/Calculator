package practice;

public class Lesson019 {
    public static void main(String[] args) {
        System.out.println("ex 4.67");
        int k = 14;
        if (k % 7 == 6 || k % 7 == 0) {
            System.out.println("vihodnoy");
        } else {
            System.out.println("budniy den");


        }

        System.out.println("ex 4.65");
        int god = 2004;//1900;//1999 2004 1900
        if ((god % 4 == 0 && god % 100 != 0) || (god % 400 == 0)) {
            System.out.println("god yavlyaetsya visokosnim");
        } else {
            System.out.println("god ne yavlyaetsya visokosnim");
        }

        System.out.println("ex 4.70");
        double a = 50;
        double b = 60;

        if (a>b){
            System.out.println("a - bolshe");
        }
        if (a<b){
            System.out.println("b - bolshe");
        }
        System.out.println("ex 4.70(b");
        String answer = "переменная а - больше";
        if (a<b){
            answer = "переменная а - меньше";
        }
        System.out.println(answer);


    }
}
