package practice;

public class Lesson016 {
    public static void main(String[] args){
        System.out.println("ex 4.37");
        int s = 46;
        int o = -5;
        int p = 3;
        if (s < o || s>p) {
                System.out.println("ne prinadlezit");
            } else {
                System.out.println("prinadlezit");}

        System.out.println("ex 4.38(a");
        int x = 3;
        int y = 2;
        if (x>3 || y>2){
            System.out.println("popadaet");
        }
        else {
            System.out.println("ne popadaet");
        }
        System.out.println("ex 4.38(b");
        int x1 = -2;
        int y1 = -4;
        if (x1<-2 || y1<-4){
            System.out.println("popadaet");
        }
        else {
            System.out.println("ne popadaet");
        }

        System.out.println("ex 4.39");
        int x2 = 5;
        if(x2>0 || x2>4){
            System.out.println("popadaet");
        }
        else {
            System.out.println("ne popadaet");
        }

        System.out.println("ex 4.42(a");
        double a = 7;
        double b = 9;
        double c = 8;
        if (a<b && b<c){
            System.out.println("vipolnyaetsya");
        }
        else {
            System.out.println("ne vipolnyaetsya");
        }

        System.out.println("ex 4.42(b");
        double b1 = 8;
        double a1 = 3;
        double c1 = 9;
        if (b1>a1 && a1>c1){
            System.out.println("vipolnyaetsya");
        }
        else {
            System.out.println("ne vipolnyaetsya");
        }

        System.out.println("ex 4.43");
        int a2 = 876;
        int b2 = 765;
        if (b%a==0 || a%b==0){
            System.out.println("da odno iz chisel yavlyaetsya delitelem drugogo");
        }
        else {
            System.out.println("net ni odno iz chisel ne yavlyaetsya delitelem drugogo");

        }

        System.out.println("ex 4.44");
        int a4 = 7;
        int b4 = 4;
        int q = a4 % b4;
        int c4 = 8;
        int d4 = 6;
        if (q==c4 || q==d4)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        System.out.println("ex 4.45");
        double a3 = 8;
        double b3 = 5;
        double c3 = 7;
        if (a3==b3 || a3==c3 || b3==c3){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


    }
}
