package practice;

public class Lesson060 {
    public static void main(String[] args){
        System.out.println("ex 6.41");
        int chislo = 12423;
        int cifra = 0;
        int i = 0;
        int max1 = cifra;
        int max2 = cifra;
        int max1number = 0;
        int max2number = 0;
        while(chislo >0){

            cifra = chislo%10;

            chislo = chislo/10;
            if (cifra > max1) {
                max2number = max1number;
                max1number = i;
                max2 = max1;
                max1 = cifra;
                max1number++;
            }
            else if(cifra>max2){
                max2 = cifra;
                max2number = i;
            }

            i++;
        }
        System.out.println(max1number);
        System.out.println(max2number);

        System.out.println("ex 6.41(b");
        chislo = 12345;
        cifra = 0;
        i = 0;
        int min1 = 9;
        int min2 = 9;

        while (chislo > 0) {
            cifra = chislo%10;
            chislo = chislo/10;
            if (cifra < min1) {
                min2 = min1;
                min1 = cifra;
            }
        }

    }
}
