package practice.Shildt131;

public class RedMeth {
    public static void main(String[] args){
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportcar = new Vehicle2();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 12;

        sportcar.passengers = 12;
        sportcar.fuelcap = 6;
        sportcar.mpg = 16;

        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("mini-furgon mozet perevezti " + minivan.passengers + " na rasstoyanie " + range1 + " mil");
        System.out.println("sportcar mozet perevezti " + sportcar.passengers + " na rasstoyanie " + range2 +  " mil");
    }
}
