package practice.Lesson115;

public class Lesson115 {
    public static void main(String args[]){
        System.out.println("ex 12.25(o");
        int x = 0;
        int massiv[][] = new int[12][10];
        int sign = -1;
        for(int i = 0; i<massiv[0].length; i++){
            for(int j = 0; j<massiv.length; j++){
                x = x+1;
                if(sign == 1){
                    massiv[j][i] = x;
                }
                else if(sign == (-1)){
                    massiv[(j -11) * (-1)][i] = x;
                }
            }
            sign = sign * (-1);
        }

        for(int i = 0; i<massiv.length; i++){
            for(int j = 0; j<massiv[0].length; j++){
                System.out.print(massiv[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("proverka");
        int mass[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int i0 = 0;
        for(int i = 0; i<mass.length; i++){
            if (i < 3) {
                i0++;
                System.out.print(mass[i] + "\t");
                if (i0 == 3) {
                    System.out.println();
                    i0 = 0;
                }
            }
            else{
                if (i > 2 && i < 6) {
                    i0++;
                    System.out.print(mass[i] + "\t");
                    if (i0 == 3) {
                        System.out.println();
                        i0 = 0;
                    }
                }
            }

            if (i > 5 && i<9) {
                i0++;
                System.out.print(mass[i] + "\t");
                if (i0 == 3) {
                    System.out.println();
                    i0 = 0;
                }
            }
            else{
                if (i > 8 ) {
                    i0++;
                    System.out.print(mass[i] + "\t");
                    if (i0 == 3) {
                        System.out.println();
                        i0 = 0;
                    }
                }
            }
        }

    }
}
