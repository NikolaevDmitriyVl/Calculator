package practice;

public class Lesson053 {
    public static void main(String[] args){
        System.out.println("ex 6,8");
        int q[] = {1,4,9,16,25};
        int n = 15;
        int i = 0;
        while(q[i] < n){
            System.out.println(q[i]);
            i++;

        }

        System.out.println("ex 6.9");
        int w[] = {1,4,9,16,25};
        int n0 = 20;
        int i0 = 0;
        while(w[i0] < n0){
            i0++;
        }
        System.out.println(w[i0]);

        System.out.println("ex 6.10");
        int n1 = 65;
        int i1 = 0;
        while(Math.pow(i1,2) < n1){
            System.out.println(Math.pow(i1,2));
            i1++;
        }

        System.out.println("ex 6.11");
        double a = 1.3;
        int i2 = 2;
        double result = 1.55;
        do{
            result = 1+ (1.0/i2);
            System.out.println(result);
            i2++;
        }while(result > a);




    }
}
