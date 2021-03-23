package practice;

import java.util.Random;

public class Lesson077 {
    public static void main(String[] args){
        System.out.println("ex 11.56");
        int elementi[] = {1,2,3,4,5,6,7,8,9};
        int summa = 0;
        for(int i = 1; i<elementi.length; i+=2){
            summa = summa + elementi[i];
        }
        System.out.println(summa);
        int osadki[] = new int[28];
        Random rnd = new Random();
        summa = 0;
        for(int i = 0; i<osadki.length; i++){
            osadki[i] = rnd.nextInt(50);
            if (i % 2 == 0) {
                summa = summa + osadki[i];
            }
        }
        System.out.println(summa);

        System.out.println("ex 11.58");

        int [][] array2d = {{9,6,4,2,0,8},
                {6,9,5,3,2,9},
                {1,2,3,4,5,6},
                {6,5,4,3,2,1},
                {1,2,3,4,5,6}};

        System.out.println(array2d[3][2]);
        int countRows = array2d.length;
        int countCells = array2d[3].length;
        array2d[2][2] = 99;
        System.out.println(array2d[2][2]);

        int[][] array2d2 = new int[2][2];
        array2d2[0][0] = 0;
        array2d2[1][1] = 1;
        for(int i = 0; i<array2d.length; i++){
            for(int j = 0; j<array2d[i].length; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("ex 12.1");
        int [][] array2d3 = {{2,1},{3,4}};
        System.out.println(array2d3[0][1]);
        System.out.println(array2d3[1][0]);
   }
}
