package practice.Shildt;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return mpg*fuelcap;
    }

    double fuelneded(int miles){
        return (double) (miles/mpg);
    }
}

class CompFuel{
public static void main(String[] args){
    Vehicle minivan = new Vehicle();
    Vehicle sportcar = new Vehicle();
    double gallons;
    int dist = 252;

    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.mpg = 21;

    sportcar.passengers = 2;
    sportcar.fuelcap = 14;
    sportcar.mpg = 12;

    gallons = minivan.fuelneded(dist);

    System.out.println("dlya preodoleniya " + dist + " mil mini-furgonu trebuetsya " + gallons + " gallonov topliva");

    gallons = sportcar.fuelneded(dist);
    System.out.println("dlya preodoleniya " + dist + " mil sportcaru potrebuetsya " + gallons + " gallonov topliva");
}
}
