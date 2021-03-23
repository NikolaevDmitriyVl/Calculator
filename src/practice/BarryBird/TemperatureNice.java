package practice.BarryBird;
import static java.lang.System.out;
public class TemperatureNice extends Temperature{
    public TemperatureNice() {
        super();
    }
    public TemperatureNice(double number){
        super(number);
    }

    public TemperatureNice(BBJanuary19_21.TempScale scale){
        super(scale);
    }
    public TemperatureNice(double number, BBJanuary19_21.TempScale scale){
        super(number, scale);
    }

    public void display(){
        out.printf("%5.2f gradusov po %s\n", getNumber(),
                getScale());
    }

}
