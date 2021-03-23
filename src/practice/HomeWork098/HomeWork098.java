package practice.HomeWork098;

public class HomeWork098 {
    public static void main(String[] args){
        System.out.println("ex 4.100");
        int a = 5;
        int b = 10;
        int c = 11;
        int naibolshee = 0;
        int naimenshee1 = 0;
        int naimenshee2 = 0;
        if (a > b && a > c) {
            naimenshee1 = b;
            naimenshee2 = c;
        }
        if (b > a && b > c) {
            naimenshee1 = a;
            naimenshee2 = c;
        }
        if (c > a && c > b) {
            naimenshee1 = a;
            naimenshee2 = b;
        }
        

        //System.out.println("ex 5.");

        //System.out.println("ex 6.");

        System.out.println("ex 7.118");
        int k = 12;
        int i0 = 0;
        int massiv[] = {1,2,3,4,5,6,7,8,-9,10,11,12};
        for(int i = 0; i<massiv.length; i++){
            if(massiv[i]<0){
                i0 = i+1;
            }
        }
        if (i0 == 0) {
            System.out.println("otricatelnie chisla otsutsvuyut");
        }
        else{
            System.out.println("nomer poslednego otricatelnogo chisla = " + i0);
        }


        System.out.println("ex 8.29");
        a = 3;
        b = 10;
        k = 3;
        naibolshee = 0;
        int naimenshee = 0;
        i0 = 0;
        int i1 = 0;
        if(a >= b){
            naibolshee = a;
            naimenshee = b;
        }
        else{
            naibolshee = b;
            naimenshee = a;
        }
        for(int i = naimenshee; i<=naibolshee; i++){
            for(int j = 1; j<naibolshee; j++){
                if (i % j == 0) {
                    i0++;
                }
            }
            if (i0 == k) {
                i1++;
            }
            i0 = 0;
        }
        System.out.println(i1);

        System.out.println("ex 10.6");
        double ab = 10;//1 katet
        double ac = 15;//2 katet
        double cd = 8;//katet
        //bc???
        //double gipotenuza = Math.sqrt();


        System.out.println("ex 11.87");

        System.out.println("ex 12.16");

        System.out.println("ex 13.12");
    }
}
