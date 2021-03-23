package practice.K2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("vvedite chislo!");
        Scanner scanner = new Scanner(System.in);
        //nel'zya so sleduyushchey stroki prinimat' znacheniya
        String rawData = scanner.nextLine();
        Parserr parser = new Parserr();
        NumbersSign2 sign = null;


        try {
            sign = new NumbersSign2(rawData);
        NumbersSign2 beforeSign = new NumbersSign2(rawData, rawData.indexOf(sign.sign));
        NumbersSign2 afterSign = new NumbersSign2(rawData, rawData.indexOf(sign.sign));
       // DataDto dataDto=parser.parseData(beforeSign.beforeSign, afterSign.afterSign);
            // Calculator answer = new Calculator(parser.numberOne, parser.numberTwo, parser.n1, parser.n2, sign.sign);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
