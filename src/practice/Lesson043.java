package practice;

public class Lesson043 {
    public static void main(String[] args){
        System.out.println("ex 5.3(a");
        int a = 20;
        int b = 35;
        for(int i  = a;  i <= b; i++){
         System.out.println(i);
        }

        System.out.println("ex 5.3(b");
        for(int i = 10; i <= b; i++){
            System.out.println(Math.pow(i,2));
        }

        System.out.println("ex 5.4(a");
        for(int i = 10; i<= 25; i++){
            System.out.println(i + " " + (i+0.4) );
        }
        System.out.println("ex 5.4(b");
        for(int i = 25; i<=35; i++){
            System.out.println(i + " " + (i+0.5) + " " + (i-0.2));
        }

        System.out.println("ex 5.5(a");
        for(int i = 21; i>=10; i--){
            System.out.println(i + " " + (i - 1.8));
            }

        System.out.println("ex 5.5(b");
        for(int i = 45; i>= 25; i--){
            System.out.println(i + " " + (i-0.5) + " " + (i-0.8));
        }

        System.out.println("ex 5.6(a");
        for(int i = 21; i<35; i++){
            System.out.println(i + " " + (i-0.6));
        }
        System.out.println("ex 5.5(b");
        for(int i = 16; i<=24; i++){
            System.out.println(i + " " + (i-0.5) + " " + (i+0.8));
        }
        }
    }
