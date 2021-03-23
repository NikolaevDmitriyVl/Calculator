package practice.Lesson100;

public class Lesson100 {
    public static void main(String[] args){
        System.out.println("ex 5.81");
        int x = 9;
        int y = 3;
        int menshee = 0;
        int bolshee = 0;
        if (x < y || x == y) {
            menshee = x;
            bolshee = y;
        }
        else{
            menshee = y;
            bolshee = x;
        }
        int umnozenie = 0;
        for(int i = 1; i<=(menshee); i++){
            umnozenie = umnozenie + bolshee;

        }
        System.out.println(umnozenie);

        System.out.println("ex 5.86");
        int n = 5;
        x = -1;
        int stepen = 0;
        for(int i = 1; i<=n; i++){
            x = x+2;
            stepen = stepen + x;
            System.out.println(stepen);
        }

        System.out.println("ex 5.87");
        x = -1;
        stepen = 0;
        int summa = 0;
        for(int i = 1; i<=10; i++){
            x = x+2;
            stepen = stepen + x;
            summa = summa + stepen;
            System.out.println(summa);
        }

        System.out.println("ex 5.66");
        double a0 = 1;
        double a1 = 0;

        n = 5;
        for(int k = 1; k<=5; k++){
            a1 = a0;
            a0 = (k * a1) + (1/k);
            System.out.println(a0);
        }
    }
}
