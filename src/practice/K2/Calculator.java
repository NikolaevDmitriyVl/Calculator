package practice.K2;

public class Calculator {
    //производим математическое вычисление, находим ответ
    public Calculator(int numberOne, int numberTwo, ArabicOrRoman2 n1, ArabicOrRoman2 n2, String sign) {
        String roman[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        int answer = 0;
        switch (sign) {
            case "*": {
                answer = numberOne * numberTwo;
            }
            break;
            case "/": {
                answer = numberOne / numberTwo;
            }
            break;
            case "+": {
                answer = numberOne + numberTwo;
            }
            break;
            case "-": {
                answer = numberOne - numberTwo;
            }
            break;
        }
//выводим ответ если были арабские числа
        if (n1 == ArabicOrRoman2.ARABIC && n2 == ArabicOrRoman2.ARABIC) {
            System.out.println(numberOne + " " + sign + " " + numberTwo + " = " + answer);
        }
//выводим ответ если были римские числа
        else if (n1 == ArabicOrRoman2.ROMAN && n2 == ArabicOrRoman2.ROMAN) {
            int answerArab = answer;
            String minus = "";
            if (answer < 0) {
                //if answer < 1 then OSHIBKA (rimskie chisla ne mogut byt' men'she 1
                minus = "-";
                answerArab = answerArab * (-1);
            }
            String mas1[] = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int mas2[] = {100, 90, 50, 40, 10, 9, 5, 4, 1};
            int count = 0;
            String answerRoman = "";
            while (answerArab > 0) {
                if (answerArab >= mas2[count]) {
                    answerArab = answerArab - mas2[count];
                    answerRoman = answerRoman + mas1[count];
                }
                if (answerArab < mas2[count]) {
                    count++;
                }
            }

            System.out.println(roman[numberOne - 1] + " " + sign + " " + roman[numberTwo - 1] + " = " + minus + answerRoman);
        }

    }
}
