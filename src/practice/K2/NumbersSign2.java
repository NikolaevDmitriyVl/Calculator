package practice.K2;

public class NumbersSign2 {
    String beforeSign;
    String afterSign;
    String sign;

    //находим математический оператор
    public NumbersSign2(String data) throws Exception {
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
    //OSHIBKA EXCEPTION esli pered znakom net simvolov
    public NumbersSign2(String data, int i) {
        beforeSign = data.substring(0, i);
        afterSign = data.substring(i + 1);
       // try{
        //    int a = Integer.parseInt(beforeSign);
        //    int b = Integer.parseInt(afterSign);
       //     throw new Exception("oshibka!!!");
       // }
       //// catch (Exception e){
       //     System.out.println("ERRor");
      //  }
        return;
    }
}
