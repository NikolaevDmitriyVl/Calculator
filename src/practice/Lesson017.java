package practice;

public class Lesson017 {
    public static void main(String[] args) {
        System.out.println("ex 4.53");
        int a = 10;
        int b = 20;
        int c = 30;

        int x = 11;
        int y = 31;

        if((a < x && b < y) || (a < y && b < x)){
            System.out.println("proidet");
        }else if ((a < x && c < y) || (c < x && a < y)){
            System.out.println("proidet");
        }else if ((b < x && c < y) || (c < x && b < y)) {
            System.out.println("proidet");
        }else{
            System.out.println("NE proidet");
        }
/*        if (x > c && y > b) {
            System.out.println("proidet");
        } else  if (x > a && y > b) {
            System.out.println("proydet")
        } else  if (x > c && y > a) {
            System.out.println("proydet");
        } else {
            System.out.println("ne proydet");
        }*/


        System.out.println("ex 4.54");
        int a1 = 40;
        int b1 = 20;
        int c1 = 15;
        int b2 = 34;
    }
}
