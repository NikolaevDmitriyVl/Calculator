package practice;

public class Lesson078 {
    public static void main(String[] args) {
        System.out.println("ex 12.8");
        int a[][] = {{4, 5, 1, 2, 3}, {6, 7, 8, 9}, {11, 12, 13, 14, 15}, {16, 17, 18, 20}};
        a[1][1] = 13;
        int b = 10;
        a[2][2] = b;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }

        }
        System.out.println("\n" + "ex 12.9");
        int w[][] = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {6, 7, 8, 9, 10}};
        int e = w[0][4];
        w[0][4] = w[2][0];
        w[2][0] = e;
        int r = w[2][4];
        w[2][4] = w[0][0];
        w[0][0] = r;
        for (int i = 0; i < w.length; i++) {
            System.out.println();
            for (int j = 0; j < w[i].length; j++) {
                System.out.print(w[i][j] + " ");
            }
        }

        System.out.println("ex 12.10");
        int t[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int u = t[2][1];
        t[2][1] = t[3][0];
        t[3][0] = u;

        System.out.println("ex 12.11");
        int y[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int summa = y[0][y[0].length-1] + y[y[2].length-1][0];
        System.out.println(summa);
        summa = 0;
        summa = 0;

    }
}
