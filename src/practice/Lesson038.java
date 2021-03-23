package practice;

public class Lesson038 {
    public static void main(String[] args){
        System.out.println("ex 2.34");
        int a1 = 1;
        int a2 = 2;//21
        int b = 3;//3
        int c1 = a2;

        int c2 = a1+b;
        if (c2>9) {
            c1 = c1 + 1;
            c2 = c2 % 10;
        }
        System.out.println(c1 + ""+ c2);
        int d1 = (a1+ b)%10;
        int d2 = a2 + (a1+b)/10;
        System.out.println(d2 + "" + d1);

        System.out.println("ex 4.136(a");
        int k = 16;
        if(k%7 == 6){
            System.out.println("subbota");
        }
        if(k%7 == 7){
            System.out.println("voskreseniye");
        }
        else{
            System.out.println("rabochie dni");
        }
        System.out.println("ex 4.136(b");
        k = 18;
        int d = 5;
        int c = (k%7)-d;
        System.out.println(c);
        if(c%7 == 6){
            System.out.println("subbota");
        }
        if(c%7 == 7){
            System.out.println("voskreseniye");
        }
        if(c%7 > 0 && c%7 < 6){
            System.out.println("rabochie dni");
        }

    }
}
