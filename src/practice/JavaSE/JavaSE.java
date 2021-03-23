package practice.JavaSE;

public class JavaSE {
    public static void main(String[] args){
        Bus ourBus;
        ourBus = new Bus();
        Bus firstBus;
        Bus secondBus;
        firstBus = new Bus();
        secondBus = new Bus();
        //Bus ourBus = new Bus();
        //Bus firstBus = new Bus();
        //Bus secondBus = new Bus(); это то же самое
        ourBus.color = "black";
        firstBus.color = "red";
        secondBus.color = "white";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();

    }
}
