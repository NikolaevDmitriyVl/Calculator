package practice.Lesson123;

import java.util.Random;

public class Lesson123 {
    public static void main(String[] args) {
        System.out.println("ex 12.29");
        int dlina = 7;
        int mas[][] = new int[dlina][dlina];
        int stroka = 0;
        int stolb = 0;
        int n = dlina*dlina;
        int count = 0;

        while (count <= n) {
            if(count== 1){
                while(mas[stroka][stolb] == 0 && stolb<5){
                   // mas[stroka][stolb]
                    stolb++;
                }
            }
        }

        System.out.println("ex 12.31");
        n  = 4;
        int dvumMas[][] = new int[n][n];
        Random rnd = new Random();
        int chislo = rnd.nextInt(20);
        int chisloTwo = 0;
        for(int i = 0; i<n; i++){
            for (int j = 0; j < n; j++) {


            chisloTwo = rnd.nextInt(20);
            boolean isUniq = false;
            // while(isUniq == false){
              //  isUniq = true;

                for(int d = 0; d<i; j++){
                 //   for
                   // if(dvumMas[][] ==  chisloTwo){
                        isUniq = false;
                        break;

                    }
                //}

            }
            //dvumMas[i][j] = chisloTwo;
        }


        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(dvumMas[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i = 0; i<5; i++){
            if (i < 4 && i>4) {
                System.out.print((i+1) + " ");
            }
            else{
                break;
            }
        }




    }
}
