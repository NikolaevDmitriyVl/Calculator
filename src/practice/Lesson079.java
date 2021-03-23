package practice;

public class Lesson079 {
    public static void main(String[] args){
        System.out.println("ex 12.11");
        int a[][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
        System.out.println(a[0][a[0].length-1]);
        int summa = a[0][a[0].length-1] + a[a.length-1][a[a.length-1].length-1];
        System.out.println(summa);

        System.out.println("ex 12.11(b");
        int sredneeArifmeticheskoe = 0;
        summa = a[0][0] + a[0][a[0].length-1] + a[a.length-1][0] + a[a.length-1][a[a.length-1].length-1];
        System.out.println(summa);

        System.out.println("ex 12.12");
        int q[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        summa = q[0][q[0].length-1] + q[q.length-1][q[q.length-1].length-1];
        System.out.println(summa);

    }
}
