package practice;

public class Lesson051 {
    public static void main(String[] args){
        System.out.println("ex 5.85");
        int a = 12345;
        int tenThousand = a/10000;//1
        System.out.println(tenThousand);
        int ostTenThousand = a%10000;//2345
        System.out.println(ostTenThousand + "ostTenThousand");
        int thousand = ostTenThousand/1000;//2
        System.out.println(thousand);
        int ostThausand = ostTenThousand%1000;//345
        int hundred = ostThausand/100;//3
        System.out.println(hundred);
        int ostHundred = ostThausand%100;//45
        int ten = ostHundred/10;//4
        System.out.println(ten);
        int one = ostHundred%10;//5
        System.out.println(one);
        System.out.println(one + "" + ten + "" + hundred + "" + thousand + "" + tenThousand);

        int number = 12345;
        for(int i = 0; i<5; i++){
            int diget = number%10;
            System.out.print(diget);
            number = number/10;

        }

        System.out.println("ex 5.86");
        int n = 5;
        int stepen = 1;
        int summa = 1;
        System.out.println(summa);
        for(int i = 1; i<5; i++){
            summa = summa + 2;
            stepen = stepen + summa ;
            System.out.println(stepen);
        }

        System.out.println("ex 5.88");
        int q = 5;
        int step = 2;
        int num = 1;
        System.out.println();
        for (int i = 0; i < 2 ; i++) {


            for (double e = 1; i < 5; i++) {
                num = num + step;
                step = step ;
                System.out.println(step);
            }
        }

}
    }
