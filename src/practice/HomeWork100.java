package practice;

import java.util.Random;

public class HomeWork100 {
    public double perimetr(){
        double osnovanie1 = 10;
        double osnovanie2 = 6;
        double osnovanieMax = 0;
        double osnovanieMin = 0;
        double visota = 4;
        if(osnovanie1 > osnovanie2){
            osnovanieMax = osnovanie1;
            osnovanieMin = osnovanie2;
        }
        else{
            osnovanieMax = osnovanie2;
            osnovanieMin = osnovanie1;
        }
        double katet = (osnovanieMax - osnovanieMin) / 2;
        double gipotenuza = Math.sqrt(Math.pow(visota,2) + (Math.pow(katet,2)));
        double perim = osnovanie1 + osnovanie2 + (gipotenuza * 2);
        return perim;
    }
    public static void main(String[] args){
        System.out.println("ex 4.102");//???
        System.out.println("ex 4.103");
        double x0 = 2.2;
        double y0 = 3.5;
        double z0 = 4.4;
        double maximum = z0;
        if (x0 >= y0 && x0 >= z0) {
            maximum = x0;
        }

        if (y0 >= x0 && y0 >= z0) {
            maximum = y0;
        }
        System.out.println("maximalnoe chislo = " + maximum);

        System.out.println("ex 7.120");
        int gruppa[] = {12,13,14,15,16,17,18,19,20};
        int tyazeliy = 0;
        int legkiy = 1000*100;
        for(int i = 0; i<gruppa.length-1; i++){
            if(tyazeliy < gruppa[i]){
                tyazeliy = gruppa[i];
            }
            if(legkiy > gruppa[i]){
                legkiy = gruppa[i];
            }
        }
            if(tyazeliy > (legkiy*2)){
                System.out.println("massa samogo tyazelogo previshaet bolshe chem v dva raza massu samogo legkogo");
            }



        System.out.println("ex 8.30");
            int a = 10;
            int b = 5;
            int maximalnoe = 0;
            int minimalnoe = 0;
            int i0 = 0;

        if (a > b) {
            maximalnoe = a;
            minimalnoe = b;
        }
        else{
            maximalnoe = b;
            minimalnoe = a;
        }
        int gdeBolshe[] = new int[maximalnoe-minimalnoe+1];
        int chislo[] = new int[maximalnoe - minimalnoe+1];
        for(int i = minimalnoe; i<=maximalnoe; i++){
            for(int j = 1; j<=i; j++){
                if (i % j == 0) {
                    i0++;
                }
            }
                gdeBolshe[i-minimalnoe] = i0;
            chislo[i-minimalnoe] = i;
            i0 = 0;

        }
        int max = 0;
        int i1 = 0;
        int ix = 0;
        for(int i = 0; i<gdeBolshe.length; i++){
            if (max <= gdeBolshe[i]  ) {
                if (max == gdeBolshe[i]) {
                    if(chislo[i1] < chislo[i])
                        ix = i;
                }
                max = gdeBolshe[i];
                i1 = i;


            }
        }
        System.out.println(chislo[ix]);







        System.out.println("ex 10.7");
        HomeWork100 perimetr = new HomeWork100();
            double otwet = perimetr.perimetr();
            System.out.println(otwet);


        System.out.println("ex 11.87");
        int rost[] = new int[22];
        Random rnd = new Random();
        Random rnd2 = new Random();
        for(int i = 0; i<(rost.length-1)/2; i++){
            rost[i] = (rnd.nextInt(35)+135) * (-1);
            rost[i+(rost.length/2)-1] = rnd2.nextInt(40)+140;
        }
        int summaM = 0;
        int summaZ = 0;
        for(int i = 0; i<rost.length-1; i++){
            if (rost[i] < 0) {
                summaM = summaM + rost[i];
            }
            if (rost[i] > 0) {
                summaZ = summaZ + rost[i];
            }
        }
        int srRostM = summaM/(rost.length/2);
        int srRostZ = summaZ/(rost.length/2);
        System.out.println("sredniy rost malchikov = " + srRostM + " sredniy rost devochek = " + srRostZ);

        System.out.println("ex 12.16");
        int dvumMass[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        int raznica = dvumMass[2][dvumMass[2].length-1] - dvumMass[3][0];
        System.out.println("proverka " + raznica);

        System.out.println("ex 12.16(b");
        System.out.println("ex 13.12");

    }
}
