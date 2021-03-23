package practice.Lesson094;

public class Lesson094 {

    public double ex_5_93g(int n){
        double otvet = 0;
        double r = 3;
        for(int i = n; i>0; i++){
            otvet = Math.sqrt(i*r + otvet);

        }
        return otvet;
    }
    public static void main(String[] args){
        System.out.println("ex 10.3");
        Lesson094 leson = new Lesson094();

        int i = 10;
        double ot = leson.ex_5_93g(i);
        System.out.println(ot);

    }
}
