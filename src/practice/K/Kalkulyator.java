package practice.K;


import java.util.Scanner;

public class Kalkulyator {
    public static void main(String args[]){
        System.out.println("Введите пример:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char operator =' ';

        if(input.contains("+")) operator='+';
        else if(input.contains("*")) operator='*';
        else if(input.contains("-")) operator='-';
        else if(input.contains("/")) operator='/';
        int i=input.indexOf(operator);
        String valueA = input.substring(0,i);
        String valueB = input.substring(i,input.length());
        CalculationSrv calculationSrv=new CalculationSrv();
        try {
            Number a = new Number(valueA);
            Number b = new Number(valueB);
            Number c = calculationSrv.calculate(a, b, operator);
            System.out.println("ответ = "+c.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
//        System.out.println(a);
//        System.out.println(operator);
//        System.out.println(b);
    }
}
