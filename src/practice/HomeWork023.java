package practice;

public class HomeWork023 {
    public static void main(String[] args){
        System.out.println("ex 5.18");
        double z = 0;
        double t = 0;
        for(int i = 2; i<17; i ++){
            t = 4*i;
            z = 3.5*Math.pow(t,2)-7*t+16;
            System.out.println(z);
        }

        System.out.println("ex 5.19");

        for(double i = 0.1; i < 1; i+= 0.1){

            double otwet = Math.sin(i);
            System.out.println("sin ot " + i + "raven " + otwet);
        }

        System.out.println("ex 5.21");
        int rubKg = 500;
        int rubGr = rubKg*1000;
// i = i - 50 ======= i -= 50
// i = i * 6  ======= i *= 6;
        for(int i = 50; i<1000; i += 50){
            System.out.println(i + " gramm " + "= " + (i*rubGr) + " rubley");
        }

        System.out.println("ex 4.113");
        int nomerMesyaca = 3;
        int chislo = 1;
        String answer = "";
        switch (nomerMesyaca) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                answer += 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                answer += 30;
                break;
            case 2:
                answer += 28;
                if (chislo < 2) {
                }
        }
    }
}
