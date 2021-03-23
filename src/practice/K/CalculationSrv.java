package practice.K;

public class CalculationSrv {

    public Number calculate(Number a,Number b,char operation) throws IllegalArgumentException{
     Number answer=new Number();
        switch (operation){
         case '*':
         {
            answer=new Number(a.getValue()*b.getValue(),a.getValueEnum());
         }break;
         case '+':
         {
             answer = new Number(a.getValue()+b.getValue(),a.getValueEnum());
         }break;
         case '-':
         {

         }break;
         case '/':
         {

         }break;
         default:{
            throw new IllegalArgumentException("недопустимая операция");
         }
        }

     return answer;
    }
}