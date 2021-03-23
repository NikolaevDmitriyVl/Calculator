package practice;

public class HomeWork042 {
    public static void main(String[] args){
        System.out.println("ex 4.91(a");
        int x = -1;
        int y = 1;
        if (x<0){
            y= 0;
        }
        else{
            y=1;
        }
        System.out.println(y);
        System.out.println("ex 4.91(b");
        int x0 = 1;
        int y0 = 0;
        if(x<0){
            y0=1;
        }
        if(x == 0){
            y0 = 0;
        }
        else{
            y0= -1;
        }
        System.out.println(y0);

        System.out.println("ex 4.91(c");
        double x1 = 4;
        double y1 = 1;
        if(x1 == 0){
            y1 = 0.5;
        }
        else{
            y1 = 1;
        }
        System.out.println(y1);

        System.out.println("ex 4.39");
        int x2 = 1;
        int y2 = 0;
        if(y2==0 && x<-1 && x>5){
            System.out.println("tochka ne popadaet");
        }
        else{
            System.out.println("tochka popadaet");
        }

        System.out.println("ex 4.40");
        double x3 = 3;
        double f = x3;
        if(x>=-2.4 && x<=5.7){
            f = Math.pow(f,2);
        }
        else{
            f = 4;
        }
        System.out.println(f);

        System.out.println("ex 4.41");//???
        double x4 = 5;
        double sin = 2;
        double f0 = x4* sin;
        if(x4>= 0.2 && x <= 0.9){
            f0 = f0;
        }
        else{
            f0 = 1;
        }
        System.out.println(f0);

        System.out.println("ex 4.42");
        double a = 1;
        double b = 2;
        double c = 3;
        if(a<b && b<c){
          System.out.println("neravenstvo vipolnyaetsya");
        }
        else {
            System.out.println("neravenstvo ne vipolnyaetsya");
        }

        System.out.println("ex 4.43");

    }
}
