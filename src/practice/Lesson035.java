package practice;

public class Lesson035 {
    public static void main(String[] args){
        System.out.println("ex 2.34");
        int a1 = 5;
        int a2 = 4;
        int b1 = 8;
        int op1 = a2+b1;//12
        int op2 = op1/10;//1
        int op3 = op1%10;//2
        int op4 = a1+op2;//6
        System.out.println(op4 + " " + op3);

        System.out.println("ex 2.35");
        int a01 = 1;
        int a02 = 2;
        int b01 = 3;
        int b02 = 4;
        int r1 = a01+ b01;//4
        int r11 = r1/10;//0
        int r12 = r1%10;//4
        int r2 = a02+ b02;//6
        int r3 = r2 + r11;//6
        System.out.println(r3 + " " + r12);

        System.out.println("ex 2.36");
        int q1 = 2;
        int q2 = 3;
        int q3 = 4;
        int w1 = 5;
        int w2 = 6;
        int e1 = w1+q1;//7
        int e11 = e1/10;//0
        int e12 = e1%10;//7
        int e2 = q2 + w2;//9
        int e21 = e2 + e11;//9
        int e22 = e21/10;//0
        int e23 = e21%10;//9
        int e3 = q3 + e22;//4
        System.out.println(e3 + " " + e21 + " " + e12);

        System.out.println("ex 5.81");
        int x = 2;
        int y = 3;
        int summa = 0;
        for(int i = 1; i<= x ; i++ ){
            summa = summa + y;
        }
        System.out.println(summa);


    }
}
