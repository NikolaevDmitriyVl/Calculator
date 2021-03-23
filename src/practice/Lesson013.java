package practice;

public class Lesson013 {
    public static void main(String[] args){
        System.out.println("ex 4.7");
        int a = 1;
        int b = 3;
        if (a>b) {
            System.out.println("a - naibolshee");
        }else{

            System.out.println("b - naibolshee");
        }
        System.out.println("ex 4.8");
        double km = 10;
        double ft = 26538;
        double mVkm = km*1000;
        double ftVm = ft*0.305;
        if (ftVm>mVkm){
            System.out.println("ftVm - bolee");
        }
        else {
            System.out.println("mVkm - bolee");
        }
        System.out.println("ex 4.9");
        int kmCh = 5;
        int mS = 6;
        int mSVkmCh = kmCh*1000/3600;
        if (mS>mSVkmCh){
            System.out.println("mS - bolee");
        }
        else {
            System.out.println("mSVkmCh - bolee");
        }
        System.out.println("ex 4.10");
        double r = 10;
        double s = 5;
        double plKr = r*2;
        double plKv = s*s;
        if (plKr>plKv){
            System.out.println("plKr - bolee");
        }
        else {
            System.out.println("plKv - bolee");
        }
        System.out.println("ex 4.11");
        int ob1 = 3;
        int m1 = 2;
        int ob2 = 5;
        int m2 = 6;
        int pl1 = ob1/m1;
        int pl2 = ob2/m2;
        if (pl1>pl2){
            System.out.println("pl1 - bolee");
        }
        else{
            System.out.println("pl2 - bolee");
        }
        System.out.println("ex 4.12");
        int s1 = 5;
        int n1 = 6;
        int s2 = 3;
        int n2 = 8;
        int t1 = s1*n1;
        int t2 = s2*n2;
        if (t1>t2){
            System.out.println("t1 - bolee");
        }
        else{
            System.out.println("t2 - bolee");
        }
    }
}
