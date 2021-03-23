package practice;

public class Lesson080 {
    public static void main(String[] args){
        System.out.println("ex 8.1");

        for(int i = 0; i<=3; i++){
            for(int j = 0; j<=5; j++){
                System.out.print("6 ");
            }
            System.out.println();
        }

        System.out.println("ex 8.1(b");
        for(int i = 0; i<= 3; i++){
            for(int j = 1; j<=10; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("ex 8.1(c");
        int a = 41;
        int i0 = 0;
        for(int i = 0; i<=3; i++){
            for(int j = 1; j<=10; j++ ){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

        System.out.println("ex 8.2");
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(5 + " ");
            }
            System.out.println();
        }
        System.out.println("ex 8.2(b");
        for(int i = 5; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}
