package practice.K3;

public class Check {
    public static void main(String[] args) {

        String stroka = "abc";
        int chislo = 21;
        int x = stroka.indexOf(stroka);
        //System.out.println(x);

        int b = 2;

        String chisloDoZnaka = "3";
        String chisloPosleZnaka = "2";

        String a = "";

        // String arabicMas[] = {"1","2","3","4","5","6","7","8","9","10"};
        String romanMas[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String znak = "+";


        int numberOne = 0;
        int numberTwo = 0;
        int y = 0;
        int y2 = 0;
        for (int i = 1; i <= 10; i++) {
            a = "" + i;
            if (a.equals(chisloDoZnaka)) {
                numberOne = i;
                y = 1;
            } else if (romanMas[i - 1].equals(chisloDoZnaka)) {
                numberOne = i;
                y = 2;
            } else {
                //System.out.println("!!!oshibka!!!");
            }
            if (a.equals(chisloPosleZnaka)) {
                numberTwo = i;
                y2 = 1;
            } else if (romanMas[i - 1].equals(chisloPosleZnaka)) {
                numberTwo = i;
                y2 = 2;
            } else {
               // System.out.println("!!!oshibka!!!");
            }

        }
        int answer = 0;
        String answerRom = "";
        if (y == 1 && y2 == 1) {
            switch (znak) {
                case "*": {
                    answer = numberOne * numberTwo;
                    System.out.println(answer);

                }
                break;
                case "/": {
                    answer = numberOne / numberTwo;
                    System.out.println(answer);

                }
                break;
                case "+": {

                    answer = numberOne + numberTwo;
                    System.out.println(numberOne + " " + znak + " " + numberTwo + " = " + answer);
                }
                break;
                case "-": {

                    answer = numberOne + numberTwo;
                    System.out.println(numberOne + " " + numberTwo + " " + znak +  " = " + answer);
                }
                break;
            }
        } else if (y == 2 && y2 == 2) {
            switch (znak) {
                case "*": {
                    System.out.println(romanMas[numberOne-1] + " " + znak + " " + romanMas[numberTwo-1] + " = " + romanMas[numberOne*numberTwo-1] );

                }
                break;
                case "/": {
                    System.out.println(romanMas[numberOne-1] + " " + znak + " " + romanMas[numberTwo-1] + " = " + romanMas[numberOne/numberTwo-1] );

                }
                break;
                case "+": {

                    System.out.println(romanMas[numberOne-1] + " " + znak + " " + romanMas[numberTwo-1] + " = " + romanMas[numberOne+numberTwo-1] );
                }
                break;
                case "-": {

                    System.out.println(romanMas[numberOne-1] + " " + znak + " " + romanMas[numberTwo-1] + " = " + romanMas[numberOne-numberTwo-1] );
                }
                break;
            }


        }
    }
}