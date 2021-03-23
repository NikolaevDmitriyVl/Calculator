package practice;

public class HomeWork034 {
    public static void main(String[] args){
        System.out.println("ex 2.27");
        int n = 231;
        int hundred = n/100;//2
        int ostatokHundred = n%100;//31
        int ten = ostatokHundred/10;//3
        int one = ostatokHundred%10;//1
        int operaciya1 = n-one;//230
        int operaciya2 = operaciya1/10;//23
        int operaciya3 = one*100 + operaciya2;
        System.out.println(operaciya3);

        System.out.println("ex 2.28");
        int q = 546;
        int hundred1 = q/100;//5
        int ostatokHundred1 = q%100;//46
        int ten1 = ostatokHundred1/10;//4
        int one1 = ostatokHundred1%10;//6
        int result = (ten1*100) + (hundred1*10) + one1;
        System.out.println(result);

        System.out.println("ex 2.29");
        int w = 235;
        int hundred2 = w/100;//2
        int ostatokHundred2 = w%100;
        int ten2 = ostatokHundred2/10;
        int one2 = ostatokHundred2%10;
        int result1 = (ten2*100) + (hundred2*10) + one2;
        System.out.println(result1);



    }
}
