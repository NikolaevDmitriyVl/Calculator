package practice.K4;

public class NumbersSign {
    String beforeSign;
    String afterSign;
    String sign;

    //находим математический оператор
    public NumbersSign(String data) throws Exception{
        sign = "";
        if (data.contains("*")) {
            sign = "*";
        } else if (data.contains("/")) {
            sign = "/";
        } else if (data.contains("+")) {
            sign = "+";
        } else if (data.contains("-")) {
            sign = "-";
        }
        else{
            throw new Exception("математический оператор отсутствует");
        }
        return;
    }

    //находим число до и после математического оператора
    public NumbersSign(String data, int i) {
        beforeSign = data.substring(0, i);
        afterSign = data.substring(i + 1);
        return;
    }
}
