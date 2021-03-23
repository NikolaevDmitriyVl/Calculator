package practice;

public class HomeWork018 {
    public static void main(String[] args){
        System.out.println("ex 4.64");
        int q = 623456;
        int handredThousand = q/100000;//6
        int ostatok = q%100000;//23456
        int tenThousand = ostatok/10000;//2
        int ostatok1 = ostatok%10000;//3456
        int thousand = ostatok1/1000;//3
        int ostatok2 = ostatok1%1000;//456
        int handred = ostatok2/100;//4
        int ostatok3 = ostatok2%100;//56
        int ten = ostatok3/10;//5
        int one = ostatok3%10;//4
        if (handredThousand+tenThousand+thousand==handred+ten+one) {
            System.out.println("chislo yavlyaetsya schastlivim");
        }
        else {
            System.out.println("chislo ne yavlyaetsya schastlivim");
        }

        System.out.println("ex 4.65");
        int god = 2020;
        if(god%4==0){
            System.out.println("god yavlyaetsya visokosnim");
        }
        else {
            System.out.println("god ne yavlyaetsya visokosnim");
        }

        System.out.println("ex 4.66");
        int a = 1000;
        int b = 500;
        int c = 25;
        int d = 15;
        int e = 4;
        if((a/d)*(b/e)>(a/e)*(b/d)){
            System.out.println("s variantom d - vdol, e - poperek pomestitsya bolshe");
        }
        else {
            System.out.println("s variantom e - vdol, d - poperek pomestitsya bolshe");
        }

        System.out.println("ex 4.67");
        int k = 14;
        if (k%7>5){
            System.out.println("vihodnoy");
        }
        else {
            System.out.println("budniy den");
        }

        System.out.println("ex 4.68");
        double v0 = 1620;
        double alpha = 35;
        double t = 2;
        double g = 9.8;
        double r = 10;
        double h = 10;
        double p = 10;
        double x = v0*t*Math.cos(alpha);
        double y = v0*t*Math.sin(alpha)-(g*Math.pow(t,2)/2);
        if (x==r && y>h && y<h+p){
            System.out.println("porazit");
        }
        else {
            System.out.println("ne porazit");
        }

        System.out.println("ex 4.69");
        int a1x = 1;
        int a1y = 1;
        int b1x = 6;
        int b1y = 6;
        int c1x = 11;
        int c1y = 6;
        int d1x = 11;
        int d1y = 1;
        int a2x = 3;
        int a2y = 3;
        int b2x = 3;
        //int b2y

    }
}
