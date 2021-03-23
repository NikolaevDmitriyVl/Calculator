package practice;

public class Lesson067 {
    public static void main(String[] args){
        System.out.println("ex 7.16");
        int n[] = {1,2,3,4,5,6,7,8,9,10};
        int summa = 0;
        for(int i = 0; i<n.length; i++){
            if (n[i] % 2 == 0) {
                summa = summa + n[i];
                System.out.println(summa);
            }
        }

        System.out.println("ex 7.17");
        int m = 2;
        int q[] = {1,2,3,4,5,6,7};
        int w = q.length;
        summa = 0;
        for(int i = 0; i<q.length; i++){
            if(q[i]%m == 0){
                summa = summa + q[i];
                System.out.println(summa);
            }
        }

        System.out.println("ex 7.18");
        int e[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        summa = 0;
        for(int i = 1; i<e.length; i++){
            if(i%2==0){
                summa = summa + e[i];
                System.out.println(summa);
            }
        }
    }
}
