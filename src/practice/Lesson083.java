package practice;

public class Lesson083 {
    public static void main(String[] args){
        System.out.println("ex 4.116");
        int a1 = 1;
        int a2 = 2;
        int b = 5;
        int d2 = a1-b;
        if(d2<0){
            a2 = a2-1;
            d2 = d2*(-1);
        }
        System.out.println(a2 + " " + d2);

        System.out.println("ex 2.34");
        a1 = 5;
        a2 = 2;
        b = 7;
        int x = a1+b;
        int c1 = x%10;
        int c2 = a2+ x /10;
        System.out.println(c1 + " " + c2);

        System.out.println("ex 12.23");
        int w[][] = new int[8][8];
        int d = 1;
        int f = 7;
        for(int i = 1; i<w.length; i++){
            w[d][d] = 1;
            w[d][f] = 1;
            d =  d + 1;
            f = f-1;

                for(int j = 1; j<w.length; j++){
                    System.out.print(w[i][j] + " ");
                }
                System.out.println();
        }

        


    }
}
