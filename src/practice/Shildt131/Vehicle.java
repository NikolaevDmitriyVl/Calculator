package practice.Shildt131;

 class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}
class TwoVehicles{
     public static void main(String[] args){
         Vehicle minivan = new Vehicle();
         Vehicle sportcar = new Vehicle();
         int range1, range2;

         minivan.passengers = 7;
         minivan.fuelcap = 16;
         minivan.mpg = 21;

         sportcar.passengers = 2;//14 12
         sportcar.fuelcap = 14;
         sportcar.mpg = 12;
         range1 = minivan.fuelcap * minivan.mpg;
         range2 = sportcar.fuelcap * minivan.mpg;

         System.out.println("Mini-furgon mozet perevezti " + minivan.passengers + " passazirov na rasstoyanie " + range1 + " mil ");
         System.out.println("Sportcar mozet perevezti " + sportcar.passengers + " passazirov na rasstoyanie " + range2 + " mil ");
     }
}
