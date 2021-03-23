package Calculat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            String data = scanner.nextLine();
            NumbersSign sign = new NumbersSign(data);
            NumbersSign beforeSign = new NumbersSign(data, data.indexOf(sign.sign));
            NumbersSign afterSign = new NumbersSign(data, data.indexOf(sign.sign));
            Parser a = new Parser(beforeSign.beforeSign, afterSign.afterSign);
            Calculator ans = new Calculator();
            ans.Answerr(a.numberOne, a.numberTwo, a.n1, a.n2, sign.sign);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
            
        }
    }
}

