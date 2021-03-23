package practice;

public class Lesson087 {
    public static void main(String[] args){
        System.out.println("ex 12.24(b");
        int massiv[][] = new int[6][6];
        int n = 0;
        for(int i = 0; i<6; i++){
            n = i+1;
            for(int j = 0; j<6; j++){
                massiv[i][j] = n;
                n++;
                if(n == 7){
                    n = 1;
                }
                System.out.print(massiv[i][j] + " ");


            }
            System.out.println();
        }

        System.out.println("ex 12.25(a");
        int massiv0[][] = new int[12][10];
        n = 1;
        for(int i = 0; i<12; i++){
            for(int j = 0; j<10; j++){
                massiv0[i][j] = n;
                n++;
                System.out.print("\t" + massiv0[i][j]);
            }
            System.out.println();
        }
        System.out.println("ex 12.25(b");
        int massiv1[][] = new int[12][10];
        n = 1;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<12; j++){
                massiv1[j][i] = n;
                n++;
            }
            System.out.println();

        }
        for(int i = 0; i<12; i++){
            for(int j = 0; j<10; j++){
                System.out.println("\t" + massiv1[i][j]);
            }
        }

    }
}
