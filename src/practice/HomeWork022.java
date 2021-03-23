package practice;

public class HomeWork022 {
    public static void main(String[] args){
        System.out.println("ex 5.5");
        for(double i = 21; i >= 10; i--){
            System.out.println(i + " " + (i - 1.8));
        }
        System.out.println("ex 5.5(b");
        for(int i = 45; i >= 25; i--){
            System.out.println(i + " " + (i - 0.5) + " " + (i- 0.8));
        }


        System.out.println("ex 5.6");
        for(int i = 21; i <= 35; i++){
            System.out.println(i + " " + (i-0.6));
        }

        System.out.println("ex 5.6(b");
        for(int i = 16; i <= 24; i++ ){
            System.out.println(i + " " + (i-0.5) + " " + (i+0.8));
        }

        System.out.println("ex 5.7");
        for(double i = 1; i <= 20; i++){
            System.out.println(i + "шт" + " " + "стоимость" + " " + (i*20.4) + "руб");
        }

        System.out.println("ex 4.112");
        int mesyac = 7;
        int mesyacPlusDvaDnya = mesyac + 1;
        String answer = "";
        switch (mesyacPlusDvaDnya){
            case 1:
                answer += "january";
                break;
            case 2:
                answer += "february";
            case 3:
                answer += "march";
                break;
            case 4:
                answer += "april";
                break;
            case 5:
                answer += "may";
                break;
            case 6:
                answer += "june";
                break;
            case 7:
                answer += "july";
                break;
            case 8:
                answer += "august";
                break;
            case 9:
                answer += "september";
                break;
            case 10:
                answer += "october";
                break;
            case 11:
                answer += "november";
                break;
            case 12:
                answer += "december";

        }
        System.out.println(answer);

        System.out.println("ex 5.8");
        for(int i = 1; i<=10; i++){
            System.out.println(i + "fut" + " raven " + (i *453) + "gr");
        }

        System.out.println("ex 5.9");
        for(int i = 10; i <= 22; i++){
            System.out.println(i + " duym " + "raven " + (i*25.4));
        }

        System.out.println("ex 4.113");

        System.out.println("ex 5.10");
        for(int i = 1; i < 21; i++){
            System.out.println(i + " dollar " + "raven " + (i*64.54) );
        }

        System.out.println("ex 5.11");
        final double radusEarth = 6350;
        double hFromEarth = 0;
        double sVkvadrate = 0;
        double s = 0;
        for(hFromEarth = 1; hFromEarth < 11; hFromEarth++){
            sVkvadrate = Math.pow((radusEarth + hFromEarth),2)- Math.pow(radusEarth,2);
            s = Math.sqrt(sVkvadrate);
            System.out.println(s);
        }

    }
}
