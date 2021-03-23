package practice;

public class Lesson081 {
    public static void main(String[] args){
        System.out.println("ex 8.25");
        int a = 120;
        int b = 140;
        for(int i = 120; i<=140; i+=20){
            for(int j = 1; j<=140; j++) {
                if (i % j == 0) {


                System.out.print(j + " ");
            }
            }
            System.out.println();
        }

        System.out.println("ex 8.26");
        int n = 10;
        for(int i = 1; i<=n; i++){
            System.out.print(i);
            for(int j = 1; j<=i ;j++){
                if (i % j == 0) {
                    System.out.print(" + ");
                }
            }
            System.out.println();
        }

        System.out.println("ex 12.22");
        int q[][] = new int[9][9];
        for(int i = 0; i<q.length; i++){
            for(int j = 0; j<q.length; j++){
                q[i][j] = (i+1)*(j+1);
                System.out.print(q[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ex 12.23");
        int w[][] = new int[7][7];








        for(int i = 0; i<w.length /2; i++){
            //for(int j = 0; j<w.length/2; j++){
                w[i][i] = 1;
                w[i][w[i].length-i -1] =1;
                w[w.length-1-i][0]= 1;
                w[w.length-1-i][w[i].length-i -1]= 1;
            //}
        }
        w[3][3] = 1;
        for(int i = 0; i<w.length; i++){
            for(int j = 0; j<w.length; j++){
                System.out.print(w[i][j] + " ");
            }
            System.out.println();
        }

    }
}
