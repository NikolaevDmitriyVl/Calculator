package practice.BarryBird;

public class Temperature {
    private double number;
    private BBJanuary19_21.TempScale scale;

    public Temperature(){
        number = 0.0;
        scale = BBJanuary19_21.TempScale.FAHRENHEIT;
    }

    public Temperature(double number){
        this.number = number;
        scale = BBJanuary19_21.TempScale.FAHRENHEIT;
    }

    public Temperature(BBJanuary19_21.TempScale scale){
        number = 0.0;
        this.scale = scale;
    }

    public Temperature(double number, BBJanuary19_21.TempScale scale){
        this.number = number;
        this.scale = scale;
    }

    public void setNumber(double number){
        this.number = number;
    }

    public double getNumber(){
        return number;
    }

    public void setScale(BBJanuary19_21.TempScale scale){
        this.scale = scale;
    }

    public BBJanuary19_21.TempScale getScale(){
        return scale;
    }
}
