package practice;

import java.util.Random;

public class Lesson086 {
    public static void main(String[] args){
        System.out.println("ex 8.9");
        int massiv[][] = new int [18][3];
        Random rnd = new Random();
        for(int i = 0; i<18; i++){
            for(int j = 0; j<3; j++){
                massiv[i][j] = rnd.nextInt(4)+1;
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("ex 8.9(b");
        for(int i = 0; i<3; i++){
            for(int j = 0; j < 18; j++){
                System.out.print(massiv[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("ex 12.24");
        int massiv0[][] = new int [6][6];
        for(int i = 0; i<6; i++){
            massiv0[0][i] = 1;
            massiv0[i][0] = 1;
        }

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
             massiv0[i+1][j+1] = massiv0[i+1][j] + massiv0[i][j+1];
             System.out.print(massiv0[i][j] + " ");

            }
            System.out.println(massiv0[i][5]);
            System.out.println();
        }
        System.out.println("ex 12.24(b");
        int massiv1[][] = new int [6][6];
        int i0 = 1;
        for(int i = 0; i<6; i++){
            i0 = i+1;
            for(int j = 0; j<6; j++){
                massiv1[i][j] = i0;
                i0++;
                if (i0 == 7) {
                    i0 = 1;
                }
                System.out.print(massiv1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
