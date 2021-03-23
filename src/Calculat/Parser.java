package Calculat;

import Calculat.Calculator;

public class Parser {
    //получаем из строки int числа, опрелделяем какие числа арабские или римские
    int numberOne;
    int numberTwo;
    ArabicOrRoman n1;
    ArabicOrRoman n2;

    public Parser(String beforeSign, String afterSign) throws Exception{
        String roman[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            String arabic = "" + i;
            if (arabic.equals(beforeSign)) {
                numberOne = i;
                n1 = ArabicOrRoman.ARABIC;


            } else if (roman[i - 1].equals(beforeSign)) {
                numberOne = i;
                n1 = ArabicOrRoman.ROMAN;

            }

            if (arabic.equals(afterSign)) {
                numberTwo = i;
                n2 = ArabicOrRoman.ARABIC;

            } else if (roman[i - 1].equals(afterSign)) {
                numberTwo = i;
                n2 = ArabicOrRoman.ROMAN;

            }
        }

        if (n1==null || n2==null || n1!=n2) {
            throw new Exception("оба целых числа должны быть либо арабскими либо римскими от 1 до 10");
        }
        return;
    }
}