package practice.Lesson096;

public class Lesson096 {
    public static void main(String[] args){
        System.out.println("ex 5.81");
        int x = 5;
        int y = 10;
        int naimenshee = 0;
        int naibolshee = 0;
        if (x > y) {
            naibolshee = x;
            naimenshee = y;
        }
        if(y>x){
            naibolshee = y;
            naimenshee = x;
        }
        if (x == y) {
            naibolshee = x;
            naimenshee = y;
        }
        int proizvedenie = 0;
        for(int i = 1; i<=naibolshee; i++){
            proizvedenie = proizvedenie + naimenshee;
            System.out.println(proizvedenie);
        }

        System.out.println("ex 5.85");
        int chislo = 12345;
        int cifra = 0;
        int i0 = 0;
        for(int i = 0;chislo>0; i++){
            cifra = chislo%10;
            chislo = chislo/10;
            System.out.print(cifra);
        }

        System.out.println("ex 5.86");
        chislo = 5;
        x = 1;
        int stepen = 1;
        System.out.println(stepen);
        for(int i = 1; i<5; i++){
            x = x+2;
            stepen = stepen + x;
            System.out.println(stepen);
        }

        System.out.println("ex 5.88");
        x = 1;
        y = 0;
        for(int i = 1; i<5; i++){
            x = x + 2;
            y =  y + x + (x+2);
            System.out.println(y);
        }
    }
}
