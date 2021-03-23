package practice;

public class HomeWork013 {
    public static void main(String[] args){
        System.out.println("ex 4.13");
        System.out.println("ex 4.14");
        System.out.println("ex 4.15");
        double gr = 1958;
        double mr = 3;
        double ng = 2019;
        double mNow = 4;
        double gVmr = mr/12;
        double gVmNow = mNow/12;
        double vozrast = (ng+gVmNow)-(gr+gVmr);
        System.out.println(vozrast);

        System.out.println("ex 4.16");
        double krug = 100;
        double kvadrat = 70;
        double dKr = 2*Math.sqrt(krug/3.14);
        double dKv = Math.sqrt(kvadrat);
        if (dKr>dKv){
            System.out.println("dKr - bolshe");
        }
        else{
            System.out.println("dKv - bolshe");
        }
    }
}
