package practice;

public class HomeWork041 {
    public static void main(String[] args){
        System.out.println("ex 4.25(a");
        int q = 12;
        int ten = q/10;//1
        int one = q%10;//2
        int summa = ten + one;//3
        if(summa-9>0){
            System.out.println("summa dvuznachnaya");
        }
        else{
            System.out.println("summa ne yavlyaetsya dvuznachnoy");
        }
        System.out.println("ex 4.25(b");
        if(q>summa){
            System.out.println("bolshe");
        }
        else{
            System.out.println("menshe");
        }

        System.out.println("ex 4.26(a");
        int w = 12;
        int ten0 = w/10;
        int one0 = w%10;
        int summa0 = ten0+ one0;
        if(summa0%3== 0){
            System.out.println("summa kratna 3");
        }
        else{
            System.out.println("summa ne kratna trem");
        }
        System.out.println("ex 4.26(b");
        int a = 2;
        if(summa0%a == 0){
            System.out.println("summa a kratna 3");
        }
        else{
            System.out.println("summa ne kratna trem");
        }

        System.out.println("ex 4.27");
        int e = 123;
        int hundred = e/100;//1
        int ostatokHundred = e%100;
        int ten1 = ostatokHundred/10;
        int one1 = ostatokHundred%10;
        if(hundred == one1){
            System.out.println("chislo palindrom");
        }
        else{
            System.out.println("chilo ne palindrom");

        }

    }
}
