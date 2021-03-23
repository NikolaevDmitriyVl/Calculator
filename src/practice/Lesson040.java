package practice;

public class Lesson040 {
    public static void main(String[] args) {
        System.out.println("ex 4.15");
        int godRozdeniya = 1992;
        int mesyacRozdeniya = 10;
        int godSeychas = 2019;
        int mesyacSeychas = 10;
        int let = godSeychas - godRozdeniya;
        int mesyacev = mesyacSeychas - mesyacRozdeniya;
        if (mesyacSeychas < mesyacRozdeniya) {
            let = let - 1;
            mesyacev = 12 - mesyacRozdeniya + mesyacSeychas;
        }
        System.out.println(let + " " + mesyacev);

        System.out.println("ex 4.16(a");
        double ploshhadKruga = 20;
        double ploshhadKvadrata = 25;
        double diametrKruga = 2*Math.sqrt(ploshhadKruga/3.14);
        double dlinaStoroni = ploshhadKvadrata/4;
        if(dlinaStoroni<diametrKruga){
        System.out.println("umestitsya");
        }
        else{
            System.out.println("ne umestitsya");

        }
        System.out.println("ex 4.16(b");
        double radiusKruga = diametrKruga/2;
        double radiusKvadrata = dlinaStoroni/Math.sqrt(2);
        if(radiusKruga>radiusKvadrata){
            System.out.println("umestitsya");
        }
        else{
            System.out.println("ne umestitsya");
        }

        System.out.println("ex 4.17");
        double ploshhadKrug = 40;
        double ploshhadTreugolnika = 30;
        

    }
}
