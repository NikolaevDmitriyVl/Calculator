package practice;

public class Lesson036 {
    public static void main(String[] args){
        System.out.println("ex 2.37(a");
        int k = 180;
        int delenie = k/2;
        int ostatok = k%2;
        int ostatokAndDelenie = ostatok + delenie;
        System.out.println(ostatokAndDelenie);

        System.out.println("ex 2.37(b");
        int chislo = ostatokAndDelenie + 9;
        System.out.println(chislo);

        System.out.println("ex 2.37(c");
        int cifra = 1;
        if(k/2 == 0){
            cifra = chislo%10;
        }else{
            cifra = chislo/10;
        }
        System.out.println(cifra);

        System.out.println("ex 2.40");
        double q = 163.25;
        int chas = (int) q/30;
        int ostatokchas = (int) q%30;
        int  minut = ostatokchas*60;
        System.out.println(chas + "" + minut);


    }
}
