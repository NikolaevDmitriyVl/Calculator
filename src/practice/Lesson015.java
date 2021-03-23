package practice;

public class Lesson015 {
    public static void main(String[] args){
        System.out.println("ex 4.28");
        int a = 123;
        int a1 = a/100;//1
        int aa = a%100;//23
        int a2 = aa/10;//2
        int a3 = aa%10;//3
        if (a1>a3){
            System.out.println("a1 - bolshe");
        }
        else {
            System.out.println("a3 - bolshe");
        }
        if (a1>a2){
            System.out.println("a1 - bolshe");
        }
        else {
            System.out.println("a2 - bolshe");
        }
        if (a2>a3){
            System.out.println("a2 - bolshe");
        }
        else {
            System.out.println("a3 - bolshe");
        }
        System.out.println("ex 4.29");
        int q = 523;
        int sotni = q/100;//5
        int ostatok = q%100;//23
        int ten = ostatok/10;//2
        int one = ostatok%10;//3
        double q1 = Math.pow(q,2);
        double q2 = Math.pow(sotni,3)+Math.pow(ten,3)+Math.pow(one,3);
        if (q1>q2) {
            System.out.println("q1 - bolshe");
        }
        else {
            System.out.println("q2 - bolse");
        }
        System.out.println("ex 4.30");
        int w = 379;
        int handred = w/100;//3
        int ostatok1 = w%100;//79
        int ten1 = ostatok1/10;//7
        int one1 = ostatok1%10;//9
        int w1 = handred+ten1+one1;
        int w2 = handred*ten1*one1;
        if (w1>9 && w1 < 100){
            System.out.println("summa - dvuhznachnaya");
        }
        else {
            System.out.println("summa ne dvuhznachnaya");
        }
        if (w2>99 && w2 < 1000){
            System.out.println("proizvedenie - trehznachnoe");
        }
        else{
            System.out.println("proizvedenie ne trehznachnoe");
        }
        if (w2>w){
            System.out.println("w2 - bolshe");
        }
        else {
            System.out.println("w - bolshe");
        }
        


    }
}
