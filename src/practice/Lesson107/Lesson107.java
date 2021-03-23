package practice.Lesson107;

public class Lesson107 {
    public static void main(String[] args){
        System.out.println("ex 8.38");
        int summaChisel[] = new int[50000];
        int summa = 0;
        for(int i = 1; i<=50000; i++){
            for(int j = 1; j<i; j++){
                if (i % j == 0) {
                    summa = summa + j;
                }
            }
            summaChisel[i-1] = summa;
            summa = 0;
        }

        int x = 0;
        for(int i = 1; i<= 50000; i++){
            for(int j = 0; j<summaChisel.length; j++){
                if(i == summaChisel[j] && j+1 == summaChisel[i-1] && i!= j+1 && i!= x){
                    System.out.println(i + " and " + (j+1));
                    x = (j+1);
                }
            }
        }
    }
}
