package practice;

public class Lesson088 {
    public static void main(String[] args){
        System.out.println("ex 12.25");
        int massiv[][] = new int[10][12];
        int i0 = 1;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<12; j++){
                massiv[i][j] = i0;
                i0++;
            }
        }
        for(int i = 0; i<10; i++){
            for(int j = 0; j<12; j++){
                System.out.print("\t" + massiv[i][j]);
            }
            System.out.println();
        }

        System.out.println("ex 12.25(b");
        int massiv0[][] = new int[12][10];
        i0 = 1;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<12; j++){
                massiv0[j][i] = i0;
                i0++;
            }
        }
        for(int i = 0;i<12; i++){
            for(int j = 0; j<10; j++){
                System.out.print("\t" + massiv0[i][j]);
            }
            System.out.println();
        }
        System.out.println("ex 12.25(c");
        int massiv1[][] = new int[12][10];
        i0 = 1;
        for(int i = 0; i<12; i++){
            for(int j = 9; j>=0; j--){
                massiv1[i][j] = i0;
                i0++;
            }
        }
        for(int i = 0; i<12; i++){
            for(int j = 0; j<10; j++){
                System.out.print("\t" + massiv1[i][j]);
            }
            System.out.println();
        }
        System.out.println("ex 12.25(d");
        int massiv2[][] = new int[12][10];
        i0 = 1;
        for(int i = 0; i<10; i++){
            for(int j = 11; j>=0; j--){
                massiv2[j][i] = i0;
                i0++;
            }
        }
        for(int i = 0; i<12; i++){
            for(int j = 0; j<10; j++){
                System.out.print("\t" + massiv2[i][j]);
            }
            System.out.println();
        }
        System.out.println("ex 12.25(e");
        int massiv3[][] = new int[10][12];
        i0 = 1;
        for(int i = 0; i<9; i+=2){
            for(int j = 0; j<12 ; j++){
                massiv3[i][j] = i0;
                i0++;
            }
            for(int l = 11; l>=0; l--){
                massiv3[i+1][l] = i0;
                i0++;
            }
        }
        for(int i = 0; i<10; i++){
            for(int j = 0; j<12; j++){
                System.out.print("\t" + massiv3[i][j]);
            }
            System.out.println();
        }

    }
}
