package practice.BarryBird;
import static java.lang.System.out;
public class UseTemperature {
    public static void main(String args[]){
        final String format = "%5.2f gradusov po %s\n";

        Temperature temp = new Temperature();
        temp.setNumber(70.0);
        temp.setScale(BBJanuary19_21.TempScale.FAHRENHEIT);
        out.printf(format, temp.getNumber(), temp.getScale());

     /*   temp = new Temperature(32.0);
        out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(32.0);
        out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(BBJanuary19_21.TempScale.CELSIUS);
        out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(2.73, BBJanuary19_21.TempScale.KELVIN);
        out.printf(format, temp.getNumber(), temp.getScale());
*/
    }
}
