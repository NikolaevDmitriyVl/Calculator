package practice;

public class Lesson065 {
    public static void main(String[] args){
        System.out.println("ex 7.1");
        for(int i = 100;i<=200;i++){
            if(i%3 == 0){
                System.out.println(i);
            }
        }

        System.out.println("ex 7.2");
        int a = 12;
        int b = 34;
        int c = 2;
        for(int q = a; q<=b; q++){
            if(q%2 == 0){
                System.out.println(q);
            }
        }

        System.out.println("ex 7.3");
        int summa = 0;
        for(int i = 50; i>0; i--){
            summa = summa + i;}
            System.out.println(summa);

        System.out.println("ex 7.4");
        a = 123;
        b = 452;
        summa = 0;
        for(int i = a; i<=b; i++){

            if(i%4 ==0){
                summa = summa + i;
            }
        }
        System.out.println(summa);

        System.out.println("ex 7.5");
        int chislo = 999;
        for(int i = chislo; i>0; i--){
            if (i % 47 == 43 && i % 43 == 47) {
                System.out.println(i);
            }
        }

       System.out.println("ex 7.6");
        chislo = 9999;
        for(int i = chislo; i>0; i--){
            if(i%133 == 125 && i%134 ==111){
                System.out.println(i);
            }
        }

        System.out.println("ex 7.7");
        int cifra = 0;
        summa = 0;
        int n = 0;
        for(int i = 100; i<=500; i++){

            int one = i%10;
            int ostatok = i/10;
            int ten = ostatok%10;
            int hundred = i/100;

                if(one + ten + hundred == 15){
                    System.out.println(i);
                }
            }

        
        }
    }

